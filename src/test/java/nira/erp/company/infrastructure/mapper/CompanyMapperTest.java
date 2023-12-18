package nira.erp.company.infrastructure.mapper;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.company.infrastructure.out.port.CompanyPersistenceAdapter;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import org.junit.jupiter.api.*;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CompanyMapperTest {

    @Inject
    CompanyPersistenceAdapter companyPersistenceAdapter;

    @Inject
    CompanyMapper companyMapper;

    CompanyModel companyModel;

    CompanyEntity companyEntity;

    UUID companyId;


    @BeforeEach
    void setUp() {
        companyId = UUID.fromString("97b33f1f-9874-43d4-893f-2a7f34e7eb41");
    }

    @Test
    @Order(1)
    void toEntity() {
        companyEntity = companyPersistenceAdapter.loadCompany(companyId);
        companyModel = companyMapper.toModel(companyEntity);
        assertNotNull(companyModel);
        assertEquals(companyId, companyModel.getCompanyId());
    }

    @Test
    @Order(2)
    void toModel() {
        companyEntity = companyPersistenceAdapter.loadCompany(companyId);
        companyModel = companyMapper.toModel(companyEntity);
        CompanyEntity companyEntityNew = companyMapper.toEntity(companyModel);
        assertNotNull(companyEntityNew);
        assertEquals(companyEntityNew.companyId, companyEntity.companyId);
    }
}