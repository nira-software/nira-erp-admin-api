package nira.erp.customer.domain.model;

import nira.erp.company.domain.model.CompanyModel;

import java.util.UUID;

public class CustomerModel {

    /**
     * Identificador del cliente.
     */
    public UUID customerId;

    /**
     * Identificador de la empresa.
     */
    public UUID companyId;

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
    public UUID countryId;

    /**
     * Empresa del cliente.
     */
    public CompanyModel company;

}
