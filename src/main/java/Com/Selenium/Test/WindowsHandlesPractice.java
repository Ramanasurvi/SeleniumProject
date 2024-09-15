package Com.Selenium.Test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.ScreenshotUtility;

public class WindowsHandlesPractice {
	
	private WebDriver driver;
	private ScreenshotUtility ss;
	
	public WindowsHandlesPractice(WebDriver driver) {
		this.driver=driver;	
		ss= new ScreenshotUtility(driver);
		}
	
	public static By newWindowbtn = By.id("newWindowBtn");
	public static By newWindowfirstname= By.id("firstName");
	
	public void switchNewWindowPerform() throws InterruptedException {
		
		String parentWindowHandle = driver.getWindowHandle();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(newWindowbtn));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", button);
		button.click();
		
		Thread.sleep(3000);
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle: allWindowHandles) {
			
			if(!handle.equals(parentWindowHandle)) {
			
			System.out.println("switching to new window");
			driver.switchTo().window(handle);
			
			driver.manage().window().maximize();
			
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement textbox = wait1.until(ExpectedConditions.visibilityOfElementLocated(newWindowfirstname));
//			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", textbox);
		
			textbox.sendKeys("Ramana");
			
			ss.takeScreenshot("onNewWindowScreenshot");
			Thread.sleep(3000);
			driver.close();
	
			driver.switchTo().window(parentWindowHandle);
			System.out.println("switched back to parent window");
			Thread.sleep(3000);
			
		}
		}
		
		
		
		
	}
	
}
