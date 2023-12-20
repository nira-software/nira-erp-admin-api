package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity(name = "customer_addresses")
public class CustomerAddress extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "address_id")
    public UUID addressId;

    @Column(name = "customer_id")
    public UUID customerId;

    @Column(name = "type", nullable = false)
    public String type;

    @Column(name = "street_address", nullable = false)
    public String streetAddress;

    @Column(name = "city_id")
    public UUID cityId;

    @Column(name = "postal_code")
    public String postalCode;

    @Column(name = "active")
    public boolean active;

    @Column(name = "created_at")
    public Timestamp createdAt;

    @Column(name = "updated_at")
    public Timestamp updatedAt;

    // Otros campos según sea necesario
}
