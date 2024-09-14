package Com.Selenium.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartHomePage {
	
	private WebDriver driver;
	private Actions ac;

	public FlipkartHomePage(WebDriver driver) {
		this.driver=driver;
		ac= new Actions(driver);
	}

	//locators
	public static By electronics= By.xpath("//div[@aria-label='Electronics']");
	public static By audio = By.xpath("//a[@class='_1BJVlg _11MZbx'][text()='Audio']");
	public static By audioAll=By.xpath("//a[@class='_3490ry'][text()='All']");
	
	
	public void HoverOverElectronics() {
		System.out.println("Inside HoverOverElectronics method");
		System.out.println("driver: "+driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(electronics));
		ac.moveToElement(element).perform();
	}

	public void HoverOverAudio() {
		System.out.println("inside method2");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(audio));
		ac.moveToElement(element).perform();
	}
	
	public void clickonAllAudio() {
		System.out.println("inside method3");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(audioAll));
		element.click();
	}
}
