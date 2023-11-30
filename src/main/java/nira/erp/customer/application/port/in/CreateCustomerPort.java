package nira.erp.customer.application.port.in;

import nira.erp.customer.domain.model.Customer;

/**
 * Contrato que se debe implementar para crear un cliente.
 * typePort: Input
 */
public interface CreateCustomerPort {
    Customer createCustomer(Customer customer);
}
