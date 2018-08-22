package bases;

import pageobjects.*;
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

    public DojoHomePage dojoHomePage(){
        return new DojoHomePage(getWebDriver(), this);
    }

    public ResultsPage resultsPage(){
        return new ResultsPage(getWebDriver(), this);
    }

    public InterviewsPage interviewsPage(){
        return new InterviewsPage(getWebDriver(), this);
    }

    public UpcomingPage upcomingPage(){
        return new UpcomingPage(getWebDriver(), this);
    }

    public TravelEditionPage travelEditionPage(){
        return new TravelEditionPage(getWebDriver(), this);
    }

    public AboutPage aboutPage(){
        return new AboutPage(getWebDriver(), this);
    }

    public SuggestAGuestPage suggestAGuestPage(){
        return new SuggestAGuestPage(getWebDriver(), this);
    }

    public ContactPage contactPage(){
        return new ContactPage(getWebDriver(), this);
    }

}
