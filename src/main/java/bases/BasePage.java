package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.*;

public abstract class BasePage extends PagesFactory{
    @FindBy(id = "s")
    WebElement searchBox;

    @FindBy(tagName = "h1")
    WebElement pagesTitle;

    @FindBy(linkText = "Interviews")
    WebElement interviewsMenuLink;

    @FindBy(linkText = "About")
    WebElement aboutMenuLink;

    @FindBy(linkText = "Suggest a Guest!")
    WebElement suggestAGuestMenuLink;

    @FindBy(linkText = "Contact")
    WebElement contactMenuLink;

    @FindBy(linkText = "Upcoming")
    WebElement upcomingMenuLink;

    @FindBy(linkText = "Travel Edition")
    WebElement travelEditionMenuLink;

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

    public void inputSearchText(String searchString){
        searchBox.sendKeys(searchString);
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

    public String getPageTitle(){
        return pagesTitle.getText();
    }

    public InterviewsPage goToInterviews(){
        clickElement(interviewsMenuLink);
        return withPage().interviewsPage();
    }

    public UpcomingPage goToUpcoming(){
        clickElement(upcomingMenuLink);
        return withPage().upcomingPage();
    }

    public TravelEditionPage goToTravelEdition(){
        clickElement(travelEditionMenuLink);
        return withPage().travelEditionPage();
    }

    public AboutPage goToAbout(){
        clickElement(aboutMenuLink);
        return withPage().aboutPage();
    }

    public SuggestAGuestPage goToSuggestAGuest(){
        clickElement(suggestAGuestMenuLink);
        return withPage().suggestAGuestPage();
    }

    public ContactPage goToContact(){
        clickElement(contactMenuLink);
        return withPage().contactPage();
    }
}
