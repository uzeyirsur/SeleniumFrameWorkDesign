package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "div[class='signup-form'] h2")
    WebElement newUserSignUpHeader;

    @FindBy(css = "[name='name']")
    WebElement signUpNewUserNameBox;

    @FindBy(css = "[name='email']")
    WebElement signUpEmailAddressBox;

    @FindBy(css = "[data-qa = 'signup-button']")
    WebElement signUpButton;
    public String getNewUserSignUpMessage(){
        return  newUserSignUpHeader.getText();

    }
    public void setSignUpNewUserNameBox(String name){
        signUpNewUserNameBox.sendKeys(name);
    }
    public void setSignUpEmailAddressBox(String email){
        signUpEmailAddressBox.sendKeys(email);
    }
    public void clickSignUpButton(){

        signUpButton.click();
    }

}
