package dao.abstractdao;

import com.fasterxml.jackson.databind.ObjectMapper;
import mapper.ObjectMapperSingleton;

import java.io.File;
import java.io.IOException;

public abstract class Dao<T> {
    private final ObjectMapper mapper = ObjectMapperSingleton.getInstance();

    public Dao() {
    }

    public T get(String filePath, Class<T> clazz) throws IOException {
        return mapper.readValue(new File(filePath), clazz);

    }

    public void save(String filePath, T object) throws IOException {
        mapper.writeValue(new File(filePath), object);
    }

    public ObjectMapper getMapper() {
        return mapper;
    }
}
