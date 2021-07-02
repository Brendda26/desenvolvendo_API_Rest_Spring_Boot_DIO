package usuario.cadastrar.spring_boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PessoaNotFoundException extends Throwable {
    public PessoaNotFoundException(Long id) {
        super("Pessoa not found wid Id" + id);
    }
}
