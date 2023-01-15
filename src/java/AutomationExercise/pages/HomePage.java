package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = "li a[href='/']")
    WebElement homeButton;

    @FindBy(xpath = "//a[@href='/login']")
    WebElement signUpLoginButton;

    @FindBy(xpath = "//ul[@class='nav navbar-nav'] /li[10]/a")
    WebElement loggedInAsUserName;

    @FindBy(css = "a[href='/delete_account']")
    WebElement deleteAccountButton;


    public boolean verifyHomePageDisplayed() {
        return homeButton.getText().equalsIgnoreCase("Home");
    }

    public void clickSignUpLogin() {
        signUpLoginButton.click();
    }

    public String getLoggedInAsUserNameText() throws InterruptedException {
        Thread.sleep(3000);
        return loggedInAsUserName.getText();
    }

    public void clickDeleteAccount() {
        deleteAccountButton.click();
    }


}
