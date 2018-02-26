package pages.account;

import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageObject;

import static assertions.CreateAccountAssertions.checkErrorMessages;
import static assertions.CreateAccountAssertions.checkWarningMessages;

public class SignInPage extends PageObject {
    @FindBy(id = "ap_email")
    private WebElement emailField;
    @FindBy(id = "ap_password")
    private WebElement passwordField;
    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    public SignInPage() {
        super();
    }

    public void signIn(User user) {
        emailField.sendKeys(user.getEmail());
        passwordField.sendKeys(user.getPassword());

        signInButton.click();
        checkErrorMessages();
        checkWarningMessages();
    }
}
