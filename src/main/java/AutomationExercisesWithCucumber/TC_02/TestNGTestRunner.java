package AutomationExercisesWithCucumber.TC_02;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/AutomationExercisesWithCucumber/TC_02/CorrectLoginTest.feature",
        glue = "AutomationExercisesWithCucumber/TC_02/StepDefinitionImp",
        monochrome = true,tags = "@login",
        plugin = {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
