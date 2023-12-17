package nira.erp.customer.infrastructure.in.api;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nira.erp.core.application.port.out.MapperJson;
import nira.erp.core.infrastructure.out.api.NiraBadRequestException;
import nira.erp.core.infrastructure.out.api.NiraResponse;
import nira.erp.customer.application.port.in.CreateCustomerPort;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import nira.erp.customer.application.usercases.CreateCustomerUseCase;


@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v1/customer/create")
public class CreateCustomerController {
    @Inject
    CreateCustomerUseCase createCustomerUseCase;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(CustomerCreateCommand customer) {
        try {
            NiraResponse niraResponse = this.createCustomerUseCase.save(customer);
            return Response.status(niraResponse.getStatus()).entity(niraResponse).build();
        } catch (IllegalArgumentException e) {
            throw new NiraBadRequestException(e.getMessage(), customer);
        }
    }
}
