package nira.erp.customer.application.port.in;

import lombok.Data;

import java.util.UUID;

/**
 * Estructura de datos para crear un cliente.
 * typePort: Input
 */
@Data
public class CustomerCreateCommand {

    /**
     * Identificador de la empresa.
     */
    private String companyId;
    
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
