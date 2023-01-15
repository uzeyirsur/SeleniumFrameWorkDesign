package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "div[class='signup-form'] h2")
    WebElement newUserSignUpHeader;

    @FindBy(css = "[name='name']")
    WebElement signUpNewUserNameBox;

    @FindBy(css = "[data-qa='signup-email']")
    WebElement signUpEmailAddressBox;

    @FindBy(css = "[data-qa = 'signup-button']")
    WebElement signUpButton;

    @FindBy (css="div h2[css='1']")
    WebElement loginToYourAccountMessage;

    @FindBy (css = "[data-qa='login-email']")
    WebElement loginEmailAddressBox;

    @FindBy(css="[data-qa='login-password']")
    WebElement loginPasswordBox;

    @FindBy (css="[data-qa='login-button']")
    WebElement loginButton;

    public String getNewUserSignUpMessage() {
        return newUserSignUpHeader.getText();

    }

    public void setSignUpNewUserNameBox(String name) {

        signUpNewUserNameBox.sendKeys(name);
    }

    public void setSignUpEmailAddressBox(String email) {
        signUpEmailAddressBox.sendKeys(email);
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }
    public void setLoginEmailAddressBox(String email){
        loginEmailAddressBox.sendKeys(email);
    }
    public void setLoginPasswordBox(String password){
        loginPasswordBox.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }

}
