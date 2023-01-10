package AutomationExercise.RegisterUser;

import AutomationExercise.AbstractComponents.AbstractComponents;
import AutomationExercise.pageObjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;

public class SubmitOrder {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
        Assert.assertTrue(landingPage.isHomePageVisible());

        Assert.assertTrue(landingPage.isSignUpPageVisible());


    }

}
