package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {
    @FindBy(id = "nblogin")
    private WebElement loginLink;

    public MainPage() {
        super();
    }

    public LoginPage goToLoginPage() {
        loginLink.click();
        return new LoginPage();
    }
}
