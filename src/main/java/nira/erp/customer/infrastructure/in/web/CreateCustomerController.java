package nira.erp.customer.infrastructure.in.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.extern.log4j.Log4j2;
import nira.erp.customer.application.port.in.CreateCustomerPort;
import nira.erp.customer.application.port.in.CustomerCreateCommand;
import nira.erp.customer.application.port.out.MapperJson;


@Log4j2
@Consumes(MediaType.APPLICATION_JSON)
@Path("/api/v1/customer/create")
public class CreateCustomerController {
    @Inject
    CreateCustomerPort createCustomerPort;

    @Inject
    MapperJson mapperJson;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean create(CustomerCreateCommand customer) throws JsonProcessingException {
        log.info("{}", mapperJson.toJson(customer));
        return this.createCustomerPort.createCustomer(customer);
    }
}
