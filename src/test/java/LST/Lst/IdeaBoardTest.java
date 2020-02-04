package LST.Lst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.IdeaBoard;
import pageObjects.Project;
import resources.Browser;
import resources.CommonTask;
import resources.UploadFile;

public class IdeaBoardTest extends TestBase {

	public static Logger logger = LogManager.getLogger(TestBase.class.getName());

	private LoginTest log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
	private IdeaBoard idb;
	private CommonTask com = new CommonTask(driver);
	

	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {

		driver = Browser.getInstance();
		driver.get(baseUrl);

		log = new LoginTest();
		log.doSignin("niti@yopmail.com", "asdF1234");
		;

		Thread.sleep(1000);

	}

	@Test(priority = 1)
	public void createNewIdeaWithParagraphAndImageAndScrolling() throws IOException, InterruptedException, Exception {

		// das = new Dashboard(driver);
		das.initElement();

		das.btn_newProject.click();

		pro = new Project(das.getDriver());
		pro.initElement();

		String projectName = "Project_With_Idea_New";

		pro.nav_startTypingProjectName.sendKeys(projectName);
		Thread.sleep(1000);

		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("This is test project with idea");

		pro.btn_startProject.click();
		Thread.sleep(100);

		logger.info("This is inside in IdeaBoard Page =====> Creating new idea on the Idea Board");
		idb = new IdeaBoard(pro.getDriver());
		idb.initElement();

		idb.btn_newIdea_IdeaBoard.click();
		Thread.sleep(800);
	
		com.moveMouseAndClick(idb.nav_startTyping_Canvas);
		idb.nav_startTyping_Canvas.sendKeys(System.getProperty("paragraph") + " \n " + System.getProperty("paragraph2")
				+ " \n " + System.getProperty("paragraph3") + " \n " + System.getProperty("paragraph4") + " \n "
				+ System.getProperty("paragraph5"));

		Thread.sleep(2000);
		com.mouseHoverOnly(idb.objectCreationControlBar_container_Canvas);

		/*
		 * File file = new File("Images/project_image.jpeg"); String path =
		 * file.getAbsolutePath(); idb.iconCamera_Canvas.sendKeys(path);
		 * 
		 * idb.nav_imageTitle_imageEditor.
		 * sendKeys("Add Image testing with paragraph in chrome browser");
		 * idb.nav_imageCaption_imageEditor.
		 * sendKeys("Image added with paragraph on dated 121119");
		 * idb.nav_imageAttribution_imageEditor.sendKeys("tested"); Thread.sleep(2000);
		 * 
		 * idb.btn_imageSaveClose_imageEditor.click(); Thread.sleep(2000);
		 */
		idb.btn_canvasSaveClose_Canvas.click();
		Thread.sleep(200);
		das.link_projects.click();
		Thread.sleep(500);
		com.moveMouseAndClick(pro.btn_first_Project_open_grid);
		Thread.sleep(2000);
		//Checking the first idea with paragraph is showing 
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'idea-content')]")).isDisplayed());

	}

	@Test(priority = 2)
	public void createNewIdeaWithImageObject() throws IOException, InterruptedException, Exception {
		// idb = new Ideaboard(pro.getDriver());
		// idb.initElement();
		idb.btn_newIdea_IdeaBoard.click();
		Thread.sleep(800);

		// File file = new File("Images/MyImage3.jpeg");
		// String path = file.getAbsolutePath();

		// idb.iconCamera_Canvas_File_type.sendKeys(path);

		String filepath = "/Users/nitijabin/qa/LivingSKY/LivingSkyAutomation_New/Images/MyImage3.jpeg";
		// String filepath=System.getProperty("user.dir")+"/Images/MyImage3.jpeg";
		idb.iconCamera_Canvas.click();

		UploadFile upfile = new UploadFile();
		upfile.upload(filepath);

		Thread.sleep(1000);

		idb.nav_imageTitle_imageEditor.sendKeys("Add Image ");
		idb.nav_imageCaption_imageEditor.sendKeys("Image Caption added");
		idb.nav_imageAttribution_imageEditor.sendKeys("Image Object attribute");
		 Thread.sleep(1000);
		com.mouseHoverOnly(idb.btn_imageSaveClose_imageEditor);
		idb.btn_imageSaveClose_imageEditor.click();

		Thread.sleep(2000);

		com.moveMouseAndClick(idb.btn_canvasSaveClose_Canvas);
		// Thread.sleep(5000);

		pro = new Project(das.getDriver());

		pro.initElement();
		das.initElement();
		das.link_projects.click();
		driver.navigate().refresh();
		Thread.sleep(1000);
		com.moveMouseAndClick(pro.btn_first_Project_open_grid);
		Thread.sleep(2000);
		
		//Checking the idea object for image element

		Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@class,'project-image')]")).isDisplayed());

	}
	@Test(priority = 3)
	public void verifyIdeaWithParagraphAndImage() throws Exception {
		// idb = new Ideaboard(pro.getDriver());
		// idb.initElement();

		idb.btn_newIdea_IdeaBoard.click();
		Thread.sleep(800);

		com.moveMouseAndClick(idb.nav_startTyping_Canvas);
		idb.nav_startTyping_Canvas.sendKeys(System.getProperty("paragraph2"));

		Thread.sleep(2000);
		com.mouseHoverOnly(idb.objectCreationControlBar_container_Canvas);

		Thread.sleep(800);

		String path = "/Users/nitijabin/qa/LivingSKY/LivingSkyAutomation_New/Images/project_image.jpeg";
		// String path=System.getProperty("user.dir")+"/Images/project_image.jpeg";
		idb.iconCamera_Canvas.click();
		Thread.sleep(800);

		UploadFile upfile = new UploadFile();
		if (System.getProperty("os").equals("mac")) {
			driver.switchTo().window(driver.getWindowHandle());

			upfile.setClipboardData(path);
			upfile.uploadFileInMac();
		} else {
			upfile.upload(path);

		}

		Thread.sleep(1000);

		idb.nav_imageTitle_imageEditor.sendKeys("Add Image ");
		idb.nav_imageCaption_imageEditor.sendKeys("Image Caption added");
		idb.nav_imageAttribution_imageEditor.sendKeys("Image Object attribute");
		// Thread.sleep(15000);
		com.mouseHoverOnly(idb.btn_imageSaveClose_imageEditor);
		
		idb.btn_imageSaveClose_imageEditor.click();
		
		Thread.sleep(1000);
	
	}
	
	@Test(priority = 4)
	
	public void verifyDragAndDropInsideCanvas() throws Exception {

		Thread.sleep(2000);
		WebElement element = idb.dotSecondParagraphInCanvas;
		WebElement target1 = idb.dotFirstParagraphInCanvas;

		com.moveMouseAndClick(element);

		Thread.sleep(2000);
		com.dragAndDrop(element, target1);

		Thread.sleep(5000);

		Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@class,'project-image')]")).isDisplayed());

		com.moveMouseAndClick(idb.btn_canvasSaveClose_Canvas);
		Thread.sleep(2000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'ideas-wrapper')]//div[contains(@class,'idea-content')]")).isDisplayed());
		

	}

	@Test(priority = 5)
	public void dragIdeaTabToDocumentEditor() throws InterruptedException, AWTException {

		pro = new Project(das.getDriver());

		pro.initElement();
		das.initElement();

		das.link_projects.click();

		Thread.sleep(5000);

		com.moveMouseAndClick(pro.btn_first_Project_open_grid);

		Thread.sleep(2000);
		
		idb = new IdeaBoard(pro.getDriver());
		idb.initElement();
/****
 * 
 * this portion will be open once the drop down have more idea board creation option
 * 
 */
/*		com.mouseHoverOnly(idb.btnPlusInTabInIdeaBoard);
		idb.btnPlusInTabInIdeaBoard.click();
		
		
		idb.dropDownSecondItemSelectionInIdeaBoard.click();
*/
		Thread.sleep(1000);
	
		WebElement element = idb.tabFirstTabInIdeaBoard;
		WebElement target = idb.tabFirstTabInDocEditor;

		com.moveMouseAndClick(element);

		com.dragAndDrop(element, target);
		Thread.sleep(5000);
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'idea-content')]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@class,'project-image')]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'ideas-wrapper')]//div[contains(@class,'idea-content')]")).isDisplayed());
		
	//	com.moveMouseAndClick(driver.findElement(By.xpath("//p[contains(text(),'Untitled Document')]")));
		
		WebElement element1 =driver.findElement(By.id("Left-tab-0"));
		WebElement target1 = driver.findElement(By.id("Left-panel-0"));
		com.moveMouseAndClick(element1);
		
		Thread.sleep(1000);
		//Thread.sleep(30000);
		
		//com.dragAndDrop2(element1, target1);
		
		 //(new Actions(driver)).dragAndDrop(element1, target1).perform();
		//(new Actions(driver)).dragAndDropBy(element1, 1079,195).build().perform();
		
	

				
			/*	       
				        Thread.sleep(5000);
		Point newButton = idb.btn_newIdea_IdeaBoard.getLocation();
		System.out.println("My Location x"+ newButton.x + "My Location y"+ newButton.y);
		com.mouseHoverOnly(idb.btn_newIdea_IdeaBoard);
		
		//(new Actions(driver)).dragAndDropBy(element1, newButton.x,newButton.y).build().perform();
				        //(new Actions(driver)).clickAndHold(element1).moveToElement(target1).release().perform();
//		(new Actions(driver)).moveToElement(target1);
				      (new Actions(driver)).dragAndDropBy(element1, 800, 400).release().build().perform();*/
		
		Point newButton = idb.btn_newIdea_IdeaBoard.getLocation();
		
		/*Robot rb=new Robot();
		rb.setAutoDelay(15);
		//rb.keyPress(KeyEvent.VK_F11);
		rb.mouseMove(1100,400);
		
		Thread.sleep(5000);
		(new Actions(driver)).dragAndDrop(element1,target1).build().perform();*/
		
			//rb.mouseMove(coordinates1.getX(), coordinates1.getY());
		   // rb.mousePress(InputEvent.BUTTON1_MASK);
		   // rb.mouseMove(coordinates2.getX(), coordinates2.getY());
		   // rb.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(3000);
		
		
		com.mouseHoverOnly(idb.btn_newIdea_IdeaBoard);
		
		com.dragAndDrop2(element1, target1);
		
	}
	
	
	@Test(priority = 6)
	public void dragIdeaFromPaneToSplitview() throws InterruptedException {
		
	}
	
	

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Idea Board page Test");
		//Browser.close();
	}

}
