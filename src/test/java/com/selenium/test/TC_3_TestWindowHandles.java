package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Selenium.Test.BrowserLaunch;
import Com.Selenium.Test.WindowsHandlesPractice;
import utility.ConfigUtility;
import utility.ScreenshotUtility;

public class TC_3_TestWindowHandles {

	WebDriver driver;
	BrowserLaunch b = new BrowserLaunch();
	WindowsHandlesPractice wp;
	ScreenshotUtility ss;
	
	
	@BeforeMethod
	public void p1() {
		System.out.println("inside p1 method");
		 b.setup();
		 driver=b.getDriver();
		 System.out.println("driver: "+driver);
		 wp = new WindowsHandlesPractice(driver);    			// initializing HomePage
		 ss = new ScreenshotUtility(driver);  			// initializing ScreenshotUtility
		 driver.get(ConfigUtility.HRYWindowHandleAppurl);
		}
	
	@Test
	public void VerifyWindowHandles() throws InterruptedException {
		wp.switchNewWindowPerform();
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		b.tearDown();  									// Quit the WebDriver after the test
	}

	
	
}
