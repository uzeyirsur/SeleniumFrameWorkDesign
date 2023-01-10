package rahulLesson.pageObjects;

import org.openqa.selenium.By;
import rahulLesson.AbstractComponents.AbstractComponents;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends AbstractComponents {
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[placeholder='Select Country']")
    WebElement countryBox;
    @FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
    WebElement selectedCountry;
    @FindBy(css = ".action__submit")
    WebElement submit;

    By resultsCountry = By.cssSelector(".ta-results");
    public void selectCountry(String country) {
        Actions a = new Actions(driver);
        a.sendKeys(countryBox, country).build().perform();
        waitForElementToAppear(resultsCountry);
        selectedCountry.click();

    }

    public ConfirmationPage submitOrder() {
        submit.click();
        return new ConfirmationPage(driver);
    }
}
