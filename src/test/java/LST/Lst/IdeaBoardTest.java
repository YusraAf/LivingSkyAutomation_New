package LST.Lst;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.Ideaboard;
import pageObjects.Project;
import resources.Browser;
import resources.CommonTask;
import resources.UploadFile;

public class IdeaBoardTest extends TestBase {

	public static Logger logger = LogManager.getLogger(TestBase.class.getName());

	private LoginTest log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
	private Ideaboard idb;
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
		idb = new Ideaboard(pro.getDriver());
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
		// Thread.sleep(15000);
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

		Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@class,'project-image')]")).isDisplayed());

	}

	@Test(priority = 3)
	public void dragIdeaFromDocument() throws InterruptedException {

		pro = new Project(das.getDriver());

		pro.initElement();
		das.initElement();

		das.link_projects.click();

		Thread.sleep(4000);

		com.moveMouseAndClick(pro.btn_first_Project_open_grid);

		Thread.sleep(2000);

		com.mouseHoverOnly(idb.btnPlusInTabInIdeaBoard);
		idb.btnPlusInTabInIdeaBoard.click();
		
		
		idb.dropDownSecondItemSelectionInIdeaBoard.click();

		Thread.sleep(1000);
	
		WebElement element = idb.tabSecondTabInIdeaBoard;
		WebElement target = idb.tabFirstTabInDocEditor;

		com.moveMouseAndClick(element);

		com.dragAndDrop(element, target);
		Thread.sleep(5000);

	}

	@Test(priority = 4)
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

	}

	@Test(priority = 5)
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

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Idea Board page Test");
		Browser.close();
	}

}
