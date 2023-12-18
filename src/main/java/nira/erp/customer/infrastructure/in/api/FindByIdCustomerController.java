package nira.erp.customer.infrastructure.in.api;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import nira.erp.core.infrastructure.out.api.exception.NiraNotFoundException;
import nira.erp.customer.application.command.LoadCustomerCommand;
import nira.erp.customer.application.port.out.NiraResponse;
import nira.erp.customer.application.usercases.LoadCustomerUseCase;

import java.util.UUID;


@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v1/customer")
public class FindByIdCustomerController {
    @Inject
    LoadCustomerUseCase loadCustomerUseCase;

    @GET()
    @Path("/{customerId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(@PathParam("customerId") UUID customerId) {
        try {
            LoadCustomerCommand command = new LoadCustomerCommand();
            command.setCustomerId(customerId);
            NiraResponse niraResponse = loadCustomerUseCase.load(command);
            return Response.status(niraResponse.getStatus()).entity(niraResponse).build();
        } catch (IllegalArgumentException e) {
            throw new NiraNotFoundException(e.getMessage(), customerId);
        }
    }
}
