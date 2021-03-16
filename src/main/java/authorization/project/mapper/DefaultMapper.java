package authorization.project.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

/**
 * Mapper class implementation for {@link ObjectMapper}
 *
 * @version 1.0
 * @since 1.0
 */
public abstract class DefaultMapper {
    public ObjectMapper getObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.KEBAB_CASE);
        return mapper;
    }
}
