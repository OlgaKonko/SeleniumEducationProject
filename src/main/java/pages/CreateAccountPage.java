package pages;

import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageObject {
    @FindBy(id = "ap_customer_name")
    private WebElement nameField;
    @FindBy(id = "ap_email")
    private WebElement emailField;
    @FindBy(id = "ap_password")
    private WebElement passwordField;
    @FindBy(id = "ap_password_check")
    private WebElement passwordCheckField;

    @FindBy(id = "continue")
    private WebElement createAccountButton;

    public CreateAccountPage() {
        super();
    }

    public void createAccount(User user) {
        nameField.sendKeys(user.getName());
        emailField.sendKeys(user.getEmail());
        passwordField.sendKeys(user.getPassword());
        passwordCheckField.sendKeys(user.getPassword());
        //  createAccountButton.click();
    }
}
