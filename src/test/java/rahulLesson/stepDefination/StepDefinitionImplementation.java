package rahulLesson.stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import rahulLesson.TestComponents.BaseTest;
import rahulLesson.pageObjects.*;

import java.io.IOException;

public class StepDefinitionImplementation extends BaseTest {
    public LandingPage landingPage;
    public ProductCatalogue productCatalogue;
    public CartPage cartPage;
    public CheckOutPage checkOutPage;
    public ConfirmationPage confirmationPage;

    @Given("I landed on Ecommerce Page")
    public void I_landed_on_Ecommerce_Page() throws IOException {
        landingPage = launchApplication();
    }

    @Given("^Logged in with username (.+) and password (.+)$")
    public void Logged_in_with_username_and_password_password(String username, String password) {
        productCatalogue = landingPage.loginApplication(username, password);
    }

    @When("^I add product (.+) to Cart$")
    public void I_add_product_to_Cart(String productName) throws InterruptedException {
        productCatalogue.addProductToCart(productName);
    }

    @When("^Checkout product (.+) and submit the order$")
    public void Checkout_product_and_submit_the_order(String productName) {
        //Go to cart page
        cartPage = productCatalogue.goToCartPage();

        //Verify the product in cart page
        boolean match = cartPage.verifyProductDisplay(productName);
        Assert.assertTrue(match);

        //Go to CheckoutPage
        checkOutPage = cartPage.goToCheckOut();

        //Select Country
        checkOutPage.selectCountry("india");

        //Click Place Order
        confirmationPage = checkOutPage.submitOrder();
    }

    @Then("{string} message is displayed on ConfirmationPage")
    public void message_displayed_confirmationPage(String string) {
        //Verify The Order with text
        String confirmMessage = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase(string));

    }
}
