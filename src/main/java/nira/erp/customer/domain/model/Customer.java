package nira.erp.customer.domain.model;

import lombok.Data;

@Data
public class Customer {

    private String customerId;
    private String name;
    private String email;
    private String tradeName;
    private String phoneNumber;
    private String countryId;

}
