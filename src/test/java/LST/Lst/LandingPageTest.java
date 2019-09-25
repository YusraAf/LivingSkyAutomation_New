package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
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
import resources.FooterNavigation;

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
			
	}
	
	// Test Case ID : WW-46-TC-007 Verify all Landing Page WebElements
	
	@Test(priority = 2)
	public void verifyLandingPageAttributes() throws InterruptedException {
		
		 LandingPage l= new LandingPage(driver);
				 //PageFactory.initElements(driver, LandingPage.class);
		 l.initElement();
		 
		 LandingPage log =new LandingPage(l.getDriver());
				 //PageFactory.initElements(driver, LoginPage.class);
		 log.initElement();
		 
		  AssertJUnit.assertTrue(log.btn_Tryforfree.isDisplayed());
		  logger.info("Try for free button is displayed on the Landing Page.");
		  AssertJUnit.assertTrue(log.btn_LearnMore.isDisplayed());
		  logger.info("Try Learn More button is displayed on the Landing Page.");
		 
		  WebElement element = driver.findElement(By.xpath("//a[@name='Try for free']"));
		  
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("arguments[0].scrollIntoView();", element);
		  
		  AssertJUnit.assertTrue(log.text_Plan.isDisplayed());
		  logger.info("Plan text is displayed on the Landing Page."); Thread.sleep(5000);
		  AssertJUnit.assertTrue(log.text_Write.isDisplayed());
		  logger.info("Write text is displayed on the Landing Page.");
		  AssertJUnit.assertTrue(log.text_Publish.isDisplayed());
		  logger.info("Publish text is displayed on the Landing Page.");
		  
		  // Verify All Images display on landing page  
		  AssertJUnit.assertTrue(log.img_NoLimitions.isDisplayed());
		  logger.info("No Limitions image is displayed in Landing Page.");
		  AssertJUnit.assertTrue(log.img_Cloudbased.isDisplayed());
		  logger.info("Cloud based image is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.img_Mindmaps.isDisplayed());
		  logger.info("Mind maps image is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.img_RefManager.isDisplayed());
		  logger.info("Ref Manager image is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.img_AutoFormat.isDisplayed());
		  logger.info("Auto Format image is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.img_ThemeDesigner.isDisplayed());
		  logger.info("Theme Designer image is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.img_ArtIntelligence.isDisplayed());
		  logger.info("Art Intelligence image is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.img_MultipleDevices.isDisplayed());
		  logger.info("Multiple Devices image is displayed in Landing Page..");
		  
		// Verify All Labels display on landing page
		  
		  AssertJUnit.assertTrue(log.lbl_NoLimitions.isDisplayed());
		  logger.info("No Limitions label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_Cloudbased.isDisplayed());
		  logger.info("Cloud based label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_Mindmaps.isDisplayed());
		  logger.info("Mind maps label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_RefManager.isDisplayed());
		  logger.info("Ref Manager label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_AutoFormat.isDisplayed());
		  logger.info("Auto Format label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_ThemeDesigner.isDisplayed());
		  logger.info("Theme Designer label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_ArtIntelligence.isDisplayed());
		  logger.info("Art Intelligence label is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.lbl_MultipleDevices.isDisplayed());
		  logger.info("Multiple Devices label is displayed in Landing Page..");
		 
		// Verify All Texts display on landing page
		 
		  AssertJUnit.assertTrue(log.text_NoLimitions.isDisplayed());
		  logger.info("No Limitions text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_Cloudbased.isDisplayed());
		  logger.info("Cloud based text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_Mindmaps.isDisplayed());
		  logger.info("Mind maps text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_RefManager.isDisplayed());
		  logger.info("Ref Manager text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_AutoFormat.isDisplayed());
		  logger.info("Auto Format text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_ThemeDesigner.isDisplayed());
		  logger.info("Theme Designer text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_ArtIntelligence.isDisplayed());
		  logger.info("Art Intelligence text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.text_MultipleDevices.isDisplayed());
		  logger.info("Multiple Devices text is displayed in Landing Page..");
		 
	
		  AssertJUnit.assertTrue(log.text_Writing.isDisplayed());
		  logger.info("Writing - the way it should be text is displayed in Landing Page..");
		  AssertJUnit.assertTrue(log.btn_TryLiveDemo.isDisplayed());
		  logger.info("Try Live Demo button is displayed in Landing Page..");
		 	 
	}
	
	// Test Case ID : WW-46-TC-008 Verify all Footer Web Elements of Landing Page
	
	@Test(priority = 3)
	public void verifyFooterLandingPageAttributes() throws InterruptedException {
		
		 LandingPage l= new LandingPage(driver);
				 //PageFactory.initElements(driver, LandingPage.class);
		 l.initElement();
		 
		 FooterNavigation footer =new FooterNavigation(l.getDriver());
		 footer.initElement();
		 
		 AssertJUnit.assertTrue(footer.wwImg_Footer.isDisplayed());
		 logger.info("WW Image is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.getPromo_Footer.isDisplayed());
		 logger.info("Get updates on the latest features and promotions text is displayed on the footer of Landing Page."); 
		 AssertJUnit.assertTrue(footer.enterEmail_Footer.isDisplayed());
		 logger.info("Enter your email address text box is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.subscribe_Footer.isDisplayed());
		 logger.info("Subscribe Button is displayed on the footer of Landing Page.");
		 
		 // Verify all Product Web Elements display on the footer of Landing Page
		 AssertJUnit.assertTrue(footer.product_Footer.isDisplayed());
		 logger.info("Product text is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.overview_Footer.isDisplayed());
		 logger.info("Overview link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.pricing_Footer.isDisplayed());
		 logger.info("Pricing link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.tryforfree_Footer.isDisplayed());
		 logger.info("Try for free link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.signIn_Footer.isDisplayed());
		 logger.info("Sign In link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.FAQ_Footer.isDisplayed());
		 logger.info("FAQ link is displayed on the footer of Landing Page.");
		 
		 // Verify all Partnership Web Elements display on the footer of Landing Page
		 AssertJUnit.assertTrue(footer.partnership_Footer.isDisplayed());
		 logger.info("Partnership Text is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.Initiatives_Footer.isDisplayed());
		 logger.info("Initiatives link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.business_Footer.isDisplayed());
		 logger.info("Business link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.education_Footer.isDisplayed());
		 logger.info("Education link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.research_Footer.isDisplayed());
		 logger.info("Research link is displayed on the footer of Landing Page.");
		 
		 // Verify all Company Web Elements display on the footer of Landing Page
		 AssertJUnit.assertTrue(footer.company_Footer.isDisplayed());
		 logger.info("Company Text is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.ourStory_Footer.isDisplayed());
		 logger.info("Our Story link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.careers_Footer.isDisplayed());
		 logger.info("Careers link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.news_Footer.isDisplayed());
		 logger.info("News link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.contactUs_Footer.isDisplayed());
		 logger.info("ContactUs link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.livingSkyTech_Footer.isDisplayed());
		 logger.info("Living Sky Tech link is displayed on the footer of Landing Page.");
		 
		 // Verify all Privacy Web Elements display on the footer of Landing Page
		 AssertJUnit.assertTrue(footer.privacy_Footer.isDisplayed());
		 logger.info("Privacy Text is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.accessibility_Footer.isDisplayed());
		 logger.info("Accessibility link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.terms_Footer.isDisplayed());
		 logger.info("Terms link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.facebookImg_Footer.isDisplayed());
		 logger.info("Facebook Image Link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.linkedInImg_Footer.isDisplayed());
		 logger.info("LinkedIn Image link is displayed on the footer of Landing Page.");
		 AssertJUnit.assertTrue(footer.youtubeImg_Footer.isDisplayed());
		 logger.info("you Tube Image link is displayed on the footer of Landing Page.");	 
	
} 
@Test(priority=4)
	public void clickOnLogin() throws InterruptedException {
		 
		//Need to add initlement for page factory
		landing = new LandingPage(driver);
		landing.initElement();
		landing.txt_login.click(); 
		logger.info("Click on Login page.");
		 Thread.sleep(500);
		 login= new LoginPage(landing.driver);
		 
		 System.out.println(login.verifyPageUrl());
		 Thread.sleep(500);
		 
	}
	
	@AfterClass
	public  void closeBrowser() {
	System.out.println("Closing Landing page Test");
	Browser.close();
	}
	
	}
