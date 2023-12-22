package nira.erp.country.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.core.infrastructure.persistence.entity.GeoCountryEntity;
import nira.erp.country.domain.model.model.CountryModel;
import org.mapstruct.factory.Mappers;

@ApplicationScoped
public class CountryMapper {
    public static final ICountryMapper INSTANCE = Mappers.getMapper(ICountryMapper.class);

    public GeoCountryEntity toEntity(CountryModel countryModel) {
        return INSTANCE.toEntity(countryModel);
    }

    public CountryModel toModel(GeoCountryEntity companyEntity) {
        return INSTANCE.toModel(companyEntity);
    }
}
