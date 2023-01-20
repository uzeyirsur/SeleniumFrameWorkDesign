package AutomationExercise.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {
    private static Properties configFile;

    static {
        try {
            String path = System.getProperty("user.dir") + "\\src\\main\\java\\AutomationExercise\\resources\\configuration.properties";
            FileInputStream input = new FileInputStream(path);

            configFile = new Properties();
            configFile.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load properties file!");
        }

    }

    public static String getProperty(String keyName) {
        return configFile.getProperty(keyName);
    }
}
