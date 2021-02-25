package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	@Test
	
	public void openFlipkart()
	{
		

		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement link = driver.findElement(By.xpath("//div/h2[text()='Deals of the Day']"));
		
		WebElement firstlink = driver.findElement(By.xpath("//a[@class='_2KpZ6l _3dESVI']"));
		System.out.println(firstlink.getText());
	}
	
	

}

