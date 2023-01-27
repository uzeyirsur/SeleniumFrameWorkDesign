package AutomationExercise.automationTestExercises;

import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_08_VerifyAllProductsAndProductDetailPage extends BaseTest {
    @Test
    public void verifyNavigateToAllProductsPage() {
        pages.getHomePage().clickProductsButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Automation Exercise - All Products");
    }

//    @Test(dependsOnMethods = "verifyNavigateToAllProductsPage")
//    public void verifyProductListIsVisible() {
//       Assert.assertEquals(pages.getProductsPage().getAllProductsTitle(),"All Products");
//    }

//    @Test(dependsOnMethods = "verifyNavigateToAllProductsPage")
//    public void verifyDetailsVisible() {
//        pages.getProductsPage().clickOnViewProductOfFirstProduct();
//
//        String productName = pages.getProductsPage().getProductName();
//        String categoryName = pages.getProductsPage().getCategory();
//        String price = pages.getProductsPage().getPrice();
//        String availability = pages.getProductsPage().getAvailability();
//        String condition = pages.getProductsPage().getCondition();
//        String brand = pages.getProductsPage().getBrand();
//
//        Assert.assertEquals(productName, "Blue Top");
//        Assert.assertEquals(categoryName, "Category: Women > Tops");
//        Assert.assertEquals(price, "Rs. 500");
//        Assert.assertEquals(availability, "Availability: In Stock");
//        Assert.assertEquals(condition, "Condition: New");
//        Assert.assertEquals(brand, "Brand: Polo");
//
//    }
}
