package usuario.cadastrar.spring_boot.repository;

import usuario.cadastrar.spring_boot.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {




}
