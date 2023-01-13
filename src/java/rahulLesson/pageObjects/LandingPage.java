package rahulLesson.pageObjects;

import org.openqa.selenium.By;
import rahulLesson.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponents {
    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //WebElement userName = driver.findElement(By.id("userEmail"));
    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(id = "login")
    WebElement submit;

    @FindBy(css = "div[aria-label='Incorrect email or password.']")
    WebElement errorMessage;



    public ProductCatalogue loginApplication(String email, String password) {
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        submit.click();
        ProductCatalogue productCatalogue = new ProductCatalogue(driver);
        return productCatalogue;
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/client");
    }

    public String getErrorMessage() {
        waitForElementToAppear(errorMessage);
        return errorMessage.getText();
    }
}

