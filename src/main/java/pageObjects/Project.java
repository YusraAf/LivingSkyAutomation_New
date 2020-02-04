package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class Project extends PageBase{

	public Project(WebDriver aDriver) {
		super(aDriver);
		
	}
	
	//@FindBy(xpath= "//div[@class='new-project-btn add-field']")
	@FindBy(xpath="//input[@type='file']")
	
	public WebElement btn_addPhoto;

	@FindBy(xpath= "//span[contains(text(),'Add description')]")
	
	public WebElement btn_addDescription;
	
	@FindBy(xpath= "//span[contains(text(),'Start Project')]")
	
	public WebElement btn_startProject;


	@FindBy(xpath= "/html[1]/body[1]/reach-portal[2]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/section[1]/input[1]")
	
	public WebElement nav_startTypingProjectName;
	
	@FindBy(xpath= "//textarea[@placeholder='Add a description']")
	
	public WebElement nav_addprojectdescription;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]")
	
	public WebElement container_project;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]")
	
	public WebElement thumbnail_first_Project_from_Grid;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")
	
	public WebElement thumbnail_first_Project_from_List;
	
	@FindBy(xpath="html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/a[1]")
	
	public WebElement btn_first_Project_open_grid;
	
	@FindBy(xpath="//div[@class='App dashboard-page-wrapper']//div[1]//div[2]//div[1]//a[1]")
	
	public WebElement btn_first_Project_open_list;
	
	@FindBy(className="card-project__title")

	public WebElement txt_first_Project_Title_frm_grid;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")

	public WebElement txt_first_Project_Title_frm_list;
					
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[2]/button[1]")
	
    public WebElement btn_deleteProject_grid;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]")
	
    public WebElement btn_deleteProject_list;
	
    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[3]/div[2]/button[2]/div[1]")
    public WebElement btn_delete_confirm_grid;
    
    @FindBy(xpath= "/html[1]/body[1]/reach-portal[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement btn_delete_confirm_list;
    
    @FindBy(xpath="//section[@class='content-canvas__container grid-view']")
    public WebElement container_grid_view;
    
    @FindBy(xpath="//section[@class='content-canvas__container list-view']")
    public WebElement container_list_view;
    
    @FindBy(xpath="//*[@class='icon-grid']")
    public WebElement icon_grid;
    
    @FindBy(xpath="//*[@class='icon-list']")
    public WebElement icon_list;
    				
    @FindBy(xpath ="//div[@id='Left-tab-0']")
    public WebElement tab_document_inside_project;
    
    @FindBy(xpath ="//div[@id='Right-tab-0']")
     public WebElement tab_ideas_inside_project;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/button[2]/div[1]")
    public WebElement btn_newProject_inside_project;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[4]/div[1]/button[1]")
    public WebElement icon_share_thumbnail_project;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[4]/div[1]/button[2]")
    public WebElement icon_copy_thumbnail_project;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[4]/div[1]/button[3]")
    public WebElement icon_star_thumbnail_project;
    
    @FindBy(xpath= "/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]/div[3]/button[1]/div[1]")
    public WebElement undoFrmProject_GridView;
    
    @FindBy(xpath= "/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]/div[3]/button[1]")
    public WebElement undoFrmProject_ListView;

}
