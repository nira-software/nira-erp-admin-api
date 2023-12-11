package nira.erp.customer.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.factory.Mappers;

@ApplicationScoped
public class CustomerCreateCommandMapper {

    private final ICustomerCreateCommandMapper INSTANCE = Mappers.getMapper(ICustomerCreateCommandMapper.class);

    public CustomerCreateCommand toCommand(CustomerModel customerModel) {
        return INSTANCE.toCommand(customerModel);
    }

    public CustomerModel toModel(CustomerCreateCommand customerCommand) {
        return INSTANCE.toModel(customerCommand);
    }

}
