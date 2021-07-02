package usuario.cadastrar.spring_boot.mapper;

import javax.persistence.MappedSuperclass;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;
import usuario.cadastrar.spring_boot.request.PessoaDTO;

@Mapper
public class PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    @Mapping(target = "niver", source="niver", dateFomat="dd-MM-yyyy")
    Pessoa toModel(PessoaDTO pessoaDTO);

    PessoaDTO toDTO(Pessoa pessa);
}
