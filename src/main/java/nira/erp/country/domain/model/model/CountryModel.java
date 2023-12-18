package nira.erp.country.domain.model.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

/**
 * Modelo de la empresa propietaria del toda la informacion del sistema.
 */
@Data
public class CountryModel {
    private UUID countryId;

    private String name;

    private String code;

    private boolean active;

}
