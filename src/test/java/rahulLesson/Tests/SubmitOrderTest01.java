package rahulLesson.Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulLesson.TestComponents.BaseTest;
import rahulLesson.pageObjects.*;

import java.io.IOException;


public class SubmitOrderTest01 extends BaseTest {
    @Test
    public void submitOrder() throws IOException {


        String productName = "ZARA COAT 3";

        //login


        ProductCatalogue productCatalogue = landingPage.loginApplication("hey@hotmail.com", "King12345");

        //Add to cart

        productCatalogue.waitForElementToAppear(By.cssSelector(".mb-3"));
        productCatalogue.addProductToCart(productName);


        //Go to cart page

        CartPage cartPage = productCatalogue.goToCartPage();

        //Verify the product in cart page
        boolean match = cartPage.verifyProductDisplay(productName);
        Assert.assertTrue(match);

        //Go to CheckoutPage
        CheckOutPage checkOutPage = cartPage.goToCheckOut();


        //Select Country
        checkOutPage.selectCountry("india");


        //Click Place Order
        ConfirmationPage confirmationPage = checkOutPage.submitOrder();

        //Verify The Order with text
        String confirmMessage = confirmationPage.getConfirmationMessage();
        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));

    }

}
