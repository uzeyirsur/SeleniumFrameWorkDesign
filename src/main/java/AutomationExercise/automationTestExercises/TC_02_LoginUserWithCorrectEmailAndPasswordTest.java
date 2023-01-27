package AutomationExercise.automationTestExercises;


import AutomationExercise.pages.BasePage;
import AutomationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_02_LoginUserWithCorrectEmailAndPasswordTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();




    @Test(dependsOnMethods = {"verifyHomePageVisible"})
    public void verifyLoggedInAsUserName() throws InterruptedException {
        pages.getHomePage().clickSignUpLogin();
        pages.getLoginPage().setLoginEmailAddressBox("uzey@gmail");
        pages.getLoginPage().setLoginPasswordBox("1212wewqe");
        pages.getLoginPage().clickLoginButton();
        String text = pages.getHomePage().getLoggedInAsUserNameText();
        boolean contains = text.contains("Logged in as");
        Assert.assertTrue(contains);
    }

    @Test(dependsOnMethods = {"verifyLoggedInAsUserName"})
    public void verifyAccountDeletedMessageVisibile()  {
        pages.getHomePage().clickDeleteAccount();
        String accountDeletedMessage = pages.getDeleteAccountPage().getAccountDeletedMessage();
        softAssert.assertEquals(accountDeletedMessage, "Account Deleted!", "Account Deleted! message is not visible or not same as expected");

    }


}
