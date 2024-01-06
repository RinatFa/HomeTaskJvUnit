package main.java.org._811286.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User user1;
    User user2;
    User admin;

    @BeforeEach
    void setUp() {
        user1 = new User("Ivan", "123", false);
        user2 = new User("Petr", "456", false);
        admin = new User("a", "p", true);
    }

    @Test
    void authenticate() {
        user1.authenticate("Ivan", "123");
        assertTrue(user1.isAuthenticate);
    }

    @Test
    void noAuthenticate() {
        user1.authenticate("Ivan", "11111");
        assertFalse(user1.isAuthenticate);
    }

    @Test
    void logout() {
        user2.authenticate("Petr", "456");
        user2.logout("Petr");
        assertFalse(user2.isAuthenticate);
    }

    @Test
    void noLogout() {
        assertFalse(user2.logout("Petya"));
    }

    @Test
    void testToString() {
        assertTrue(admin.toString()
                .contains("User{  name= 'admin', password= 'passw', isAuthenticate= false  }"));
    }
}
