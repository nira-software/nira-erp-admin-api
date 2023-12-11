package nira.erp.customer.application.port.out;

import nira.erp.customer.domain.model.CustomerModel;

public interface CreateCustomerPort {
    CustomerModel createCustomer(CustomerModel customerModel);
}
