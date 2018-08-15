package bases;

import factorypages.FactoryDojoHomePage;
import factorypages.FactoryResultsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PagesFactory {
    private WebDriver _webDriver;

    public PagesFactory(WebDriver driver){
        _webDriver = driver;
        PageFactory.initElements(_webDriver, this);
    }

    public WebDriver getWebDriver(){
        return _webDriver;
    }

    public FactoryDojoHomePage factoryDojoHomePage(){
        return new FactoryDojoHomePage(getWebDriver(), this);
    }

    public FactoryResultsPage factoryResultsPage(){
        return new FactoryResultsPage(getWebDriver(), this);
    }

}
