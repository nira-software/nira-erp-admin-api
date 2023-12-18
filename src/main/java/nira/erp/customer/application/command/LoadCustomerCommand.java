package nira.erp.customer.application.command;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

/**
 * Estructura de datos para crear un cliente.
 * typePort: Input
 */
@Setter
@Getter
public class LoadCustomerCommand {
    /**
     * Identificador del cliente.
     */
    private UUID customerId;
}
