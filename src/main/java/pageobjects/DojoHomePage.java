package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DojoHomePage extends BasePage {

    @FindBy(linkText = "WATCH AN INTERVIEW!")
    WebElement interviewLink;

    @FindBy(id = "searchsubmit")
    WebElement searchButton;


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

    public Boolean isInterviewLinkPresent(){
        return isElementPresent(interviewLink);
    }

}