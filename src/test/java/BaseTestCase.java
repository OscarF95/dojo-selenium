import bases.PagesFactory;
import org.testng.annotations.*;
import pageobjects.FactoryDojoHomePage;
import pageobjects.FactoryInterviewsPage;
import pageobjects.FactoryResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    WebDriver driver;

    PagesFactory pagesFactory;

    // Add pages factories
    FactoryDojoHomePage factoryDojoHomePage;
    FactoryResultsPage factoryResultsPage;
    FactoryInterviewsPage factoryInterviewsPage;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pagesFactory = new PagesFactory(driver);
    }

    public FactoryDojoHomePage goToHomePage() {
        driver.get("http://dojo.nearsoft.com");
        return new FactoryDojoHomePage(driver, pagesFactory);
    }

    @AfterMethod
    public void cleanup(){
        driver.quit();
    }
}
