package business;

import model.User;
import pages.MainPage;
import pages.lists.ListSettingsPage;

import java.util.List;

public class UserBO {
    User user;

    public UserBO(User user) {
        this.user = user;
    }

    public void createNewUser() {
        new MainPage().goToLoginPage().goToCreateAccountPage().createAccount(user);
    }

    public void createNewList(String listName, List<String> filmNames) {
        ListSettingsPage listSettingsPage = new MainPage().
                goToMyListPage().
                goToCreateListPage().
                createList(listName);
        for (String filmName : filmNames) {
            listSettingsPage.addItemToList(filmName);
        }
        listSettingsPage.create();
    }

    public void deleteFirstList() {
        new MainPage().
                goToMyListPage().
                deleteFirstList();

    }

    public void signIn() {
        MainPage mainPage = new MainPage();
        mainPage.goToLoginPage().goToSignInPage().signIn(user);
        mainPage.update();
        assert mainPage.checkLogIn().equals(user.getName());
    }
}
