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
	
	@FindBy(xpath="//div[@class='object-container-content']")
	public WebElement txt_BlankPlaceHolderEnterTitle_DocumentEditor;
	
	//@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--title selected']")
	//public WebElement lbl_First_Card_Title_DocumentEditor;
	
	@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--title selected']")
	public WebElement lbl_First_Card_Title_DocumentEditor;
	
	@FindBy(xpath="//div[@class='object-handle object-handle--paragraph']//*[local-name()='svg']")
	public WebElement ObjHandle_Title_DocumentEditor;
	
	@FindBy(xpath="//div[@class='object-container paragraph-object active']//div[@class='object-handle object-handle--paragraph']//*[local-name()='svg']")
	public WebElement ObjHandle_Body_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/span[1]")
	//@FindBy(xpath="//div[@class='object-container paragraph-object']//div[@class='object-container-content']")
  	public WebElement txt_body_First_DocumentEditor;
	
	@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--body selected']")
	public WebElement lbl_Body_DocumentEditor;
	
	@FindBy(xpath="//div[@class='object-container paragraph-object active']//div[@class='object-container-content']//div[2]")
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
	
	@FindBy(xpath="//div[contains(text(),'Preview')]")
	public WebElement btn_Preview_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[1]")
	public WebElement iconQuote_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='document-control-bar']//button[2]")
	public WebElement iconCamera_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[3]")
	public WebElement iconList_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[4]")
	public WebElement iconTable_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[5]")
	public WebElement iconMicrophone_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//div[@class='btn-wrapper']//button[6]")
	public WebElement iconFormula_ObjectCreationControlBar_DocumentEditor;
	
	@FindBy(xpath="//span[@class='dropdown-button__text']")
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

	@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--caption']//div[@class='object-container-content']")
	public WebElement nav_imageCaption_imageEditorInDocumentEditor;

	@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--citation']//div[@class='object-content']")
	public WebElement nav_imageCitation_imageEditorInDocumentEditor;

	@FindBy(xpath="//button[@class='button-transparant']")
	public WebElement btn_imageSaveClose_imageEditorInDocumentEditor;
	
	@FindBy(xpath="//div[@class='editor-card']//div[@class='card-controls__options']")
	public WebElement cardController_DocumentEditor;
	
	@FindBy(xpath="//div[@class='editor-card']//button[1]")
	public WebElement icon_Card_cardController_DocumentEditor;
	
	@FindBy(xpath="//div[@class='editor-card']//button[2]")
	public WebElement icon_titleCard_cardController_DocumentEditor;
	
	@FindBy(xpath="//div[@class='editor-card']//div[@class='card-controls__handle']")
	public WebElement icon_MoveCard_controlBarSeparator_DocumentEditor;
	


}
