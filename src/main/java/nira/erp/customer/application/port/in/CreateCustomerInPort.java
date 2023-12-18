package nira.erp.customer.application.port.in;

import nira.erp.customer.application.command.CustomerCreateCommand;
import nira.erp.customer.application.port.out.NiraResponse;

/**
 * Contrato que se debe implementar un servicio para crear un cliente.
 * typePort: Input
 */
public interface CreateCustomerInPort {
    NiraResponse save(CustomerCreateCommand customer);
}
