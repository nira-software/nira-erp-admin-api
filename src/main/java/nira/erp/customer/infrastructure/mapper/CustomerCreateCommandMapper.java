package nira.erp.customer.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.customer.application.command.CustomerCreateCommand;
import nira.erp.customer.domain.model.CustomerAddressModel;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.UUID;

@ApplicationScoped
public class CustomerCreateCommandMapper {

    private final ICustomerCreateCommandMapper instance = Mappers.getMapper(ICustomerCreateCommandMapper.class);

    public CustomerCreateCommand toCommand(CustomerModel customerModel) {
        CustomerCreateCommand command = instance.toCommand(customerModel);
        if (customerModel.getAddresses() != null && !customerModel.getAddresses().isEmpty()) {
            command.setAddress(customerModel.getAddresses().get(0).getStreetAddress());
        }
        return command;
    }

    public CustomerModel toModel(CustomerCreateCommand customerCommand) {
        CustomerModel model = instance.toModel(customerCommand);

        if (customerCommand.getAddress() != null && !customerCommand.getAddress().isEmpty()) {
            ArrayList<CustomerAddressModel> addresses = new ArrayList<>();
            CustomerAddressModel address = new CustomerAddressModel();
            address.setStreetAddress(customerCommand.getAddress());
            address.setCityId(UUID.fromString(customerCommand.getCityId()));
            // TODO: set type
            address.setType("BILLING");
            address.setActive(true);
            addresses.add(address);
            model.setAddresses(addresses);
        }
        return model;
    }

}
