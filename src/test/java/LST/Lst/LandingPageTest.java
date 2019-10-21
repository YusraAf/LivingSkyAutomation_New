package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import LST.core.TestBase;

//import java.awt.List;

//import LST.core.TestBase;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Browser;
import resources.CommonTask;
import resources.FooterNavigation;

public class LandingPageTest extends TestBase {

	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage log = new LandingPage(driver);
	//private LandingPage log = new LandingPage(landing.getDriver());
	private CommonTestForAllPages common;
	private LoginPage login;
	private FooterNavigation footer = new FooterNavigation(log.getDriver());
	private CommonTask com;

	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {
		driver = Browser.getInstance();
		driver.get(baseUrl);
		logger.info("Browser is initialized in landing page.");

	}
	
	@Test(priority = 1)
	public void verifyHeadNavForAllPages() throws InterruptedException {
		// landing = new LandingPage(driver);
		//landing.initElement();
		//LandingPage l = new LandingPage(driver);
		//landing.initElement();

		//LandingPage log = new LandingPage(l.getDriver());
		log.initElement();
		common = new CommonTestForAllPages();
		common.verifyNavBarHeaderContent(driver);
		Thread.sleep(1000);

	}
	// Test Case ID : WW-46-TC-007 Verify all WebElements of Landing Page

		@Test(priority = 2)
		public void verifyTryforfreeBtnLandingPageAttributes() throws InterruptedException {
			
			logger.info("This is inside in Landing Page =====> Verify all Landing Page WebElements");
			//openLandingPage();
			log.initElement();
			AssertJUnit.assertTrue(log.btn_Tryforfree.isDisplayed());
			logger.info("Try for free button is displayed on the Landing Page.");
		}
		@Test(priority = 3)
		public void verifyLearnMoreBtnLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.btn_LearnMore.isDisplayed());
			logger.info("Try Learn More button is displayed on the Landing Page.");
		}
		@Test(priority = 4)
		public void verifyPlanTextLandingPageAttributes() throws InterruptedException {
			
			WebElement element = driver.findElement(By.xpath("//a[@name='Try for free']"));

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView();", element);

			AssertJUnit.assertTrue(log.text_Plan.isDisplayed());
			logger.info("Plan text is displayed on the Landing Page.");
			/*
			AssertJUnit.assertTrue(log.text_Write.isDisplayed());
			logger.info("Write text is displayed on the Landing Page.");
			AssertJUnit.assertTrue(log.text_Publish.isDisplayed());
			logger.info("Publish text is displayed on the Landing Page.");
		*/	
		}
			
		@Test(priority = 5)
		public void verifyWriteTextLandingPageAttributes() throws InterruptedException {
		
			AssertJUnit.assertTrue(log.text_Write.isDisplayed());
			logger.info("Write text is displayed on the Landing Page.");
		}	
		
		@Test(priority = 6)
		public void verifyPublishTextLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.text_Publish.isDisplayed());
			logger.info("Publish text is displayed on the Landing Page.");
		}
		
		// Verify All Images display on landing page
		
		@Test(priority = 7)
		public void verifyNoLimittationsImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_NoLimitions.isDisplayed());
			logger.info("No Limitations image is displayed in Landing Page.");
		}	
		@Test(priority = 8)
		public void verifyCloudBasedImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_Cloudbased.isDisplayed());
			logger.info("Cloud based image is displayed in Landing Page..");
		}
		@Test(priority = 9)
		public void verifyMindMapsImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_Mindmaps.isDisplayed());
			logger.info("Mind maps image is displayed in Landing Page..");
		}
		@Test(priority = 10)
		public void verifyRefManagerImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_RefManager.isDisplayed());
			logger.info("Reference Manager image is displayed in Landing Page..");
		}
		@Test(priority = 11)
		public void verifyAutoFormatImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_AutoFormat.isDisplayed());
			logger.info("Auto Format image is displayed in Landing Page..");
		}
		
		@Test(priority = 12)
		public void verifyThemeDesignerImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_ThemeDesigner.isDisplayed());
			logger.info("Theme Designer image is displayed in Landing Page..");
		}
		@Test(priority = 13)
		public void verifyArtIntelligenceImgLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.img_ArtIntelligence.isDisplayed());
			logger.info("Art Intelligence image is displayed in Landing Page..");
		}
		@Test(priority = 14)
		public void verifyMultipleDevicesImgLandingPageAttributes() throws InterruptedException {
		
			AssertJUnit.assertTrue(log.img_MultipleDevices.isDisplayed());
			logger.info("Multiple Devices image is displayed in Landing Page..");
		}

		// Verify All Labels display on landing page
		
		@Test(priority = 15)
		public void verifyNoLimitationsLabelLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.lbl_NoLimitions.isDisplayed());
			logger.info("No Limitations label is displayed in Landing Page..");
		}
		@Test(priority = 16)
		public void verifyCloudBasedLabelLandingPageAttributes() throws InterruptedException {
		
			AssertJUnit.assertTrue(log.lbl_Cloudbased.isDisplayed());
			logger.info("Cloud based label is displayed in Landing Page..");
		}
		@Test(priority = 17)
		public void verifyMindMapsLabelLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.lbl_Mindmaps.isDisplayed());
			logger.info("Mind maps label is displayed in Landing Page..");
		}
		@Test(priority = 18)
		public void verifyRefManagerLabelLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.lbl_RefManager.isDisplayed());
			logger.info("Reference Manager label is displayed in Landing Page..");
		}
		@Test(priority = 19)
		public void verifyAutoFormatLabelLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(log.lbl_AutoFormat.isDisplayed());
			logger.info("Auto Format label is displayed in Landing Page..");
		}
		@Test(priority = 20)
		public void verifyThemeDesignerLabelLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(log.lbl_ThemeDesigner.isDisplayed());
			logger.info("Theme Designer label is displayed in Landing Page..");
		}
		@Test(priority = 21)
		public void verifyArtIntelligenceLabelLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(log.lbl_ArtIntelligence.isDisplayed());
			logger.info("Art Intelligence label is displayed in Landing Page..");
		}
		@Test(priority = 22)
		public void verifyMultipleDevicesLabelLandingPageAttributes() throws InterruptedException {
		
			AssertJUnit.assertTrue(log.lbl_MultipleDevices.isDisplayed());
			logger.info("Multiple Devices label is displayed in Landing Page..");
		}

		// Verify All Texts display on landing page
		
		@Test(priority = 23)
		public void verifyNoLimitationsTextLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(log.text_NoLimitions.isDisplayed());
			logger.info("No Limitations text is displayed in Landing Page..");
		}
		@Test(priority = 24)
		public void verifyCloudBasedTextLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(log.text_Cloudbased.isDisplayed());
			logger.info("Cloud based text is displayed in Landing Page..");
		}
		@Test(priority = 25)
		public void verifyMindMapsTextLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(log.text_Mindmaps.isDisplayed());
			logger.info("Mind maps text is displayed in Landing Page..");
		}
		@Test(priority = 26)
		public void verifyRefManagerTextLandingPageAttributes() throws InterruptedException {
		
			AssertJUnit.assertTrue(log.text_RefManager.isDisplayed());
			logger.info("Reference Manager text is displayed in Landing Page..");
		}
		@Test(priority = 27)
		public void verifyAutoFormatTextLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(log.text_AutoFormat.isDisplayed());
			logger.info("Auto Format text is displayed in Landing Page..");
		}
		@Test(priority = 28)
		public void verifyThemeDesignerTextLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(log.text_ThemeDesigner.isDisplayed());
			logger.info("Theme Designer text is displayed in Landing Page..");
		}
		@Test(priority = 29)
		public void verifyArtIntelligenceTextLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(log.text_ArtIntelligence.isDisplayed());
			logger.info("Art Intelligence text is displayed in Landing Page..");
		}
		@Test(priority = 30)
		public void verifyMultipleDevicesTextLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(log.text_MultipleDevices.isDisplayed());
			logger.info("Multiple Devices text is displayed in Landing Page..");
		}
		@Test(priority = 31)
		public void verifyWritingTextLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(log.text_Writing.isDisplayed());
			logger.info("Writing - the way it should be text is displayed in Landing Page..");
		}
		@Test(priority = 32)
		public void verifyTryLiveDemoBtnLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(log.btn_TryLiveDemo.isDisplayed());
			logger.info("Try Live Demo button is displayed in Landing Page..");

		}

		// Test Case ID : WW-46-TC-008 Verify all Footer Web Elements of Landing Page

		@Test(priority = 33)
		public void verifywwImgFooterLandingPageAttributes() throws InterruptedException {

			footer.initElement();
			AssertJUnit.assertTrue(footer.img_wwFooter.isDisplayed());
			logger.info("WW Image is displayed on the footer of Landing Page.");
		}
		@Test(priority = 34)
		public void verifygetPromoTextFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.text_getPromoFooter.isDisplayed());
			logger.info("Get updates on the latest features and promotions text is displayed on the footer of Landing Page.");
		}
		@Test(priority = 35)
		public void verifyenterEmailTextBoxFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.textbox_enterEmailFooter.isDisplayed());
			logger.info("Enter your email address text box is displayed on the footer of Landing Page.");
		}
		@Test(priority = 36)
		public void verifySubscribeBtnFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.btn_subscribeFooter.isDisplayed());
			logger.info("Subscribe Button is displayed on the footer of Landing Page.");
		}
		
		// Verify all Product Web Elements display on the footer of Landing Page
		
		@Test(priority = 37)
		public void verifyProductTextFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.text_productFooter.isDisplayed());
			logger.info("Product text is displayed on the footer of Landing Page.");
		}
		@Test(priority = 38)
		public void verifyOverviewLinkFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.link_overviewFooter.isDisplayed());
			logger.info("Overview link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 39)
		public void verifyPricingLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_pricingFooter.isDisplayed());
			logger.info("Pricing link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 40)
		public void verifyTryforfreeLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_tryforfreeFooter.isDisplayed());
			logger.info("Try for free link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 41)
		public void verifySignInLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_signInFooter.isDisplayed());
			logger.info("Sign In link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 42)
		public void verifyFAQLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_FaqFooter.isDisplayed());
			logger.info("FAQ link is displayed on the footer of Landing Page.");
		}
		
		// Verify all Partnership Web Elements display on the footer of Landing Page
		@Test(priority = 43)
		public void verifyPartnershipTextFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.text_partnershipFooter.isDisplayed());
			logger.info("Partnership Text is displayed on the footer of Landing Page.");
		}
		@Test(priority = 44)
		public void verifyInitiativesLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_initiativesFooter.isDisplayed());
			logger.info("Initiatives link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 45)
		public void verifyBusinessLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_businessFooter.isDisplayed());
			logger.info("Business link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 46)
		public void verifyEducationLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_educationFooter.isDisplayed());
			logger.info("Education link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 47)
		public void verifyResearchLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_researchFooter.isDisplayed());
			logger.info("Research link is displayed on the footer of Landing Page.");
		}
		
		// Verify all Company Web Elements display on the footer of Landing Page
		
		@Test(priority = 48)
		public void verifyCompanyTextFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.text_companyFooter.isDisplayed());
			logger.info("Company Text is displayed on the footer of Landing Page.");
		}
		@Test(priority = 49)
		public void verifyOurStoryLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_ourStoryFooter.isDisplayed());
			logger.info("Our Story link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 50)
		public void verifyCareersLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_careersFooter.isDisplayed());
			logger.info("Careers link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 51)
		public void verifyNewsLinkFooterLandingPageAttributes() throws InterruptedException {
	
			AssertJUnit.assertTrue(footer.link_newsFooter.isDisplayed());
			logger.info("News link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 52)
		public void verifyContactUsLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_contactUsFooter.isDisplayed());
			logger.info("ContactUs link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 53)
		public void verifyLivingSkyTechLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_livingSkyTechFooter.isDisplayed());
			logger.info("Living Sky Tech link is displayed on the footer of Landing Page.");
		}

		// Verify all Privacy Web Elements display on the footer of Landing Page
		
		@Test(priority = 54)
		public void verifyPrivacyTextFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_privacyFooter.isDisplayed());
			logger.info("Privacy Text is displayed on the footer of Landing Page.");
		}
		@Test(priority = 55)
		public void verifyAccessibilityLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_accessibilityFooter.isDisplayed());
			logger.info("Accessibility link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 56)
		public void verifyTermsLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_termsFooter.isDisplayed());
			logger.info("Terms link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 57)
		public void verifyFacebookImageLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_facebookImgFooter.isDisplayed());
			logger.info("Facebook Image Link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 58)
		public void verifyLinkedInImageLinkFooterLandingPageAttributes() throws InterruptedException {
			
			AssertJUnit.assertTrue(footer.link_linkedInImgFooter.isDisplayed());
			logger.info("LinkedIn Image link is displayed on the footer of Landing Page.");
		}
		@Test(priority = 59)
		public void verifyYouTubeImageLinkFooterLandingPageAttributes() throws InterruptedException {

			AssertJUnit.assertTrue(footer.link_youTubeImgFooter.isDisplayed());
			logger.info("youTube Image link is displayed on the footer of Landing Page.");

		}
	
	// Test Case ID : WW-46-TC-009 Verify Our Story Link on the Footer of Landing Page
	@Test(priority = 60)
	public void verifyOurStoryFooterLink() throws InterruptedException {
		 //LandingPage l = new LandingPage(driver);
		 // PageFactory.initElements(driver,LandingPage.class);
		// log.initElement();
		
		// FooterNavigation footer = new FooterNavigation(l.getDriver());
		// footer.initElement();		
		
		 verifyAllFooterLink(footer.link_ourStoryFooter, "about");	
	     logger.info("Our Story Link is clicked and About Living Sky Tech page is displayed successfully.");
		}
	
	/*	
	// Test Case ID : WW-46-TC-010 Verify Careers Link on the Footer of Landing Page
	@Test(priority = 8)
	public void verifyCareersFooterlink() throws InterruptedException {
		LandingPage l = new LandingPage(driver);
		l.initElement();
		FooterNavigation footer = new FooterNavigation(l.getDriver());
		footer.initElement();
		
		footer.link_careersFooter.click();
		String parentWindow = driver.getWindowHandle(); 
			 
		for (String childWindow : driver.getWindowHandles()) {
			driver.switchTo().window(childWindow);
			}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	  
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.livingskytech.com/careers/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(500);
		driver.close();
		driver.switchTo().window(parentWindow);
		logger.info("Careers Link is Clicked and Careers page is displayed successfully.");
		}
			
	// Test Case ID : WW-46-TC-011 Verify Contact Us Link on the Footer of Landing Page
	@Test(priority = 9)
	public void verifyContactUsFooterlink() throws InterruptedException {
		LandingPage l = new LandingPage(driver);
		l.initElement();
		FooterNavigation footer = new FooterNavigation(l.getDriver());
		footer.initElement();
		
		footer.link_contactUsFooter.click();
		String parentWindow = driver.getWindowHandle(); 
			 
		for (String childWindow : driver.getWindowHandles()) {
			 driver.switchTo().window(childWindow);
			}
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://www.livingskytech.com/contact/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
		driver.switchTo().window(parentWindow);
		logger.info("ContactUs Link is Clicked and ContactUs page is displayed successfully.");	
	} 
	*/
	
	// Test Case ID : WW-46-TC-012 Verify Facebook Img Link on the Footer of Landing Page
	@Test(priority = 61)
	public void verifyFacebookImgFooterlink() throws InterruptedException {
		// LandingPage l = new LandingPage(driver);
		 // PageFactory.initElements(driver,LandingPage.class);
		// l.initElement();
		
		// FooterNavigation footer = new FooterNavigation(l.getDriver());
		// footer.initElement();
		 verifyAllFooterLink(footer.link_facebookImgFooter, "livingskytech");
	     logger.info("FacebookImg Link is Clicked and FacebookImg page is displayed successfully.");
		}
	
	
	// Test Case ID : WW-46-TC-013 Verify LinkedIn Img Link on the Footer of Landing Page
	@Test(priority = 62)
	public void verifyLinkedInImgFooterlink() throws InterruptedException {
		// LandingPage l = new LandingPage(driver);
		 // PageFactory.initElements(driver,LandingPage.class);
		// l.initElement();
		
		// FooterNavigation footer = new FooterNavigation(l.getDriver());
		 footer.initElement();
		 verifyAllFooterLink(footer.link_linkedInImgFooter, "company");
	     logger.info("LinkedInImg Link is Clicked and LinkedInImg page is displayed successfully.");
		 }
	
	
	// Test Case ID : WW-46-TC-014 Verify Youtube Img Link on the Footer of Landing
	@Test(priority = 63)
	public void verifyYouTubeImgFooterlink() throws InterruptedException {
		// LandingPage l = new LandingPage(driver);
		 // PageFactory.initElements(driver,LandingPage.class);
		// l.initElement();
		
		// FooterNavigation footer = new FooterNavigation(l.getDriver());
		 footer.initElement();
		 verifyAllFooterLink(footer.link_youTubeImgFooter, "livingskytech");
	     logger.info("youTubeImg Link is Clicked and youTubeImg page is displayed successfully.");
		 }

	// Test Case ID : WW-46-TC-010 Verify Careers Link on the Footer of Landing Page
	@Test(priority = 64)
	public void verifyCareersFooterlink() throws InterruptedException {
	//	LandingPage l = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// PageFactory.initElements(driver,LandingPage.class);
	//	l.initElement();
				
	//	FooterNavigation footer = new FooterNavigation(l.getDriver());
		footer.initElement();
		
		verifyAllFooterLink(footer.link_careersFooter, "https://www.livingskytech.com/careers/");
		logger.info("Careers Link is Clicked and Careers page is displayed successfully.");
	}
	
	// Test Case ID : WW-46-TC-011 Verify Contact Us Link on the Footer of Landing Page
	@Test(priority = 65)
	public void verifyContactUsFooterlink() throws InterruptedException {
	//	LandingPage l = new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// PageFactory.initElements(driver,LandingPage.class);
	//	l.initElement();
			
	//	FooterNavigation footer = new FooterNavigation(l.getDriver());
		footer.initElement();
		
		verifyAllFooterLink(footer.link_contactUsFooter, "https://www.livingskytech.com/contact/");
		logger.info("ContactUs Link is Clicked and ContactUs page is displayed successfully.");
		}
	
	// Test Case ID : WW-46-TC-015 Verify Privacy Link on the Footer of Landing Page
	@Test(priority = 66)
	public void privacyFooterlink() throws InterruptedException {
	//	LandingPage l = new LandingPage(driver);
		// PageFactory.initElements(driver,LandingPage.class);
	//	l.initElement();
				
	//	FooterNavigation footer = new FooterNavigation(l.getDriver());
		footer.initElement();
		footer.link_privacyFooter.click();
		Thread.sleep(200);
		//AssertJUnit.assertEquals(driver.getTitle(), "Write Way"); 
		AssertJUnit.assertEquals(driver.getCurrentUrl(), "https://frontend-test.writeway.com/privacy-policy");
		logger.info("Privacy Link is Clicked and Privacy page is displayed successfully.");
		}
			
			
	// Test Case ID : WW-46-TC-
	@Test(priority = 67)
	public void clickOnLogin() throws InterruptedException {

		// Need to add initElement for page factory
		//log = new LandingPage(driver);
		//landing.initElement();
		log.txt_login.click();
		logger.info("Click on Login page.");
		Thread.sleep(500);
		login = new LoginPage(log.driver);

		System.out.println(login.verifyPageUrl());
		Thread.sleep(500);		
		}

	public void verifyAllFooterLink(WebElement footerLinkName, String urlLink) throws InterruptedException  
	{
		 com= new CommonTask(driver);
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 String parentWindow = driver.getWindowHandle(); 
		 Thread.sleep(200);
		
		 List<Object> childWindowList = (List<Object>) com.childWindowHandler(footerLinkName,urlLink, parentWindow); 
	 	
	
	     boolean actualUrl = (boolean) childWindowList.get(1);
	    
	     AssertJUnit.assertEquals(actualUrl, true);
	    
	     com.backToParentWinFromChildWin(parentWindow);
	     Thread.sleep(200);	  
	
		}

	@AfterClass
	public void closeBrowser() {
		logger.info("Closing of Landing Page Test");
		System.out.println("Closing Landing page Test");
		Browser.close();
		}

}
