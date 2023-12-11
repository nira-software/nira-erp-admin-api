package nira.erp.core.application.port.out;

import jakarta.inject.Inject;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventLog {
    private String message;
    private Object data;
}
