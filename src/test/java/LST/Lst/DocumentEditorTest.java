package LST.Lst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.DocumentEditor;
import pageObjects.IdeaBoard;
import pageObjects.Project;
import resources.Browser;
import resources.CommonTask;
import resources.UploadFile;

public class DocumentEditorTest extends TestBase {
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());

	private LoginTest log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
	private DocumentEditor doce;
	private CommonTask com  = new CommonTask(driver);
	private IdeaBoard idb;
	private Robot rb;
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		
		driver = Browser.getInstance();
		driver.get(baseUrl);
		
		log =new LoginTest();
		log.doSignin("niti+2@livingskytech.com", "asdf1234");
		
		Thread.sleep(1000);
	}	
	
	@Test(priority=1) 	
	public void verifyAndCreateCardTitleAreaInDocumentEditorTest() throws IOException, InterruptedException, Exception {

		das = new Dashboard(driver);
		das.initElement();
		
		das.btn_newProject.click();
		
		pro = new Project(das.getDriver());
		pro.initElement();
		
		String  projectName = "Project_With_Document";
				
		pro.nav_startTypingProjectName.sendKeys(projectName);
		Thread.sleep(1000);
		
		File file = new File("Images/project_image.jpeg"); 
		String path = file.getAbsolutePath(); 
		pro.btn_addPhoto.sendKeys(path);
		
		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("Vision- Our vision is to provide a suite of products and services that are indispensable to content creators across all disciplines. Mission - The mission of Living Sky Technologies is to streamline your workflow by making content creation more efficient.");
		
		pro.btn_startProject.click();
		Thread.sleep(100);
		
		logger.info("This is inside in Document Editor Page =====> Creating document on the Document Editor");
		doce = new DocumentEditor(pro.getDriver());
		doce.initElement();
			
		//System.out.println("Document Name is ----> " + doce.tab_documentName_DocumentEditor.getText());
		
		WebElement title = doce.txt_BlankPlaceHolderEnterTitle_DocumentEditor;
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", ele);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//com.moveMouseAndClick(ele);
		Thread.sleep(1000);
			
		Actions action = new Actions(driver);
		com.moveMouseAndClick(title);
		
		action.click(title).sendKeys("Living Sky Technologies" + Keys.ENTER).perform();
		Thread.sleep(1000);
			
	    Assert.assertTrue((doce.ObjHandle_Title_DocumentEditor).isDisplayed());
		logger.info("Object Handle for Title is displayed in the Document Editor");
		//System.out.println("Verifing Object Handle for Title in the Document Editor");
			
		//System.out.println("Area Name is ---->  " + doce.lbl_First_Card_Title_DocumentEditor.getText());
		//WebElement btn = doce.lbl_First_Card_Title_DocumentEditor;
		//System.out.println("Area Name is ---->  " + btn.getAttribute("aria-label"));
		
	   // Assert.assertTrue((doce.lbl_First_Card_Title_DocumentEditor).isDisplayed());
		//logger.info("Label for Title card area is displayed in the Document Editor");
	}
	/*
	@Test(priority=2) 	
	public void verifyAndCreateCardSubTitleAreaInDocumentEditorTest() throws IOException, InterruptedException, Exception {
		
		Actions action = new Actions(driver);	
		com.moveMouseAndClick(doce.iconPlusSubTileAndBoby);

		WebElement subtitle = doce.txt_subTitle_First_DocumentEditor;
			
		action.click(subtitle).sendKeys("Vision").perform();
		Thread.sleep(1000);
			
		Assert.assertTrue((doce.ObjHandle_SubTitle_DocumentEditor).isDisplayed());
		logger.info("Object Handle for SubTitle is displayed in the Document Editor");
			
		System.out.println("Area Name is ---->  " + doce.lbl_SubTitle_DocumentEditor.getText());
		Assert.assertTrue((doce.lbl_SubTitle_DocumentEditor).isDisplayed());
		logger.info("Label for SubTitle card area is displayed in the Document Editor");
	}*/
	
	@Test(priority=3) 	
	public void verifyAndCreateCardBodyAreaInDocumentEditorTest() throws IOException, InterruptedException, Exception {
		Thread.sleep(500);
		Actions action = new Actions(driver);	
		//com.moveMouseAndClick(doce.iconPlusBoby);
		
		
		WebElement body = doce.txt_body_First_DocumentEditor;
		
		action.click(body).sendKeys("Our vision is to provide a suite of products and services that are indispensable to content creators across all disciplines." +Keys.ENTER + Keys.ENTER).perform();
		Thread.sleep(1000);
			
		Assert.assertTrue((doce.ObjHandle_Body_DocumentEditor).isDisplayed());
		logger.info("Object Handle for Body is displayed in the Document Editor");
		//System.out.println("Verifing Object Handle for Body in the Document Editor");
			
		//System.out.println("Area Name is ---->  " + doce.lbl_Body_DocumentEditor.getText());

		//Assert.assertTrue((doce.lbl_Body_DocumentEditor).isDisplayed());
		//logger.info("Label for Body card area is displayed in the Document Editor");
		//Thread.sleep(500);
		/*		
		String filepath=System.getProperty("user.dir")+"/Images/MyImage5.jpg";
		doce.iconCamera_ObjectCreationControlBar_DocumentEditor.click();

		UploadFile upfile = new UploadFile();
		upfile.upload(filepath);

		Thread.sleep(1000);
		
		//doce.nav_imageTitle_imageEditorInDocumentEditor.sendKeys("Image added in Document Editor ");
		doce.nav_imageCaption_imageEditorInDocumentEditor.sendKeys("Image Caption added in Document Editor");
		doce.nav_imageCitation_imageEditorInDocumentEditor.sendKeys("Image Citation added in Document Editor");*/
		//Thread.sleep(1000);
		//com.mouseHoverOnly(doce.btn_imageSaveClose_imageEditorInDocumentEditor);
		//doce.btn_imageSaveClose_imageEditorInDocumentEditor.click();

	}

	@Test(priority=4) 	
	public void verifyEnterKeyFromKeyboardWithCardAreaInDocument() throws IOException, InterruptedException, Exception {
			
		Actions action = new Actions(driver);
	
		WebElement secondTitle = doce.txt_Body_Second_DocumentEditor;
		//com.moveMouseAndClick(secondTitle);
		Thread.sleep(1000);
		
		action.click(secondTitle).sendKeys("About Living Sky Technologies" + Keys.ENTER).perform();
		Thread.sleep(1000);
				
		WebElement body = doce.txt_Body_Second_DocumentEditor;
		action.click(body).sendKeys("Empowering creators everywhere. What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched." ).perform();
		Thread.sleep(1000);	
		
		String filepath=System.getProperty("user.dir")+"/Images/MyImage5.jpg";
		doce.iconCamera_ObjectCreationControlBar_DocumentEditor.click();

		UploadFile upfile = new UploadFile();
		upfile.upload(filepath);

		Thread.sleep(1000);
		
		//doce.nav_imageTitle_imageEditorInDocumentEditor.sendKeys("Image added in Document Editor ");
		doce.nav_imageCaption_imageEditorInDocumentEditor.sendKeys("Image Caption added in Document Editor");
		doce.nav_imageCitation_imageEditorInDocumentEditor.sendKeys("Image Citation added in Document Editor");
	/*	
		String imagepath=System.getProperty("user.dir")+"/Images/MyImage5.jpg";
		doce.iconCamera_ObjectCreationControlBar_DocumentEditor.click();
		Thread.sleep(700);
		
		UploadFile upfile = new UploadFile();
		if (System.getProperty("os").equals("mac")) {
			driver.switchTo().window(driver.getWindowHandle());

			upfile.setClipboardData(imagepath);
			upfile.uploadFileInMac();
		} else {
			upfile.upload(imagepath);

		}
		Thread.sleep(1000);

		//doce.nav_imageTitle_imageEditorInDocumentEditor.sendKeys("Image added in Document Editor ");
		//doce.nav_imageCaption_imageEditorInDocumentEditor.sendKeys("Image Caption added in Document Editor");
		//doce.nav_imageAttribution_imageEditorInDocumentEditor.sendKeys("Image Object attribute in Document Editor");
		//Thread.sleep(1000);
		//com.mouseHoverOnly(doce.btn_imageSaveClose_imageEditorInDocumentEditor);
		//doce.btn_imageSaveClose_imageEditorInDocumentEditor.click();
		
		WebElement addSubtitleAfterBody = doce.txt_AddSubTitle_AfterBody_DocumentEditor;
			
		action.click(addSubtitleAfterBody).sendKeys("About Living Sky Technologies" + Keys.ENTER).perform();
		Thread.sleep(1000);
		
		String imagepath2=System.getProperty("user.dir")+"/Images/MyImage3.jpeg";
		doce.iconCamera_ObjectCreationControlBar_DocumentEditor.click();
		Thread.sleep(700);
		
		UploadFile upfile2 = new UploadFile();
		if (System.getProperty("os").equals("mac")) {
			driver.switchTo().window(driver.getWindowHandle());

			upfile2.setClipboardData(imagepath2);
			upfile2.uploadFileInMac();
		} else {
			upfile.upload(imagepath);
		}*/
	}
	
	@Test(priority=5) 	
	public void verifyPageScrollingTest() throws IOException, InterruptedException, Exception {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(100,0)","");
		Thread.sleep(1000);
		
	}
/*
	@Test(priority=6) 	
	public void verifyControlBarSeparatorTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(doce.line_topOfCardSeparator_DocumentEditor);
		Assert.assertTrue((doce.line_topOfCardSeparator_DocumentEditorAfterHover).isDisplayed());
		logger.info("Top of the Card Separator Line is displayed in the Document Editor");
		
		//WebElement controlBarSeparator = doce.controlBarSeparator_DocumentEditor;
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		//action2.moveToElement(controlBarSeparator).build().perform();
		Thread.sleep(500);
			
		Assert.assertTrue((doce.controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Control Bar Separator is displayed in the Document Editor");
		}
	
	@Test(priority=7) 	
	public void verifyIconMatterCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_MatterCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Matter card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=8) 	
	public void verifyIconAddNewCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_AddCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Add new card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=9) 	
	public void verifyIconCopyCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_CopyCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Copy or duplicate card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=10) 	
	public void verifyAddNewCardControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.moveMouseAndClick(doce.icon_AddCard_controlBarSeparator_DocumentEditor);
		
		Thread.sleep(1000);
		WebElement title5 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]"));
		
		Actions action2 = new Actions(driver);
			
		action2.click(title5).sendKeys("Michael Zhou"+Keys.ENTER).build().perform();
		Thread.sleep(1000);
		//rb.keyPress(KeyEvent.VK_ENTER);
		WebElement body=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[4]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]"));
		action2.click(body).sendKeys( "Founder & Chief Executive Officer").build().perform();
		Thread.sleep(1000);
		Assert.assertEquals(doce.txtBodyAreaInTheTopCardCreated.getText(),"Founder & Chief Executive Officer");
		
	}
	
	//@Test(priority=11) 	
	public void verifyDropDownMenuForMatterCardControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(doce.line_topOfCardSeparator_DocumentEditor);
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		Thread.sleep(500);
		com.moveMouseAndClick(doce.icon_MatterCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(1000);
		Assert.assertTrue((doce.dropDown_MatterMenu_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Drop Down Menu for Matter card is displayed inside Control Bar Separator in the Document Editor");
		com.moveMouseAndClick(doce.icon_MatterCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(500);	
	}
	// Copy Card
	@Test(priority=12) 	
	public void verifyCopyCardControlBarTest() throws IOException, InterruptedException, Exception {
		com.mouseHoverOnly(doce.line_topOfCardSeparator_DocumentEditor);
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		Thread.sleep(500);
		com.moveMouseAndClick(doce.icon_CopyCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(1000);
		
	}
	
	@Test(priority=13) 	
	public void verifyIconDeleteCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_DeleteCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Delete or remove card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	// Delete Card
	@Test(priority=14) 	
	public void verifyDeleteCardControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.moveMouseAndClick(doce.icon_DeleteCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(1000);
		
	}
	*/
	@Test(priority=15) 	
	public void verifyObjectCreationControlBarContainerTest() throws IOException, InterruptedException, Exception {
		
		WebElement objectContainer = doce.container_ObjectCreationControlBar_DocumentEditor;
		Actions action3 = new Actions(driver);
		
		action3.moveToElement(objectContainer).build().perform();
		Assert.assertTrue((doce.container_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("Object Creation Control Bar Container is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	
	@Test(priority=16) 	
	public void verifyPreviewObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.moveMouseAndClick(doce.btn_More_ObjectCreationControlBar_DocumentEditor);
		Assert.assertTrue((doce.btn_Preview_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		com.moveMouseAndClick(doce.btn_Preview_ObjectCreationControlBar_DocumentEditor);
		
		logger.info("Preview button Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(3000);
		
	//	com.mouseHoverOnly(doce.tabForPreviewInIdeaBoard);
	//	Assert.assertEquals(doce.tabForPreviewInIdeaBoard.getText(), "Preview");
		
	//	com.moveMouseAndClick(doce.btnTabPreviewCloseButton);
		
	}
	
	@Test(priority=17) 	
	public void verifyQuoteObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconQuote_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("Quote icon Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	
	@Test(priority=18) 	
	public void verifyCameraObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconCamera_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("Camera icon Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	
	@Test(priority=19) 	
	public void verifyListObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconList_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("List icon Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	
	@Test(priority=20) 	
	public void verifyTableObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconTable_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("Table icon Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	
	@Test(priority=21) 	
	public void verifyMicrophoneObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconMicrophone_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("Microphone icon Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	
	@Test(priority=22) 	
	public void verifyFormulaObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconFormula_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("Formula icon Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}

	@Test(priority=23) 	
	public void verifyMoreObjectCreationControlBarTest() throws IOException, InterruptedException, Exception {
		
		Assert.assertTrue((doce.iconFormula_ObjectCreationControlBar_DocumentEditor).isDisplayed());
		logger.info("More button Object Creation Control Bar is displayed at the bottom in the Document Editor");
		Thread.sleep(500);
		
	}
	/*
	@Test(priority=24)
	public void verifyDargBodyToIdeaBoard() throws InterruptedException, AWTException{
		das = new Dashboard(driver);
		das.initElement();
		
		pro = new Project(das.getDriver());
		pro.initElement();
		
		doce = new DocumentEditor(pro.getDriver());
		doce.initElement();
		
		//das.link_projects.click();
		
	    //pro.btn_first_Project_open_grid.click();
		
		Thread.sleep(1000);
		
		WebElement element =doce.ObjHandle_Body_DocumentEditor_new;
														
		WebElement target = doce.panelRight;
		//(new Actions(driver)).sendKeys(Keys.ENTER).build().perform();
		//(new Actions(driver)).clickAndHold(target).build().perform();
		//com.moveMouseAndClick(target);
		//Thread.sleep(5000);
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", doce.txt_BlankPlaceHolderEnterTitle_DocumentEditor);
		   
		//com.moveMouseAndClick(doce.txt_BlankPlaceHolderEnterTitle_DocumentEditor);
		//Thread.sleep(3000);
		com.moveMouseAndClick(element);
		Thread.sleep(3000);
		
		rb=new Robot();
		rb.setAutoDelay(15);
		//rb.keyPress(KeyEvent.VK_F11);
		rb.mouseMove(1150,500);
		
		Thread.sleep(5000);
		(new Actions(driver)).dragAndDrop(element,target).build().perform();
		
		//com.dragAndDrop2(element, target);
		//(new Actions(driver)).clickAndHold(element).moveToElement(target).build().perform();
		//com.dragAndDrop(element, target);
		//(new Actions(driver)).dragAndDrop(element, target);
		//(new Actions(driver)).clickAndHold(element).moveToElement(target).release().perform();

		idb = new IdeaBoard(doce.getDriver());
		idb.initElement();
		
		Assert.assertTrue(idb.ideaFirstInIdeaBoard.isDisplayed());
		
	}
	
	@Test(priority=25)
	public void verifyDragBodyElementToDropInsideAnIdea() throws InterruptedException, AWTException{
	
		rb.mouseMove(1102, 402);
		WebElement element2 =doce.ObjHandle_Body_DocumentEditor;
		
		WebElement target = idb.ideaFirstInIdeaBoard;
		//System.out.println("TargetEMEhjasdhask"+ target.getText());
		Thread.sleep(3000);
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", doce.txt_BlankPlaceHolderEnterTitle_DocumentEditor);
		   
		//com.moveMouseAndClick(doce.txt_BlankPlaceHolderEnterTitle_DocumentEditor);
		//Thread.sleep(3000);
		com.moveMouseAndClick(element2);
		Thread.sleep(2000);
		//com.dragAndDrop2(element, target);
		(new Actions(driver)).dragAndDrop(element2,target).build().perform();
		
		com.mouseHoverOnly(idb.btn_newIdea_IdeaBoard);
		Thread.sleep(2000);
		
		//Assert.assertTrue(target.getText().contains(element.getText()));
	
	}
	@Test(priority=26)
	public void verifyDargMultipleParagraphToIdeaBoard() throws InterruptedException, AWTException{

		WebElement element2 =doce.ObjHandle_SubTitle_DocumentEditor;
		
		WebElement target2 = doce.panelRight;
		
		com.moveMouseAndClick(element2);
		Thread.sleep(3000);
		
		rb=new Robot();
		rb.setAutoDelay(15);
		
		rb.mouseMove(1350,450);
		
		Thread.sleep(5000);
		(new Actions(driver)).dragAndDrop(element2,target2).build().perform();

		rb.mouseMove(1450, 450);
		WebElement element3 =doce.ObjHandle_Body_DocumentEditor;
		
		WebElement target3 = idb.ideaFirstInIdeaBoard;
		
		Thread.sleep(3000);
	
		com.moveMouseAndClick(element3);
		Thread.sleep(3000);
		
		(new Actions(driver)).dragAndDrop(element3,target3).build().perform();
		rb.mouseMove(1550, 550);
		
	}
	
	//@Test(priority=27)
	public void verifyDragWholeCardToIdea() throws InterruptedException, AWTException {
		//rb.mouseMove(1356,840);
		
		com.mouseHoverOnly(doce.line_topOfCardSeparator_DocumentEditor);
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		Thread.sleep(500);
		WebElement element =doce.icon_MoveCard_controlBarSeparator_DocumentEditor;
		
		WebElement target = doce.panelRight;
		(new Actions(driver)).clickAndHold(element).build().perform();
		//com.moveMouseAndClick(element);
		Thread.sleep(1000);
		
		//com.mouseHoverOnly(driver.findElement(By.xpath("//div[@class='control-bar-btns']")));

		//com.mouseHoverOnly(driver.findElement(By.xpath("//div[@class='move']")));
	
		//com.moveMouseAndClick(driver.findElement(By.xpath("//div[@class='move']")));
		
		//Thread.sleep(500);
		//com.moveMouseAndClick(doce.icon_MatterCard_controlBarSeparator_DocumentEditor);
		//Thread.sleep(1000);
		
		
		//element.click();
		
		//com.moveMouseAndClick(element);
		rb=new Robot();
		rb.setAutoDelay(15);
		rb.mouseMove(1356,840);
		
		Thread.sleep(3000);
		//(new Actions(driver)).clickAndHold(element).perform();
		(new Actions(driver)).dragAndDrop(element,target).build().perform();
		Thread.sleep(1000);
	}
	//@Test(priority=27)
	public void verifyDragWholeCardToIdea1() throws InterruptedException {
		//rb.mouseMove(1356,840);
		
		com.mouseHoverOnly(driver.findElement(By.cssSelector(".doc-editor__card:nth-child(2) > .card-separator")));

		com.mouseHoverOnly(driver.findElement(By.cssSelector(".doc-editor__card:nth-child(2) .icon-move")));
	
		com.moveMouseAndClick(driver.findElement(By.cssSelector(".doc-editor__card:nth-child(2) .icon-move")));
		
		//Thread.sleep(500);
		//com.moveMouseAndClick(doce.icon_MatterCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(1000);
		
		
		
		WebElement element =driver.findElement(By.cssSelector(".doc-editor__card:nth-child(2) #Line_19-2"));
		
		WebElement target = idb.ideaFirstInIdeaBoard;
		//element.click();
		
		//com.moveMouseAndClick(element);
		
		Thread.sleep(1000);
		//(new Actions(driver)).clickAndHold(element).perform();
		(new Actions(driver)).dragAndDrop(element,target).build().perform();
		
	}*/

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Document Editor page Test");
		Browser.close();
	}
	
}


