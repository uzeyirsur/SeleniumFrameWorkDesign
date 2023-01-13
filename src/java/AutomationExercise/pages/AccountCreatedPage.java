package AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{
    @FindBy(css = "div h2 b")
    WebElement accountCreatedMessage;

    @FindBy(css = "[data-qa='continue-button']")
    WebElement continueButton;
    public void getAccountCreatedMessage(){
        accountCreatedMessage.getText();
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}
