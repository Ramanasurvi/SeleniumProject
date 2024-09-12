package utility;

import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.Date;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	private WebDriver driver;
	
	public ScreenshotUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	public void takeScreenshot(String screenshotname) {
		
	String timestamp= new SimpleDateFormat("yyyymmdd_HHmmss").format(new Date());	
	
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileHandler.copy(src, new File("screenshots/"+screenshotname+"_"+timestamp+".png"));
		System.out.println("Screenshot Saved Successfully");
	} catch (IOException e) {
		
		System.out.println("Failed to save Screenshot"+e.getMessage());
	}
	
	
	
	}
}
