package nira.erp.customer.application.port.out;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * Mapper para convertir objetos a json y viceversa.
 */
@ApplicationScoped
public class MapperJson {
    @Inject
    ObjectMapper objectMapper;

    public String toJson(Object object) throws JsonProcessingException {
        return this.objectMapper.writeValueAsString(object);
    }

    public <T> T toObject(String json, Class<T> clazz) throws JsonProcessingException {
        return this.objectMapper.readValue(json, clazz);
    }
}
