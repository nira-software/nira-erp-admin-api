package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "cities")
public class City extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "city_id")
    public UUID cityId;

    @Column(name = "state_id")
    public UUID stateId;

    @Column(name = "city_code")
    public String cityCode;

    @Column(name = "city_name")
    public String cityName;

    @Column(name = "is_active")
    public boolean isActive;
}


