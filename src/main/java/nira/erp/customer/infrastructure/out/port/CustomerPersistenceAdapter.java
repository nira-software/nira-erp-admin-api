package nira.erp.customer.infrastructure.out.port;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.company.infrastructure.out.port.CompanyPersistenceAdapter;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import nira.erp.core.infrastructure.persistence.entity.CountryEntity;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.core.infrastructure.persistence.repository.CustomerRepository;
import nira.erp.country.infrastructure.out.port.CountryPersistenceAdapter;
import nira.erp.customer.application.port.out.CreateCustomerPort;
import nira.erp.customer.application.port.out.LoadCustomerPort;
import nira.erp.customer.domain.model.CustomerModel;
import nira.erp.customer.infrastructure.mapper.CustomerMapper;

import java.util.UUID;

@ApplicationScoped
public class CustomerPersistenceAdapter implements LoadCustomerPort, CreateCustomerPort {

    @Inject
    CustomerRepository customerRepository;

    @Inject
    CompanyPersistenceAdapter companyPersistenceAdapter;

    @Inject
    CountryPersistenceAdapter countryPersistenceAdapter;

    @Inject
    CustomerMapper customerMapper;

    @Override
    public CustomerModel createCustomer(CustomerModel customerModel) {
        CountryEntity countryEntity = countryPersistenceAdapter.loadCountry(customerModel.getCountryId());
        CompanyEntity companyEntity = companyPersistenceAdapter.loadCompany(customerModel.getCompanyId());
        CustomerEntity customerEntity = customerMapper.toEntity(customerModel);
        customerEntity.companyEntity = companyEntity;
        customerEntity.countryEntity = countryEntity;
        customerRepository.getEntityManager().merge(customerEntity);
        return customerModel;
    }

    @Override
    public CustomerModel loadCustomer(UUID customerId) {
        CustomerEntity customerEntity = customerRepository.findById(customerId);
        return customerMapper.toModel(customerEntity);
    }
}
