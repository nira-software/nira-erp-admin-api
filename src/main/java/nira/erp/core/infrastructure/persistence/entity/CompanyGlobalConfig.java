package nira.erp.core.infrastructure.persistence.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "company_global_configs")
@IdClass(CompanyGlobalConfigId.class)
public class CompanyGlobalConfig extends PanacheEntityBase {

    @Id
    @Column(name = "company_id")
    public UUID companyId;

    @Id
    @Column(name = "global_config_id")
    public UUID globalConfigId;

    // Otros campos según sea necesario

    // Relación con la tabla de empresas
    @ManyToOne
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    public CompanyEntity companyEntity;

    // Relación con la tabla de configuración global
    @ManyToOne
    @JoinColumn(name = "global_config_id", insertable = false, updatable = false)
    public GlobalConfig globalConfig;
}
