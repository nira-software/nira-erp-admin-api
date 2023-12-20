package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "customers")
public class CustomerEntity extends PanacheEntityBase {

    @Id
    @Column(name = "customer_id")
    public UUID customerId;

    @Column(name = "name")
    public String name;

    @Column(name = "trade_name")
    public String tradeName;

    @Column(name = "email")
    public String email;

    @Column(name = "phone_number")
    public String phoneNumber;

    // Claves foráneas
    @ManyToOne()
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    public CompanyEntity companyEntity;

    @ManyToOne()
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    public CountryEntity countryEntity;
}
