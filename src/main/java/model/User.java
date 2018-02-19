package model;

public class User {
    private String name;
    private String email;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
