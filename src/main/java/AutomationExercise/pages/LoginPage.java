package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "div[class='signup-form'] h2")
    WebElement newUserSignUpHeader;

    @FindBy(css = "input[placeholder='Name']")
    WebElement signUpNewUserNameBox;

    @FindBy(css = "[data-qa='signup-email']")
    WebElement signUpEmailAddressBox;

    @FindBy(css = "[data-qa = 'signup-button']")
    WebElement signUpButton;

    @FindBy(css = "div[class='login-form'] h2")
    WebElement loginToYourAccountMessage;

    @FindBy(css = "[data-qa='login-email']")
    WebElement loginEmailAddressBox;

    @FindBy(css = "[data-qa='login-password']")
    WebElement loginPasswordBox;

    @FindBy(css = "[data-qa='login-button']")
    WebElement loginButton;
    @FindBy(xpath = "//form/p[@style]")
    WebElement incorrectEmailOrPasswordMessage;
    @FindBy(css = "p[style]")
    WebElement emailAddressAlreadyExistMessage;

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

    public void setLoginEmailAddressBox(String email) {
        loginEmailAddressBox.sendKeys(email);
    }

    public void setLoginPasswordBox(String password) {
        loginPasswordBox.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getIncorrectEmailOrPasswordMessage(){
        return incorrectEmailOrPasswordMessage.getText();
    }
    public String getLoginToYourAccountMessage(){
        return loginToYourAccountMessage.getText();
    }
    public String getEmailAddressAlreadyExistMessage(){
        return emailAddressAlreadyExistMessage.getText();
    }
}


