package AutomationExercise.automationTestExercises;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_06_ContactUsFormTest extends BaseTest{
    SoftAssert softAssert = new SoftAssert();
@Test
    public void verifyGetInTouchVisible(){
    pages.getHomePage().clickContactUs();

}
}
