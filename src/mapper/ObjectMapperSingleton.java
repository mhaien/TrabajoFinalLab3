package mapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;

public class ObjectMapperSingleton {

    private static ObjectMapper mapper = null;

    public static ObjectMapper getInstance()
    {
        if(Objects.isNull(mapper))
        {
            mapper = new ObjectMapper();
        }
        return mapper;
    }

}
