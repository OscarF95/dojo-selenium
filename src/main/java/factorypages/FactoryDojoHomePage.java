package factorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FactoryDojoHomePage {
    WebDriver driver;

    @FindBy(linkText = "WATCH AN INTERVIEW!")
    WebElement interviewLink;

    @FindBy(id = "s")
    WebElement searchBox;

    @FindBy(id = "searchSubmit")
    WebElement searchButton;

    public FactoryDojoHomePage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public String getInterviewLinkText(){
        return interviewLink.getText();
    }

    public void search(String searchString){
        searchBox.sendKeys(searchString);
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void searchInDojoHomePage(String searchString){
        this.search(searchString);
        this.clickSearch();
    }
}
