package nira.erp.customer.infrastructure.out.port;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.core.infrastructure.persistence.entity.*;
import nira.erp.core.infrastructure.persistence.repository.*;
import nira.erp.customer.application.port.out.CreateCustomerOutPort;
import nira.erp.customer.application.port.out.LoadCustomerOutPort;
import nira.erp.customer.domain.model.CustomerModel;
import nira.erp.customer.infrastructure.mapper.CustomerMapper;

import java.sql.Timestamp;
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

    @Inject
    CustomerAddressRepository customerAddressRepository;

    @Inject
    GeoCityRepository geoCityRepository;

    @Inject
    GeoCountryRepository geoCountryRepository;

    @Inject
    CompanyRepository companyRepository;

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
        GeoCityEntity geoCityEntity = geoCityRepository.findById(customerModel.getAddresses().get(0).getCityId());
        GeoCountryEntity geoCountryEntity = this.loadCountry(customerModel.getCountry().getCountryId());
        CompanyEntity companyEntity = this.loadCompany(customerModel.getCompany().getCompanyId());

        CustomerEntity customerEntity = customerMapper.toEntity(customerModel);
        customerEntity.company = companyEntity;
        customerEntity.country = geoCountryEntity;
        customerEntity.addresses.get(0).city = geoCityEntity;

        customerRepository.getEntityManager().merge(customerEntity);
        customerAddressRepository.getEntityManager().merge(createCustomerAddress(customerEntity));

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
    private GeoCountryEntity loadCountry(UUID countryId) {
        GeoCountryEntity country = geoCountryRepository.findById(countryId);
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
        CompanyEntity company = companyRepository.findById(companyId);
        if (company == null) {
            throw new IllegalArgumentException("Company not found");
        }
        return company;
    }

    private CustomerAddressEntity createCustomerAddress(CustomerEntity customer) {
        CustomerAddressEntity customerAddressEntity = customer.addresses.get(0);
        customerAddressEntity.createdAt = new Timestamp(System.currentTimeMillis());
        customerAddressEntity.customer = customer;
        return customerAddressEntity;
    }
}
