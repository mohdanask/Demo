package com.actitime.scripts;

import org.testng.annotations.Test;
import com.actitime.features.EnterTimeTrackFeature;
import com.actitime.features.LoginFeature;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class LoginTest extends BaseLib{
 
	@Test(priority=1)
    public void validLogin()
	{
	  ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	  String username = eu.readData("Sheet1", 1, 1);
	  String password = eu.readData("Sheet1", 1, 2);
	  
	  LoginFeature lf = new LoginFeature(driver);
	  lf.login(username, password);
	  
	  EnterTimeTrackFeature ettf = new EnterTimeTrackFeature(driver);
	  ettf.verifyHomePage();
	}
	
	
	@Test(priority=2)
	public void invaildLogin() {
		 ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		  String username = eu.readData("Sheet1", 1, 1);
		  String password = eu.readData("Sheet1", 1, 3);
		  
		  LoginFeature lf = new LoginFeature(driver);
		  lf.login(username, password);
		  
		 lf.verifyInvalidLogin();
	}
}
