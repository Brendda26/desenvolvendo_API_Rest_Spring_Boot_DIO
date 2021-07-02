package usuario.cadastrar.spring_boot.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {

    private Long id;

    @NotEmpty
    private String pais;

    @NotEmpty
    @CNPJ
    private Integer cep;

    @NotEmpty
    private String cidade;

    @NotEmpty
    private String logradouro;

    @NotEmpty
    private String rua;

    @NotEmpty
    private Integer numeroCasa;

}
