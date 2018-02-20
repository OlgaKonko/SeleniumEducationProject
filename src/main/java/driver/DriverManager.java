package driver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import io.github.bonigarcia.wdm.WebDriverManager;
import logger.EventHandler;
//import org.openqa.selenium.SeleneseCommandExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver = initDriver();

    public static WebDriver initDriver() {
        WebDriver driver;
        switch (System.getProperty("browser", "chrome")) {
            case "chrome": {
               // System.setProperty("webdriver.chrome.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/chromedriver.exe");
                //driver = new ChromeDriver();
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case "firefox": {
                //System.setProperty("webdriver.gecko.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/geckodriver.exe");
                //driver = new FirefoxDriver();
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case "edge": {
                System.setProperty("webdriver.edge.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/MicrosoftWebDriver.exe");
                driver = new EdgeDriver();

               // WebDriverManager.edgedriver().setup();
              //  driver = new EdgeDriver();
               break;
            }
            case "safari": {
              //  System.setProperty("webdriver.edge.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/MicrosoftWebDriver.exe");
                //System.setProperty("webdriver.safari.noinstall", "true");

              //  Selenium sel = new DefaultSelenium("localhost", 4444, "*safari", "http://www.imdb.com/");
                //CommandExecutor executor = new SeleneseCommandExecutor(sel);
               // DesiredCapabilities dc = new DesiredCapabilities();
               // driver = new RemoteWebDriver(executor, dc);
                //SafariOptions safariOptions = new SafariOptions();
                //safariOptions.setUseCleanSession(true);
               // safariOptions.setPort(4444);
                driver = new  SafariDriver();
                break;
            }
            default: {
                System.setProperty("webdriver.chrome.driver", "/Project/EducationProject/SeleniumEducationProject/src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            }
        }

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("http://www.imdb.com/");
       // EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
      //  eventDriver.get("http://www.imdb.com/");
        EventHandler handler = new EventHandler();
       // eventDriver.register(handler);
        return driver;//eventDriver;
    }

    public static void closeDriver() {
        driver.quit();
    }
}
