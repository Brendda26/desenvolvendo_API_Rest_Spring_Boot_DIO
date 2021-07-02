package usuario.cadastrar.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import usuario.cadastrar.spring_boot.entity.Pessoa;
import usuario.cadastrar.spring_boot.repository.PessoaRepository;
import usuario.cadastrar.spring_boot.pessoa.MessageResponseDTO;
import usuario.cadastrar.spring_boot.request.PessoaDTO;


@RestController
@RequestMapping ("/api/v1/usuario")

public class usuario_controller {

    private PessoaRepository pessoaService;

    @Autowired
    public usuario_controller(PessoaRepository pessoaServise) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    //validar o usuario
    public MessageResponseDTO createPessoa(@RequestBody @Valid PessoaDTO pessoaDTO){
        return pessoaService.createPessoa(pessoaDTO);

    }



}
