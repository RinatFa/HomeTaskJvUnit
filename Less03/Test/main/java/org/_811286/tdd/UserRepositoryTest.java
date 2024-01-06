package main.java.org._811286.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserRepositoryTest {
    User user1;
    User user2;
    User user3;
    User admin;
    UserRepository userRepository;

    @BeforeEach
    void setUp() {
        user1 = new User("Ivan", "123", false);
        user2 = new User("Petr", "456", false);
        admin = new User("a", "p", true);

        userRepository = new UserRepository(new ArrayList<>());
        user1.authenticate("Ivan", "123");
        userRepository.addUser(user1);
        user2.authenticate("Petr", "456");
        userRepository.addUser(user2);
        admin.authenticate("admin", "passw");
        userRepository.addUser(admin);
    }

    @Test
    void addUser() {
        user3 = new User("Oleg", "789", false);
        user3.authenticate("Oleg", "789");
        userRepository.addUser(user3);
        assertTrue(userRepository.findByName("Oleg"));
        System.out.println(userRepository.toString());
    }

    @Test
    void removeUser() {
        userRepository.removeUser(user2);
        assertFalse(userRepository.findByName(user2.name));
    }

    @Test
    void removeAllUser() {
        userRepository.removeAllUser();
        assertFalse(userRepository.findByName(user2.name));
    }

    @Test
    void noRemoveAdmin() {
        userRepository.removeAllUser();
        assertTrue(userRepository.findByName(admin.name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ivan", "Petr", "admin"})
    void findByName(String name) {
        assertTrue(userRepository.findByName(name));
    }

    @Test
    void noFindByName() {
        assertFalse(userRepository.findByName("Sergey"));
    }

    @Test
    void testToString() {
        assertTrue(userRepository.toString()
                .contains("User{  name= 'admin', password= 'passw', isAuthenticate= true  }"));
    }
}
