package nira.erp.customer.infrastructure.in.web;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nira.erp.customer.application.port.in.CreateCustomerPort;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import nira.erp.core.application.port.out.MapperJson;


@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v1/customer/create")
public class CreateCustomerController {
    @Inject
    CreateCustomerPort createCustomerPort;

    @Inject
    MapperJson mapperJson;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public CustomerCreateCommand create(CustomerCreateCommand customer) {
        return this.createCustomerPort.save(customer);
    }
}
