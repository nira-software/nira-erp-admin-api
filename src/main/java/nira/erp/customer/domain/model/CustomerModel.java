package nira.erp.customer.domain.model;

import lombok.Data;
import nira.erp.company.domain.model.CompanyModel;

import java.util.UUID;

@Data
public class CustomerModel {

    /**
     * Identificador del cliente.
     */
    private UUID customerId;

    /**
     * Identificador de la empresa.
     */
    private UUID companyId;

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
    private UUID countryId;

    /**
     * Empresa del cliente.
     */
    private CompanyModel company;

}
