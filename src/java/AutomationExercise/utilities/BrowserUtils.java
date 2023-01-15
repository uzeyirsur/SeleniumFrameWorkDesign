package AutomationExercise.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtils {



    public static void waitForElementToAppear(By findBy){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }
    public static void waitForElementToAppear(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static void waitForElementToDisappear(WebElement webElement){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
    public void verifyElementDisplayed(WebElement element){

    }

}
