package com.objectreprositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateTest {
	
	
	@FindBy(xpath="//div[text()='Create a test']")
	private WebElement createtest;
	
	@FindBy(xpath="//div[text()='Web']")
	private WebElement Webtest;
	
	@FindBy(xpath="//div[text()='Next']")
	private WebElement nextbtn;
	
	@FindBy(xpath="//input[@title='Test Name']")
	private WebElement testtxt;
	
	@FindBy(xpath="//div[text()='Next']")
	private WebElement nextbttn;
	
	@FindBy(xpath="//div[text()='Web applications']")
	private WebElement dropddwn;
	
	@FindBy(xpath="//div[text()='Add a new application for testing']")
	private WebElement addnewtestapp;
	@FindBy(xpath="/html/body/div[1]/tp-movable/ng-transclude/div/div[2]/tp-mbw-dynamic-template/div/div[3]/div/div[1]/div/div[2]/input")
	private WebElement nameapp;
	@FindBy(xpath="/html/body/div[1]/tp-movable/ng-transclude/div/div[2]/tp-mbw-dynamic-template/div/div[3]/div/div[2]/div/div[2]/input")
	private WebElement url;
	@FindBy(xpath="//div[text()='Finish']")
	private WebElement finshbtn;
	
	@FindBy(xpath="//div[text()='Next']")
	private WebElement nxtbtn;
	
	@FindBy(xpath="/html/body/div[1]/tp-movable/ng-transclude/div/div[2]/tp-mbw-dynamic-template/div/div/div[3]/div/div/div[1]/div[1]")
	private WebElement recordbtn;
	
	@FindBy(xpath="//div[text()='Start recording']")
	private WebElement recorbtn;
	

		

		public CreateTest(WebDriver driver) {     

			PageFactory.initElements(driver, this);
		}




		public WebElement getCreatetest() {
			return createtest;
		}




		public WebElement getWebtest() {
			return Webtest;
		}




		public WebElement getNextbtn() {
			return nextbtn;
		}




		public WebElement getTesttxt() {
			return testtxt;
		}




		public WebElement getNextbttn() {
			return nextbttn;
		}




		public WebElement getDropddwn() {
			return dropddwn;
		}




		public WebElement getAddnewtestapp() {
			return addnewtestapp;
		}




		public WebElement getNameapp() {
			return nameapp;
		}




		public WebElement getUrl() {
			return url;
		}




		public WebElement getFinshbtn() {
			return finshbtn;
		}




		public WebElement getNxtbtn() {
			return nxtbtn;
		}




		public WebElement getRecordbtn() {
			return recordbtn;
		}




		public WebElement getRecorbtn() {
			return recorbtn;
		}
	
	
	
		
	
	
	

}
