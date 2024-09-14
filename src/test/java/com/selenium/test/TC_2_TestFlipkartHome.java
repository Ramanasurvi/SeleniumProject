package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Selenium.Test.BrowserLaunch;
import Com.Selenium.Test.FlipkartHomePage;
import Com.Selenium.Test.HomePage;
import utility.ConfigUtility;
import utility.ScreenshotUtility;


public class TC_2_TestFlipkartHome{
	WebDriver driver;
	BrowserLaunch b = new BrowserLaunch();
	FlipkartHomePage fh;
	ScreenshotUtility ss;
	
	
	@BeforeMethod
	public void p1() {
		System.out.println("inside p1 method");
		 b.setup();
		 driver=b.getDriver();
		 System.out.println("driver: "+driver);
		 fh = new FlipkartHomePage(driver);    			// initializing HomePage
		 ss = new ScreenshotUtility(driver);  			// initializing ScreenshotUtility
		 driver.get(ConfigUtility.FlipkartAppurl);
		}


	@Test(groups="flipkart")
	public void verifyFlipkartHomePage() throws InterruptedException {
		System.out.println("Inside verifyFlipkartHomePage method");
		System.out.println("driver: "+driver);
		
		fh.HoverOverElectronics();
		fh.HoverOverAudio();
		fh.clickonAllAudio();
		Thread.sleep(2000);
		
		ss.takeScreenshot("AudioallPage");
		
	}
	
	@AfterMethod
	public void tearDown() {
		b.tearDown();  									// Quit the WebDriver after the test
	}

}
