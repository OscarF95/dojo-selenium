package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public String getElementText(String elementText){
        return driver.findElement(By.linkText(elementText)).getText();
    }

    public void clickElementById(String buttonId){
        driver.findElement(By.id(buttonId)).click();
    }

    public void clickElementByClass(String buttonClass){
        driver.findElement(By.className(buttonClass)).click();
    }

    public void inputText(String stringId, String inputText){
        driver.findElement(By.id(stringId)).sendKeys(inputText);
    }

}
