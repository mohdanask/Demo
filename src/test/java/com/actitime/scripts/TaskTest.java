package com.actitime.scripts;


import org.testng.annotations.Test;
import com.actitime.features.LoginFeature;
import com.actitime.features.TaskFeature;
import com.actitime.generic.BaseLib;
import com.actitime.generic.ExcelUtilities;

public class TaskTest extends BaseLib {
  @Test
  public void createCustomer() {
	  ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
	  String username = eu.readData("Sheet1", 1, 1);
	  String password = eu.readData("Sheet1", 1, 2);
	  
	  LoginFeature lf = new LoginFeature(driver);
	  lf.login(username, password);
	  
	    String customerName = eu.readData("sheet1", 3, 3);
	  
	  TaskFeature tf = new TaskFeature(driver);
	  tf.creatCustomer(customerName);
	  tf.verifyCreateCustomer(customerName);
	  tf.logout();
  }


}
