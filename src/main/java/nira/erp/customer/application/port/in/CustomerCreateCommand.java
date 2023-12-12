package nira.erp.customer.application.port.in;

import java.util.UUID;

/**
 * Estructura de datos para crear un cliente.
 * typePort: Input
 */
public class CustomerCreateCommand {

    /**
     * Identificador de la empresa.
     */
    public UUID companyId;
    
    /**
     * Identificador del cliente.
     */
    public String customerId;

    /**
     * Nombre del cliente.
     */
    public String name;

    /**
     * Correo electrónico del cliente.
     */
    public String email;

    /**
     * Nombre Comercial del cliente.
     */
    public String tradeName;

    /**
     * Telefono del cliente.
     */
    public String phoneNumber;

    /**
     * Pais del cliente.
     */
    public String countryId;
}
