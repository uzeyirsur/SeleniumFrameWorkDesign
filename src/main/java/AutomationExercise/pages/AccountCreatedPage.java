package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountCreatedPage extends BasePage{
    @FindBy(css = "div h2 b")
    WebElement accountCreatedMessage;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;
    public void getAccountCreatedMessage(){
        BrowserUtils.waitForElementToAppear(accountCreatedMessage);
        accountCreatedMessage.getText();
    }
    public void clickContinueButton() throws InterruptedException {
        continueButton.click();

    }
}
