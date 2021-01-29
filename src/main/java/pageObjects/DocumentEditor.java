package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class DocumentEditor extends PageBase {

	public DocumentEditor(WebDriver aDriver) {
		super(aDriver);
		
	}
	               
	
	// Added new Web Elements
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement firstCardTopEdge_DocumentEditor;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement secomdCardTopEdge_DocumentEditor;
	
	//@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	@FindBy(xpath="//span[contains(text(),'Start typing...')]")
	public WebElement txt_BlankPlaceHolderEnterTitle_DocumentEditor;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement ObjHandle_Title_DocumentEditor;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement ObjHandle_Body_DocumentEditor;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	//@FindBy(xpath="//div[@class='object-container paragraph-object']//div[@class='object-container-content']")
  	public WebElement txt_body_First_DocumentEditor;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement txt_Body_Second_DocumentEditor;
	               //body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/button[1]/div[1]/div[1]
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]/div[1]")
	public WebElement mousehover_PlusIcon_AboveSecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement txt_Body__First_SecondCard_DocumentEditor;

	
	
	//All Context Menu options
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]")
	public WebElement contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
	public WebElement edit_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]")
	public WebElement insertImage_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[3]/button[1]")
	public WebElement insertList_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]")
	public WebElement convertToList_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[5]/button[1]")
	public WebElement cut_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[6]/button[1]")
	public WebElement copy_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[7]/button[1]")
	public WebElement paste_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[8]/button[1]")
	public WebElement duplicate_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[9]/button[1]")
	public WebElement makeHeading_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[10]/button[1]")
	public WebElement moveToIdeaboard_contextMenu_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/ul[1]/li[11]/button[1]")
	public WebElement delete_contextMenu_DocumentEditor;
	

	
	// Card Index control menu options
	
	@FindBy(xpath="//button[@id='menu-button--menu--375']")
	public WebElement cardIndex_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/div[2]/button[2]")
	public WebElement indentCard_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement outdentCard_SecondCard_DocumentEditor;	
	
	
	
	// All card type options
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/div[1]/button[1]")
	public WebElement icon_defaultCardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[2]/ul[1]/li[1]")
	public WebElement card_CardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[2]/ul[1]/li[2]")
	public WebElement title_CardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[2]/ul[1]/li[3]")
	public WebElement abstract_CardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[2]/ul[1]/li[4]")
	public WebElement introduction_CardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[2]/ul[1]/li[5]")
	public WebElement conclusion_CardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[2]/ul[1]/li[6]")
	public WebElement appendix_CardType_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[7]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement iconReset_CardType_SecondCard_DocumentEditor;	
	
	
	
	// Second card context menu options
	
	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]")
	public WebElement cardContextMenu_SecondCard_DocumentEditor;	
	
	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")
	public WebElement insertCardAbove_CardContextMenu_SecondCard_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]")
	public WebElement insertCardBelow_CardContextMenu_SecondCard_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]/li[3]/button[1]")
	public WebElement insertChildCard_CardContextMenu_SecondCard_DocumentEditor;
	
	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]")
	public WebElement indentCard_CardContextMenu_SecondCard_DocumentEditor;
	

	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]/li[4]/button[1]")
	public WebElement outdentCard_CardContextMenu_SecondCard_DocumentEditor;

	
	
	@FindBy(xpath="//body/reach-portal[9]/div[1]/div[1]/div[1]/ul[1]/li[5]/button[1]")
	public WebElement deleteCard_CardContextMenu_SecondCard_DocumentEditor;
	
	
	
	/*
	
	@FindBy(xpath="//span[contains(text(),'Untitled Document')]")
	public WebElement tab_documentName_DocumentEditor;
	
	//@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--title selected']")
	//public WebElement lbl_First_Card_Title_DocumentEditor;
	
	@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--title selected']")
	public WebElement lbl_First_Card_Title_DocumentEditor;
	
	@FindBy(xpath="//section[@class='area-wrapper area-wrapper-type--body selected']")
	public WebElement lbl_Body_DocumentEditor;
	
	@FindBy(xpath="//div[@class='doc-editor__card'][1]//div[@class='card-separator hide']")
	public WebElement line_topOfCardSeparator_DocumentEditor;
	
	
	
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
	
	@FindBy(xpath="//div[@class='object-container paragraph-object active']//div[@class='object-content']")
	public WebElement txt_Body_Third_DocumentEditor;
	
	@FindBy(xpath="//*[name()='circle' and @id='prefix__Ellipse_216']")
	public WebElement objHandle_Image_DocumentEditor;
	
	@FindBy(xpath="//div[3]//div[1]//div[1]//div[1]//section[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]")
	public WebElement objHandle_Body_Thrid_DocumentEditor;

	@FindBy(xpath="//body/reach-portal/div/div[@class='ContextMenu']/div[@class='ContextMenu__menu-container']/ul[@class='ContextMenu__menu-list']/li[5]/div[1]")
	public WebElement duplicate_ContextMenu__list_DocumentEditor;
*/


}
