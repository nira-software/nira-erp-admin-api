package nira.erp.customer.infrastructure.mapper;

import nira.erp.company.infrastructure.mapper.CompanyMapper;
import nira.erp.customer.application.command.CustomerCreateCommand;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = CompanyMapper.class)
public interface ICustomerCreateCommandMapper {

    @Mapping(target = "countryId", source = "country.countryId")
    @Mapping(target = "companyId", source = "company.companyId")
    @Mapping(ignore = true, target = "address")
    @Mapping(ignore = true, target = "cityId")
    CustomerCreateCommand toCommand(CustomerModel customerModel);

    @Mapping(target = "country.countryId", source = "countryId")
    @Mapping(target = "company.companyId", source = "companyId")
    @Mapping(ignore = true, target = "addresses")
    CustomerModel toModel(CustomerCreateCommand customerCommand);

}
