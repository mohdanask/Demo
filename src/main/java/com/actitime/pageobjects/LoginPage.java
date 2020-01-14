package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement ustxtbx;
	@FindBy(name="pwd")
	private WebElement pwdtxtbx;
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	@FindBy(xpath="//table[@id='ErrorsTable']//span")
	private WebElement errorLnTxt;
	
	   
	public LoginPage(WebDriver driver) 
	    {
		PageFactory.initElements(driver, this);
	    }

       
	    public WebElement getUstxtbx()
        {
		return ustxtbx;
	    }

        public WebElement getPwdtxtbx() 
        {
		return pwdtxtbx;
	    }

        public WebElement getLoginbtn()
        {
		return loginbtn;
	    }

        public WebElement getErrorLnTxt()
        {
			return errorLnTxt;
		}


		
}
