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

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement deleteAccountButton;

    @FindBy(xpath = "//a[normalize-space()='Logout']")
     WebElement logoutButton;

    @FindBy(css = "a[href='/contact_us']")
    WebElement contactUsButton;

    public boolean verifyHomePageDisplayed() {
        return homeButton.getText().equalsIgnoreCase("Home");
    }

    public void clickSignUpLogin() {
        signUpLoginButton.click();
    }

    public String getLoggedInAsUserNameText() throws InterruptedException {

        return loggedInAsUserName.getText();
    }

    public void clickDeleteAccount() {
        navigateTo("Delete Account");
    }
    public void clickLogout(){
       BrowserUtils.waitForElementToAppear(logoutButton);
        logoutButton.click();
    }
public void clickContactUs(){
        contactUsButton.click();
}

}
