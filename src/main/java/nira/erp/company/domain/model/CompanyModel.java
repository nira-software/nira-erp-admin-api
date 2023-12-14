package nira.erp.company.domain.model;

import lombok.Data;

import java.util.UUID;

/**
 * Modelo de la empresa propietaria del toda la informacion del sistema.
 */
@Data
public class CompanyModel {
    private UUID companyId;

    private String tradeName;

    private String email;

    private String address;

    private String phoneNumber;

}
