package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import logger.EventHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.SeleneseCommandExecutor;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariOptions;

public class DriverManager {
    public static WebDriver driver = initDriver();

    public static WebDriver initDriver() {
        WebDriver driver;
        switch (System.getProperty("browser", "chrome")) {
            case "chrome": {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "edge": {
                WebDriverManager.edgedriver().version("4.15063").setup();
                driver = new EdgeDriver();
                break;
            }
            case "ie": {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            }
            case "opera": {
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            }
            case "safari": {
                driver = new SafariDriver();
                break;
            }
            default: {
                System.setProperty("webdriver.chrome.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://www.imdb.com/");
        // EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        //  eventDriver.get("http://www.imdb.com/");
        EventHandler handler = new EventHandler();
        // eventDriver.register(handler);
        return driver;//eventDriver;
    }

    public static void closeDriver() {
        //driver.quit();
    }
}
