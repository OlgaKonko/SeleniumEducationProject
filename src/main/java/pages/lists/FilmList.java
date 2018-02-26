package pages.lists;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static driver.DriverManager.driver;

public class FilmList {

    private WebElement menuButton;

    public FilmList() {
        PageFactory.initElements(driver, this);
    }
}
