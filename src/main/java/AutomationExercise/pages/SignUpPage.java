package AutomationExercise.pages;


import AutomationExercise.utilities.BrowserUtils;
import AutomationExercise.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {
    Actions a = new Actions(Driver.getDriver());
    @FindBy(id = "id_gender1")
    WebElement genderManRadio;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "days")
    WebElement days;
    @FindBy(id = "months")
    WebElement months;
    @FindBy(id = "years")
    WebElement years;
    @FindBy(id = "newsletter")
    WebElement newsLetter;
    @FindBy(id = "optin")
    WebElement specialOffers;
    @FindBy(id = "first_name")
    WebElement firstName;
    @FindBy(id = "last_name")
    WebElement lastName;
    @FindBy(id = "company")
    WebElement company;
    @FindBy(id = "address1")
    WebElement address1;
    @FindBy(id = "address2")
    WebElement address2;
    @FindBy(id = "country")
    WebElement country;
    @FindBy(id = "state")
    WebElement state;
    @FindBy(id = "city")
    WebElement city;
    @FindBy(id = "zipcode")
    WebElement zipcode;
    @FindBy(id = "mobile_number")
    WebElement mobile_number;
    @FindBy(css = "[data-qa='create-account']")
    WebElement createAccountSubmit;

    @FindBy(xpath = "//b[text()='Enter Account Information']")
    WebElement enterAccountInformationMessage;




    public void selectGenderMan() {
        BrowserUtils.waitForElementToAppear(genderManRadio);
        genderManRadio.click();
    }

    public void enterPassword(String userPassword) {
        password.sendKeys(userPassword);
    }

    public void selectDropdown(WebElement element, String value) {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(value);
    }

    public void selectDay(String day) {
        selectDropdown(days, day);
    }

    public void selectMonth(String month) {
        selectDropdown(months, month);
    }

    public void selectYear(String year) {
        selectDropdown(years, year);
    }

    public void clickNewsLetter() throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView();", newsLetter);
        BrowserUtils.waitForElementToAppear(newsLetter);
        newsLetter.click();
    }

    public void clickSpecialOffers() throws InterruptedException {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].scrollIntoView();", specialOffers);
        BrowserUtils.waitForElementToAppear(specialOffers);
        specialOffers.click();
    }

    public void setFirstName(String userFirstName) {
        firstName.sendKeys(userFirstName);
    }

    public void setLastName(String userLastName) {
        lastName.sendKeys(userLastName);
    }

    public void setCompany(String companyName) {
        company.sendKeys(companyName);
    }

    public void setAddress1(String address) {
        address1.sendKeys(address);
    }

    public void setAddress2(String address) {
        address2.sendKeys(address);
    }

    public void selectCountry(String userCountry) {
        Select select = new Select(country);
        select.selectByVisibleText(userCountry);
    }

    public void setCity(String userCity) {
        city.sendKeys(userCity);
    }

    public void setZipCode(String userZipCode) {
        zipcode.sendKeys(userZipCode);
    }

    public void setMobileNumber(String userMobileNumber) {
        mobile_number.sendKeys(userMobileNumber);
    }

    public void clickCreateAccount() {
        createAccountSubmit.click();
    }

    public String getEnterAccountInformationMessage() {

        return enterAccountInformationMessage.getText();
    }

    public void setState(String userState) {
        state.sendKeys(userState);
    }


}
