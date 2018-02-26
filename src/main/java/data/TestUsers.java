package data;

import model.User;
import model.UserBuilder;

public class TestUsers {
    public static User testUser() {
        return new UserBuilder().
                name("testname").
                email("foreverytesting@gmail.com").
                password("qwertyuiop").
                build();
    }
}
