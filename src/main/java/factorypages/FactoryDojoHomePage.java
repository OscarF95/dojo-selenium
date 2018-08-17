package factorypages;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    @FindBy(tagName = "h1")
    WebElement pagesTitle;


    public FactoryDojoHomePage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public void searchInDojoHomePage(String searchString){
        inputText(searchBox, searchString);
    }

    public FactoryResultsPage goToResults(){
        clickElement(searchButton);
        return withPage().factoryResultsPage();
    }

    public FactoryDojoHomePage goToInterviews(){
        clickElement(interviewsMenuLink);
        return withPage().factoryDojoHomePage();
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

    public Boolean isInterviewLinkPresent(){
        return isElementPresent(interviewLink);
    }

    public String getInterviewsTitle(){
        return getText(pagesTitle);
    }

    public String getUpcomingTitle(){
        return getText(pagesTitle);
    }

    public String getTravelEditionTitle(){
        return getText(pagesTitle);
    }

    public String getAboutTitle(){
        return getText(pagesTitle);
    }
}
