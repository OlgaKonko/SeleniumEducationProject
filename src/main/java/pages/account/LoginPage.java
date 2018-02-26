package pages.account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageObject;

public class LoginPage extends PageObject {
    // @FindBy(className = "list-group-item create-account ")
    //@FindBy(xpath = "//a[@class=\"list-group-item create-account\"]")
    @FindBy(xpath = "//a[contains(@class, 'list-group-item') and contains(@class, 'create-account')]")
    private WebElement createAccountLink;

    //@FindBy(className = "list-group-item")
    @FindBy(xpath = "//span[text()=\"Sign in with IMDb\"]")
    private WebElement signInLink;

    public LoginPage() {

        super();
    }

    public CreateAccountPage goToCreateAccountPage() {
        createAccountLink.click();
        return new CreateAccountPage();
    }

    public SignInPage goToSignInPage() {
        signInLink.click();
        return new SignInPage();
    }
}
