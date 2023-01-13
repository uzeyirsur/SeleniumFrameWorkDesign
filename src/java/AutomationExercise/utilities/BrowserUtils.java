package AutomationExercise.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtils {
    WebDriver driver;
    public BrowserUtils(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void waitForElementToAppear(By findBy){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public void waitForElementToAppear(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public void waitForElementToDisappear(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
    public void verifyElementDisplayed(WebElement element){

    }

}
