package LST.Lst;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.DocumentEditor;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Project;
import resources.Browser;
import resources.CommonTask;

public class DocumentEditorTest extends TestBase {
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());

	private LoginTest log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
	private DocumentEditor doce;
	private CommonTask com  = new CommonTask(driver);
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		
		driver = Browser.getInstance();
		driver.get(baseUrl);
		
		log =new LoginTest();
		log.doSignin("test8@gmail.com", "asdF1234");;
		
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
		
		
		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("This is test project with document");
		
		pro.btn_startProject.click();
		Thread.sleep(100);
		
		logger.info("This is inside in Document Editor Page =====> Creating document on the Document Editor");
		doce = new DocumentEditor(pro.getDriver());
		doce.initElement();
			
		System.out.println("Document Name is ----> " + doce.tab_documentName_DocumentEditor.getText());
		//WebDriverWait wait = new WebDriverWait(driver, 50);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")));
		
		WebElement title = doce.nav_FirstTitle_DocumentEditor;
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", ele);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//com.moveMouseAndClick(ele);
		//Thread.sleep(3000);
			
		Actions action = new Actions(driver);
			
		action.click(title).sendKeys("Living Sky Technologies").perform();
		Thread.sleep(1000);
			
		Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]")).isDisplayed());
		logger.info("Object Handle for Title is displayed in the Document Editor");
		//System.out.println("Verifing Object Handle for Title in the Document Editor");
			
		System.out.println("Area Name is ---->  " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).getText());
		Assert.assertTrue((doce.lbl_Title_DocumentEditor).isDisplayed());
		logger.info("Label for Title card area is displayed in the Document Editor");
	}
	@Test(priority=2) 	
	public void verifyAndCreateCardSubTitleAreaInDocumentEditorTest() throws IOException, InterruptedException, Exception {
		
		Actions action = new Actions(driver);	
		com.moveMouseAndClick(doce.plusIcon_DocumentEditor);

		WebElement subtitle = doce.nav_subTitle_DocumentEditor;
			
		action.click(subtitle).sendKeys("Vision").perform();
		Thread.sleep(1000);
			
		Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]")).isDisplayed());
		logger.info("Object Handle for SubTitle is displayed in the Document Editor");
		//System.out.println("Verifing Object Handle for SubTitle in the Document Editor");
			
		System.out.println("Area Name is ---->  " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[1]/span[1]")).getText());
		Assert.assertTrue((doce.lbl_SubTitle_DocumentEditor).isDisplayed());
		logger.info("Label for SubTitle card area is displayed in the Document Editor");
	}
	
	@Test(priority=3) 	
	public void verifyAndCreateCardBodyAreaInDocumentEditorTest() throws IOException, InterruptedException, Exception {
		
		Actions action = new Actions(driver);	
		com.moveMouseAndClick(doce.plusIcon_DocumentEditor);
			
		WebElement body = doce.nav_body_DocumentEditor;
			
		action.click(body).sendKeys("Our vision is to provide a suite of products and services that are indispensable to content creators across all disciplines.").perform();
		Thread.sleep(1000);
			
		Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")).isDisplayed());
		logger.info("Object Handle for Body is displayed in the Document Editor");
		//System.out.println("Verifing Object Handle for Body in the Document Editor");
			
		System.out.println("Area Name is ---->  " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[4]/div[1]/div[1]/span[1]")).getText());
		Assert.assertTrue((doce.lbl_Body_DocumentEditor).isDisplayed());
		logger.info("Label for Body card area is displayed in the Document Editor");
		Thread.sleep(500);
			
		//das.link_projects.click();
		//Thread.sleep(500);
		//com.moveMouseAndClick(pro.btn_first_Project_open_grid);
		//Thread.sleep(1000);
		//action.click(title).build().perform();
		//Thread.sleep(1000);
		//System.out.println("Area Name is ---->  " + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).getText());
		//Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/span[1]")).isDisplayed());
			
	}

	@Test(priority=4) 	
	public void verifyEnterKeyFromKeyboardWithCardAreaInDocument() throws IOException, InterruptedException, Exception {
			
		Actions action = new Actions(driver);
				
		com.moveMouseAndClick(doce.mousehover_SecondCard_DocumentEditor);
		WebElement secondTitle = doce.nav_SecondTitle_DocumentEditor;
				
		action.click(secondTitle).sendKeys("Living Sky Technologies" + Keys.ENTER).perform();
		Thread.sleep(1000);
				
		//WebElement body = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]"));
		WebElement body = doce.nav_SecondBody_DocumentEditor;
		action.click(body).sendKeys("Empowering creators everywhere. What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched." + Keys.ENTER).perform();
		Thread.sleep(1000);	
		
		//com.moveMouseAndClick(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[2]/div[3]/div[1]/div[2]")));	
		//com.moveMouseAndClick(doce.plusIcon_DocumentEditor);

		WebElement addSubtitleAfterBody = doce.nav_AddSubTitleAfterBody_DocumentEditor;
			
		action.click(addSubtitleAfterBody).sendKeys("About Living Sky Technologies").perform();
		Thread.sleep(1000);
			
	}

	@Test(priority=5) 	
	public void verifyControlBarSeparatorTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(doce.line_topOfCardSeparator_DocumentEditor);
		Assert.assertTrue((doce.line_topOfCardSeparator_DocumentEditor).isDisplayed());
		logger.info("Top of the Card Separator Line is displayed in the Document Editor");
		
		//WebElement controlBarSeparator = doce.controlBarSeparator_DocumentEditor;
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		//action2.moveToElement(controlBarSeparator).build().perform();
		Thread.sleep(500);
			
		Assert.assertTrue((doce.controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Control Bar Separator is displayed in the Document Editor");
		}
	
	@Test(priority=6) 	
	public void verifyIconMatterCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		//Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")).isDisplayed());
		Assert.assertTrue((doce.icon_MatterCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Matter card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=7) 	
	public void verifyIconAddNewCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_AddCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Add new card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=8) 	
	public void verifyIconCopyCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_CopyCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Copy or duplicate card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=9) 	
	public void verifyIconDeleteCardControlBarTest() throws IOException, InterruptedException, Exception {
	
		Assert.assertTrue((doce.icon_DeleteCard_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Delete or remove card icon is displayed inside Control Bar Separator in the Document Editor");
	}
	
	@Test(priority=10) 	
	public void verifyAddNewCardControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.moveMouseAndClick(doce.icon_AddCard_controlBarSeparator_DocumentEditor);
		WebElement title5 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]"));
		
		Actions action2 = new Actions(driver);
			
		action2.click(title5).sendKeys("Michael Zhou" + Keys.ENTER + "Founder & Chief Executive Officer").build().perform();
		Thread.sleep(1000);
		
	}
	
	@Test(priority=11) 	
	public void verifyDropDownMenuForMatterCardControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		com.moveMouseAndClick(doce.icon_MatterCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(500);
		Assert.assertTrue((doce.dropDown_MatterMenu_controlBarSeparator_DocumentEditor).isDisplayed());
		logger.info("Drop Down Menu for Matter card is displayed inside Control Bar Separator in the Document Editor");
			
	}

	@Test(priority=12) 	
	public void verifyDeleteCardControlBarTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(doce.controlBarSeparator_DocumentEditor);
		com.moveMouseAndClick(doce.icon_DeleteCard_controlBarSeparator_DocumentEditor);
		Thread.sleep(1000);
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Document Editor page Test");
		Browser.close();
	}
	
}


