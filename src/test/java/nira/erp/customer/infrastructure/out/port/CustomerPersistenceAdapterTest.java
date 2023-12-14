package nira.erp.customer.infrastructure.out.port;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;

import jakarta.inject.Inject;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.core.infrastructure.persistence.repository.CustomerRepository;
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
        customerModel = new CustomerModel();
        // generate random UUID
        UUID uuid = UUID.randomUUID();
        customerModel.setCustomerId(uuid);
        customerModel.setName("Test");
        customerModel.setEmail("test@domain.com");
        customerModel.setPhoneNumber("1234567890");
        customerModel.setCompany(new CompanyModel());
        customerModel.setCompanyId(UUID.randomUUID());
        customerModel.setCountryId(UUID.randomUUID());

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