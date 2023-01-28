package AutomationExercisesWithCucumber.TC_02;

import AutomationExercise.automationTestExercises.BaseTest;
import AutomationExercise.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class StepDefinitionImp extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    @Given("^the user landed on Home Page$")
    public void the_user_landed_on_Home_Page(){
       setUpSuit();
    }
    @Then("^the user sees Home Page$")
    public void the_user_sees_Home_Page(){
        softAssert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise");
    }
    @When("^the user click SignupLogin button$")
    public void the_user_click_SignupLogin_button(){
        pages.getHomePage().clickSignUpLogin();
    }
    @Then("^the user see Login to your account message$")
    public void the_user_see_Login_to_your_account_message(){
        String message = pages.getLoginPage().getNewUserSignUpMessage();
        softAssert.assertEquals(message, "New User Signup!", "New User Signup! Message is not visible");
    }
    @When("^the user enters email address (.+)$")
    public void the_user_enters_email_address(String emailAddress){
        pages.getLoginPage().setLoginEmailAddressBox(emailAddress);
    }
    @When("^the user enters password (.+)$")
    public void the_user_enters_password(String password){
        pages.getLoginPage().setLoginPasswordBox(password);
    }
    @When("^the user clicks Login button$")
    public void the_user_clicks_Login_button(){
        pages.getLoginPage().clickLoginButton();
    }
    @Then("^the user sees logged in as username$")
    public void the_user_sees_logged_in_as_username()  {
        String text = pages.getHomePage().getLoggedInAsUserNameText();
        boolean contains = text.contains("Logged in as");
        Assert.assertTrue(contains);
    }
    @When("^the user clicks Delete Account button$")
    public void the_user_clicks_Delete_Account_button(){
        pages.getHomePage().clickDeleteAccount();
    }
    @Then("{string} message displayed on the DeleteAccountPage")
    public void the_user_sees_Account_Deleted_Message(String message){
        String accountDeletedMessage = pages.getDeleteAccountPage().getAccountDeletedMessage();
        softAssert.assertEquals(accountDeletedMessage, message,
                "Account Deleted! message is not visible or not same as expected");
    }

    @Given("^the user navigates to log in page to login$")
    public void the_user_navigates_to_log_in_page_to_login() {
        the_user_landed_on_Home_Page();
        the_user_click_SignupLogin_button();
        the_user_see_Login_to_your_account_message();
    }


    @When("^the user clicks Logout button$")
    public void the_user_clicks_logout_button() {
        pages.getHomePage().clickLogout();
    }

    @Then("^the user navigates to log in page$")
    public void the_user_navigates_to_log_in_page() {
        String message = pages.getLoginPage().getLoginToYourAccountMessage();
        Assert.assertEquals(message,"Login to your account");
    }


}
