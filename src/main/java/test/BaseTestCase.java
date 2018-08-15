package test;

import bases.PagesFactory;
import factorypages.FactoryDojoHomePage;
import factorypages.FactoryResultsPage;
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

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        pagesFactory = new PagesFactory(driver);
    }

    public FactoryDojoHomePage goToWebsite(String website) {
        driver.get(website);
        return new FactoryDojoHomePage(driver, pagesFactory);
    }

    @AfterTest
    public void cleanup(){
        driver.quit();
    }
}
