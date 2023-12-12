package nira.erp.company.infrastructure.mapper;

import nira.erp.company.domain.model.CompanyModel;
import nira.erp.core.infrastructure.persistence.entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper()
public interface ICompanyMapper {

    CompanyEntity toEntity(CompanyModel companyModel);

    @Mapping(target = "address", ignore = true)
    CompanyModel toModel(CompanyEntity companyEntity);
}
