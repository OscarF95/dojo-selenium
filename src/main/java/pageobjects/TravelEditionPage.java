package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;

public class TravelEditionPage extends BasePage {

    public TravelEditionPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getTravelEditionTitle(){
        return getPageTitle();
    }
}
