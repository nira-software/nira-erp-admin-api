package nira.erp.customer.application.usercases;

import nira.erp.customer.application.port.in.CreateCustomerPort;
import nira.erp.customer.application.port.in.CustomerCreateCommand;

/**
 * Implementacion de caso de uso para crear un cliente
 */
public class CreateCustomer implements CreateCustomerPort {
    @Override
    public Boolean createCustomer(CustomerCreateCommand customer) {
        return false;
    }
}
