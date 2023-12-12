package nira.erp.core.application.port.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventLog {
    private String message;
    private Object data;
}
