package driver;

import logger.EventHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver = initDriver();

    public static WebDriver initDriver() {
        WebDriver driver;
        switch (System.getProperty("browser", "chrome")) {
            case "chrome": {
                System.setProperty("webdriver.chrome.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
            case "firefox": {
                System.setProperty("webdriver.gecko.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            }
            case "edge": {
                System.setProperty("webdriver.edge.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                break;
            }
            default: {
                System.setProperty("webdriver.chrome.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
        }
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        eventDriver.get("http://www.imdb.com/");
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);
        return eventDriver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
