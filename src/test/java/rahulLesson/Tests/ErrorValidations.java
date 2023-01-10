package rahulLesson.Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import rahulLesson.TestComponents.BaseTest;
import rahulLesson.pageObjects.CartPage;
import rahulLesson.pageObjects.CheckOutPage;
import rahulLesson.pageObjects.ConfirmationPage;
import rahulLesson.pageObjects.ProductCatalogue;

import java.io.IOException;


public class ErrorValidations extends BaseTest {
    @Test
    public void LoginErrorValidation() throws IOException {

        String productName = "ZARA COAT 3";

        //login  @BeforeMethod

        ProductCatalogue productCatalogue = landingPage.loginApplication("hey@hotmail.com", "King1542345");
        Assert.assertEquals("Incorrect email or password.",landingPage.getErrorMessage());


    }
    @Test
    public void productionErrorValidation() throws IOException {


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



    }


}
