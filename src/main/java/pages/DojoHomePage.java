package pages;

import bases.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DojoHomePage extends BasePage {
    WebDriver driver;

    String interviewLink;
    String searchBox;
    String searchButton;

    public DojoHomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getInterviewLinkText(){
        return driver.findElement(By.linkText("WATCH AN INTERVIEW!")).getText();
    }

    public void searchInDojoHomePage(String searchString, String searchButtonId){
        this.inputText("s", searchString);
        this.clickElementById(searchButtonId);
    }
}
