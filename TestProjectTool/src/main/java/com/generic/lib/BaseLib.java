package com.generic.lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLib {
	
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public void browserlaunch()
	{
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://testproject.io/");
}
	
@AfterMethod
	public void postCondition()
	{
	driver.close();
	
	}
}
