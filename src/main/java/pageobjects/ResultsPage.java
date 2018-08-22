package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultsPage extends BasePage {

    @FindBy(className = "postSummary__titleLink")
    WebElement resultDetailLink;

    @FindBy(css = "body > div.container > div.mainArea > article > header > h1")
    WebElement resultDetailTitle;

    public ResultsPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getSearchText(){
        return getText(resultDetailLink);
    }

    public void goToResultDetail(){
        clickElement(resultDetailLink);
    }

    public String getResultDetailTitle(){
        return getText(resultDetailTitle);
    }
}
