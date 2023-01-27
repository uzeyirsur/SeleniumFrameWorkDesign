package AutomationExercisesWithCucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/AutomationExercisesWithCucumber/RegisterTest",
        glue = "AutomationExercisesWithCucumber/StepDefinitionImp",
        monochrome = true,tags = "@login",
        plugin = {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
