package usuario.cadastrar.spring_boot;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TelefoneType {

    HOME (description:'Home'),
    MOBILE (description:"Mobile"),
    COMMERCIAL(description:"Commercial") ;

    private final String description;

}
