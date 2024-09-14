package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Selenium.Test.BrowserLaunch;
import Com.Selenium.Test.FlipkartHomePage;
import Com.Selenium.Test.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigUtility;
import utility.ScreenshotUtility;



public class TC_1_TestMakemyTripSearch{
	WebDriver driver;
	HomePage hp;
	ScreenshotUtility ss;
	BrowserLaunch b = new BrowserLaunch();
	
	
	@BeforeMethod
	public void p2() {
		System.out.println("inside p2 method");
		 b.setup();
		 driver=b.getDriver();
		 System.out.println("driver: "+driver);
		 hp = new HomePage(driver);    			// initializing HomePage
		 ss = new ScreenshotUtility(driver);  			// initializing ScreenshotUtility
		 driver.get(ConfigUtility.MakemyTripAppurl);
		}
	
	@Test(groups="makemytrip")
	public void verifyUserabletoSearch() throws InterruptedException {	
		 System.out.println("Inside verifyUserabletoSearch test");
		 System.out.println("driver: "+driver);
		 
	hp.clicktripType();
	
	hp.selecttripTypeSecOpt();
	
	hp.clicktripType();
	
	hp.selecttripTypeFirOpt();
	
	hp.selectfromlocation();
	
	hp.selectDepartDate();
	
	hp.selectReturnDate();
	
	hp.selectPassengersClass();
	
	hp.clickSearch();
	
	Thread.sleep(2000);
	
	hp.clickCustomModelPopUp();
	
	Thread.sleep(2000);
	
	Assert.assertTrue(hp.verifyTextOnPage(), "The text "+hp.getTextOnPage()+" is not displayed on the page.");
	
	ss.takeScreenshot("AfterSearchbtnappliedfilters");
	
	}
	
	@AfterMethod
	public void tearDown() {
		b.tearDown();  									// Quit the WebDriver after the test
	}

	
    }
