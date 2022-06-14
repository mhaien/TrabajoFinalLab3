package dao;

import dao.abstractdao.AbstractDao;
import model.User;

import java.io.IOException;
import java.util.NoSuchElementException;

public class UserDao extends AbstractDao<User> {
    private static final String FILE_PATH = "resource/files/user.json";

    public UserDao() {
        super(FILE_PATH);
    }

    public boolean saveNewUser(User user) throws IOException {

        this.getDatabase().add(user);
        return this.save();

    }

    public User getUser(String DNI) throws IOException, NoSuchElementException {

        return this.getDatabase().stream().filter(u -> u.getDNI().equals(DNI)).findFirst().orElseThrow(() -> new NoSuchElementException("No se encontró usuario con DNI"));
    }


}
