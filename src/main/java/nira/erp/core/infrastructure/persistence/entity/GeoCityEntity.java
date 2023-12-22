package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "geo_cities")
public class GeoCityEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "city_id")
    public UUID cityId;

    @Column(name = "city_code")
    public String cityCode;

    @Column(name = "city_name")
    public String cityName;

    @Column(name = "active")
    public boolean active;

    @ManyToOne()
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    public GeoStateEntity state;

    @OneToMany(mappedBy = "city")
    public List<CustomerAddressEntity> customerAddresses;

}


