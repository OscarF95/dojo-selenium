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

    @FindBy(css = "body > div.container > div.mainArea > article > div > div.postSummary > h2 > a")
    WebElement resultDetailLink;

    @FindBy(css = "body > div.container > div.mainArea > article > header > h1")
    WebElement resultDetailTitle;

    public FactoryResultsPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getSearchText(){
        return getText(resultsPageTitle);
    }

    public void goToResultDetail(){
        clickElement(resultDetailLink);
    }

    public String getResultDetailTitle(){
        return getText(resultDetailTitle);
    }

}
