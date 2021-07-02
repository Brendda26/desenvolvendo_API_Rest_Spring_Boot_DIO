package usuario.cadastrar.spring_boot.repository;

import usuario.cadastrar.spring_boot.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import usuario.cadastrar.spring_boot.request.PessoaDTO;

import java.util.List;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {


    List<PessoaDTO> listAll();
}
