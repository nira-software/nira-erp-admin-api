package nira.erp.country.application.port.out;

import nira.erp.core.infrastructure.persistence.entity.CountryEntity;

import java.util.UUID;

public interface LoadCountryPort {
    CountryEntity loadCountry(UUID companyId);
}
