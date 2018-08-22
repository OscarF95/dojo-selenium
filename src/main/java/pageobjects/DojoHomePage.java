package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DojoHomePage extends BasePage {

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

    public DojoHomePage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public void searchInDojoHomePage(String searchString){
        inputSearchText(searchString);
    }

    public ResultsPage goToResults(){
        clickElement(searchButton);
        return withPage().resultsPage();
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

    public DojoHomePage goToAbout() {
        clickElement(aboutMenuLink);
        return withPage().dojoHomePage();
    }

    public DojoHomePage goToSuggestAGuest(){
        clickElement(suggestAGuestMenuLink);
        return withPage().dojoHomePage();
    }

    public DojoHomePage goToContact(){
        clickElement(contactMenuLink);
        return withPage().dojoHomePage();
    }

    public Boolean isInterviewLinkPresent(){
        return isElementPresent(interviewLink);
    }

    public String getInterviewsTitle(){
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