package nira.erp.customer.application.port.in;

import nira.erp.customer.application.command.LoadCustomerCommand;
import nira.erp.core.application.port.out.NiraResponse;

/**
 * Contrato que se debe implementar un servicio para buscar por el ID un cliente.
 * typePort: Input
 */
public interface LoadCustomerInPort {
    NiraResponse load(LoadCustomerCommand customer);
}
