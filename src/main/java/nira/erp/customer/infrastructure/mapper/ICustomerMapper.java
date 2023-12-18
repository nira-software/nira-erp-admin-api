package nira.erp.customer.infrastructure.mapper;
import nira.erp.company.infrastructure.mapper.CompanyMapper;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.country.infrastructure.mapper.CountryMapper;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper( uses = { CompanyMapper.class, CountryMapper.class })
public interface ICustomerMapper {

    @Mapping(target = "companyEntity", source = "company")
    @Mapping(target = "countryEntity", source = "country")
    CustomerEntity toEntity(CustomerModel customerModel);

    @Mapping(target = "company", source = "companyEntity")
    @Mapping(target = "country", source = "countryEntity")
    CustomerModel toModel(CustomerEntity customerEntity);
}
