package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LST.core.TestBase;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SignUP;
import resources.Browser;
import resources.CommonTask;
import resources.HeaderNavigation;

public class CommonTestForAllPages extends TestBase  {
	
	private HeaderNavigation headNav;
	private LandingPage landing;	
	private SignUP signup;
	private LoginPage log;

	public static Logger logger = LogManager.getLogger(TestBase.class.getName());

	//Verify the Navigation page
	public void verifyNavBarHeaderContent(WebDriver driver) {
		
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
		headNav = new HeaderNavigation(driver);
		headNav.initElement();
		WebElement path = headNav.navBar_HeaderContent1;
		CommonTask ct = new CommonTask();
		List<WebElement> navBarContent1 = ct.getLiElementInUl(path);
		
		 AssertJUnit.assertEquals(navBarContent1.get(0).getText(), "Features");
		 logger.info("Features link is available in header.");
		 AssertJUnit.assertEquals(navBarContent1.get(1).getText(), "Pricing");
		 logger.info("Pricing link is available in header.");

		 WebElement path1 = headNav.navBar_HeaderContent2;
		 List<WebElement> navBarContent2 = ct.getLiElementInUl(path1);
			
		 AssertJUnit.assertEquals(navBarContent2.get(0).getText(), "Sign In");
		 logger.info("Sign In link is available in header.");
		 AssertJUnit.assertEquals(navBarContent2.get(1).getText(), "Try it for free");
		 logger.info("Try it for free link is available in header.");
			
		 
	}
@BeforeClass
	
	public void openBrowser() throws IOException, InterruptedException {
	driver = Browser.getInstance();
	driver.get(baseUrl);
	
	}
@Test
	public void verifyHeadNavAndPageLoadForSignUpPages() {
		
		landing= new LandingPage(driver);
		 landing.initElement();
		 landing.txt_signup.click();
		 
		 signup = new SignUP(landing.getDriver());
		 signup.initElement();
		
		 signup.verifyPageUrl();
		 logger.info("Signup Page URL is verified."); 
		 verifyNavBarHeaderContent(driver);
		
	}
@Test
public void verifyHeadNavAndPageLoadForLoginPages() {
		
		landing= new LandingPage(driver);
		landing.initElement();
		landing.txt_login.click();
		
		log = new LoginPage(landing.getDriver());
		log.initElement();
		log.verifyPageUrl();
		
		logger.info("Login Page URL is verified."); 
		verifyNavBarHeaderContent(driver);
		
	}

@AfterClass
public  void closeBrowser() {
	System.out.println("Closing common  Test");
    Browser.close();
}

}
 