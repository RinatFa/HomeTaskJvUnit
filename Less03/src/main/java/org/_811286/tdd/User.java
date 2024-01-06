package main.java.org._811286.tdd;

public class User {

    String name;
    String password;
    boolean isAdmin;

    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        if (!isAdmin) {
            this.name = name;
            this.password = password;
        } else {
            this.name = "admin";
            this.password = "passw";
        }
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String nameIn, String passwordIn) {
        if (name.equals(nameIn)) {
            if (password.equals(passwordIn)) {
                isAuthenticate = true;
                return true;
            }
        }
        return false;
    }

    public boolean logout(String nameOut) {
        if (name.equals(nameOut)) {
            isAuthenticate = false;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "  name= '" + name + '\'' +
                ", password= '" + password + '\'' +
                ", isAuthenticate= " + isAuthenticate +
                "  }";
    }
}
