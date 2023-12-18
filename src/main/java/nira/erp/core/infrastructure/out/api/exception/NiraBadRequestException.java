package nira.erp.core.infrastructure.out.api.exception;

import lombok.Getter;

import java.io.Serializable;
@Getter
public class NiraBadRequestException extends RuntimeException implements Serializable {
    private final Object data;
    public NiraBadRequestException(String message, Object data) {
        super(message);
        this.data = data;
    }
}
