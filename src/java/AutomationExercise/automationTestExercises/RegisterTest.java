package AutomationExercise.automationTestExercises;

import AutomationExercise.pages.SignUpPage;
import AutomationExercise.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void verifyHomePageVisible() {
        softAssert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise");
    }

    @Test
    public void verifyNewUserSignUpVisible() {

        pages.getHomePage().clickSignUpLogin();
        String message = pages.getLoginPage().getNewUserSignUpMessage();
        softAssert.assertEquals(message, "New User Signup!", "New User Signup! Message is not visible");
    }

    @Test
    public void verifyEnterAccountInformationVisible() {
        pages.getLoginPage().setSignUpNewUserNameBox("Uzeyir");
        pages.getLoginPage().setSignUpEmailAddressBox("sdads@rtrewt");
        pages.getLoginPage().clickSignUpButton();
        String message = pages.getSignUpPage().getEnterAccountInformationMessage();
        softAssert.assertEquals(message, "Enter Account Information");
    }

    @Test
    public void verifyAccountCreatedVisible() {
        SignUpPage signUpPage = pages.getSignUpPage();
        signUpPage.selectGenderMan();
        signUpPage.enterPassword("1212wewqe");
        signUpPage.selectDay("5");
        signUpPage.selectMonth("March");
        signUpPage.selectYear("1972");
        signUpPage.clickNewsLetter();
        signUpPage.clickSpecialOffers();
        signUpPage.setFirstName("Ahmet");
        signUpPage.setLastName("Loyloy");
        signUpPage.setCompany("Inar Academy");
        signUpPage.setAddress1("Bilmemne Sok. sdsdsa cad.");
        signUpPage.setAddress2("heyhey cad. loyloy sok.");
        signUpPage.selectCountry("Canada");
        signUpPage.setState("Toronto");
        signUpPage.setZipCode("12121223");
        signUpPage.setMobileNumber("45435345345345");
        signUpPage.clickCreateAccount();
    }
}
