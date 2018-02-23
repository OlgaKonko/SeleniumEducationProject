package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyListsPage extends PageObject{

    @FindBy(xpath = "//a[text=\"Create a new list\"]]")
    private WebElement myListsLink;

    public MyListsPage() {
        super();
    }

    public CreateNewListPage goToCreateListPage(){
        return new CreateNewListPage();

    }

}
