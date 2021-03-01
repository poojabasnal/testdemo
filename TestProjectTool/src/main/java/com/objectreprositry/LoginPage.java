package com.objectreprositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	public LoginPage(WebDriver driver) {     

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Logbtn;
	
	@FindBy(id="username")
	private WebElement untxtbx;
	
	@FindBy(id="password")
	private WebElement pswbx;
	
	@FindBy(xpath="//input[@value='Sign in']")
	private WebElement signinbtn;
	

	public WebElement getLogbtn() {
		return Logbtn;
	}

	public WebElement getUntxtbx() {
		return untxtbx;
	}

	public WebElement getPswbx() {
		return pswbx;
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}
	
	
	
	
	
 
	

}
