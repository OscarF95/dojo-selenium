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

    public FactoryDojoHomePage(WebDriver webDriver, PagesFactory pagesFactory){
        super(webDriver, pagesFactory);
    }

    public FactoryDojoHomePage clickSearch(){
        clickElement(searchButton);
        return withPage().factoryDojoHomePage();
    }

    public FactoryDojoHomePage searchInDojoHomePage(String searchString){
        inputText(searchBox, searchString);
        clickElement(searchButton);
        return withPage().factoryDojoHomePage();
    }

    public Boolean isInterviewLinkPresent(){
        return isElementPresent(interviewLink);
    }
}
