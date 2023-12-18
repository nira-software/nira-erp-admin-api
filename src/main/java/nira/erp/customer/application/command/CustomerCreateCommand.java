package nira.erp.customer.application.command;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Estructura de datos para crear un cliente.
 * typePort: Input
 */
@Getter
@Setter
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