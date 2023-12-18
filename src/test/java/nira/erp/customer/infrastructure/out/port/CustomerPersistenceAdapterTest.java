
package nira.erp.customer.infrastructure.out.port;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;

import jakarta.inject.Inject;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.core.infrastructure.persistence.repository.CustomerRepository;
import nira.erp.country.domain.model.model.CountryModel;
import nira.erp.customer.domain.model.CustomerModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class CustomerPersistenceAdapterTest {

    @InjectMock
    CustomerRepository customerRepository;

    @Inject
    CustomerPersistenceAdapter customerPersistenceAdapter;

    CustomerModel customerModel;

    CustomerEntity customerEntity;

    @BeforeEach
    void setUp() {
        // generate random UUID
        UUID customerId = UUID.randomUUID();

        UUID companyId = UUID.fromString("97b33f1f-9874-43d4-893f-2a7f34e7eb41");
        CompanyModel companyModel = new CompanyModel();
        companyModel.setCompanyId(companyId);
        customerModel = new CustomerModel();

        UUID countryId = UUID.fromString("f64f2d7f-f871-4e8b-8cb1-223655d277bf");
        CountryModel countryModel = new CountryModel();
        countryModel.setCountryId(countryId);

        customerModel.setCustomerId(customerId);
        customerModel.setName("Test");
        customerModel.setEmail("test@domain.com");
        customerModel.setPhoneNumber("1234567890");
        customerModel.setCompany(new CompanyModel());
        customerModel.setCompany(companyModel);
        customerModel.setCountry(countryModel);

        customerEntity = new CustomerEntity();
        customerEntity.customerId = customerModel.getCustomerId();
        customerEntity.name = customerModel.getName();
        customerEntity.email = customerModel.getEmail();
        customerEntity.phoneNumber = customerModel.getPhoneNumber();
    }

    @Test
    void loadCustomer() {
        Mockito.when(customerRepository.findById(customerModel.getCustomerId())).thenReturn(customerEntity);
        CustomerModel customerExisted = customerPersistenceAdapter.loadCustomer(customerModel.getCustomerId());
        assertEquals(customerModel.getCustomerId(), customerExisted.getCustomerId());
        assertEquals(customerModel.getName(), customerExisted.getName());
        assertEquals(customerModel.getEmail(), customerExisted.getEmail());
    }
}
