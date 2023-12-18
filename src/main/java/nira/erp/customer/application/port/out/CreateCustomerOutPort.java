package nira.erp.customer.application.port.out;

import nira.erp.customer.domain.model.CustomerModel;

public interface CreateCustomerOutPort {
    CustomerModel createCustomer(CustomerModel customerModel);
}
