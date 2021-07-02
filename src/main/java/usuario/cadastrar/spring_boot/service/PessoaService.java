package usuario.cadastrar.spring_boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import usuario.cadastrar.spring_boot.entity.Pessoa;
import usuario.cadastrar.spring_boot.mapper.PessoaMapper;
import usuario.cadastrar.spring_boot.repository.PessoaRepository;
import usuario.cadastrar.spring_boot.request.PessoaDTO;

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
        return  usuario.cadastrar.spring_boot.pessoa.MessageResponseDTO
                .builder()
                .message("Created person with ID" + savedPessoa.getId())
                .build();
    }
}
