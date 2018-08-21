package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryDojoHomePage extends BasePage {

    @FindBy(linkText = "WATCH AN INTERVIEW!")
    WebElement interviewLink;

    @FindBy(id = "s")
    WebElement searchBox;

    @FindBy(id = "searchsubmit")
    WebElement searchButton;

    @FindBy(linkText = "Interviews")
    WebElement interviewsMenuLink;

    @FindBy(linkText = "Upcoming")
    WebElement upcomingMenuLink;

    @FindBy(linkText = "Travel Edition")
    WebElement travelEditionMenuLink;

    @FindBy(linkText = "About")
    WebElement aboutMenuLink;

    @FindBy(linkText = "Suggest a Guest!")
    WebElement suggestAGuestMenuLink;

    @FindBy(linkText = "Contact")
    WebElement contactMenuLink;

    public FactoryDojoHomePage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public void searchInDojoHomePage(String searchString){
        inputSearchText(searchString);
    }

    public FactoryResultsPage goToResults(){
        clickElement(searchButton);
        return withPage().factoryResultsPage();
    }

    public FactoryInterviewsPage goToInterviews(){
        clickElement(interviewsMenuLink);
        return withPage().factoryInterviewsPage();
    }

    public FactoryDojoHomePage goToUpcoming(){
        clickElement(upcomingMenuLink);
        return withPage().factoryDojoHomePage();
    }

    public FactoryDojoHomePage goToTravelEdition(){
        clickElement(travelEditionMenuLink);
        return withPage().factoryDojoHomePage();
    }

    public FactoryDojoHomePage goToAbout() {
        clickElement(aboutMenuLink);
        return withPage().factoryDojoHomePage();
    }

    public FactoryDojoHomePage goToSuggestAGuest(){
        clickElement(suggestAGuestMenuLink);
        return withPage().factoryDojoHomePage();
    }

    public FactoryDojoHomePage goToContact(){
        clickElement(contactMenuLink);
        return withPage().factoryDojoHomePage();
    }

    public Boolean isInterviewLinkPresent(){
        return isElementPresent(interviewLink);
    }

    public String getInterviewsTitle(){
        return getPageTitle();
    }

    public String getUpcomingTitle(){
        return getPageTitle();
    }

    public String getTravelEditionTitle(){
        return getPageTitle();
    }

    public String getAboutTitle(){
        return getPageTitle();
    }

    public String getSuggestAGuestTitle(){
        return getPageTitle();
    }

    public String getContactTitle(){
        return getPageTitle();
    }
}
