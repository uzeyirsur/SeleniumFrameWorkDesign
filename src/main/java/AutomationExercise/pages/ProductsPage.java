package AutomationExercise.pages;

import AutomationExercise.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class ProductsPage {
    @FindBy(css = ".title.text-center")
    WebElement allProductsTitle;
    @FindBy(css = "[class='btn btn-default add-to-cart']")
    List<WebElement> addToCartButtons;
    @FindBy(css = "a[href$='/product_details/1']")
    WebElement viewFirstProductButton;

    @FindBy(css = "div[class='product-information'] h2")
    WebElement productName;
    @FindBy(xpath = "//div[@class='product-information']/p[1]")
    WebElement category;
    @FindBy(xpath = "//div[@class='product-information']/p[2]")
    WebElement availability;
    @FindBy(xpath = "//div[@class='product-information']/p[3]")
    WebElement condition;
    @FindBy(xpath = "//div[@class='product-information']/p[4]")
    WebElement brand;
    @FindBy(xpath = "//div[@class='product-information']/span/span")
    WebElement price;


    public String getAllProductsTitle() {
        BrowserUtils.scrollDown("400");
        BrowserUtils.waitForElementToAppear(allProductsTitle);
        return allProductsTitle.getText();
    }

    public int getNumberOfAddToCartButton() {
        BrowserUtils.scrollDown("700");

        return addToCartButtons.size();
    }

    public void clickOnViewProductOfFirstProduct() {
        BrowserUtils.scrollDown("600");
        viewFirstProductButton.click();
    }
    public String getProductName(){
        return productName.getText();
    }
    public String getCategory(){
        return category.getText();
    }
    public String getPrice(){
        return price.getText();
    }
    public String getAvailability(){
        return availability.getText();
    }
    public String getCondition(){
        return condition.getText();
    }
    public String getBrand(){
        return brand.getText();
    }

}
