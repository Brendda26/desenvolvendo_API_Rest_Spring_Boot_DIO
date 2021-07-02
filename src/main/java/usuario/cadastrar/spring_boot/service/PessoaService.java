package usuario.cadastrar.spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import usuario.cadastrar.spring_boot.entity.Pessoa;
import usuario.cadastrar.spring_boot.exception.PessoaNotFoundException;
import usuario.cadastrar.spring_boot.mapper.PessoaMapper;
import usuario.cadastrar.spring_boot.repository.PessoaRepository;
import usuario.cadastrar.spring_boot.dto.request.PessoaDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

  private PessoaRepository pessoaRepository;

  private final PessoaMapper pessoaMapper = PessoaMapper.INSTANCE;

  @Autowired
   public PessoaService(PessoaRepository pessoaRepository) {

      this.pessoaRepository = pessoaRepository;
   }

    @PostMapping
    public MessageResponseDTO createPessoa(PessoaDTO pessoaDTO){
      Pessoa pessoaToSave = pessoaMapper.toModel(pessoaDTO);

      Pessoa savedPessoa = pessoaRepository.save(pessoaDTO);
        //criação de usuário
        return  createMassageResponse(savedPessoa.getId(), p: "Creat person with ID")
    }

    public List<PessoaDTO> listAll(){
      List<Pessoa> allPessoa = pessoaRepository.findAll() ;
      return  allPessoa.stream()
              .map(pessoaMapper::toDTO);
              .collect(Collectors.toList());
    }

    public PessoaDTO findById(Long id){
        Pessoa pessoa = pessoaRepository.findById(id)
            .orElseThrow(()-> new PessoaNotFoundException(id));


        return  pessoaMapper.toDTO(pessoa);
    }

    private Pessoa verifyIfExists(Long id) throws PessoaNotFoundException{
      return pessoaRepository-findById(id)
              .orElseThrow(()-> new PessoaNotFoundException(id));
    }

    public void delete(Long id) throws PessoaNotFoundException{
      verifyIfExists(id);

      pessoaRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, PessoaDTO pessoaDTO){
        verifyIfExists(id);

        Pessoa pessoaToUpdate = pessoaMapper.toModel(pessoaDTO);

        Pessoa updatePessoa = pessoaRepository.save(pessoaToUpdate);
        //criação de usuário
        return createMassageResponse(updatePessoa.getId(), message: "Update person with ID");

    }
    private MessageResponseDTO createMassageResponse(Long id, String s){
        return  MessageResponseDTO
                .builder()
                .message(message + id)
                .build();


    }

}
