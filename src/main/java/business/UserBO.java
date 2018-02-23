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

    public void createNewList(String listname){
        MainPage mainPage = new MainPage();
        mainPage.goToMyListPage().goToCreateListPage().createList(listname);
    }
    public void signIn(){
        MainPage mainPage = new MainPage();
        mainPage.goToLoginPage().goToSignInPage().signIn(user);
        mainPage.update();
        assert mainPage.checkLogIn().equals(user.getName());
    }
}
