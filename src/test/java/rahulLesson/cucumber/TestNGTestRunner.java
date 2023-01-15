package rahulLesson.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/rahulLesson/cucumber", glue = "rahulLesson/stepDefination",
        monochrome = true, tags = "@tag", plugin = {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
