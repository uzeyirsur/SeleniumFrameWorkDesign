package rahulLesson.Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rahulLesson.TestComponents.BaseTest;
import rahulLesson.pageObjects.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class SubmitOrderTest01 extends BaseTest {
      String productName = "ZARA COAT 3";

    @Test(dataProvider = "getData", groups = {"Purchase"})
    public void submitOrder(HashMap<String, String> input) throws IOException, InterruptedException {

        //login @BeforeTest
        ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));

        //Add to cart
        productCatalogue.addProductToCart(input.get("product"));

        //Go to cart page
        CartPage cartPage = productCatalogue.goToCartPage();

        //Verify the product in cart page
        boolean match = cartPage.verifyProductDisplay(input.get("product"));
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

    @Test(dependsOnMethods = {"submitOrder"}, dataProvider = "getData")
    public void OrderHistoryTest(HashMap<String, String> input) {
        ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"), input.get("password"));
        OrderPage orderPage = productCatalogue.goToOrderPage();

        orderPage.verifyOrderedProduct(productName);
    }

    @DataProvider(name = "getData")
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir") +
                "\\src\\test\\java\\rahulLesson\\data\\PurchaseOrder.json");
        return new Object[][]{{data.get(0)}, {data.get(1)}};
    }


}
