package Com.Selenium.Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;

	// locators
	public static By tripType = By.id("tripType");
	public static By tripTypeFirOpt = By.xpath("//div[@class='tripTypeFilter']/ul/li[1]");
	public static By tripTypeSecOpt = By.xpath("//div[@class='tripTypeFilter']/ul/li[2]");
	public static By fromlocation = By.xpath(
			"//div[@class='modify-search-input-box startPlace']/label[@class='modify-search-label blueText font12 latoBold'][text()='From']");
	public static By selectfrom = By.xpath(
			"//li[@class='liCityFrom']/p[@class='darkGreyText font14 make_flex space_between']/span[@class='autosuggest_label'][contains(text(),'Pune')]");
	public static By depart = By.xpath("//label[text()='Depart']");
	public static By selectdepartdate = By.xpath("//a[@class='ui-state-default'][text()='14']");
	public static By returnlocator = By.xpath("//label[text()='Return']");
	public static By returndate = By.xpath("//a[@class='ui-state-default'][text()='16']");
	public static By passengersclass = By.xpath("//label[text()='Passengers & Class']");
	public static By numadults = By.xpath("//ul[@class='pax-counter pax-counter-adults']/li[text()='2']");
	public static By childnum = By.xpath("//ul[@class='pax-counter pax-counter-children']/li[text()='1']");
	public static By infantsnum = By.xpath("//ul[@class='pax-counter pax-counter-infants']/li[text()='1']");
	public static By travelclass = By.xpath("//ul[@class='pax-class-type']/li[text()='Premium Economy']");
	public static By applybtn = By
			.xpath("//a[@class='close_pax pull-right primaryBtn fill font12 applyBtn'][text()='Apply']");
	public static By searchbtn = By.xpath("//button[text()='Search']");
	public static By appliedfilter = By.xpath("//p[@class='filtersHeading appendBottom15'][text()='Applied Filters']");
	public static By customdialogbox = By.xpath("//button[text()='OKAY, GOT IT!']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicktripType() {

		try {
			driver.findElement(tripType).click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			// Attempt JavaScript click as fallback
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", tripType);
		}
	}

	public void selecttripTypeSecOpt() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tripTypeSecOpt));
			element.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			// Attempt JavaScript click as fallback
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", tripTypeSecOpt);
		}
	}

	public void selecttripTypeFirOpt() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(tripTypeFirOpt));
			element.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			// Attempt JavaScript click as fallback
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", tripTypeSecOpt);
		}
	}

	public void selectfromlocation() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(fromlocation));
			element.click();
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(selectfrom));
			element1.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromlocation);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectfrom);
		}
	}

	public void selectDepartDate() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(depart));
			element.click();
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(selectdepartdate));
			element1.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", depart);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectdepartdate);
		}
	}

	public void selectReturnDate() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(returnlocator));
			element.click();
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(returndate));
			element1.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", returnlocator);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", returndate);
		}
	}

	public void selectPassengersClass() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(passengersclass));
			element.click();
			WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(numadults));
			element1.click();
			WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(childnum));
			element.click();
			WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(infantsnum));
			element1.click();
			WebElement element4 = wait.until(ExpectedConditions.elementToBeClickable(travelclass));
			element.click();
			WebElement element5 = wait.until(ExpectedConditions.elementToBeClickable(applybtn));
			element1.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", passengersclass);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", numadults);

		}
	}

	public void clickSearch() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
			element.click();
		} catch (Exception e) {
			System.out.println("Failed to click the element: " + e.getMessage());
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchbtn);
		}
	}

	public boolean verifyTextOnPage() {
		String result = getText(appliedfilter);
		return result.contains("Applied Filters");
	}

	public String getTextOnPage() {
		String result = getText(appliedfilter);
		return result;
	}

	public String getText(By element) {
		return driver.findElement(element).getText().trim();
	}

	public void killAlert() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}

	public void clickCustomModelPopUp() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(customdialogbox));
		element.click();
	}

}
