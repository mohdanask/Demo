package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ActiveProjCustPage extends BasePage {
	
	@FindBy(css="input[value='Create New Project']")
	private WebElement createNewCusBtn;
	
	@FindBy(xpath="//table[@id='SuccessMessages']//span")
	private WebElement successMsgEle;
	
	
     public ActiveProjCustPage(WebDriver driver)
     {
		super(driver);
		PageFactory.initElements(driver, this);
	 }

	public WebElement getCreateNewCusBtn() {
		return createNewCusBtn;
	}
	
	public WebElement getSuccessMsgEle() {
		return successMsgEle;
	}

}
