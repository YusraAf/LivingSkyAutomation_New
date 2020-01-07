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
	@CacheLookup
	public WebElement tab_Name_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]")
	@CacheLookup
	public WebElement containerGrid_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[1]/input[1]")
	@CacheLookup
	public WebElement nav_searchObject_IdeaBoard;
	
	@FindBy(xpath= "/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/button[2]")
    @CacheLookup
    public WebElement dropDownbtn_sortBy_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[2]/button[1]")
	@CacheLookup
	public WebElement iconGrid_IdeaBoard;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[2]/button[2]")
	@CacheLookup
	public WebElement iconMindMap_IdeaBoard;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[2]/button[3]")
	@CacheLookup
	public WebElement iconList_IdeaBoard;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/div[1]/header[1]/div[4]/button[1]/div[1]/div[1]")
	@CacheLookup
	public WebElement btn_newIdea_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]")
	@CacheLookup
	public WebElement container_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/button[1]")
	@CacheLookup
	public WebElement btn_Cancel_Canvas;
	
			//---/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]
	              ///html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[2]
					
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	@CacheLookup
	public WebElement nav_startTyping_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]")
	@CacheLookup
	public WebElement objectCreationControlBar_container_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/button[1]")
	@CacheLookup
	public WebElement dropDownbtn_InsertFrom_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[1]/*")
	@CacheLookup
	public WebElement iconQuote_Canvas;
	
	@FindBy(xpath="//section[@class='content-editor-container']//*[@class='icon-camera-small']")
	@CacheLookup
	public WebElement iconCamera_Canvas;
	
	@FindBy(id="file")
	@CacheLookup
	public WebElement iconCamera_Canvas_File_type;
	 
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[4]/*")
	@CacheLookup
	public WebElement iconList_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[5]/*")
	@CacheLookup
	public WebElement iconTable_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[6]/*")
	@CacheLookup
	public WebElement iconMicrophone_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/div[1]/button[7]/*")
	@CacheLookup
	public WebElement iconFormula_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]/button[2]")
	@CacheLookup
	public WebElement btn_canvasSaveClose_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]")
	@CacheLookup
	public WebElement container_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]")
	@CacheLookup
	public WebElement objectCreationControlBar_container_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[1]/input[1]")
	@CacheLookup
	public WebElement nav_imageTitle_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/input[1]")
	@CacheLookup
	public WebElement nav_imageCaption_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/input[2]")
	@CacheLookup
	public WebElement nav_imageAttribution_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/button[2]")
	@CacheLookup
	public WebElement btn_imageSaveClose_imageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/button[1]/span[1]")
	@CacheLookup
	public WebElement dropDownbtn_InsertFrm_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[1]/*")
	@CacheLookup
	public WebElement iconQuote_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[2]/*")
	@CacheLookup
	public WebElement iconCamera_ImageEditor;
	 
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[4]/*")
	@CacheLookup
	public WebElement iconList_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[5]/*")
	@CacheLookup
	public WebElement iconTable_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[6]/*")
	@CacheLookup
	public WebElement iconMicrophone_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/div[1]/button[7]/*")
	@CacheLookup
	public WebElement iconFormula_ImageEditor;
	
			
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	@CacheLookup
	public WebElement dotFirstParagraphInCanvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	@CacheLookup
	public WebElement dotSecondParagraphInCanvas;
			
	
}
