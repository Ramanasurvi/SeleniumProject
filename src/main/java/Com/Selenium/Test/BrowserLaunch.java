package Com.Selenium.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
	
	 private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	 @BeforeMethod
	    public WebDriver setup() {
	        WebDriverManager.chromedriver().setup();  // Setup ChromeDriver
	        WebDriver driverInstance = new ChromeDriver(); 				// Initialize WebDriver
	        driver.set(driverInstance);
	        driverInstance.manage().window().maximize(); 
	        
	    	return driverInstance;
	    }
	 
		@AfterMethod
		public void tearDown() {
			if(driver.get()!=null) {
				driver.get().quit();
				driver.remove();
			}
		}
		
	    public WebDriver getDriver() {
	        return driver.get();
	    }

}
