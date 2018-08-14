package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    WebDriver driver;

    By searchTitle = By.className("postSummary__titleLink");

    public ResultsPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSearchText(){
        return driver.findElement(searchTitle).getText();
    }
}
