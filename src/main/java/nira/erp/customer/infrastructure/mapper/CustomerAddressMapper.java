package nira.erp.customer.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.core.infrastructure.persistence.entity.CustomerAddressEntity;
import nira.erp.customer.domain.model.CustomerAddressModel;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CustomerAddressMapper {

    private final ICustomerAddressMapper instance = Mappers.getMapper(ICustomerAddressMapper.class);

    public CustomerAddressEntity toEntity(CustomerAddressModel model) {
        return instance.toEntity(model);
    }

    public CustomerAddressModel toModel(CustomerAddressEntity entity) {
        return instance.toModel(entity);
    }

    public List<CustomerAddressEntity> toEntityList(List<CustomerAddressModel> models) {
        return models.stream()
                .map(this::toEntity)
                .collect(Collectors.toList());
    }

    public List<CustomerAddressModel> toModelList(List<CustomerAddressEntity> entities) {
        return entities.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
