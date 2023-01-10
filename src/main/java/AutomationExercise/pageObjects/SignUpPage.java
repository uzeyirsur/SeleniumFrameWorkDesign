package AutomationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;
    public SignUpPage (){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="[name='name']")
    WebElement userName;
    @FindBy(css="[name='email']:nth-child(3)")
    WebElement userEmail;
    @FindBy(xpath = "//button[text()='Signup']")
    WebElement submit;
    public CreateAccountPage  SignUpApplication(String name,String email){
        userName.sendKeys(name);
        userEmail.sendKeys(email);
        submit.click();
      CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        return createAccountPage;
    }
}
