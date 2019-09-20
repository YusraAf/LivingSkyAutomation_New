package LST.Lst;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LST.core.TestBase;

//import LST.core.TestBase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import pageObjects.Browser;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class LandingPageTest extends TestBase{

public static Logger logger = LogManager.getLogger(TestBase.class.getName());
private LandingPage landing=new LandingPage(driver);
private CommonTestForAllPages common;
private LoginPage login;

	@BeforeClass 
	
	public void openBrowser() throws IOException, InterruptedException {
		driver = Browser.getInstance();
		driver.get(baseUrl);
		logger.info("Browser is initialized in landing page.");
	
	}

	@Test(priority=1)
	public void verifyHeadNavForAllPages() throws InterruptedException {
	//	landing = new LandingPage(driver);
		landing.initElement();
		common = new CommonTestForAllPages();
		common.verifyNavBarHeaderContent(driver);
		Thread.sleep(1000);
		/*
		 * //JavascriptExecutor js = (JavascriptExecutor) driver;
		 * //js.executeScript("window.scrollBy(0,4000)"); WebElement element
		 * =driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"
		 * ));
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView();",element);
		 * 
		 * //Actions actions = new Actions(driver); //
		 * actions.moveToElement(element).perform();
		 * 
		 * Thread.sleep(2000);
		 */
		
	}
	
	
	@Test(priority = 2)
	
	public void verifyLandingPageAttributes() throws InterruptedException {
		
		 LandingPage l= new LandingPage(driver);
				 //PageFactory.initElements(driver, LandingPage.class);
		 l.initElement();
		 
		 LandingPage log =new LandingPage(l.getDriver());
				 //PageFactory.initElements(driver, LoginPage.class);
		 log.initElement();
		 
		 AssertJUnit.assertTrue(log.btn_Tryforfree.isDisplayed());
		 logger.info("Try for free button is displayed.");
		 AssertJUnit.assertTrue(log.btn_LearnMore.isDisplayed());
		 logger.info("Try Learn More button is displayed.");
		 
		  WebElement element = driver.findElement(By.xpath("//a[@name='Try for free']"));
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("arguments[0].scrollIntoView();", element);
		  
		  AssertJUnit.assertTrue(log.text_Plan.isDisplayed());
		  logger.info("Plan text is displayed."); Thread.sleep(5000);
		  AssertJUnit.assertTrue(log.text_Write.isDisplayed());
		  logger.info("Write text is displayed.");
		  AssertJUnit.assertTrue(log.text_Publish.isDisplayed());
		  logger.info("Publish text is displayed.");
		  
		  // Verify All Images display on landing page  
		  AssertJUnit.assertTrue(log.img_NoLimitions.isDisplayed());
		  logger.info("No Limitions image is displayed.");
		  AssertJUnit.assertTrue(log.img_Cloudbased.isDisplayed());
		  logger.info("Cloud based image is displayed.");
		  AssertJUnit.assertTrue(log.img_Mindmaps.isDisplayed());
		  logger.info("Mind maps image is displayed.");
		  AssertJUnit.assertTrue(log.img_RefManager.isDisplayed());
		  logger.info("Ref Manager image is displayed.");
		  AssertJUnit.assertTrue(log.img_AutoFormat.isDisplayed());
		  logger.info("Auto Format image is displayed.");
		  AssertJUnit.assertTrue(log.img_ThemeDesigner.isDisplayed());
		  logger.info("Theme Designer image is displayed.");
		  AssertJUnit.assertTrue(log.img_ArtIntelligence.isDisplayed());
		  logger.info("Art Intelligence image is displayed.");
		  AssertJUnit.assertTrue(log.img_MultipleDevices.isDisplayed());
		  logger.info("Multiple Devices image is displayed.");
		  
		// Verify All Labels display on landing page
		  
		  AssertJUnit.assertTrue(log.lbl_NoLimitions.isDisplayed());
		  logger.info("No Limitions label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_Cloudbased.isDisplayed());
		  logger.info("Cloud based label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_Mindmaps.isDisplayed());
		  logger.info("Mind maps label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_RefManager.isDisplayed());
		  logger.info("Ref Manager label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_AutoFormat.isDisplayed());
		  logger.info("Auto Format label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_ThemeDesigner.isDisplayed());
		  logger.info("Theme Designer label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_ArtIntelligence.isDisplayed());
		  logger.info("Art Intelligence label is displayed.");
		  AssertJUnit.assertTrue(log.lbl_MultipleDevices.isDisplayed());
		  logger.info("Multiple Devices label is displayed.");
		 
		// Verify All Texts display on landing page
		 
		  AssertJUnit.assertTrue(log.text_NoLimitions.isDisplayed());
		  logger.info("No Limitions text is displayed.");
		  AssertJUnit.assertTrue(log.text_Cloudbased.isDisplayed());
		  logger.info("Cloud based text is displayed.");
		  AssertJUnit.assertTrue(log.text_Mindmaps.isDisplayed());
		  logger.info("Mind maps text is displayed.");
		  AssertJUnit.assertTrue(log.text_RefManager.isDisplayed());
		  logger.info("Ref Manager text is displayed.");
		  AssertJUnit.assertTrue(log.text_AutoFormat.isDisplayed());
		  logger.info("Auto Format text is displayed.");
		  AssertJUnit.assertTrue(log.text_ThemeDesigner.isDisplayed());
		  logger.info("Theme Designer text is displayed.");
		  AssertJUnit.assertTrue(log.text_ArtIntelligence.isDisplayed());
		  logger.info("Art ntelligence text is displayed.");
		  AssertJUnit.assertTrue(log.text_MultipleDevices.isDisplayed());
		  logger.info("Multiple Devices text is displayed.");
		 
		  
		  
		  AssertJUnit.assertTrue(log.text_Writing.isDisplayed());
		  logger.info("Writing - the way it should be text is displayed.");
		  AssertJUnit.assertTrue(log.btn_TryLiveDemo.isDisplayed());
		  logger.info("Try Live Demo button is displayed.");
		 	 
	}
@Test(priority=3)
	public void clickOnLogin() throws InterruptedException {
		 
		//Need to add initlement for page factory
		landing = new LandingPage(driver);
		landing.initElement();
		landing.txt_login.click(); 
		logger.info("Click on Login page.");
		 Thread.sleep(500);
		 login= new LoginPage(landing.driver);
		 login.verifyPageUrl();
		 Thread.sleep(500);
		 
	}
	
	@AfterClass
	public  void closeBrowser() {
	System.out.println("Closing Landing page Test");
	Browser.close();
	}
	
	}
