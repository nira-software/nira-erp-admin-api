package nira.erp.customer.application.port.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Estructura de datos para crear un cliente.
 * typePort: Input
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreateCommand {
    /**
     * Identificador del cliente.
     */
    private String customerId;

    /**
     * Nombre del cliente.
     */
    private String name;

    /**
     * Correo electrónico del cliente.
     */
    private String email;

    /**
     * Nombre Comercial del cliente.
     */
    private String tradeName;

    /**
     * Telefono del cliente.
     */
    private String phoneNumber;

    /**
     * Pais del cliente.
     */
    private String countryId;
}
