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
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]")
	@CacheLookup
	public WebElement container_Trash;
					
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	public WebElement thumbnail_first_Trash_from_Grid;
					
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")
	@CacheLookup
	public WebElement thumbnail_first_Trash_from_List;
	
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]")
	@CacheLookup
    public WebElement btn_restoreTrash_grid;
		
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[1]/div[1]")
	@CacheLookup   
    public WebElement btn_restoreTrash_list;
	
    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/button[2]/div[1]")
    @CacheLookup
    public WebElement btn_deleteForever_Trash_grid;
    
    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
    @CacheLookup
    public WebElement btn_deleteForever_Trash_list;
    				
    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    public WebElement btn_deleteTrash_confirm_grid;
    
    @FindBy(xpath= "/html[1]/body[1]/reach-portal[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/input[1]")
    @CacheLookup
    public WebElement btn_deleteTrash_confirm_list;
    
    @FindBy(xpath="//section[@class='content-canvas__container grid-view']")
    @CacheLookup
    public WebElement containerTrash_grid_view;
    
    @FindBy(xpath="//div[@class='content-card__card']")
    @CacheLookup
    public WebElement containerTrash_list_view;
    
    @FindBy(xpath="//*[@class='icon-grid']")
    @CacheLookup
    public WebElement iconTrash_grid;
    
    @FindBy(xpath="//*[@class='icon-list']")
    @CacheLookup
    public WebElement iconTrash_list;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/button[2]")
    @CacheLookup
    public WebElement btn_emptyTrash;
    
    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[1]")
    @CacheLookup
    public WebElement thumbnail_project_title;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
    @CacheLookup
	public WebElement txt_Project_Title_frm_List;
}