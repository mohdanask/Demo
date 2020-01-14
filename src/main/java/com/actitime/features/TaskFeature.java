package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.ActiveProjCustPage;
import com.actitime.pageobjects.CreateNewCustPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.OpenTaskPage;

public class TaskFeature {

	WebDriver driver;
	EnterTimeTrackPage ettp;
	OpenTaskPage otp;
	ActiveProjCustPage apcp;
	CreateNewCustPage cncp;
	
	public TaskFeature(WebDriver driver) {  
		this.driver=driver;
		ettp= new EnterTimeTrackPage(driver);
		otp= new OpenTaskPage(driver);
		apcp= new ActiveProjCustPage(driver);
		cncp= new CreateNewCustPage(driver);
	}
	public void creatCustomer(String customerName) {
		ettp.getTaskEle().click();
		otp.getProjcustLink().click();
		apcp.getCreateNewCusBtn().click();
		cncp.getCreatecustsubmitBtn().click();
	}
	
	public void verifyCreateCustomer(String customerName) {
		String expectedMsg="Customer \""+customerName+"\" has been successfully created.";
		String actualMsg = apcp.getSuccessMsgEle().getText();
		Assert.assertEquals(actualMsg, expectedMsg);
		Reporter.log(expectedMsg, true);
	}
	public void logout() {
		apcp.getLogoutLink();
	}
}

