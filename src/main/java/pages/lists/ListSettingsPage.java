package pages.lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageObject;

public class ListSettingsPage extends PageObject {

    @FindBy(xpath = "//div[name=\"listTitle\"]")
    private WebElement listTitle;

    @FindBy(id = "add-to-list-search")
    private WebElement searchFild;

    @FindBy(id = "add-to-list-search-results")
    private WebElement resultField;

    //@FindBy(xpath = "//*[@id=\"add-to-list-search-results\"]/a[1]")
    //private WebElement firstResultField;

    @FindBy(xpath = "//button[text()=\"Done\"]")
    private WebElement createListButton;

    public void addItemToList(String filmName) {
        searchFild.sendKeys(filmName);
        waitElementToBeClickable(resultField.findElement(By.xpath(".//a[1]")));
        WebElement firstResultField = resultField.findElement(By.xpath(".//a[1]"));
        waitElementToBeClickable(firstResultField);
        firstResultField.click();

    }

    public void create() {
        createListButton.click();
    }
}