package simpleTest;

import business.UserBO;
import model.User;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static data.Names.DEFAULT_FILM_NAME;
import static data.Names.DEFAULT_LIST_NAME;
import static data.TestUsers.testUser;

public class UserTest extends BaseTest {

    public User setUser() {
        return testUser();
    }

    @Test(enabled = false)
    public void createUser() {
        User user = setUser();
        user.setEmail("test");
        new UserBO(user).createNewUser();

    }

    @Test
    public void signInUser() {
        User user = setUser();
        new UserBO(user).signIn();

    }

    @Test
    public void createNewList() {
        User user = setUser();
        UserBO userBO = new UserBO(user);
        userBO.signIn();
        ArrayList<String> filmNames = new ArrayList<>();
        filmNames.add(DEFAULT_FILM_NAME);
        userBO.createNewList(DEFAULT_LIST_NAME, filmNames);
    }

    @Test
    public void deleteList() {
        User user = setUser();
        UserBO userBO = new UserBO(user);
        userBO.signIn();
        userBO.deleteFirstList();

    }
}