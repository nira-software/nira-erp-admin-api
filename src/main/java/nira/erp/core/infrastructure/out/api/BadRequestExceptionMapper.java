package nira.erp.core.infrastructure.out.api;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<NiraBadRequestException> {

    @Override
    public Response toResponse(NiraBadRequestException e) {
        NiraResponse niraResponse = new NiraResponse(Response.Status.BAD_REQUEST, e.getMessage(), e.getData());
        return Response.status(Response.Status.BAD_REQUEST).entity(niraResponse).build();
    }
}
