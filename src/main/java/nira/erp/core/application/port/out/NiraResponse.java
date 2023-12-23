package nira.erp.core.application.port.out;

import jakarta.ws.rs.core.Response;
import lombok.Getter;

@Getter
public class NiraResponse {

    private final Response.Status status;
    private final String message;
    private final Object data;

    public NiraResponse(Response.Status status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}

