package nira.erp.customer.domain.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.country.domain.model.model.CountryModel;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
public class CustomerModel {

    /**
     * Identificador del cliente.
     */
    private UUID customerId;

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
    private CountryModel country;

    /**
     * Empresa del cliente.
     */
    private CompanyModel company;

}
