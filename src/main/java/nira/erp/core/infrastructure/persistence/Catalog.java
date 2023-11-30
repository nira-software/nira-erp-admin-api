package nira.erp.core.infrastructure.persistence;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "catalogs")
public class Catalog extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "catalog_id")
    public UUID catalogId;

    @Column(name = "global_config_id")
    public UUID globalConfigId;

    @Column(name = "group_name")
    public String groupName;

    @Column(name = "is_active")
    public boolean isActive;
}

