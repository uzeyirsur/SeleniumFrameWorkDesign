package AutomationExercise.automationTestExercises;


import AutomationExercise.utilities.ConfigurationReader;
import AutomationExercise.utilities.Driver;
import AutomationExercise.utilities.Pages;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected Pages pages = new Pages();
    @BeforeSuite()
public void setUpSuit(){
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(URL);
        System.out.println(":::::::::Test Information:::::::::\n"+"URL:" + URL +
                "\nBrowser: " + browser +"\nEnvironment: "+ environment);

        }
    @AfterSuite
    public void tearDown(){
        Driver.getDriver().quit();
    }


}
