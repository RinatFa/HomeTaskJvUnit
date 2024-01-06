package main.java.org._811286.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Разработайте класс User с методом аутентификации по логину и паролю.
 * Метод должен возвращать true, если введенные логин и пароль корректны,
 * иначе false. Протестируйте все методы.
 */
public class UserRepository {

    List<User> data = new ArrayList<>();

    public UserRepository(List<User> data) {
        this.data = data;
    }

    public void addUser(User user) {
        if (user.isAuthenticate) {
            data.add(user);
        }
    }

    public void removeUser(User user) {
        if ((findByName(user.name)) && (!user.isAdmin)) {
            user.logout(user.name);
            data.remove(user);
        }
    }

    public void removeAllUser() {
        for (int i = data.size() - 1; i >= 0; --i) {
            if (!data.get(i).isAdmin) {
                data.get(i).logout(data.get(i).name);
                data.remove(i);
            }
        }
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "data=" + data +
                '}';
    }
}
