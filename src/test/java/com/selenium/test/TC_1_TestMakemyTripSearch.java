package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Selenium.Test.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigUtility;
import utility.ScreenshotUtility;



public class TC_1_TestMakemyTripSearch {
	WebDriver driver;
	
	 @BeforeMethod
	    public void setup() {
	        WebDriverManager.chromedriver().setup();  // Setup ChromeDriver
	        driver = new ChromeDriver(); 				// Initialize WebDriver
	        driver.manage().window().maximize(); 
	    	driver.get(ConfigUtility.APP_URL);

	    }
	
	@Test
	public void verifyUserabletoSearch() throws InterruptedException {	
	HomePage hp = new HomePage(driver);    // initializing HomePage
	
	ScreenshotUtility ss = new ScreenshotUtility(driver); //initializing ScreenshotUtility
	
	hp.clicktripType();
	
	hp.selecttripTypeSecOpt();
	
	hp.clicktripType();
	
	hp.selecttripTypeFirOpt();
	
	hp.selectfromlocation();
	
	hp.selectDepartDate();
	
	hp.selectReturnDate();
	
	hp.selectPassengersClass();
	
	hp.clickSearch();
	
	Thread.sleep(5000);
	
	hp.clickCustomModelPopUp();
	
	Thread.sleep(3000);
	
	Assert.assertTrue(hp.verifyTextOnPage(), "The text "+hp.getTextOnPage()+" is not displayed on the page.");
	
	ss.takeScreenshot("AfterSearchbtnappliedfilters");
	
	}
	
	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
    }
