package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class Ideaboard extends PageBase{

	public Ideaboard(WebDriver aDriver) {
		super(aDriver);
		
	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[1]/p[1]")
	public WebElement tab_Name_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]")
	public WebElement containerGrid_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[1]/input[1]")
	public WebElement nav_searchObject_IdeaBoard;
	
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/button[2]")
    public WebElement dropDownbtn_sortBy_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[2]/button[1]")
	public WebElement iconGrid_IdeaBoard;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[2]/button[2]")
	public WebElement iconMindMap_IdeaBoard;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[2]/button[3]")
	public WebElement iconList_IdeaBoard;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[4]/button[1]/div[1]/div[1]")
	public WebElement btn_newIdea_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]")
	public WebElement container_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/button[1]")
	public WebElement btn_Cancel_Canvas;
					
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement nav_startTyping_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]")
	public WebElement objectCreationControlBar_container_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/button[1]")
	public WebElement dropDownbtn_InsertFrom_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[1]/*")
	public WebElement iconQuote_Canvas;
	
	@FindBy(xpath="//section[@class='content-editor-container']//*[@class='icon-camera-small']")
	public WebElement iconCamera_Canvas;
	
	@FindBy(id="file")
	public WebElement iconCamera_Canvas_File_type;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[4]/*")
	public WebElement iconList_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[5]/*")
	public WebElement iconTable_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[6]/*")
	public WebElement iconMicrophone_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[7]/*")
	public WebElement iconFormula_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/button[2]")
	public WebElement btn_canvasSaveClose_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]")
	public WebElement container_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]")
	public WebElement objectCreationControlBar_container_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/input[1]")
	public WebElement nav_imageTitle_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/input[1]")
	public WebElement nav_imageCaption_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/input[2]")
	public WebElement nav_imageAttribution_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/button[2]")
	public WebElement btn_imageSaveClose_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/button[1]/span[1]")
	public WebElement dropDownbtn_InsertFrm_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[1]/*")
	public WebElement iconQuote_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[2]/*")
	public WebElement iconCamera_ImageEditor;
	 
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[4]/*")
	public WebElement iconList_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[5]/*")
	public WebElement iconTable_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[6]/*")
	public WebElement iconMicrophone_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[7]/*")
	public WebElement iconFormula_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
	public WebElement tab_Name_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/*")
	public WebElement iconMatter_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/*")
	public WebElement iconPlus_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]/*")
	public WebElement iconCopy_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[4]/*")
	public WebElement iconTrash_controlBarMenu_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[2]/div[1]")
	public WebElement cardSeparatorLine_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")
	public WebElement nav_enterTitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[3]/div[1]/div[2]")
	public WebElement iconPlus_mousehoverSubtitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[1]")
	public WebElement btn_clickonSubtitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]")
	public WebElement nav_enterSubtitle_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[4]/div[1]/div[2]")
	public WebElement btn_mouseHoverclickonBody_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]")
	public WebElement nav_enterBody_DocumentEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement dotFirstParagraphInCanvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement dotSecondParagraphInCanvas;
	
	
}
