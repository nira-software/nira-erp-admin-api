package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity(name = "geo_countries")
public class GeoCountryEntity extends PanacheEntityBase {

    @Id
    @Column(name = "country_id")
    public UUID countryId;

    @Column(name = "country_code")
    public String countryCode;

    @Column(name = "country_name")
    public String countryName;

    @Column(name = "active")
    public boolean active;

    @OneToMany(mappedBy = "country")
    public List<GeoStateEntity> states;

    @OneToMany(mappedBy = "country")
    public List<CustomerEntity> customers;
}

