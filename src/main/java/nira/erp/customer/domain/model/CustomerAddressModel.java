package nira.erp.customer.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class CustomerAddressModel {
    private UUID addressId;
    private String type;
    private String streetAddress;
    private UUID cityId;
    private String postalCode;
    private boolean active;
}
