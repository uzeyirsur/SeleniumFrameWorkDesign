package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.Driver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class TC_01_RegisterTest extends BaseTest {
    SoftAssert softAssert = new SoftAssert();


    @Test
    public void verifyNewUserSignUpVisible() {
        pages.getHomePage().clickSignUpLogin();
        String message = pages.getLoginPage().getNewUserSignUpMessage();
        softAssert.assertEquals(message, "New User Signup!", "New User Signup! Message is not visible");
    }

    @Test(dependsOnMethods = {"verifyNewUserSignUpVisible"})
    public void verifyEnterAccountInformationVisible() throws InterruptedException {

        pages.getLoginPage().setSignUpNewUserNameBox("uzey123");
        pages.getLoginPage().setSignUpEmailAddressBox("uzey123@gmail");
        pages.getLoginPage().clickSignUpButton();

        String message = pages.getSignUpPage().getEnterAccountInformationMessage();
        softAssert.assertEquals(message, "Enter Account Information", "Enter Account Information Message is not visible");
    }


    @Test(dependsOnMethods = {"verifyEnterAccountInformationVisible"})
    public void verifyAccountCreatedVisible() throws InterruptedException {


        pages.getSignUpPage().selectGenderMan();
        pages.getSignUpPage().enterPassword("1212wewqe");
        pages.getSignUpPage().selectDay("5");
        pages.getSignUpPage().selectMonth("March");
        pages.getSignUpPage().selectYear("1972");
        pages.getSignUpPage().clickNewsLetter();
        pages.getSignUpPage().clickSpecialOffers();
        pages.getSignUpPage().setFirstName("Ahmet");
        pages.getSignUpPage().setLastName("Loyloy");
        pages.getSignUpPage().setCompany("Inar Academy");
        pages.getSignUpPage().setAddress1("Bilmemne Sok. sdsdsa cad.");
        pages.getSignUpPage().setAddress2("heyhey cad. loyloy sok.");
        pages.getSignUpPage().selectCountry("Canada");
        pages.getSignUpPage().setState("Toronto");
        pages.getSignUpPage().setCity("HeyCity");
        pages.getSignUpPage().setZipCode("12121223");
        pages.getSignUpPage().setMobileNumber("45435345345345");
        pages.getSignUpPage().clickCreateAccount();
        pages.getAccountCreatedPage().getAccountCreatedMessage();
    }

    @Test
    public void verifyAccountDeletedMessageVisibile() throws InterruptedException {

        pages.getAccountCreatedPage().clickContinueButton();
        pages.getHomePage().getLoggedInAsUserNameText();
        pages.getHomePage().clickDeleteAccount();
        String accountDeletedMessage = pages.getDeleteAccountPage().getAccountDeletedMessage();
        softAssert.assertEquals(accountDeletedMessage, "Account Deleted!", "Account Deleted! message is not visible or not same as expected");
        pages.getDeleteAccountPage().clickContinueButton();
    }

    @DataProvider(name = "getDataForAutomation")
    public Object[][] getDataForAutomation() throws IOException {
        List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") +
                "\\src\\test\\java\\AutomationExercises\\data\\Register.json");
        return new Object[][]{{data.get(0)}, {data.get(1)}};

    }
}