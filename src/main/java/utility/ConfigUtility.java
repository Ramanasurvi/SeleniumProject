package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtility {

    private static Properties properties = new Properties();

    // Declare the final static field
    public static final String APP_URL;

    // Static block to initialize the final static field
    static {
        String appUrlTemp; // Local variable for temporary storage

        try (InputStream input = ConfigUtility.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new IOException("Property file not found in the classpath");
            }
            properties.load(input);
            appUrlTemp = properties.getProperty("Appurl");
        } catch (IOException e) {
            System.out.println("Error reading the properties file: " + e.getMessage());
            appUrlTemp = "default_url"; // Fallback value if an error occurs
        }

        // Initialize the final static field
        APP_URL = appUrlTemp;
    }
}
