package usuario.cadastrar.spring_boot.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import usuario.cadastrar.spring_boot.entity.Endereço;
import usuario.cadastrar.spring_boot.entity.Formação;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;

    @NotEmpty
    @Size (min=2, max = 100)
    private String firsName;

    @NotEmpty
    @Size (min=2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF
    private String cpf;

    private LocalDate niver;

    @NotEmpty
    @Valid
    private List<Telefone> telefone;

    private List<Endereço> endereco;

    private Formação formação;


}
