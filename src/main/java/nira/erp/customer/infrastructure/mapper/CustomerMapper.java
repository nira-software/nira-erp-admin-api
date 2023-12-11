package nira.erp.customer.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.factory.Mappers;

@ApplicationScoped
public class CustomerMapper {

    private final ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);


    public CustomerEntity toEntity(CustomerModel customerModel) {
        return INSTANCE.toEntity(customerModel);
    }

    public CustomerModel toModel(CustomerEntity customerEntity) {
        return INSTANCE.toModel(customerEntity);
    }
}
