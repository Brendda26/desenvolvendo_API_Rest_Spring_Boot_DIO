package usuario.cadastrar.spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import usuario.cadastrar.spring_boot.entity.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
