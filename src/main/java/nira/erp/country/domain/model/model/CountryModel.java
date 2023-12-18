package nira.erp.country.domain.model.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

/**
 * Modelo de la empresa propietaria del toda la informacion del sistema.
 */
@Setter
@Getter
public class CountryModel {
    private UUID countryId;

    private String name;

    private String code;

    private boolean active;

}
