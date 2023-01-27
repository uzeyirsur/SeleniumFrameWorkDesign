package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_06_ContactUsFormTest extends BaseTest{

@Test
    public void verifyGetInTouchVisible(){
    pages.getHomePage().clickContactUs();
String message = pages.getContactUsPage().getGetInTouchMessage();
    Assert.assertEquals(message.toLowerCase(),"Get In Touch".toLowerCase());
}
@Test(dependsOnMethods = "verifyGetInTouchVisible")
    public void verifySuccessMessage(){
    pages.getContactUsPage().setNameBox("Uzeyir");
    pages.getContactUsPage().setEmailBox("abc@gmail");
    pages.getContactUsPage().setSubjectBox("Help me!");
    pages.getContactUsPage().setMessageBox("Hello I need some help about...");
    pages.getContactUsPage().selectFile("C:\\Users\\omers\\OneDrive\\Masaüstü\\Java notları.txt");
    BrowserUtils.scrollDown("100");
    pages.getContactUsPage().clickSubmitButton();
    pages.getContactUsPage().clickOkPopUp();
    String message = pages.getContactUsPage().getSuccessSubmitMessage();
    Assert.assertEquals(message.toLowerCase(),"Success! Your details have been submitted successfully.".toLowerCase());

    }
    @Test(dependsOnMethods ="verifySuccessMessage")
    public void verifyHomePageVisible() {
        pages.getContactUsPage().clickHomeButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise");
}
}
