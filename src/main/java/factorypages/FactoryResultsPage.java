package factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryResultsPage {
    WebDriver driver;

    @FindBy(className = "postSummary__titleLink")
    WebElement resultsPageTitle;

    public FactoryResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getSearchText(){
        return resultsPageTitle.getText();
    }
}
