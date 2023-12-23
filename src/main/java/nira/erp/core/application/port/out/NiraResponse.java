package nira.erp.core.application.port.out;

import jakarta.ws.rs.core.Response;
import lombok.Getter;

import java.io.Serializable;

public record NiraResponse(Response.Status status, String message, Object data) implements Serializable {

}

