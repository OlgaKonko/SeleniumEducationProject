package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewListPage extends PageObject{
    @FindBy(id = "list-create-name")
    private WebElement listNameField;

    @FindBy(xpath = "//button[text=\"CREATE\"]]")
    private WebElement createListButton;

    public void createList(String name){
        listNameField.sendKeys(name);
        createListButton.click();
    }
}
