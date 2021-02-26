package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;


public class Dashboard extends PageBase {
	
	
	public Dashboard(WebDriver driver) { 
		super(driver);
		this.setUrl("writer");
	} 
	
@FindBy(xpath= "//input[@placeholder='Search for a project']")
public WebElement nav_menuBar;

//--update on jan 2021
@FindBy(xpath= "//span[contains(text(),'My Projects')]") 
public WebElement link_projects;

//@FindBy(xpath= "//div[contains(text(),'Collection')]")
//public WebElement link_collections;

//--update on jan 2021
@FindBy(xpath=("//div[@id='option-2--menu--1']"))
public WebElement btn_logout;


@FindBy(xpath= "//div[contains(text(),'Favourites')]")
public WebElement link_favourites;

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/div[1]/li[3]/a[1]")
public WebElement link_trash;

//--update on jan 2021
@FindBy(xpath= "//span[@id='title']")
public WebElement link_myAccount;

@FindBy(xpath= "//div[contains(text(),'Settings')]")
public WebElement link_settings;

@FindBy(xpath= "//div[contains(text(),'Help')]")
public WebElement link_help;

//updated on Jan 2021
@FindBy(xpath= "//div[@class='button-general btn-transparent']")

public WebElement btn_newProject;


@FindBy(xpath= "//button[@id='button-k6usgnju']")
public WebElement dropDownbtn_sortBylastModified;

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div")
public WebElement divListOfAllProject;

}
