package nira.erp.country.application.port.out;

import nira.erp.core.infrastructure.persistence.entity.GeoCountryEntity;

import java.util.UUID;

public interface LoadCountryPort {
    GeoCountryEntity loadCountry(UUID companyId);
}
