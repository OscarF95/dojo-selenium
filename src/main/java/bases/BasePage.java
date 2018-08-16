package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage extends PagesFactory{
    @FindBy(id = "s")
    WebElement searchBox;

    private PagesFactory _pagesFactory;
    private WebDriver _webDriver;

    public BasePage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver);
        this._webDriver = webDriver;
        this._pagesFactory = pagesFactory;
    }

    public void clickElement(WebElement webElement){
        webElement.click();
    }

    public String getText(WebElement webElement){
        return webElement.getText();
    }

    public void inputText(WebElement webElement, String inputText){
        webElement.sendKeys(inputText);
    }

    public PagesFactory withPage(){
        return _pagesFactory;
    }

    public Boolean isElementPresent(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public void goToPreviousPage(){
        _webDriver.navigate().back();
    }
}
