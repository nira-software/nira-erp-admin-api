package nira.erp.country.infrastructure.mapper;

import nira.erp.core.infrastructure.persistence.entity.GeoCountryEntity;
import nira.erp.country.domain.model.model.CountryModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper()
public interface ICountryMapper {

    @Mapping(target = "countryName", source = "name")
    @Mapping(target = "countryCode", source = "code")
    GeoCountryEntity toEntity(CountryModel countryModel);

    @Mapping(target = "name", source = "countryName")
    @Mapping(target = "code", source = "countryCode")
    CountryModel toModel(GeoCountryEntity geoCountryEntity);
}
