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
public WebElement nav_menuBar;

@FindBy(xpath= "//div[contains(text(),'Projects')]")
public WebElement link_projects;

@FindBy(xpath= "//div[contains(text(),'Collection')]")
public WebElement link_collections;

@FindBy(xpath=("//button[@class='logout']"))
public WebElement btn_logout;

@FindBy(xpath= "//div[contains(text(),'Favourites')]")
public WebElement link_favourites;

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/div[1]/li[3]/a[1]")
public WebElement link_trash;


@FindBy(xpath= "//div[contains(text(),'My Account')]")
public WebElement link_myAccount;

@FindBy(xpath= "//div[contains(text(),'Settings')]")
public WebElement link_settings;

@FindBy(xpath= "//div[contains(text(),'Help')]")
public WebElement link_help;

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/button[2]")
public WebElement btn_newProject;


@FindBy(xpath= "//button[@id='button-k6usgnju']")
public WebElement dropDownbtn_sortBylastModified;

}
