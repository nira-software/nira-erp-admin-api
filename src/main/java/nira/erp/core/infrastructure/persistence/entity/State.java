package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "states")
public class State extends PanacheEntityBase {

    @Id
    @Column(name = "state_id")
    public UUID stateId;

    @Column(name = "country_id")
    public UUID countryId;

    @Column(name = "state_code")
    public String stateCode;

    @Column(name = "state_name")
    public String stateName;

    @Column(name = "active")
    public boolean active;
}

