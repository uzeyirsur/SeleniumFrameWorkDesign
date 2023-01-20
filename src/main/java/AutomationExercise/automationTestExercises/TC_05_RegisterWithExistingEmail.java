package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_05_RegisterWithExistingEmail extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void verifyNewUserSignUpVisible() {
        pages.getHomePage().clickSignUpLogin();
        String message = pages.getLoginPage().getNewUserSignUpMessage();
        Assert.assertEquals(message, "New User Signup!", "New User Signup! Message is not visible");
    }

    @Test
    public void verifyEmailAddressAlreadyExistIsVisible()  {

        pages.getLoginPage().setSignUpNewUserNameBox("idris");
        pages.getLoginPage().setSignUpEmailAddressBox("uzey@gmail");
        pages.getLoginPage().clickSignUpButton();
        String message = pages.getLoginPage().getEmailAddressAlreadyExistMessage();
        Assert.assertEquals(message, "Email Address already exist!");
    }
}
