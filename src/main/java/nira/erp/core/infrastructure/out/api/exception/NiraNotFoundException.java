package nira.erp.core.infrastructure.out.api.exception;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class NiraNotFoundException extends RuntimeException implements Serializable {
    private final Object data;
    public NiraNotFoundException(String message, Object data) {
        super(message);
        this.data = data;
    }
}
