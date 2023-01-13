package AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "li a[href='/']")
    WebElement homeButton;

    @FindBy(xpath = "//a[@href='/login']")
    WebElement signUpLoginButton;

    @FindBy(css = "li a[css='10']")
    WebElement loggedInAsUserName;

    @FindBy(css = "a[href='/delete_account']")
    WebElement deleteAccountButton;


    public boolean verifyHomePageDisplayed() {
        return homeButton.getText().equalsIgnoreCase("Home");
    }

    public void clickSignUpLogin() {

        signUpLoginButton.click();
    }

    public void getLoggedInAsUserNameText() {
        loggedInAsUserName.getText();
    }

    public void clickDeleteAccount() {
        deleteAccountButton.click();
    }


}
