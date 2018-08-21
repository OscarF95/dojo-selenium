import bases.PagesFactory;
import factorypages.FactoryDojoHomePage;
import factorypages.FactoryInterviewsPage;
import factorypages.FactoryResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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

    public FactoryDojoHomePage goToWebsite(String website) {
        driver.get(website);
        return new FactoryDojoHomePage(driver, pagesFactory);
    }

    public FactoryInterviewsPage goToInterviewsPage(String website) {
        driver.get(website);
        return new FactoryInterviewsPage(driver, pagesFactory);
    }

    @AfterMethod
    public void cleanup(){
        driver.quit();
    }
}
