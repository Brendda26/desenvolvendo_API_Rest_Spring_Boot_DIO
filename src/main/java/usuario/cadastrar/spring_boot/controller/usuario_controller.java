package usuario.cadastrar.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import usuario.cadastrar.spring_boot.entity.Pessoa;
import usuario.cadastrar.spring_boot.repository.PessoaRepository;
import usuario.cadastrar.spring_boot.pessoa.MessageResponseDTO;


@RestController
@RequestMapping ("/api/v1/usuario")

public class usuario_controller {

    private PessoaRepository pessoaRepository;

    @Autowired
    public usuario_controller(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @PostMapping
    public MessageResponseDTO createPessoa(@RequestBody Pessoa pessoa){
        Pessoa savedPessoa = pessoaRepository.save(pessoa);
       //criação de usuário
        return  MessageResponseDTO
                .builder()
                .message("Created pessoa with ID" + savedPessoa.getId())
                .build();
    }



}
