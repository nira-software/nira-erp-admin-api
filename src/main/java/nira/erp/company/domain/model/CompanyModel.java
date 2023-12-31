package nira.erp.company.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

/**
 * Modelo de la empresa propietaria del toda la informacion del sistema.
 */
@Getter
@Setter
public class CompanyModel implements Serializable {
    private UUID companyId;

    private String tradeName;

    private String email;

    private String address;

    private String phoneNumber;

}
