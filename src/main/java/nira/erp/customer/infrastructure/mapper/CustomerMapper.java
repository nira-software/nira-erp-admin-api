package nira.erp.customer.infrastructure.mapper;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import nira.erp.core.infrastructure.persistence.entity.CustomerEntity;
import nira.erp.customer.domain.model.CustomerModel;
import org.mapstruct.factory.Mappers;

@ApplicationScoped
public class CustomerMapper {

    private final ICustomerMapper instance = Mappers.getMapper(ICustomerMapper.class);

    @Inject
    CustomerAddressMapper addressMapper;

    public CustomerEntity toEntity(CustomerModel customerModel) {
        CustomerEntity entity = instance.toEntity(customerModel);
        if (customerModel.getAddresses() != null && !customerModel.getAddresses().isEmpty()) {
            entity.addresses = addressMapper.toEntityList(customerModel.getAddresses());
        }
        return entity;
    }

    public CustomerModel toModel(CustomerEntity customerEntity) {
        CustomerModel model = instance.toModel(customerEntity);
        if (customerEntity.addresses != null && !customerEntity.addresses.isEmpty()) {
            model.setAddresses(addressMapper.toModelList(customerEntity.addresses));
        }
        return model;
    }
}
