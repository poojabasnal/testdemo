package com.test.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.generic.lib.BaseLib;
import com.generic.lib.WebUtils;
import com.objectreprositry.CreateNewProject;
import com.objectreprositry.CreateTest;
import com.objectreprositry.LoginPage;

public class Testscripts extends BaseLib {
	
WebUtils wb=new WebUtils();
	
	@Test
	
	public void loginApp(){
		
		LoginPage lp= new LoginPage(driver);
		lp.getLogbtn().click();
		

		wb.swicthToWindow(driver, "auth.testproject");
		
		
		lp.getUntxtbx().sendKeys("username");
		lp.getPswbx().sendKeys("password");
		lp.getSigninbtn().click();
		
	
	}
	
	@Test
	
	public void createNewJob()
	
	{
		
		CreateNewProject projct= new CreateNewProject(driver);
		
		
		projct.getMyprojects().click();
		projct.getNewprjct().click();
		projct.getNametxtbx().sendKeys("OrangeHrm");
		
		projct.getCreatebtn().click();
		projct.getAddjob().click();
		projct.getCreatejob().click();
		projct.getNextbtn().click();
		projct.getNameofjob().sendKeys("xyz");
		projct.getNxtbtn().click();
		projct.getSearchbx().sendKeys("chrome");
		projct.getCheckbx().click();
		projct.getCreatbtn().click();
			
	}
	
	@Test
	
	
	public void createTest()
	{
		
		CreateTest crttest= new CreateTest(driver);
		
		crttest.getCreatetest().click();
		crttest.getWebtest().click();
		crttest.getNextbtn().click();
		crttest.getTesttxt().sendKeys("logintest");
		crttest.getNextbttn().click();
		crttest.getDropddwn().click();
		crttest.getAddnewtestapp().click();
		crttest.getNameapp().sendKeys("OrangeHRM");
		crttest.getUrl().sendKeys("http:www.orange hrm");
		crttest.getFinshbtn().click();
		crttest.getNxtbtn().click();
		crttest.getRecordbtn().click();
		crttest.getRecorbtn().click();
		
	}
}
