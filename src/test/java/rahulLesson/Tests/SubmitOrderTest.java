package rahulLesson.Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import rahulLesson.pageObjects.*;
import rahulLesson.resources.BaseTest;

import java.time.Duration;

public class SubmitOrderTest extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        String productName = "ZARA COAT 3";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        //login
        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
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
        driver.close();
    }

}



