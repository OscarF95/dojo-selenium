package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;

public class UpcomingPage extends BasePage {

    public UpcomingPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getUpcomingTitle(){
        return getPageTitle();
    }
}
