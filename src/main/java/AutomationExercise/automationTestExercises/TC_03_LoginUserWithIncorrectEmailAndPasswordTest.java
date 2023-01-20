package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_03_LoginUserWithIncorrectEmailAndPasswordTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();
@Test
public void verifyHomePageVisible() {
    softAssert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise");
}
@Test
    public void verifyErrorYourEmailOrPasswordIncorrectVisible(){
    pages.getHomePage().clickSignUpLogin();
    pages.getLoginPage().setLoginEmailAddressBox("opopo@gmalss");
    pages.getLoginPage().setLoginPasswordBox("s1212wewqe");
    pages.getLoginPage().clickLoginButton();
    String errorMessage = pages.getLoginPage().getIncorrectEmailOrPasswordMessage();
    softAssert.assertEquals(errorMessage,"Your email or password is incorrect!");
}



}
