import bases.PagesFactory;
import pageobjects.FactoryDojoHomePage;
import pageobjects.FactoryInterviewsPage;
import pageobjects.FactoryResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    WebDriver driver;

    PagesFactory pagesFactory;

    // Add pages factories
    FactoryDojoHomePage factoryDojoHomePage;
    FactoryResultsPage factoryResultsPage;
    FactoryInterviewsPage factoryInterviewsPage;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pagesFactory = new PagesFactory(driver);
    }

    public FactoryDojoHomePage goToHomePage() {
        driver.get("http://dojo.nearsoft.com");
        return new FactoryDojoHomePage(driver, pagesFactory);
    }

//    public FactoryInterviewsPage goToInterviewsPage(String website) {
//        driver.get(website);
//        return new FactoryInterviewsPage(driver, pagesFactory);
//    }

    @AfterTest
    public void cleanup(){
        driver.quit();
    }
}
