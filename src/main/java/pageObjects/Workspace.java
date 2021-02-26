package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;


public class Workspace extends PageBase {
	
	
	public Workspace(WebDriver driver) { 
		super(driver);
		this.setUrl("writer");
	} 
	
	
	// Left Toggle bar options
	
	@FindBy(id="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement panelLeft;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement tabForPreview;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement tabForDocument;
	
	
	
	// Right Toggle bar options
	
	@FindBy(id="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]")
	public WebElement panelRight;

	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]")
	public WebElement tabForIdeaBoard;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]/div[2]/button[1]")
	public WebElement tabForOutline;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]")
	public WebElement tabForPublish;
	
	
	
	// Univeral bar options from Workspace
	
	@FindBy(xpath= "//header/nav[1]")
    public WebElement universalMenu_container_Workspace;
	  
  	@FindBy(xpath= "//header/nav[1]/div[1]/div[1]")
    public WebElement icon_WriteWayLogo_Workspace_UniversalMenu;
  	
 	@FindBy(xpath= "//header/nav[1]/div[1]/div[2]/*[1]")
    public WebElement icon_BackArrow_Workspace_UniversalMenu;
    
	@FindBy(xpath= "//header/nav[1]/div[2]/div[1]/button[1]/div[1]")
    public WebElement btn_DarkMode_Workspace_UniversalMenu;
    
    @FindBy(xpath= "//header/nav[1]/div[2]/div[1]/button[1]/div[1]")
    public WebElement btn_LightMode_Workspace_UniversalMenu;
    
    @FindBy(xpath="//header/nav[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    public WebElement icon_ViewDetails_Workspace_UniversalMenu;
    
    @FindBy(xpath="//header/nav[1]/div[2]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]")
    public WebElement icon_Resize_Workspace_UniversalMenu;
    
    @FindBy(xpath="//header/nav[1]/div[2]/div[1]/div[3]/div[1]")
    public WebElement icon_Synced_Workspace_UniversalMenu;
	
    @FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[4]/button[1]")
    public WebElement dropDown_MyAccount_Workspace_UniversalMenu;
    
    @FindBy(xpath="/html[1]/body[1]/reach-portal[2]/div[1]/div[1]/div[1]")
    public WebElement dropDown_MyAccount_AccountSettings_Workspace_UniversalMenu;
    
    @FindBy(xpath="/html[1]/body[1]/reach-portal[2]/div[1]/div[1]/div[3]")
    public WebElement dropDown_MyAccount_Help_Workspace_UniversalMenu;
    
    @FindBy(xpath="/html[1]/body[1]/reach-portal[2]/div[1]/div[1]/div[5]")
    public WebElement dropDown_MyAccount_Logout_Workspace_UniversalMenu;
	
	
	
	
	
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

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/button[2]")
public WebElement btn_newProject;


@FindBy(xpath= "//button[@id='button-k6usgnju']")
public WebElement dropDownbtn_sortBylastModified;

@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div")
public WebElement divListOfAllProject;

}
