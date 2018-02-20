package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {
    @FindBy(id = "nblogin")
    private WebElement loginLink;

    @FindBy(id = "consumer_user_nav")
    private WebElement userPanel;

    public MainPage() {
        super();
    }
    public LoginPage goToLoginPage() {
        loginLink.click();
        return new LoginPage();
    }

    public String checkLogIn(){
        try {
         return userPanel.findElement(By.xpath(".//a")).getText();
        }
        catch (NoSuchElementException e){
            return "No login";
        }

    }

  /*  public void checkUser (){
       userPanel.findElement(By.xpath("//a")).getText();
    }*/
}
