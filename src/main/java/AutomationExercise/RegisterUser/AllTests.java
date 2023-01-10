package AutomationExercise.RegisterUser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class AllTests {
    public static void main(String[] args) throws InterruptedException {
        String userName = "Uzeyir1231232";
        String email = "hey2123123@gmail.com";
        String firstName = "Uzeyir";
        String lastName = "Sur";
        String company = "Inar";
        String address1 = "adress1";
        String address2 = "address2";
        String state = "Quebec";
        String city = "Montreal";
        String zipcode = "121212";
        String mobile_number = "6761212121234";


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

//Is HomePage visible
        List<WebElement> links = driver.findElements(By.cssSelector("div ul[class='nav navbar-nav']"));
        boolean homePageFlag = driver.findElement(By.cssSelector("li a[href='/']")).getText().equalsIgnoreCase("home");
        Assert.assertTrue(homePageFlag);


        //Click Signup/Login Button
        driver.findElement(By.cssSelector("li a[href='/login']")).click();
        List<WebElement> loginSignUp = driver.findElements(By.xpath("//div/h2"));
        boolean signUpPageFlag = loginSignUp.stream().anyMatch(s -> s.getText().equalsIgnoreCase("New User Signup!"));
        Assert.assertTrue(signUpPageFlag);

        // Enter name and email address
        driver.findElement(By.cssSelector("[name='name']")).sendKeys(userName);
        driver.findElement(By.cssSelector("[name='email']:nth-child(3)")).sendKeys(email);

        driver.findElement(By.xpath("//button[text()='Signup']")).click();

        //Verify that 'ENTER ACCOUNT INFORMATION' is visible

        boolean accountInfoPageFlag = driver.findElement(By.xpath("//b[text()='Enter Account Information']")).getText().
                equalsIgnoreCase("Enter Account Information");
        Assert.assertTrue(accountInfoPageFlag);

//Fill details: Title, Name, Email, Password, Date of birth

        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("King12345");

        WebElement staticDropdownDay = driver.findElement(By.id("days"));
        Select dropdown = new Select(staticDropdownDay);
        dropdown.selectByVisibleText("5");

        WebElement staticDropdownMonth = driver.findElement(By.id("months"));
        Select dropdown2 = new Select(staticDropdownMonth);
        dropdown2.selectByVisibleText("March");

        WebElement staticDropdownYear = driver.findElement(By.id("years"));
        Select dropdown3 = new Select(staticDropdownYear);
        dropdown3.selectByVisibleText("1996");

        Thread.sleep(6000);

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();

        driver.findElement(By.id("first_name")).sendKeys(firstName);
        driver.findElement(By.id("last_name")).sendKeys(lastName);
        driver.findElement(By.id("company")).sendKeys(company);
        driver.findElement(By.id("address1")).sendKeys(address1);
        driver.findElement(By.id("address2")).sendKeys(address2);

        WebElement staticDropdownCountry = driver.findElement(By.id("country"));
        Select dropdown4 = new Select(staticDropdownCountry);
        dropdown4.selectByVisibleText("Canada");
        driver.findElement(By.id("state")).sendKeys(state);
        driver.findElement(By.id("city")).sendKeys(city);
        driver.findElement(By.id("zipcode")).sendKeys(zipcode);
        driver.findElement(By.id("mobile_number")).sendKeys(mobile_number);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Create Account']")));
        driver.findElement(By.xpath("//button[text()='Create Account']")).click();


    }
}
