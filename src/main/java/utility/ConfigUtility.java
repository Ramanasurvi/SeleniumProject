package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtility {

    private static Properties properties = new Properties();

    // Declare the final static field FlipkartAppurl
    public static String MakemyTripAppurl;
    public static String FlipkartAppurl;
    public static String HRYWindowHandleAppurl;

    // Static block to initialize the final static field
    static {
//        String appUrlTemp; 

        try (InputStream input = ConfigUtility.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new IOException("Property file not found in the classpath");
            }
            properties.load(input);
            MakemyTripAppurl = properties.getProperty("makemytripappurl");
            FlipkartAppurl = properties.getProperty("flipkartappurl");
            HRYWindowHandleAppurl = properties.getProperty("hrywindowhandleappurl");
            
        } catch (IOException e) {
            System.out.println("Error reading the properties file: " + e.getMessage());
//            appUrlTemp = "default_url";
        }

        // Initialize the final static field
//        MakemyTripAppurl = appUrlTemp;
    }
}
