package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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
