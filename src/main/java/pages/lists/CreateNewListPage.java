package pages.lists;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageObject;

public class CreateNewListPage extends PageObject {
    @FindBy(id = "list-create-name")
    private WebElement listNameField;

    @FindBy(xpath = "//button[text()=\"CREATE\"]")
    private WebElement createListButton;

    public ListSettingsPage createList(String name) {
        listNameField.sendKeys(name);
        createListButton.click();
        return new ListSettingsPage();
    }
}
