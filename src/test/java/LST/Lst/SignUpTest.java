package LST.Lst;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import LST.core.TestBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import pageObjects.Browser;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SignUP;
import resources.CommonTask;

public class SignUpTest extends TestBase{

public static Logger logger = LogManager.getLogger(TestBase.class.getName());
private LandingPage landing;	
private SignUP signup;
<<<<<<< HEAD

private CommonTestForAllPages common;
=======
private CommonTask common;
>>>>>>> 1c19a31394062f1774075c77c971b570878f9d7c
	
@BeforeClass
	
	public void openBrowser() throws IOException, InterruptedException {
	driver = Browser.getInstance();
	driver.get(baseUrl);
	
	}
<<<<<<< HEAD
	
	
	  @Test(priority=1) public void verifyHeadNavForAllPages() { 
		  signup = new SignUP(driver); 
		  signup.initElement(); 
		  common = new CommonTestForAllPages();
	  common.verifyNavBarHeaderContent(driver);
	  
	  }
	  
	  @Test(priority=2)
	  public void checkSignupAttributes() throws InterruptedException {
	 	// basePageNavigation();
	 	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	 	 common = new CommonTestForAllPages();
	 	 landing= new LandingPage(driver);
	 	 landing.initElement();
	 	 signup = new SignUP(landing.getDriver());
	 	 signup.initElement();
	 	 
	 	 landing.txt_signup.click();
	 	 
	 	 SignUP log =new SignUP(signup.getDriver());
	 	 log.initElement();
	 	 
	 	 AssertJUnit.assertTrue(log.btn_Facebook.isDisplayed());
	 	 logger.info("Sign up with Facebook button is displayed.");
	 	 AssertJUnit.assertTrue(log.btn_Google.isDisplayed());
	 	 logger.info("Sign up with Google button is displayed.");
	 	 AssertJUnit.assertTrue(log.btn_TermsPolicy.isDisplayed());
	 	 logger.info("Terms and Policy button is displayed.");
	 	 AssertJUnit.assertTrue(log.btn_WriteWaySignUP.isDisplayed());
	 	 logger.info("I want to receive updates about WriteWay button is displayed.");
	 	 
	  }
	  
	  
	  @Test(priority=3) public void checkSignupA() throws InterruptedException { 
		  //basePageNavigation(); 
	  driver.manage().timeouts().implicitlyWait(50,
	  TimeUnit.SECONDS); common = new CommonTestForAllPages(); landing= new
	  LandingPage(driver); landing.initElement(); signup = new
	  SignUP(landing.getDriver()); signup.initElement();
	  
	  landing.txt_signup.click();
	  
	  signup.verifyPageUrl();
	  System.out.println("Random Number: "+common.randomNumber());
	  signup.txt_userName.click();
	  signup.txt_userName.sendKeys("test"+common.randomNumber()+"@yopmail.com");
	  
	  signup.txt_password.click();
	  
	  signup.txt_password.sendKeys("asdF1234");
	  
	  signup.txt_confirmPassword.click();
	  signup.txt_confirmPassword.sendKeys("asdF1234");
	  signup.radio_termsandCond.click(); signup.radio_updates.click();
	  signup.btn_signUp.click(); signup.txt_capcha.click();
	  signup.txt_capcha.sendKeys("ssssfdg"); Thread.sleep(200);
	  signup.btn_capcha.click(); Thread.sleep(20000);
	  //driver.findElement(By.cssSelector(".content-canvas__container")).click();
	  
	  
	  System.out.println("+++++++++++++++++++++++IN Signup+++++++++++++++++");
	  
	  }
=======
 
	
 @Test(priority=1)
 public void checkSignupA() throws InterruptedException {
	
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	 common = new CommonTask();
	 
	 landing= new LandingPage(driver);
	 landing.initElement();
	 
	 signup = new SignUP(landing.getDriver());
	 signup.initElement();
	 
	 landing.txt_signup.click();
		 
	
	 System.out.println("Random Number: "+common.randomNumber());
	 signup.txt_userName.click();
	 signup.txt_userName.sendKeys("test"+common.randomNumber()+"@yopmail.com");
	    
	 signup.txt_password.click();
	    
	 signup.txt_password.sendKeys("asdF1234");
	   	
	 signup.txt_confirmPassword.click();
	 signup.txt_confirmPassword.sendKeys("asdF1234");
	 signup.radio_termsandCond.click();
	 signup.radio_updates.click();
	 signup.btn_signUp.click();
	 signup.txt_capcha.click();
	 signup.txt_capcha.sendKeys("ssssfdg");
	    Thread.sleep(200); 
	    signup.btn_capcha.click();
	    Thread.sleep(20000); 
	    //driver.findElement(By.cssSelector(".content-canvas__container")).click();
	 
>>>>>>> 1c19a31394062f1774075c77c971b570878f9d7c
	 
 
@AfterClass
public  void closeBrowser() {
	System.out.println("Closing Signup page Test");
    Browser.close();
}

}
