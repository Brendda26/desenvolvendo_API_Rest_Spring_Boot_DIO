package usuario.cadastrar.spring_boot.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import usuario.cadastrar.spring_boot.TelefoneType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TelefoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private TelefoneType type;

    @NotFound
    @Size(min=13, max = 14)
    private String number;

}
