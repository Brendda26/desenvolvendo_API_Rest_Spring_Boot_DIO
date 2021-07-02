package usuario.cadastrar.spring_boot.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TelefoneType {

    HOME ("Home"),
    MOBILE ("Mobile"),
        COMMERCIAL ("Commercial");

    private final  String description;
}
