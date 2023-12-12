package nira.erp.customer.infrastructure.mapper;
import nira.erp.company.infrastructure.mapper.CompanyMapper;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper( uses = CompanyMapper.class)
public interface ICustomerMapper {

    @Mapping(target = "companyEntity", source = "company")
    CustomerEntity toEntity(CustomerModel customerModel);

    @Mapping(target = "company", source = "companyEntity")
    CustomerModel toModel(CustomerEntity customerEntity);
}
