package nira.erp.customer.infrastructure.out.port;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.company.infrastructure.out.port.CompanyPersistenceAdapter;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import nira.erp.core.infrastructure.persistence.entity.CountryEntity;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.core.infrastructure.persistence.repository.CustomerRepository;
import nira.erp.country.infrastructure.out.port.CountryPersistenceAdapter;
import nira.erp.customer.application.port.out.CreateCustomerOutPort;
import nira.erp.customer.application.port.out.LoadCustomerOutPort;
import nira.erp.customer.domain.model.CustomerModel;
import nira.erp.customer.infrastructure.mapper.CustomerMapper;

import java.util.UUID;

/**
 * Adaptador de persistencia para el modulo de clientes
 */
@ApplicationScoped
public class CustomerPersistenceAdapter implements LoadCustomerOutPort, CreateCustomerOutPort {

    /**
     * Repositorio de clientes
     */
    @Inject
    CustomerRepository customerRepository;

    /**
     * Adaptador de persistencia para el modulo de Compañias
     */
    @Inject
    CompanyPersistenceAdapter companyPersistenceAdapter;

    /**
     * Adaptador de persistencia para el modulo de paises
     */
    @Inject
    CountryPersistenceAdapter countryPersistenceAdapter;

    /**
     * Mapper para convertir de modelo a entidad
     */
    @Inject
    CustomerMapper customerMapper;

    /**
     * Crea un cliente
     *
     * @param customerModel modelo de cliente
     * @return modelo de cliente
     */
    @Override
    public CustomerModel createCustomer(CustomerModel customerModel) {
        CountryEntity countryEntity = this.loadCountry(customerModel.getCountry().getCountryId());
        CompanyEntity companyEntity = this.loadCompany(customerModel.getCompany().getCompanyId());
        CustomerEntity customerEntity = customerMapper.toEntity(customerModel);
        customerEntity.companyEntity = companyEntity;
        customerEntity.countryEntity = countryEntity;
        customerRepository.getEntityManager().merge(customerEntity);
        return customerMapper.toModel(customerEntity);
    }

    /**
     * Carga un cliente
     *
     * @param customerId id de cliente
     * @return modelo de cliente
     */
    @Override
    public CustomerModel loadCustomer(UUID customerId) {
        CustomerEntity customerEntity = customerRepository.findById(customerId);
        if (customerEntity == null) {
            throw new IllegalArgumentException("Customer not found");
        }
        return customerMapper.toModel(customerEntity);
    }

    /**
     * Carga un pais
     *
     * @param countryId id de pais
     * @return entidad de pais
     */
    private CountryEntity loadCountry(UUID countryId) {
        CountryEntity country = countryPersistenceAdapter.loadCountry(countryId);
        if (country == null) {
            throw new IllegalArgumentException("Country not found");
        }
        return country;
    }

    /**
     * Carga una compañia
     *
     * @param companyId id de compañia
     * @return entidad de compañia
     */
    private CompanyEntity loadCompany(UUID companyId) {
        CompanyEntity company = companyPersistenceAdapter.loadCompany(companyId);
        if (company == null) {
            throw new IllegalArgumentException("Company not found");
        }
        return company;
    }
}
