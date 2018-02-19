package simpleTest;

import business.UserBO;
import model.User;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {

    @Test()
    public void createUser() {
        User user = new User("testname", "pass");
        user.setEmail("test");
        new UserBO(user).createNewUser();

    }
}