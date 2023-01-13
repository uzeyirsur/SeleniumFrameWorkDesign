package AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccountPage extends BasePage {
    @FindBy(css = "h2 b")
    WebElement accountDeletedMessage;

    public String getAccountDeletedMessage() {
        return accountDeletedMessage.getText();
    }
}
