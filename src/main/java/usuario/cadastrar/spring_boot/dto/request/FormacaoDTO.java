package usuario.cadastrar.spring_boot.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormacaoDTO {

    private Long id;

    private String tipoFormacao;

    @NotEmpty
    private String periodoInicio;

    @NotEmpty
    private String conclusao;
}
