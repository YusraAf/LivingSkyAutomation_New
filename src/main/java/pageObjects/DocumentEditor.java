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
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	//@FindBy(xpath="//div[@class='TabView']//p[contains(text(),'Untitled Document')]")
	@FindBy(xpath="//div[@class='Tab focused']//p[contains(text(),'Untitled Document')]")
	@CacheLookup   
	public WebElement tab_documentName_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")
	//@FindBy(xpath="//div[@id='title-blank']")
	//@FindBy(xpath="//div[@class='section-content']")
	//@FindBy(xpath="//*[@class='blank-placeholder__card'] //div[@class='section-content']")
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='blank-placeholder__card']//div[@class='section-content']")
	@CacheLookup   
	public WebElement txt_BlankPlaceHolderEnterTitle_DocumentEditor;
	
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//span[@class='label-content'][contains(text(),'Title')]")
	@CacheLookup   
	public WebElement lbl_First_Card_Title_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]") object-handle-container 
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//div[2]//div[2]//div[@class='ObjectHandle']")
	@CacheLookup    
	public WebElement ObjHandle_Title_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/button[1]/*")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='control-bar with-menu']//*[@class='icon-plus']")
	@CacheLookup   
	public WebElement icon_Plus_DocumentEditor;
					
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]")
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//div[3]//ul[@class='menu-list']//li[1]")
	@CacheLookup   
	public WebElement txt_subTitle_First_DocumentEditor;
	
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//span[@class='label-content'][contains(text(),'Subtitle')]")
	@CacheLookup   
	public WebElement lbl_SubTitle_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//div[3]//div[2]//div[@class='ObjectHandle']")
	@CacheLookup   
	public WebElement ObjHandle_SubTitle_DocumentEditor;
		
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[3]/div[1]/div[2]")
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//div[3]//button[1]")
	@CacheLookup   
	public WebElement txt_AddSubTitle_AfterBody_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]")
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//div[4]")
	@CacheLookup   
	public WebElement txt_body_First_DocumentEditor;
	
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//span[@class='label-content'][contains(text(),'Body')]")
	@CacheLookup   
	public WebElement lbl_Body_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
	@FindBy(xpath="//div[@class='Tab focused']//*[@class='doc-editor__card']//div[4]//div[2]//div[@class='ObjectHandle']")
	@CacheLookup   
	public WebElement ObjHandle_Body_DocumentEditor;
	
	@FindBy(xpath="//div[@class='Tab focused']//section[@id='document-editor']//div[2]//div[4]")
	@CacheLookup   
	public WebElement txt_Body_Second_DocumentEditor;

	//@FindBy(xpath="//*[@class='blank-placeholder__card']//div[@class='blank-card-content']//div[@class='ContextMenu']//div[@id='title-blank']//div[@class='section-content']")
			
			///"/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]")
	//@CacheLookup   
	//public WebElement nav_SecondTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]")
	@CacheLookup   
	public WebElement mousehover_SecondCard_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='doc-editor__card'][1]//div[@class='card-separator hide']")
	@CacheLookup
	public WebElement line_topOfCardSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	//@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='control-bar-content']")
	@CacheLookup   
	public WebElement controlBarSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[1]")
	@CacheLookup
	public WebElement icon_MatterCard_controlBarSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]")
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[2]")
	@CacheLookup
	public WebElement icon_AddCard_controlBarSeparator_DocumentEditor;

	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]")
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[3]")
	@CacheLookup
	public WebElement icon_CopyCard_controlBarSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]")
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[4]")
	@CacheLookup
	public WebElement icon_DeleteCard_controlBarSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/reach-portal[4]/div[1]/div[1]/div[2]/div[1]")
	//@FindBy(xpath="//div[@class='input-dropdown-inner__menu-list css-11unzgr']")
	@FindBy(xpath="//div[@class='input-dropdown-inner__menu css-26l3qy-menu']")
	@CacheLookup
	public WebElement dropDown_MatterMenu_controlBarSeparator_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]")
	@FindBy(xpath="//div[@class='Tab focused']//section[@class='object-creation-control-bar-container']")
	@CacheLookup   
	public WebElement container_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/button[1]")
	@FindBy(xpath="//div[@class='Tab focused']//button[@class='icon-btn preview']")
	@CacheLookup
	public WebElement btn_Preview_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[1]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='btn-wrapper']//button[1]")
	@CacheLookup
	public WebElement iconQuote_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[2]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='btn-wrapper']//button[2]")
	@CacheLookup
	public WebElement iconCamera_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[4]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='btn-wrapper']//button[4]")
	@CacheLookup
	public WebElement iconList_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[5]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='btn-wrapper']//button[5]")
	@CacheLookup
	public WebElement iconTable_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[6]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='btn-wrapper']//button[6]")
	@CacheLookup
	public WebElement iconMicrophone_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/div[1]/button[7]")
	@FindBy(xpath="//div[@class='Tab focused']//div[@class='btn-wrapper']//button[7]")
	@CacheLookup
	public WebElement iconFormula_ObjectCreationControlBar_DocumentEditor;
	
	//@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[2]/button[2]")
	@FindBy(xpath="//div[@class='Tab focused']//button[@class='icon-btn more']")
	@CacheLookup
	public WebElement btn_More_ObjectCreationControlBar_DocumentEditor;
	
}
