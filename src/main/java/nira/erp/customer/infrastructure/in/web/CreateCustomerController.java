package nira.erp.customer.infrastructure.in.web;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v1/customer/create")
public class CreateCustomerController {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean create() {
        return true;
    }
}
