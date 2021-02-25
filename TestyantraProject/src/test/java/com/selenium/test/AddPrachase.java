package com.selenium.test;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddPrachase {
	
	@Test
	
	public void cartParchase()
	{
		
	
			
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	

			driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
			
			String electWebele ="//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/span[1]";
			WebElement electronics = driver.findElement(By.xpath(electWebele));
			
			
			
				Actions act=new Actions(driver);
				act.moveToElement(electronics).perform();
				
				String mI="//a[@title='Mi']";
			
				driver.findElement(By.xpath(mI)).click();
				String mobile="//div[contains(text(),'Redmi 9 Prime (Space Blue, 64 GB)')]";
				driver.findElement(By.xpath(mobile)).click();
				
				Set<String> winId = driver.getWindowHandles();
				Iterator<String> it = winId.iterator();
					String parent = it.next();
					String child = it.next();
					driver.switchTo().window(child);
					
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			String xp = "//a[text()='Redmi 9 Prime (Space Blue, 64 GB)']";
			String actual = driver.findElement(By.xpath(xp)).getText();
			String expected = "Redmi 9 Prime (Space Blue, 64 GB)";
			
			  Assert.assertEquals(actual, expected);
			
			
			
		
			
			
			
			
		}

	}
	


