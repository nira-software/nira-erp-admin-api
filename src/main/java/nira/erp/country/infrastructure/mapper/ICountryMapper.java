package nira.erp.country.infrastructure.mapper;

import nira.erp.core.infrastructure.persistence.entity.CountryEntity;
import nira.erp.country.domain.model.model.CountryModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper()
public interface ICountryMapper {

    CountryEntity toEntity(CountryModel companyModel);

    @Mapping(target = "address", ignore = true)
    CountryModel toModel(CountryEntity companyEntity);
}
