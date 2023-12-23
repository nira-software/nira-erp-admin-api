package nira.erp.customer.infrastructure.mapper;

import nira.erp.core.infrastructure.persistence.entity.CustomerAddressEntity;
import nira.erp.customer.domain.model.CustomerAddressModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ICustomerAddressMapper {

    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "customer", ignore = true)
    CustomerAddressEntity toEntity(CustomerAddressModel model);

    CustomerAddressModel toModel(CustomerAddressEntity entity);
}
