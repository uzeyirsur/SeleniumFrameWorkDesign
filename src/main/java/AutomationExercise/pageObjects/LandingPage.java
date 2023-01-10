package AutomationExercise.pageObjects;

import AutomationExercise.AbstractComponents.AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage extends AbstractComponents {
WebDriver driver;
    public LandingPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void goTo(){
        driver.get("https://automationexercise.com/");
    }

    public boolean isHomePageVisible(){

        boolean homePageFlag = driver.findElement(By.cssSelector("li a[href='/']")).getText().equalsIgnoreCase("home");
        return homePageFlag;
    }
    public boolean isSignUpPageVisible(){
        driver.findElement(By.cssSelector("li a[href='/login']")).click();
        List<WebElement> loginSignUp = driver.findElements(By.xpath("//div/h2"));
        boolean signUpPageFlag = loginSignUp.stream().anyMatch(s -> s.getText().equalsIgnoreCase("New User Signup!"));
        return signUpPageFlag;
    }
}
