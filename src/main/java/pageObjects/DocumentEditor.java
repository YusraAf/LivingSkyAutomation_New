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
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	@CacheLookup   
	public WebElement lbl_Title_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup   
	public WebElement ObjHandle_Title_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/button[1]/*")
	@CacheLookup   
	public WebElement plusIcon_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]")
	@CacheLookup   
	public WebElement nav_subTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/span[1]")
	@CacheLookup   
	public WebElement lbl_SubTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup   
	public WebElement ObjHandle_SubTitle_DocumentEditor;
		
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[3]/div[1]/div[2]")
	@CacheLookup   
	public WebElement nav_AddSubTitleAfterBody_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]")
	@CacheLookup   
	public WebElement nav_body_DocumentEditor;
	
	@FindBy(xpath="html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
	@CacheLookup   
	public WebElement lbl_Body_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup   
	public WebElement ObjHandle_Body_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]")
	@CacheLookup   
	public WebElement nav_SecondBody_DocumentEditor;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]")
	@CacheLookup   
	public WebElement nav_SecondTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]")
	@CacheLookup   
	public WebElement mousehover_SecondCard_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]")
	@CacheLookup
	public WebElement line_topOfCardSeparator_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup   
	public WebElement controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	@CacheLookup
	public WebElement icon_MatterCard_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")
	@CacheLookup
	public WebElement icon_AddCard_controlBarSeparator_DocumentEditor;

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]")
	@CacheLookup
	public WebElement icon_CopyCard_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]")
	@CacheLookup
	public WebElement icon_DeleteCard_controlBarSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/reach-portal[4]/div[1]/div[1]/div[2]/div[1]")
	@FindBy(xpath="//div[@class='input-dropdown-inner__menu-list css-11unzgr']")
	@CacheLookup
	public WebElement dropDown_MatterMenu_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]")
	@CacheLookup
	public WebElement container_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/button[1]")
	@CacheLookup
	public WebElement btn_Preview_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[1]")
	@CacheLookup
	public WebElement iconQuote_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[2]")
	@CacheLookup
	public WebElement iconCamera_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[4]")
	@CacheLookup
	public WebElement iconList_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[5]")
	@CacheLookup
	public WebElement iconTable_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[6]")
	@CacheLookup
	public WebElement iconMicrophone_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[7]")
	@CacheLookup
	public WebElement iconFormula_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/button[2]")
	@CacheLookup
	public WebElement btn_More_ObjectCreationControlBar_DocumentEditor;
	
}
