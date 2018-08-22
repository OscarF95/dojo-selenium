package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;

public class SuggestAGuestPage extends BasePage {

    public SuggestAGuestPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getSuggestAGuestTitle(){
        return getPageTitle();
    }
}
