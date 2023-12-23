package nira.erp.core.infrastructure.out.api.exception;

import lombok.Getter;

import java.io.Serializable;
@Getter
public class NiraBadRequestException extends RuntimeException implements Serializable {
    private final Serializable data;
    public NiraBadRequestException(String message, Serializable data) {
        super(message);
        this.data = data;
    }
}
