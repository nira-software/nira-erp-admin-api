package nira.erp.customer.application.port.in;

import nira.erp.core.application.port.out.NiraResponse;
import nira.erp.customer.application.command.CustomerCreateCommand;

/**
 * Contrato que se debe implementar un servicio para crear un cliente.
 * typePort: Input
 */
public interface CreateCustomerInPort {
    NiraResponse save(CustomerCreateCommand customer);
}
