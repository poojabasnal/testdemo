package com.generic.lib;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebUtils {
	
	/** @author pooja**/
	
	public void select(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}
	
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	
	public void waitforElementToBeClickable(WebDriver driver , WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void swicthToWindow(WebDriver driver , String partailWindowTitle) {
		  /*get all window session ID*/
		   Set<String> set = driver.getWindowHandles();
		   Iterator<String> it = set.iterator();
		    
		   while(it.hasNext()) {
			   String winID = it.next();
			   driver.switchTo().window(winID);
			   String actTitle = driver.getTitle();
			  // if(actTitle.contains(partailWindowTitle)) {
				  // System.out.println("swicthed to actual winow");
				 //  break;
			 //  }
		   }
	}
	
	public void moveToExpectedElemnet(WebDriver driver , WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void swictToFrame(WebDriver driver , int index) {
		driver.switchTo().frame(index);
	}

}
