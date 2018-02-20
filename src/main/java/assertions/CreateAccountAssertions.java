package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static driver.DriverManager.driver;

public class CreateAccountAssertions {
    public static void checkErrorMessages() {
        List<WebElement> errorMessages = driver.findElements(By.id("auth-error-message-box"));
        assert (errorMessages.size() == 0) : "Error - error message";

    }

    public static void checkWarningMessages() {
        List<WebElement> errorMessages = driver.findElements(By.id("auth-warning-message-box"));
        assert (errorMessages.size() == 0) : "Error - error message";

    }
}
