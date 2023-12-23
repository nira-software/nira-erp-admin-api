package nira.erp.core.infrastructure.out.api.exception;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class NiraNotFoundException extends RuntimeException implements Serializable {
    private final Serializable data;
    public NiraNotFoundException(String message, Serializable data) {
        super(message);
        this.data = data;
    }
}
