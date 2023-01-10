package rahulLesson.pageObjects;

import rahulLesson.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends AbstractComponents {
    WebDriver driver;

    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".cartSection h3")
    List<WebElement> cartProducts;

    public boolean verifyProductDisplay(String productName) {
        boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
        return match;
    }

    @FindBy(css = ".totalRow button")
    WebElement checkOutButton;

    public CheckOutPage goToCheckOut() {
        checkOutButton.click();
        return new CheckOutPage(driver);
    }
}
