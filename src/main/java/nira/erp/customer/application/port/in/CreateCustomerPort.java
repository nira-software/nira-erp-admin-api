package nira.erp.customer.application.port.in;

import nira.erp.core.infrastructure.out.api.NiraResponse;

/**
 * Contrato que se debe implementar un servicio para crear un cliente.
 * typePort: Input
 */
public interface CreateCustomerPort {
    NiraResponse save(CustomerCreateCommand customer);
}
