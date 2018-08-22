import bases.PagesFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
    AboutPage aboutPage;
    SuggestAGuestPage suggestAGuestPage;
    ContactPage contactPage;

    @BeforeMethod
    public void setup(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless", "window-size=1200,1100");

        driver = new ChromeDriver(chromeOptions);
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
