package dao.abstractdao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AbstractDao<T> extends Dao<List> {
    protected final String filePath;
    protected List<T> database = new ArrayList<>();

    public AbstractDao(String file_path) {
        filePath = file_path;
    }

    public List<T> getDatabase() throws IOException {
        try {
            if (database.isEmpty()) {
                database = get(filePath, List.class);
            }
        } catch (FileNotFoundException e) {
            database = new ArrayList<>();
        }

        return database;

    }

    public void saveDatabase() throws IOException {
        save(filePath, database);
    }

    public boolean save() throws IOException {
        this.save(filePath, database);
        return true;
    }

}
