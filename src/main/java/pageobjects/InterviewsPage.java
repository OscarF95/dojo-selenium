package pageobjects;

import bases.BasePage;
import bases.PagesFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterviewsPage extends BasePage {
    @FindBy(className = "post__title")
    WebElement interviewTitle;

    @FindBy(xpath = "//a[.=\"Older Interviews →\"]")
    WebElement olderInterviewsLink;

    public InterviewsPage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public Boolean isInterviewsTitlePresent(){
        return isElementPresent(interviewTitle);
    }

    public void goToOlderInterviews(){
        clickElement(olderInterviewsLink);
    }

    public String getInterviewsTitle(){
        return getPageTitle();
    }
}
