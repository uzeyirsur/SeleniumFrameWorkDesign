package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_04_LogoutTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void verifyLoggedInAsUserName() throws InterruptedException {
        pages.getHomePage().clickSignUpLogin();
        pages.getLoginPage().setLoginEmailAddressBox("uzey12345@gmail");
        pages.getLoginPage().setLoginPasswordBox("1212wewqe");
        pages.getLoginPage().clickLoginButton();
        String text = pages.getHomePage().getLoggedInAsUserNameText();
        softAssert.assertEquals(text, " Logged in as uzey12345");
    }

    @Test
    public void verifyNavigatedToLoginPage(){

        pages.getHomePage().clickLogout();
        String message = pages.getLoginPage().getLoginToYourAccountMessage();
        softAssert.assertEquals(message,"Login to your account");
}

}
