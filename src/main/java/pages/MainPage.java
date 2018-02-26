package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.account.LoginPage;
import pages.lists.MyListsPage;

import static driver.DriverManager.driver;


public class MainPage extends PageObject {
    @FindBy(id = "nblogin")
    private WebElement loginLink;

    @FindBy(id = "consumer_user_nav")
    private WebElement userPanel;

    //@FindBy(xpath = "//ul[id=\"consumer_user_nav\"//a[text=\"Your Lists\"]]")
    @FindBy(xpath = "//a[text()=\"Your Lists\"]")
    private WebElement myListsLink;


    @FindBy(id = "navUserMenu")
    private WebElement userMenu;


    public MainPage() {
        super();
    }

    public LoginPage goToLoginPage() {
        loginLink.click();
        return new LoginPage();
    }

    public String checkLogIn() {
        try {
            return userPanel.findElement(By.xpath(".//a")).getText();
        } catch (NoSuchElementException e) {
            return "No login";
        }

    }

    private Actions openUserMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(userPanel).perform();
        return actions;
    }

    public MyListsPage goToMyListPage() {
        Actions actions = openUserMenu();
        waitElementToBeClickable(myListsLink);
        actions.click(myListsLink).build().perform();
        // myListsLink.click();
        //myListsLink.click();
        //action.build().perform();
        return new MyListsPage();
    }

  /*  public void checkUser (){
       userPanel.findElement(By.xpath("//a")).getText();
    }*/
}
