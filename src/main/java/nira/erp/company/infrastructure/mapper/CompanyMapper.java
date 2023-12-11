package nira.erp.company.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.company.domain.model.CompanyModel;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import org.mapstruct.factory.Mappers;

@ApplicationScoped
public class CompanyMapper {
    public static final ICompanyMapper INSTANCE = Mappers.getMapper(ICompanyMapper.class);

    public CompanyEntity toEntity(CompanyModel companyModel) {
        return INSTANCE.toEntity(companyModel);
    }

    public CompanyModel toModel(CompanyEntity companyEntity) {
        return INSTANCE.toModel(companyEntity);
    }
}
