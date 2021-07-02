package usuario.cadastrar.spring_boot.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import usuario.cadastrar.spring_boot.exception.PessoaNotFoundException;
import usuario.cadastrar.spring_boot.repository.PessoaRepository;
import usuario.cadastrar.spring_boot.dto.response.MessageResponseDTO;
import usuario.cadastrar.spring_boot.dto.request.PessoaDTO;

import java.util.List;


@RestController
@RequestMapping ("/api/v1/usuario")
@AllArgsConstructor(onConstructor =  = @__(@Autowired)

public class usuario_controller {

    private PessoaService pessoaService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public usuario_controller(PessoaRepository pessoaServise) {
        this.pessoaService = pessoaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    //validar o usuario
    public MessageResponseDTO createPessoa(@RequestBody @Valid PessoaDTO pessoaDTO){
        return pessoaService.createPessoa(pessoaDTO);

    }

    @GetMapping
    public List<PessoaDTO> listAll(){

        return pessoaService.listAll();
    }

    @GetMapping("/{id}")
    public PessoaDTO findById(@PathVariable Long id){

        return pessoaService.findById(id);
    }

    @DeleteMapping("{/id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PessoaNotFoundException{
        pessoaService.delete(id);
    }

    @PutMapping("{/id")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody PessoaDTO pessoaDTO) throws PessoaNotFoundException {
        return pessoaService.updateById(id, pessoaDTO);
    }



}
