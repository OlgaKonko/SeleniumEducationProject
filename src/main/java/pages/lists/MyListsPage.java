package pages.lists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageObject;

import java.util.List;

public class MyListsPage extends PageObject {

    @FindBy(xpath = "//a[text()=\"Create a new list\"]")
    private WebElement myListsLink;

    //@FindBy(xpath = "//ul[normalize-space(@class) = \"ipl-zebra-listuser-listslists-for-user\")/*")
    @FindBy(css = "ul.ipl-zebra-list.user-lists.lists-for-user>li")
    private List<WebElement> lists;

    public MyListsPage() {
        super();
    }

    public CreateNewListPage goToCreateListPage() {
        myListsLink.click();
        return new CreateNewListPage();

    }

    public void deleteFirstList() {
        //lists.get(0).click();
        //  System.out.println("!!!!first list id "+lists.get(0).getAttribute("id"));
        // WebElement firstElementMenu = lists.get(0).findElement(By.xpath(".//svg"));
        WebElement firstElementMenu = lists.get(0).findElement(By.xpath(".//div[@class=\"vertical-ellipsis\"]"));

        firstElementMenu.click();
        firstElementMenu.findElement(By.xpath(".//a[text()=\"Delete this list\"]")).click();
        //waitElementToBeEnable(firstElementMenu.findElement(By.xpath(".//a[text()=\"Delete\"]")));
        //waitElementToBeClickable(firstElementMenu.findElement(By.xpath(".//a[text()=\"Delete\"]")));
        //driver.findElements(By.cssSelector("ul.ipl-zebra-list.user-lists.lists-for-user>li")).get(0).findElement(By.xpath(".//a[text()=\"Delete\"]")).click();

        firstElementMenu.findElement(By.xpath(".//*[text()=\" Delete \"]")).click();
        // firstElementMenu.findElement(By.xpath(".//a[@id=\""+firstElementMenu.getAttribute("id")+"\" and text()=\"Delete\"]")).click();
        //firstElementMenu.findElement(By.cssSelector("a.flat-button.pop-up-modal-option.confirm")).click();
        //  firstElementMenu.findElement(By.xpath(".//a[text()=\"Delete\"]")).click();
        //  WebElement firstElementMenu = lists.findElement(By.xpath("./*[1].//svg"));
        //  firstElementMenu.click();
    }

}
