package nira.erp.customer.application.port.out;

import nira.erp.customer.domain.model.CustomerModel;

import java.util.UUID;

public interface LoadCustomerOutPort {
    CustomerModel loadCustomer(UUID customerId);
}
