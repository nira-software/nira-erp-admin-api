package nira.erp.country.infrastructure.out.port;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.core.infrastructure.persistence.entity.GeoCountryEntity;
import nira.erp.core.infrastructure.persistence.repository.GeoCountryRepository;
import nira.erp.country.application.port.out.LoadCountryPort;

import java.util.UUID;

@ApplicationScoped
public class CountryPersistenceAdapter implements LoadCountryPort {

    @Inject
    GeoCountryRepository geoCountryRepository;

    @Override
    public GeoCountryEntity loadCountry(UUID countryId) {
        return geoCountryRepository.findById(countryId);
    }
}
