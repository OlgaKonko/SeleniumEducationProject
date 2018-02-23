package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.driver;


public class MainPage extends PageObject {
    @FindBy(id = "nblogin")
    private WebElement loginLink;

    @FindBy(id = "consumer_user_nav")
    private WebElement userPanel;

    //@FindBy(xpath = "//ul[id=\"consumer_user_nav\"//a[text=\"Your Lists\"]]")
    @FindBy(xpath = "//a[text()=\"Your Lists\"]")
    private WebElement myListsLink;


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

    private Actions openUserMenu(){
       // userPanel.click();
        Actions actions = new Actions(driver);
        return actions.moveToElement(userPanel);
    }

    public MyListsPage goToMyListPage() {
        Actions action = openUserMenu();
        action.moveToElement(myListsLink);
        action.click(myListsLink).build().perform();
        //myListsLink.click();
        //action.build().perform();
        return new MyListsPage();
    }

  /*  public void checkUser (){
       userPanel.findElement(By.xpath("//a")).getText();
    }*/
}
