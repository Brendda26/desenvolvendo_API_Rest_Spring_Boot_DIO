package usuario.cadastrar.spring_boot.request;

import com.sun.istack.Interned;
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
