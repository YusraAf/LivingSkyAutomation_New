package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class Project extends PageBase{

	public Project(WebDriver aDriver) {
		super(aDriver);
		
	}
	
	@FindBy(xpath= "//span[contains(text(),'Add a photo')]")
	@CacheLookup
	public WebElement btn_addPhoto;

	@FindBy(xpath= "//span[contains(text(),'Add description')]")
	@CacheLookup
	public WebElement btn_addDescription;
	
	@FindBy(xpath= "//span[contains(text(),'Start Project')]")
	@CacheLookup
	public WebElement btn_startProject;


	@FindBy(xpath= "//input[@id='input-title']")
	@CacheLookup
	public WebElement nav_startTypingProjectName;


}
