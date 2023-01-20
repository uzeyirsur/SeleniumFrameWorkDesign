package rahulLesson.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import rahulLesson.AbstractComponents.AbstractComponents;

import java.util.List;

public class OrderPage extends AbstractComponents {
    WebDriver driver;

    public OrderPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//tr/td[2]")
    List<WebElement> orderedProducts;


    public boolean verifyOrderedProduct(String productName) {
        return orderedProducts.stream().anyMatch(product -> product.getText().equalsIgnoreCase(productName));
    }

}
