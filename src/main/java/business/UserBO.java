package business;

import model.User;
import pages.MainPage;

public class UserBO {
    User user;

    public UserBO(User user) {
        this.user = user;
    }

    public void createNewUser() {
        new MainPage().goToLoginPage().goToCreateAccountPage().createAccount(user);
    }
}
