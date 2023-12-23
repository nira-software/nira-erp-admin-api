package nira.erp.customer.domain.model;

import lombok.Getter;
import lombok.Setter;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.country.domain.model.model.CountryModel;

import java.util.List;
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
     * Direcciones del cliente.
     */
    private List<CustomerAddressModel> addresses;

    /**
     * Pais del cliente.
     */
    private CountryModel country;

    /**
     * Empresa del cliente.
     */
    private CompanyModel company;

}
