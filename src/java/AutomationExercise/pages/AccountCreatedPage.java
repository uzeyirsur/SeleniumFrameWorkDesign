package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{
    @FindBy(css = "div h2 b")
    WebElement accountCreatedMessage;

    @FindBy(className = "[data-qa='continue-button']")
    WebElement continueButton;
    public void getAccountCreatedMessage(){
        BrowserUtils.waitForElementToAppear(accountCreatedMessage);
        accountCreatedMessage.getText();
    }
    public void clickContinueButton() throws InterruptedException {
        BrowserUtils.waitForElementToAppear(continueButton);
        continueButton.click();

    }
}
