package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class Trash extends PageBase{

	public Trash(WebDriver aDriver) {
		super(aDriver);
		
	}
	
	// Added new Web elements 
	
	
	@FindBy(xpath= "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	public WebElement link_Trash_Sidebar;
	
	@FindBy(xpath ="//header/div[1]/div[1]/span[1]")
    public WebElement text_Trash_TrashTopbar;
	
	@FindBy(xpath ="//span[contains(text(),'Empty Trash')]")
    public WebElement btn_emptyTrash_TrashTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'Sort')]")
    public WebElement dropDownBtn_Sort_TrashTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'Last Modified')]")
    public WebElement dropDownBtn_SortBylastModified_TrashTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'Title A → Z')]")
    public WebElement dropDownBtn_SortBytitleAZ_TrashTopbar;
    
    @FindBy(xpath= " //span[contains(text(),'Title Z → A')]")
    public WebElement dropDownBtn_SortBytitleZA_TrashTopbar;
    
    @FindBy(xpath= "//span[contains(text(),'View')]")
    public WebElement btn_View_TrashTopbar;
    
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]")
	public WebElement container_Trash;
					
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement thumbnail_first_Trash_from_Grid;
					
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement thumbnail_first_Trash_Project_from_List;
	
	@FindBy(xpath= "//body/reach-portal[3]/div[1]/div[1]/div[1]/ul[1]")
    public WebElement actionMenu_Trash;
    
    @FindBy(xpath= "//p[contains(text(),'Restore')]")
    public WebElement actionMenu_restoreTrash;
    
    @FindBy(xpath= "//p[contains(text(),'Delete forever')]")
    public WebElement actionMenu_deleteForever_Trash;
	
    @FindBy(xpath= "//body/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement txt_deleteForever_confirm;
    
    @FindBy(xpath= "//div[contains(text(),'Delete')]")
    public WebElement btn_deleteForever_confirmDeleteClick;
    
    @FindBy(xpath= "//div[contains(text(),'Cancel')]")
    public WebElement btn_deleteForever_confirmCancelClick;
    
    @FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
    public WebElement txt_project_title_Trash_Grid;
    
    @FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public WebElement txt_Project_Title_frm_List;
    
    @FindBy(xpath= "//body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    public WebElement txt_EmptyTrash_confirm;
    
    @FindBy(xpath= "//div[contains(text(),'Empty Trash')]")
    public WebElement btn_EmptyTrash_confirmClick; 

    @FindBy(xpath= "//div[contains(text(),'Cancel')]")
    public WebElement btn_EmptyTrash_CancelClick;
    
    @FindBy(xpath= "//body/ul[1]/li[1]/div[1]/section[1]")
    public WebElement toastNotification_FromTrash; 
    
    
    
    
   /* 
	
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]")
	@CacheLookup
    public WebElement btn_restoreTrash_grid;
		
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]")
	@CacheLookup   
    public WebElement btn_restoreTrash_list;
	
    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]/div[1]")
    @CacheLookup
    public WebElement btn_deleteForever_Trash_grid;
    //html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[2]/button[1]
    @FindBy(xpath= "//button[@class='control__content-btn delete-action delete-forever-list']")
    @CacheLookup    
    public WebElement btn_deleteForever_Trash_list;
    				
    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup     
    public WebElement txt_deleteTrash_confirm_grid;
    
    @FindBy(xpath= "//input[@name='confirmDelete']")
    @CacheLookup
    public WebElement txt_deleteTrash_confirm_list;
    
    @FindBy(xpath="//section[@class='content-canvas__container grid-view']")
    @CacheLookup
    public WebElement containerTrash_grid_view;
    
    @FindBy(xpath="//div[@class='content-card__card']")
    @CacheLookup
    public WebElement containerTrash_list_view;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/div[1]/button[1]/*")
    @CacheLookup
    public WebElement iconTrash_grid;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/div[1]/button[2]/*")
    @CacheLookup
    public WebElement iconTrash_list;
    
    
    @FindBy(xpath= "/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]/div[3]/button[1]")
    @CacheLookup 
    public WebElement undoProjectFromTrash_GridView; 
  //css=.card-project__action-text //div[3]/button/div
   
    @FindBy(xpath= "/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]/div[3]/button[1]")
    @CacheLookup 
    public WebElement undoProjectFromTrash_ListView; 

*/

}

