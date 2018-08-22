import bases.PagesFactory;
import org.testng.annotations.*;
import pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    WebDriver driver;

    PagesFactory pagesFactory;

    // Add pages factories
    DojoHomePage dojoHomePage;
    ResultsPage resultsPage;
    InterviewsPage interviewsPage;
    UpcomingPage upcomingPage;
    TravelEditionPage travelEditionPage;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pagesFactory = new PagesFactory(driver);
    }

    public DojoHomePage goToHomePage() {
        driver.get("http://dojo.nearsoft.com");
        return new DojoHomePage(driver, pagesFactory);
    }

    @AfterMethod
    public void cleanup(){
        driver.quit();
    }
}
