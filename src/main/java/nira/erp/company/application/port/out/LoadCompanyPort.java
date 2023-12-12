package nira.erp.company.application.port.out;

import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;

import java.util.UUID;

public interface LoadCompanyPort {
    CompanyEntity loadCompany(UUID companyId);
}
