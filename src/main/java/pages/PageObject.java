package pages;

import org.openqa.selenium.support.PageFactory;

import static driver.DriverManager.driver;

public class PageObject {

    public PageObject() {
        PageFactory.initElements(driver, this);
    }
    public void update(){
                  PageFactory.initElements(driver, this);
    }
}
