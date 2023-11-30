package nira.erp.customer.domain.model;

import lombok.Data;

@Data
public class Customer {

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
