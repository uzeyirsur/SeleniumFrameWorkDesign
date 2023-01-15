package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginUserWithCorrectEmailAndPasswordTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void verifyHomePageVisible() {
        softAssert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise");
    }



    @Test
    public void verifyLoggedInAsUserName() throws InterruptedException {
        pages.getHomePage().clickSignUpLogin();
        pages.getLoginPage().setLoginEmailAddressBox("opopo@gmalss");
        pages.getLoginPage().setLoginPasswordBox("1212wewqe");
        pages.getLoginPage().clickLoginButton();
        String text = pages.getHomePage().getLoggedInAsUserNameText();
        softAssert.assertEquals(text, " Logged in as hlslslsı2ir");
    }
    @Test
    public void verifyAccountDeletedMessageVisibile() throws InterruptedException {

        pages.getHomePage().clickDeleteAccount();
        String accountDeletedMessage = pages.getDeleteAccountPage().getAccountDeletedMessage();
        softAssert.assertEquals(accountDeletedMessage,"Account Deleted!","Account Deleted! message is not visible or not same as expected");

    }


}
