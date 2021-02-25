package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	@Test
	
	public void login()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("url");
		 driver.findElement(By.xpath("xpath")).sendKeys("un");
		 driver.findElement(By.xpath("xpath")).sendKeys("pass");
		 driver.findElement(By.id("button")).click();
	

}
}
