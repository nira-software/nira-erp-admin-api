package nira.erp.core.infrastructure.persistence;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity(name = "companies")
public class Company extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "company_id")
    public UUID companyId;

    @Column(name = "trade_name")
    public String tradeName;

    @Column(name = "email")
    public String email;

    @Column(name = "address")
    public String address;

    @Column(name = "phone_number")
    public String phoneNumber;

    // Otros campos según sea necesario

    // Relación con la tabla de configuración global
    @OneToMany(mappedBy = "company")
    public List<CompanyGlobalConfig> companyGlobalConfigs;

    // Relación con la tabla de clientes
    @OneToMany(mappedBy = "company")
    public List<Customer> customers;
}
