package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.generic.BaseLib;
import com.actitime.pageobjects.LoginPage;

public class LoginFeature extends BaseLib
{
	WebDriver driver;
	LoginPage lp;
	
	public LoginFeature(WebDriver driver) 
	{
		this.driver=driver;
		lp=new LoginPage(driver);
	}
public void login(String username,String password)
{
	lp.getUstxtbx().sendKeys(username);
	lp.getPwdtxtbx().sendKeys(password);
	lp.getLoginbtn().click();
}
 
public void verifyInvalidLogin() 
{
	 String expectedMsg="Username or Password is invalid. Please try again.";
	 String actualMsg = lp.getErrorLnTxt().getText();
	 Assert.assertEquals(actualMsg, expectedMsg);
	 Reporter.log("invalid login message is verified", true);
}
}
