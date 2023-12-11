package nira.erp.core.infrastructure.persistence.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;

import java.util.UUID;

@ApplicationScoped
public class CompanyRepository implements PanacheRepositoryBase<CompanyEntity, UUID> {
}
