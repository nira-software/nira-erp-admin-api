package nira.erp.company.infrastructure.out.port;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class CompanyPersistenceAdapterTest {

    @Inject
    CompanyPersistenceAdapter companyPersistenceAdapter;

    UUID companyId;

    @BeforeEach
    void setUp() {
        companyId = UUID.fromString("97b33f1f-9874-43d4-893f-2a7f34e7eb41");
    }

    @Test
    void loadCompany() {
        CompanyEntity entity = companyPersistenceAdapter.loadCompany(companyId);
        assertNotNull(entity);
        assertEquals(companyId, entity.companyId);
    }
}