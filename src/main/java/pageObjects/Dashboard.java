package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;


public class Dashboard extends PageBase {
	
	
	public Dashboard(WebDriver driver) { 
		super(driver);
		this.setUrl("dashboard");
	} 
	
@FindBy(xpath= "//input[@placeholder='Search for a project']")
@CacheLookup
public WebElement nav_menuBar;

@FindBy(xpath= "//div[contains(text(),'Projects')]")
@CacheLookup
public WebElement link_projects;

@FindBy(xpath= "//div[contains(text(),'Collection')]")
@CacheLookup
public WebElement link_collections;

@FindBy(xpath=("//button[@class='logout']"))
@CacheLookup
public WebElement btn_logout;

@FindBy(xpath= "//div[contains(text(),'Favourites')]")
@CacheLookup
public WebElement link_favourites;

@FindBy(xpath= "//div[contains(text(),'Trash')]")
@CacheLookup
public WebElement link_trash;

@FindBy(xpath= "//span[@class='menu-btn-text delete-btn-text']")
@CacheLookup
public WebElement link_EmptyTrash;

@FindBy(xpath= "//div[contains(text(),'My Account')]")
@CacheLookup
public WebElement link_myAccount;

@FindBy(xpath= "//div[contains(text(),'Settings')]")
@CacheLookup
public WebElement link_settings;

@FindBy(xpath= "//div[contains(text(),'Help')]")
@CacheLookup
public WebElement link_help;

@FindBy(xpath= "//span[@class='menu-btn-text']")
@CacheLookup
public WebElement btn_newProject;

@FindBy(xpath= "//span[contains(text(),'Start Project')]")
@CacheLookup
public WebElement btn_startProject;

@FindBy(xpath= "//span[contains(text(),'Add a photo')]")
@CacheLookup
public WebElement btn_addPhoto;

@FindBy(xpath= "//span[contains(text(),'Add description')]")
@CacheLookup
public WebElement btn_addDescription;

@FindBy(xpath= "//input[@id='input-name']")
@CacheLookup
public WebElement nav_startTypingProjectName;

@FindBy(xpath= "//button[@id='button-k6usgnju']")
@CacheLookup
public WebElement dropDownbtn_sortBylastModified;

}
