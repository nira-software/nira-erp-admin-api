package nira.erp.company.infrastructure.out.port;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.company.application.port.out.LoadCompanyPort;
import nira.erp.company.infrastructure.mapper.CompanyMapper;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import nira.erp.core.infrastructure.persistence.repository.CompanyRepository;

import java.util.UUID;

@ApplicationScoped
public class CompanyPersistenceAdapter implements LoadCompanyPort {

    @Inject
    CompanyRepository companyRepository;

    @Inject
    CompanyMapper companyMapper;

    @Override
    public CompanyEntity loadCompany(UUID companyId) {
        return companyRepository.findById(companyId);
    }
}
