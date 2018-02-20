package simpleTest;

import business.UserBO;
import model.User;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test(enabled = false)
    public void createUser() {
        User user = new User("testname", "pass");
        user.setEmail("test");
        new UserBO(user).createNewUser();

    }
    @Test
    public void signInUser() {
        User user = new User("testname", "qwertyuiop");
        user.setEmail("foreverytesting@gmail.com");
        new UserBO(user).signIn();

    }
}