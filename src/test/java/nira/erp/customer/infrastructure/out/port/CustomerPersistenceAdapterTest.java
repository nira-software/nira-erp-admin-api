
package nira.erp.customer.infrastructure.out.port;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.country.domain.model.model.CountryModel;
import nira.erp.customer.domain.model.CustomerModel;
import org.junit.jupiter.api.*;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerPersistenceAdapterTest {

    @Inject
    CustomerPersistenceAdapter customerPersistenceAdapter;

    CustomerModel customerModel;

    CustomerEntity customerEntity;

    UUID customerId;

    @BeforeEach
    void setUp() {
        // generate random UUID
        customerId = UUID.fromString("9d11ba25-824e-46e4-be20-c164e9e8d7ed");

        UUID companyId = UUID.fromString("97b33f1f-9874-43d4-893f-2a7f34e7eb41");
        CompanyModel companyModel = new CompanyModel();
        companyModel.setCompanyId(companyId);
        customerModel = new CustomerModel();

        UUID countryId = UUID.fromString("f64f2d7f-f871-4e8b-8cb1-223655d277bf");
        CountryModel countryModel = new CountryModel();
        countryModel.setCountryId(countryId);

        customerModel.setCustomerId(customerId);
        customerModel.setName("Cliente Test");
        customerModel.setEmail("test@domain.test");
        customerModel.setPhoneNumber("70135454");
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
    @Order(2)
    void loadCustomer() {
        CustomerModel customerExisted = customerPersistenceAdapter.loadCustomer(customerId);
        assertEquals(customerModel.getCustomerId(), customerExisted.getCustomerId());
        assertEquals(customerModel.getName(), customerExisted.getName());
        assertEquals(customerModel.getEmail(), customerExisted.getEmail());
    }

    @Test
    @Order(1)
    @Transactional
    void createCustomer() {
        CustomerModel customerExisted = customerPersistenceAdapter.createCustomer(customerModel);
        assertEquals(customerModel.getCustomerId(), customerExisted.getCustomerId());
        assertEquals(customerModel.getName(), customerExisted.getName());
        assertEquals(customerModel.getEmail(), customerExisted.getEmail());
    }
}
