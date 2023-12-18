package nira.erp.core.infrastructure.out.api.mapper;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import nira.erp.core.infrastructure.out.api.exception.NiraNotFoundException;
import nira.erp.core.application.port.out.NiraResponse;

@Provider
public class NofFoundExceptionMapper implements ExceptionMapper<NiraNotFoundException> {

    @Override
    public Response toResponse(NiraNotFoundException e) {
        NiraResponse niraResponse = new NiraResponse(Response.Status.NOT_FOUND, e.getMessage(), e.getData());
        return Response.status(niraResponse.getStatus()).entity(niraResponse).build();
    }
}
