package mapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public class ObjectMapperSingleton {

    private static ObjectMapper mapper = null;

    public static ObjectMapper getInstance() {
        if (Objects.isNull(mapper)) {
            mapper = new ObjectMapper();
        }
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper;
    }

}
