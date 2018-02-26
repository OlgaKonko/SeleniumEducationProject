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

   // @FindBy(xpath = "//span[class=\"downArrow\"]")
    @FindBy(className = "downArrow")
    private WebElement arrow;

    @FindBy(id = "navUserMenu")
    private WebElement userMenu;


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
        Actions actions = new Actions(driver);
        actions.moveToElement(userPanel).build().perform();
        return actions;
    }

    public MyListsPage goToMyListPage() {
     // openUserMenu();
        Actions actions = new Actions(driver);
        actions.moveToElement(userPanel).pause(1000).moveToElement(myListsLink).click(myListsLink).build().perform();
      // myListsLink.click();
        //myListsLink.click();
        //action.build().perform();
        return new MyListsPage();
    }

  /*  public void checkUser (){
       userPanel.findElement(By.xpath("//a")).getText();
    }*/
}
