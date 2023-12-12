package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "countries")
public class CountryEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "country_id")
    public UUID countryId;

    @Column(name = "global_config_id")
    public UUID globalConfigId;

    @Column(name = "country_code")
    public String countryCode;

    @Column(name = "country_name")
    public String countryName;

    @Column(name = "is_active")
    public boolean isActive;
}

