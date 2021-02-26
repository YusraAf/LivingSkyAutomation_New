package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class ProjectDashboard extends PageBase{

	public ProjectDashboard(WebDriver aDriver) {
		super(aDriver);
		
	}

	
	
	// Universal Menu options from Project dashboard
    
  	@FindBy(xpath= "//header/nav[1]/div[1]/div[1]")
    public WebElement icon_WriteWayLogo_ProjectDashboard_UniversalMenu;
    
	//@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[2]/div[1]/button[1]/div[1]")
	@FindBy(xpath= "//header/nav[1]/div[2]/div[1]/button[1]/div[1]")
    public WebElement btn_DarkMode_ProjectDashboard_UniversalMenu;
    
    //@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[2]/div[1]/button[1]/div[1]")
    @FindBy(xpath= "//header/nav[1]/div[2]/div[1]/button[1]/div[1]")
    public WebElement btn_LightMode_ProjectDashboard_UniversalMenu;
    
    //@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[2]/div[1]/div[1]")
    @FindBy(xpath="//header/nav[1]/div[2]/div[1]/div[1]")
    public WebElement icon_ViewDetails_ProjectDashboard_UniversalMenu;
    
    //@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[2]/div[1]/div[2]/div[1]")
    @FindBy(xpath="//header/nav[1]/div[2]/div[1]/div[2]/div[1]")
    public WebElement icon_Synced_ProjectDashboard_UniversalMenu;
	
    //@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/header[1]/nav[1]/div[4]/button[1]")
    @FindBy(xpath="//span[@id='title']")
    public WebElement dropDown_MyAccount_ProjectDashboard_UniversalMenu;
    
    @FindBy(xpath="/html[1]/body[1]/reach-portal[1]/div[1]/div[1]/div[1]")
    public WebElement dropDown_MyAccount_AccountSettings_ProjectDashboard_UniversalMenu;
    
    @FindBy(xpath="/html[1]/body[1]/reach-portal[1]/div[1]/div[1]/div[3]")
    public WebElement dropDown_MyAccount_Help_ProjectDashboard_UniversalMenu;
    
    @FindBy(xpath="/html[1]/body[1]/reach-portal[1]/div[1]/div[1]/div[5]")
    public WebElement dropDown_MyAccount_Logout_ProjectDashboard_UniversalMenu;
    
    
    

    // Sidebar options
    
    //@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    @FindBy (xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement link_Favorites_Sidebar;
    
    //@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
    @FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]")
    public WebElement link_MyProjects_Sidebar;
    
    @FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]")
    public WebElement btn_Plus_CreateNewFolder_Sidebar;
 
    @FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement link_Trash_Sidebar;
    
    @FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement icon_Collapse_Sidebar;
    
    @FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement icon_Expand_Sidebar;
  
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement thumbnail_first_Project_from_Favorites;
    		
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement text_first_Project_title_from_Favorites;
    
    
    
    // Folder Topbar options
    
    @FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/header[1]/div[2]")
    public WebElement myProjects_ProjectsTopbar;
    
    //@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/header[1]/div[1]/div[1]/span[1]")
    @FindBy(xpath= "//span[contains(text(),'My Projects')]")
    public WebElement text_MyProjects_ProjectsTopbar;
    
    //@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/header[1]/div[2]/button[1]/div[1]")
    @FindBy(xpath= "//span[contains(text(),'Sort')]")
    public WebElement dropDownBtn_Sort_ProjectsTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'Last Modified')]")
    public WebElement dropDownBtn_Sort_lastModified_ProjectsTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'Title A → Z')]")
    public WebElement dropDownBtn_Sort_titleAZ_ProjectsTopbar;
    
    @FindBy(xpath= " //span[contains(text(),'Title Z → A')]")
    public WebElement dropDownBtn_Sort_titleZA_ProjectsTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'View')]")
    public WebElement btn_View_ProjectsTopbar;
    
    //@FindBy(xpath= "//header/div[2]/div[2]/button[1]/div[1]")
    @FindBy(xpath= "//span[contains(text(),'New Project')]")
    public WebElement btn_NewProject_ProjectsTopbar;
    
    
    
    
    // Project View Details Sidebar 
    
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]")
	public WebElement sidebar_ProjectDetails;
    
    //@FindBy(id="editable-info-input-mk-ohQ")
    @FindBy(xpath="//input[@placeholder='Add Title']")
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/div[1]/input[1]")
	public WebElement txt_ProjectTitle_ProjectDetails;
	
    @FindBy(xpath="//input[@id='editable-info-input-mk-ohQ']")
    //@FindBy(xpath="//input[@placeholder='Add Title']")
	//@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/div[1]/input[1]")
	public WebElement txt_verifyProjectTitle_ProjectDetails;
    
	//@FindBy(xpath="//input[@type='file']")
	@FindBy(xpath= "//span[contains(text(),'Upload Image')]")
	public WebElement link_UploadImage_ProjectDetails;

	@FindBy(xpath= "//input[@placeholder='Add Author']")
	public WebElement txt_addAuthor_ProjectDetails;

	@FindBy(tagName= "textarea")
	//@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[4]/label[1]/textarea[1]")
	public WebElement txt_addDescription_ProjectDetails;
	
	@FindBy(xpath= "//div[@class='close-button-container']")
	//@FindBy(xpath= "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[4]/label[1]/textarea[1]")
	public WebElement btn_closeDetailsPane_ProjectDetails;
	
	
	
	// Context menu for Creation of New folder and New project
	
	@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]")
	public WebElement contextMenu_NewFolder_NewProject; 
	
	//@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
	@FindBy(xpath= "//p[contains(text(),'New folder')]")
	public WebElement contextMenu_NewFolderCreation; 
	
	//@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]")
	@FindBy(xpath= "//p[contains(text(),'New project')]")
	public WebElement contextMenu_NewProjectCreation; 
	
	
	
	
	// All Projects Container 
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/h4[1]")
   	public WebElement lbl_Projects_ProjectDashboard;
	               //body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement thumbnail_first_Project_from_Grid;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement thumbnail_first_Project_from_List;
	
	               
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	//@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]")
	public WebElement text_first_Project_Title_from_grid;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement text_first_Project_Title_from_list;
					
	@FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
    public WebElement text_first_Project_Timestamp_from_grid;
	             
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
    public WebElement text_first_Project_Timestamp_from_list;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")
	public WebElement icon_first_Project_favorites_grid;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	public WebElement icon_first_Project_favorites_list;
    
    @FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]")
    public WebElement actionMenu_Project;
    
    //@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
    @FindBy(xpath= "//p[contains(text(),'Rename')]")
    public WebElement actionMenu_Rename_Project;
    
    //@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]")
    @FindBy(xpath= "//p[contains(text(),'Add to Favourites')]")
    public WebElement actionMenu_addToFavourites_Project;
    
    //@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[3]/button[1]")
    @FindBy(xpath= "//p[contains(text(),'View Details')]")
    public WebElement actionMenu_viewDetails_Project;
    
    //@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]")
    @FindBy(xpath= "//p[contains(text(),'Trash')]")
    public WebElement actionMenu_trash_Project;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement container_Projects_grid_view;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement container_Projects_list_view;
    
    
    
    
    // All Folders Container 
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement container_Folder_grid_view;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement container_Folder_list_view;

    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/h4[1]")
   	public WebElement lbl_Folder_ProjectDashboard;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement thumbnail_first_Folder_from_Grid;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement thumbnail_first_Folder_from_List;
	
	@FindBy(xpath="//span[contains(text(),'Untitled Folder')]")
	public WebElement text_first_Folder_Title_from_grid;
	
	@FindBy(xpath="//span[contains(text(),'Untitled Folder')]")
	public WebElement text_first_Folder_Title_from_list;
	
    @FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]")
    public WebElement actionMenu_Folder;
    
    //@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
    @FindBy(xpath= "//p[contains(text(),'Rename')]")
    public WebElement actionMenu_Rename_Folder;
    
    //@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]")
    @FindBy(xpath= "//p[contains(text(),'Trash')]")
    public WebElement actionMenu_Trash_Folder;
        
    
    
    
    // All Folders and Projects container on the Project dashboard
    
    //@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]")
    //@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]")
    @FindBy(xpath="//div[contains(@class,'selectable-main')]")
    public WebElement container_ProjectDashboard_grid_view;
    
    //@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]")
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/div[1]/div[1]")
    public WebElement container_ProjectDashboard_list_view;
    

}
