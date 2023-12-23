package nira.erp.customer.infrastructure.mapper;
import nira.erp.company.infrastructure.mapper.CompanyMapper;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.country.infrastructure.mapper.CountryMapper;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper( uses = { CompanyMapper.class, CountryMapper.class, CustomerAddressMapper.class })
public interface ICustomerMapper {

    @Mapping(target = "company", source = "company")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "addresses", source = "addresses")
    CustomerEntity toEntity(CustomerModel customerModel);

    @Mapping(target = "company", source = "company")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "addresses", source = "addresses")
    CustomerModel toModel(CustomerEntity customerEntity);
}
