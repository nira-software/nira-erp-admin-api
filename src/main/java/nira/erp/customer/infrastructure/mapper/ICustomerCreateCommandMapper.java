package nira.erp.customer.infrastructure.mapper;

import nira.erp.company.infrastructure.mapper.CompanyMapper;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = CompanyMapper.class)
public interface ICustomerCreateCommandMapper {

    CustomerCreateCommand toCommand(CustomerModel customerModel);

    CustomerModel toModel(CustomerCreateCommand customerCommand);

}