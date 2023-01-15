package AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends BasePage {
    @FindBy(css = "h2 b")
    WebElement accountDeletedMessage;

    @FindBy(css="[data-qa='continue-button']")
    WebElement continueButton;

    public String getAccountDeletedMessage() {
        return accountDeletedMessage.getText();
    }
    public void clickContinueButton(){
        continueButton.click();
    }
}
