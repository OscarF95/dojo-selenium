package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage {

    public AboutPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public String getAboutTitle(){
        return getPageTitle();
    }
}
