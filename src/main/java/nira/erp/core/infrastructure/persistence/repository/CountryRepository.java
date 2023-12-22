package nira.erp.core.infrastructure.persistence.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.core.infrastructure.persistence.entity.GeoCountryEntity;

import java.util.UUID;


@ApplicationScoped
public class CountryRepository implements PanacheRepositoryBase<GeoCountryEntity, UUID> {
}
