package nira.erp.customer.application.usercases;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.customer.application.port.in.CreateCustomerPort;
import nira.erp.customer.application.port.in.CustomerCreateCommand;

/**
 * Implementacion de caso de uso para crear un cliente
 */
@ApplicationScoped
public class CreateCustomer implements CreateCustomerPort {
    @Override
    public Boolean createCustomer(CustomerCreateCommand customer) {
        return false;
    }
}
