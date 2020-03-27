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
	
	@FindBy(xpath="//span[contains(text(),'Untitled Document')]")
	public WebElement tab_documentName_DocumentEditor;
	
	
	@FindBy(xpath="//*[@class='blank-placeholder__card']//div[@class='section-content']")
	public WebElement txt_BlankPlaceHolderEnterTitle_DocumentEditor;
	
	@FindBy(xpath="//*[@class='doc-editor__card']//div[@class='editor-area editor-area_title']//span[@class='label-content'][contains(text(),'title')]")
	public WebElement lbl_First_Card_Title_DocumentEditor;
	
	@FindBy(xpath="//*[@class='doc-editor__card'] //div[@class='editor-area editor-area_title'] //div[@class='ObjectHandle']")
	public WebElement ObjHandle_Title_DocumentEditor;
	
	@FindBy(xpath="//button[contains(@class,'icon-btn add-area-button')]//*[contains(@class,'icon-plus')]")
	public WebElement iconPlusSubTileAndBoby;
	
	@FindBy(xpath="//span[contains(text(),'Body')]")
	public WebElement iconPlusBoby;
					
	@FindBy(xpath="//*[@class='doc-editor__card']//div[3]//ul[@class='menu-list']//li[1]")
	public WebElement txt_subTitle_First_DocumentEditor;
	
	@FindBy(xpath="//*[@class='doc-editor__card']//span[@class='label-content'][contains(text(),'subtitle')]")
	@CacheLookup   
	public WebElement lbl_SubTitle_DocumentEditor;
	
	@FindBy(xpath="//*[@class='doc-editor__card']//div[@class='editor-area editor-area_subtitle']//div[@class='ObjectHandle']")
	public WebElement ObjHandle_SubTitle_DocumentEditor;
		
	@FindBy(xpath="//span[contains(text(),'Subtitle')]")
	public WebElement txt_AddSubTitle_AfterBody_DocumentEditor;
	
	
	
	@FindBy(xpath="//div[@id='doc-editor-card']/div[2]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[3]/div[1]")
	public WebElement ObjHandleFirst_DocumentEditor;
	
	@FindBy(xpath="//div[@id='doc-editor-card']/div[1]/div[2]/section/div[3]/div/div/div[2]/div[2]/div[2]/div")
  	public WebElement txt_body_First_DocumentEditor;
					
	@FindBy(xpath="//div[@id='doc-editor-card']/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div")
	public WebElement txtBodyAreaInTheTopCardCreated;
	
	@FindBy(xpath="//*[@class='doc-editor__card']//span[@class='label-content'][contains(text(),'body')]")
	public WebElement lbl_Body_DocumentEditor;
	
	//@FindBy(xpath="//div[contains(@class,'doc-editor__card')]/div[contains(@class,'doc-editor__card-drop-zone')]/div[contains(@class,'ContextMenu')]/section[contains(@class,'document-container')]/div[4]/div[1]/div[1]/div[3]/div[1]")
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]")		
			//"//*[@class='doc-editor__card']//div[@class='editor-area editor-area_body']//div[@class='ObjectHandle']")
	public WebElement ObjHandle_Body_DocumentEditor_new;
	
	@FindBy(xpath="//*[@class='doc-editor__card']//div[@class='editor-area editor-area_body']//div[@class='ObjectHandle']")
	
	//"//*[@class='doc-editor__card']//div[@class='editor-area editor-area_body']//div[@class='ObjectHandle']")
	public WebElement ObjHandle_Body_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[2]/section[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]")
	public WebElement txt_Body_Second_DocumentEditor;

	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]")
	public WebElement mousehover_SecondCard_DocumentEditor;
	
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='card-separator hide']")
	public WebElement line_topOfCardSeparator_DocumentEditor;
	
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='card-separator']")
	public WebElement line_topOfCardSeparator_DocumentEditorAfterHover;
	
	@FindBy(xpath="//*[@class='control-bar-content']")
	public WebElement controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[1]")
	public WebElement icon_MatterCard_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[2]")
	public WebElement icon_AddCard_controlBarSeparator_DocumentEditor;

	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='control-bar-btns']//button[3]")
	public WebElement icon_CopyCard_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="//div[@class='doc-editor__card'][2]//div[@class='control-bar-btns']//button[4]")
	public WebElement icon_DeleteCard_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="//button[@class='icon-btn 701f4325-1aa9-41a5-92dc-8119ea8f039d-matter']")
	public WebElement dropDown_MatterMenu_controlBarSeparator_DocumentEditor;
	
	@FindBy(xpath="//section[@class='object-creation-control-bar-container']")
	public WebElement container_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(css="reach-portal > div > div > div")
	public WebElement btn_Preview_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[1]")
	public WebElement iconQuote_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[2]")
	public WebElement iconCamera_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[3]")
	public WebElement iconList_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[4]")
	public WebElement iconTable_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[5]")
	public WebElement iconMicrophone_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[6]")
	public WebElement iconFormula_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(css=".dropdown-button__content > .dropdown-button__text")
	public WebElement btn_More_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(css="#Right-tab-1 p")
	public WebElement tabForPreviewInIdeaBoard;
	
	@FindBy(xpath="//div[@id='Right-tab-1']//*[contains(@class,'icon-cancel')]")
	public WebElement btnTabPreviewCloseButton;
	
	@FindBy(id="Left-panel-0")
	public WebElement panelLeft;
	
	@FindBy(id="Right-panel-0")
	public WebElement panelRight;
	
	@FindBy(xpath="//input[@id='input-title']")
	public WebElement nav_imageTitle_imageEditorInDocumentEditor;

	@FindBy(xpath="//input[@id='input-caption']")
	public WebElement nav_imageCaption_imageEditorInDocumentEditor;

	@FindBy(xpath="//input[@id='input-attribution']")
	public WebElement nav_imageAttribution_imageEditorInDocumentEditor;

	@FindBy(xpath="//button[@class='button-transparant']")
	public WebElement btn_imageSaveClose_imageEditorInDocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement controlBarSeparatorThridCard_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement icon_MoveCard_controlBarSeparator_DocumentEditor;
	


}
