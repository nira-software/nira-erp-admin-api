package nira.erp.core.infrastructure.out.api;

import lombok.Getter;

import java.lang.RuntimeException;
@Getter
public class NiraBadRequestException extends RuntimeException {
    private final Object data;
    public NiraBadRequestException(String message, Object data) {
        super(message);
        this.data = data;
    }
}
