package nira.erp.customer.application.command;

import lombok.Data;

import java.util.UUID;

/**
 * Estructura de datos para crear un cliente.
 * typePort: Input
 */
@Data
public class LoadCustomerCommand {
    /**
     * Identificador del cliente.
     */
    private UUID customerId;
}
