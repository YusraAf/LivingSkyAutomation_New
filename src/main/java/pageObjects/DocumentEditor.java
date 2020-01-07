package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class DocumentEditor extends PageBase {

	public DocumentEditor(WebDriver aDriver) {
		super(aDriver);
		
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup   
	public WebElement tab_documentName_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	//@FindBy(xpath="//div[@id='title-blank']")
	//@FindBy(xpath="//div[@class='section-content']")
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	@CacheLookup
	public WebElement nav_FirstTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/button[1]/*")
	@CacheLookup   
	public WebElement plusIcon_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]")
	@CacheLookup
	public WebElement nav_subTitle_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/button[1]/span[1]")
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]")
	@CacheLookup   
	public WebElement nav_body_DocumentEditor;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]")
	@CacheLookup   
	public WebElement nav_SecondTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]")
	@CacheLookup   
	public WebElement mousehover_SecondCard_DocumentEditor;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[2]/*")
	@CacheLookup   
	public WebElement addNewCard_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	public WebElement controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*")
	@CacheLookup
	public WebElement iconMatter_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/*")
	@CacheLookup
	public WebElement iconPlus_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]/*")
	@CacheLookup
	public WebElement iconCopy_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]/*")
	@CacheLookup
	public WebElement iconTrash_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[2]/div[1]")
	@CacheLookup
	public WebElement cardSeparatorLine_DocumentEditor;
	

}
