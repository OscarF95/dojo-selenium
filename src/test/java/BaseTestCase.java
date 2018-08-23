import bases.PagesFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTestCase {
    private WebDriver driver;

    private PagesFactory pagesFactory;

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
    public void setup() {

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless", "window-size=1200,1100");

            driver = new ChromeDriver(chromeOptions);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            pagesFactory = new PagesFactory(driver);

    }

    DojoHomePage goToHomePage() {
        driver.get("http://dojo.nearsoft.com");
        return new DojoHomePage(driver, pagesFactory);
    }

    @AfterMethod
    public void cleanup(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            try{
                String timestamp = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
                TakesScreenshot screenshot = (TakesScreenshot)driver;
                File src = screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(src, new File("screenshots/" + result.getName() + timestamp + ".png"));
                System.out.println("Screenshot should be at '/screenshots/" + result.getName() + timestamp + ".png'");
            }
            catch(Exception e){
                System.out.println("Failed to take screenshot "+ e.getMessage());
            }
        }
        driver.quit();
    }
}