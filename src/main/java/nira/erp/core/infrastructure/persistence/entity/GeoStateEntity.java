package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "geo_states")
public class GeoStateEntity extends PanacheEntityBase {

    @Id
    @Column(name = "state_id")
    public UUID stateId;

    @Column(name = "state_code")
    public String stateCode;

    @Column(name = "state_name")
    public String stateName;

    @Column(name = "active")
    public boolean active;

    @ManyToOne()
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    public GeoCountryEntity country;

    @OneToMany(mappedBy = "state")
    public List<GeoCityEntity> cities;

}

