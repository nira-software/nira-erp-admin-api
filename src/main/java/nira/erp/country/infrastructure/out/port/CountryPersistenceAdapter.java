package nira.erp.country.infrastructure.out.port;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.core.infrastructure.persistence.entity.CountryEntity;
import nira.erp.core.infrastructure.persistence.repository.CountryRepository;
import nira.erp.country.application.port.out.LoadCountryPort;
import nira.erp.country.infrastructure.mapper.CountryMapper;

import java.util.UUID;

@ApplicationScoped
public class CountryPersistenceAdapter implements LoadCountryPort {

    @Inject
    CountryRepository countryRepository;

    @Inject
    CountryMapper companyMapper;

    @Override
    public CountryEntity loadCountry(UUID countryId) {
        return countryRepository.findById(countryId);
    }
}
