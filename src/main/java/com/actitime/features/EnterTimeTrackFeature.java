package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.EnterTimeTrackPage;

public class EnterTimeTrackFeature  {
	WebDriver driver;
	EnterTimeTrackPage eTTP;
	
	public EnterTimeTrackFeature(WebDriver driver) {
		this.driver=driver;
		eTTP = new EnterTimeTrackPage(driver);
	}
	public void verifyHomePage() {
		String expectedText="Enter Time-Track";
		String actualText=eTTP.getPageTitleEle().getText();
		Assert.assertEquals(actualText, expectedText);
		
		String expectedTitle="actiTIME - Enter Time-Track";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("home page verified", true);
	}
	

}
