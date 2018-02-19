package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    //@FindBy(className = "list-group-item create-account ")
    //@FindBy(xpath = "//a[@class=list-group-item create-account]")
    @FindBy(xpath = "//a[contains(@class, 'list-group-item') and contains(@class, 'create-account')]")
    private WebElement createAccountLink;

    public LoginPage() {

        super();
    }

    public CreateAccountPage goToCreateAccountPage() {
        createAccountLink.click();
        return new CreateAccountPage();
    }
}
