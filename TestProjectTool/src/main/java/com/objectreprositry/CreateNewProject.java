package com.objectreprositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProject {

	
	@FindBy(xpath="//div[text()='My Projects']")
	private WebElement Myprojects;
	
	@FindBy(xpath="//*[@id=\"mCSB_4_container\"]/main/div[2]/project-top-sub-header/div/div[1]/tp-projects-dropdown/div/div[3]/div/div[2]")
	private WebElement Newprjct;
	
	@FindBy(xpath="//*[@id=\"new-project-container\"]/div[1]/span")
	private WebElement Nametxtbx;
	
	@FindBy(xpath="//div[text()='Create']")
	private WebElement createbtn;
	
	
	@FindBy(xpath="//*[@id=\"mCSB_4_container\"]/main/div[3]/div[2]/div/project-jobs/div/div[3]/div/div[2]/div[3]/div")
	private WebElement Addjob;
	
	@FindBy(xpath="//div/span[text()='Web']")
	private WebElement createjob;
	
	@FindBy (xpath="//div[text()='Next']")
	private WebElement Nextbtn;
	
	@FindBy(xpath="/html/body/div[1]/tp-movable/ng-transclude/div/div[2]/tp-mbw-dynamic-template/div/div/div[4]/div/input")
	private WebElement nameofjob;
	
	@FindBy(xpath="//div[text()='Next']")
	private WebElement nxtbtn;
	
	@FindBy(xpath="/html/body/div[1]/tp-movable/ng-transclude/div/div[2]/tp-mbw-dynamic-template/div/div/div[3]/div[1]/div/div/div/input")
	private WebElement searchbx;
	
	@FindBy(xpath="//div[@class='cj-checkbox__view']")
private WebElement checkbx;
	
	@FindBy(xpath="//div[text()='Create']")
	private WebElement creatbtn;
	
	
	
	public CreateNewProject(WebDriver driver) {     

		PageFactory.initElements(driver, this);
	}



	public WebElement getMyprojects() {
		return Myprojects;
	}



	public WebElement getNewprjct() {
		return Newprjct;
	}



	public WebElement getNametxtbx() {
		return Nametxtbx;
	}



	public WebElement getCreatebtn() {
		return createbtn;
	}



	public WebElement getAddjob() {
		return Addjob;
	}



	public WebElement getCreatejob() {
		return createjob;
	}



	public WebElement getNextbtn() {
		return Nextbtn;
	}



	public WebElement getNameofjob() {
		return nameofjob;
	}



	public WebElement getNxtbtn() {
		return nxtbtn;
	}



	public WebElement getSearchbx() {
		return searchbx;
	}



	public WebElement getCheckbx() {
		return checkbx;
	}



	public WebElement getCreatbtn() {
		return creatbtn;
	}
	
	
	
	
	
	
}
