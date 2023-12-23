package nira.erp.core.infrastructure.out.api.mapper;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import nira.erp.core.application.port.out.NiraResponse;
import nira.erp.core.infrastructure.out.api.exception.NiraBadRequestException;

@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<NiraBadRequestException> {

    @Override
    public Response toResponse(NiraBadRequestException e) {
        NiraResponse niraResponse = new NiraResponse(Response.Status.BAD_REQUEST, e.getMessage(), e.getData());
        return Response.status(niraResponse.getStatus()).entity(niraResponse).build();
    }
}
