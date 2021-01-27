package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class IdeaBoard extends PageBase{

	public IdeaBoard(WebDriver aDriver) {
		super(aDriver);
		
	}

	// Idea board creation options
	
	@FindBy(xpath="/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/header[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement txt_Paragraph_IdeaBoard;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/header[1]/div[1]/div[1]/div[2]")
	public WebElement objectCreationControlBar_IdeaBoard;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[1]")
	public WebElement iconCamera_IdeaBoard;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/header[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	public WebElement iconList_IdeaBoard;

	@FindBy(xpath="//body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/section[1]/div[1]/header[1]/div[1]/div[2]/div[1]/button[1]/div[1]/div[1]")
	public WebElement dropDown_Sort_IdeaBoard;
	
	@FindBy(xpath="//div[@id='option-0--menu--52']")
	public WebElement dropDown_SortByLastModified_IdeaBoard;
	
	@FindBy(xpath="//div[@id='option-1--menu--52']")
	public WebElement dropDown_SortByType_IdeaBoard;
	
	@FindBy(xpath="//div[@id='option-2--menu--52']")
	public WebElement dropDown_SortByTitlteAZ_IdeaBoard;
	
	@FindBy(xpath="//div[@id='option-3--menu--52']")
	public WebElement dropDown_SortByTitlteZA_IdeaBoard;
	
	
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]/div[1]/button[1]")
	public WebElement tabForIdeaBoard;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]/div[2]/button[1]")
	public WebElement tabForOutline;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[4]/div[3]/button[1]")
	public WebElement tabForPublish;
	
	/*				
	@FindBy(xpath="//div[@id='Right-tab-0']")
	public WebElement tabFirstTabInIdeaBoard;
	
	@FindBy(xpath="//div[@id='Right-tab-1']")
	public WebElement tabSecondTabInIdeaBoard;
	
	@FindBy(xpath="//div[@id='Left-tab-0']")
	public WebElement tabFirstTabInDocEditor;
	
	@FindBy(xpath="//div[@id='Left-add-tab-1']")
	public WebElement btnPlusInTabInDocEditor;
	
	@FindBy(xpath="//div[@id='Right-add-tab-1']")
	public WebElement btnPlusInTabInIdeaBoard;
	
	@FindBy(xpath="//reach-portal[2]/div/div/div[2]")
	public WebElement dropDownSecondItemSelectionInIdeaBoard;
	
	@FindBy(xpath="//div[@class='masonry-grid large show']")
			
			
			//"/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]")
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
	 
	@FindBy(xpath="//div[@class='dropdown-button__text']")
	public WebElement btn_newIdea_IdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]")
	public WebElement container_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/button[1]")
	public WebElement btn_Cancel_Canvas;
							
					//		/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]
					//  /html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
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
	
	@FindBy(xpath="//button[@class='button-transparant']")
	public WebElement btn_canvasSaveClose_Canvas;
	
	@FindBy(xpath="/html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]")
	public WebElement container_ImageEditor;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/section[1]")
	public WebElement objectCreationControlBar_container_ImageEditor;
	
	@FindBy(id="input-title")
	public WebElement nav_imageTitle_imageEditor;
	
	@FindBy(id="input-caption")
	public WebElement nav_imageCaption_imageEditor;
	
	@FindBy(id="input-attribution")
	public WebElement nav_imageAttribution_imageEditor;
	
	@FindBy(xpath="//section[@class='image-editor-container title-input__container']//button[@class='button-transparant'][contains(text(),'Done')]")
	
	///html[1]/body[1]/reach-portal[3]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/section[2]/button[2]
	
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
	

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement dotFirstParagraphInCanvas;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	public WebElement dotSecondParagraphInCanvas;
	
	//@FindBy(xpath="//div[contains(@class,'masonry-grid medium show')] /div[contains(@class,'text-wrapper')][1]")
	@FindBy(xpath="//div[@class='idea-content']")
	public WebElement ideaFirstInIdeaBoard;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/span[1]/img[1]")
	public WebElement ideaSecondInIdeaBoard;
	*/
}
