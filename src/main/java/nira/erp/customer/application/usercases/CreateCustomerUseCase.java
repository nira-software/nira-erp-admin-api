package nira.erp.customer.application.usercases;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.customer.application.port.in.CreateCustomerPort;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import nira.erp.customer.domain.model.CustomerModel;
import nira.erp.customer.infrastructure.mapper.CustomerCreateCommandMapper;
import nira.erp.customer.infrastructure.out.port.CustomerPersistenceAdapter;

/**
 * Implementacion de caso de uso para crear un cliente
 */
@ApplicationScoped
public class CreateCustomerUseCase implements CreateCustomerPort {

    @Inject
    CustomerPersistenceAdapter customerPersistenceAdapter;

    @Inject
    CustomerCreateCommandMapper customerCreateCommandMapper;


    @Override
    public CustomerCreateCommand save(CustomerCreateCommand customerCreateCommand) {
        // CompanyModel company = companyPersistenceAdapter.loadCompany(customerCreateCommand.companyId);
        CustomerModel customerModel = customerCreateCommandMapper.toModel(customerCreateCommand);
        // customerModel.company = company;
        customerPersistenceAdapter.createCustomer(customerModel);
        return customerCreateCommand;
    }
}
