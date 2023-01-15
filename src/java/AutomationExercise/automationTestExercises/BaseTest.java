package AutomationExercise.automationTestExercises;


import AutomationExercise.utilities.ConfigurationReader;
import AutomationExercise.utilities.Driver;
import AutomationExercise.utilities.Pages;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class BaseTest {
    protected Pages pages = new Pages();

    @BeforeTest()
    public void setUpSuit() {
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(URL);
        System.out.println(":::::::::Test Information:::::::::\n" + "URL:" + URL +
                "\nBrowser: " + browser + "\nEnvironment: " + environment);

    }
   // @AfterSuite
    //public void tearDown() {
      //  Driver.getDriver().quit();
    //}

    public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {
        //Read Json to String
        String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);

        //String to HashMap -Jackson DataBind
        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });
        return data;
    }

}
