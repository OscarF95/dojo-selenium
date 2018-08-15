package factorypages;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryResultsPage extends BasePage {

    @FindBy(className = "postSummary__titleLink")
    WebElement resultsPageTitle;

    public FactoryResultsPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getSearchText(){
        return getText(resultsPageTitle);
    }

}
