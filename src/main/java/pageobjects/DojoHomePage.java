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

    @FindBy(linkText = "Upcoming")
    WebElement upcomingMenuLink;

    @FindBy(linkText = "Travel Edition")
    WebElement travelEditionMenuLink;


    @FindBy(linkText = "Suggest a Guest!")
    WebElement suggestAGuestMenuLink;



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

    public UpcomingPage goToUpcoming(){
        clickElement(upcomingMenuLink);
        return withPage().upcomingPage();
    }

    public TravelEditionPage goToTravelEdition(){
        clickElement(travelEditionMenuLink);
        return withPage().travelEditionPage();
    }

    public Boolean isInterviewLinkPresent(){
        return isElementPresent(interviewLink);
    }

    public String getSuggestAGuestTitle(){
        return getPageTitle();
    }

    public String getContactTitle(){
        return getPageTitle();
    }
}