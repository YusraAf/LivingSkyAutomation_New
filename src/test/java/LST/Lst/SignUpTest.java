package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;


import LST.core.TestBase;
import dbconnection.DbQuery;
import dbconnection.PostGreConnection;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import pageObjects.Dashboard;

import pageObjects.LandingPage;

import pageObjects.SignUP;
import resources.Browser;
import resources.CommonTask;

public class SignUpTest extends TestBase{

public static Logger logger = LogManager.getLogger(TestBase.class.getName());
private LandingPage landing;	
private SignUP signup;

private CommonTask common;

@BeforeClass
	
	public void openBrowser() throws IOException, InterruptedException {
	
	deleteRegisterData();
	driver = Browser.getInstance();
	driver.get(baseUrl);
	
	}

	  
	  @Test(priority=1)
	  public void checkSignupAttributes() throws InterruptedException {
	 	// basePageNavigation();
	 	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	 	
	 	 landing= new LandingPage(driver);
	 	 landing.initElement();
	 	 signup = new SignUP(landing.getDriver());
	 	 signup.initElement();
	 	 
	 	 landing.txt_signup.click();
	 	 
	 	 AssertJUnit.assertTrue(signup.txt_userName.isDisplayed());
	 	 logger.info("Email text box is displayed in Signup Page.");
	 	 AssertJUnit.assertTrue(signup.txt_password.isDisplayed());
	 	 logger.info("Password text box is displayed in Signup Page.");
	 	 AssertJUnit.assertTrue(signup.txt_confirmPassword.isDisplayed());
	 	 logger.info("Confirm Password text box is displayed in Signup Page.");
	 	 AssertJUnit.assertTrue(signup.btn_Facebook.isDisplayed());
	 	 logger.info("Sign up with Facebook button is displayed in Signup Page.");
	 	 AssertJUnit.assertTrue(signup.btn_Google.isDisplayed());
	 	 logger.info("Sign up with Google button is displayed in Signup Page.");
	 	 AssertJUnit.assertTrue(signup.link_TermsPolicy.isDisplayed());
	 	 logger.info("Terms and Policy button is displayed in Signup Page.");
	 	 AssertJUnit.assertTrue(signup.link_PrivacyPolicy.isDisplayed());
	 	 logger.info("I want to receive updates about WriteWay button is displayed in Signup Page.");
	 	 
	  }
	  
	  
@Test(dataProvider= "getSignInData",priority=2) 

 public void checkSignupA(String username, String password, String cPassword, int testCase) throws InterruptedException {
	
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	 common = new CommonTask();
	 
	 landing= new LandingPage(driver);
	 landing.initElement();
	 
	 signup = new SignUP(landing.getDriver());
	 signup.initElement();
	 
	 landing.txt_signup.click();
		
	 signup.txt_userName.click();
	 signup.txt_userName.sendKeys(username);
	    
	 signup.txt_password.click();
	    
	 signup.txt_password.sendKeys(password);
	   	
	 signup.txt_confirmPassword.click();
	 signup.txt_confirmPassword.sendKeys(cPassword);
	 System.out.println("TestCase: "+ testCase);
	 
	 if (testCase ==2)
	 {
		 boolean actualValue= signup.radio_termsandCond.isSelected();
		 System.out.println("Radio: "+ actualValue);
		 if(actualValue==true) {
			 signup.radio_termsandCond.click();
		 }
	 }else {
	 signup.radio_termsandCond.click();
	 }
	 signup.radio_updates.click();
	 signup.btn_signUp.click();
	 Thread.sleep(200);
	 System.out.println("text: ..........");
	
	 try {
	 	// if(signup.text_ErrorMSg.isDisplayed()) {
		//		 System.out.println("text: ");
		 WebDriverWait wait=new WebDriverWait(driver,5);
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='statusText error-msg']")));	 
	 
	  //}
	 }catch(Exception e) {
		 System.out.println("in side catch: ");
		
		 signup.txt_capcha.click();
		 signup.txt_capcha.sendKeys("ssssfdg");
		 signup.btn_capcha.click();
		
	 }
	 
	 switch(testCase) {
	    case 1: testCase1(); break;
	    case 2: testCase2(); break;
	    case 3: testCase3(); break;
	    case 4: testCase4(); break;
	    case 5: testCase5(); break;
	    case 6: testCase6(); break;
	    case 7: testCase7(); break;
	    }
		  System.out.println("+++++++++++++++++++++++IN Signup+++++++++++++++++");
		  
		  }

	@DataProvider
	  public Object[][] getSignInData(){
		 common = new CommonTask();
		 String user = "test"+common.randomNumber()+"@yopmail.com";
		  
	   Object[][] data= new Object[7][4];
	   data[0][0]= "";
	   data[0][1]= "asdF1234";
	   data[0][2]= "asdF1234";
	   data[0][3]= 1;
	   
	   data[1][0]= user;
	   data[1][1]= "asdF1234";
	   data[1][2]= "asdF1234";
	   data[1][3]= 2;
	   
	   data[2][0]= user;
	   data[2][1]= "asdF";
	   data[2][2]= "asdF";
	   data[2][3]= 3;
	   
	   data[3][0]= user;
	   data[3][1]= "asdF123456";
	   data[3][2]= "asdF1234";
	   data[3][3]= 4;
	   
	   data[4][0]= user;
	   data[4][1]= "";
	   data[4][2]= "asdF1234";
	   data[4][3]= 5;
	   
	   data[5][0]= user;
	   data[5][1]= "asdF1234";
	   data[5][2]= "";
	   data[5][3]= 6;
	   
	   data[6][0]= user;
	   data[6][1]= "asdF1234";
	   data[6][2]= "asdF1234";
	   data[6][3]= 7;
	   
	   return data;
	  }
	  
	
 
	public void testCase1() {
		  AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Email address is required."); 
		  logger.info("Empty email address message is showing successfully.");
		Browser.pageRefresh();
	  }
	

	  public void testCase2() {
	
		  AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "First you need to agree to the terms of use."); 

		  logger.info("First you need to agree to the terms of use message is showing successfully.");
		  Browser.pageRefresh();
	  }
	  
	  public void testCase3() {
			
		  AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Password must be 8 or more characters."); 
		  logger.info("Password must be 8 or more characters message is showing successfully.");
		  Browser.pageRefresh();
		  
	  }
	  
	  public void testCase4() {
			
		  AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Passwords do not match."); 
		  logger.info("Passwords do not match message is showing successfully.");
		  Browser.pageRefresh();
	  }
	  
	  public void testCase5() {
			
		  AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Password is required."); 
		  logger.info("Password is required message is showing successfully.");
		  Browser.pageRefresh();
	  }
	  
	  public void testCase6() {
			
		  AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Confirm password is required."); 
		  logger.info("Confirm password is required message is showing successfully.");
		  Browser.pageRefresh();
	  } 
	  public void testCase7() throws InterruptedException {
		  	signup = new SignUP(driver);
			Dashboard dash = new Dashboard(signup.getDriver());
			dash.initElement();
			dash.verifyPageUrl();
			dash.btn_logout.click();		
	  }
	  public void deleteRegisterData() {
		  
		  PostGreConnection.postGreDbConnectionOpen(); 
		  DbQuery dbq= new  DbQuery(); 
		  String query =  "Delete from public.\"unverifiedUsers\" where email like '%test%'";
		  dbq.deleteData(query); 
		  PostGreConnection.dbClose();
	  }
@AfterClass
public  void closeBrowser() {
	System.out.println("Closing Signup page Test");
    Browser.close();
}

}
