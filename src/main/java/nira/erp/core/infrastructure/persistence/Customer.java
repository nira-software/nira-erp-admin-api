package nira.erp.core.infrastructure.persistence;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "customers")
public class Customer extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "customer_id")
    public UUID customerId;

    @Column(name = "company_id")
    public UUID companyId;

    @Column(name = "name")
    public String name;

    @Column(name = "trade_name")
    public String tradeName;

    @Column(name = "email")
    public String email;

    @Column(name = "phone_number")
    public String phoneNumber;

    @Column(name = "country_id")
    public UUID countryId;

    // Otros campos según sea necesario

    // Claves foráneas
    @ManyToOne
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    public Company company;

    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    public Country country;
}
