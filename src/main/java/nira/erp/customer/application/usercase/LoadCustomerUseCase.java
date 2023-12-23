package nira.erp.customer.application.usercase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;
import nira.erp.core.application.port.out.NiraResponse;
import nira.erp.customer.application.command.LoadCustomerCommand;
import nira.erp.customer.application.port.in.LoadCustomerInPort;
import nira.erp.customer.domain.model.CustomerModel;
import nira.erp.customer.infrastructure.out.port.CustomerPersistenceAdapter;

/**
 * Implementacion de caso de uso para crear un cliente
 */
@ApplicationScoped
public class LoadCustomerUseCase implements LoadCustomerInPort {

    @Inject
    CustomerPersistenceAdapter customerPersistenceAdapter;


    @Override
    public NiraResponse load(LoadCustomerCommand customer) {
        CustomerModel customerModel = customerPersistenceAdapter.loadCustomer(customer.getCustomerId());
        return new NiraResponse(Response.Status.OK, "Client loaded", customerModel);
    }
}