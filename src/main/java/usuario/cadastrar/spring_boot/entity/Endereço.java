package usuario.cadastrar.spring_boot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Endereço {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false, unique = true)
    private Integer cep;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private Integer numeroCasa;


}
