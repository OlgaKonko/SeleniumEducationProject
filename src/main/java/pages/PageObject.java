package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverManager.driver;

public class PageObject {

    public PageObject() {
        PageFactory.initElements(driver, this);
    }

    protected static void waitElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
    }

    protected static void waitElementToBeUpdate(WebElement element) {
        // new WebDriverWait(driver, 10).until(ExpectedConditions.(element));
    }

    public void update() {
        PageFactory.initElements(driver, this);
    }
}
