package nira.erp.customer.application.port.in;

/**
 * Contrato que se debe implementar un servicio para crear un cliente.
 * typePort: Input
 */
public interface CreateCustomerPort {
    CustomerCreateCommand save(CustomerCreateCommand customer);
}
