package nira.erp.customer.domain.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
public class CustomerAddressModel  implements Serializable {
    private UUID addressId;
    private String type;
    private String streetAddress;
    private UUID cityId;
    private String postalCode;
    private boolean active;
}
