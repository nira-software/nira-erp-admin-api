package nira.erp.core.infrastructure.out.api;

import jakarta.ws.rs.core.Response;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NiraResponse {

    private Response.Status status;
    private String message;
    private Object data;

    public NiraResponse(Response.Status status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}

