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

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/div[1]/li[3]/a[1]")
@CacheLookup
public WebElement link_trash;



@FindBy(xpath= "//div[contains(text(),'My Account')]")
@CacheLookup
public WebElement link_myAccount;

@FindBy(xpath= "//div[contains(text(),'Settings')]")
@CacheLookup
public WebElement link_settings;

@FindBy(xpath= "//div[contains(text(),'Help')]")
@CacheLookup
public WebElement link_help;

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/button[2]")
@CacheLookup
public WebElement btn_newProject;



@FindBy(xpath= "//button[@id='button-k6usgnju']")
@CacheLookup
public WebElement dropDownbtn_sortBylastModified;

}
