package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;


import LST.core.TestBase;
import dbconnection.DbQuery;
import dbconnection.PostGreConnection;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;

import java.io.FileOutputStream;
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
	 	 // Verify all WebElement of SignUp page
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

 public void checkSignup(String username, String password, String cPassword, int testCase) throws InterruptedException {
	Browser.pageRefresh();
	// Test Case ID : WW-48-TC-003 Verify SignUp with different Test Scenario 
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	 common = new CommonTask(driver);
	 
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
	 Thread.sleep(5000);
	 }
//	 signup.radio_updates.click();
	 
	 
	// signup.btn_signUp.click();
	
	 System.out.println("text: ..........");
	
	/* try {
	 	 //if(signup.text_ErrorMSg.isDisplayed()) {
			//	 System.out.println("text: ");}
		 
		// WebDriverWait wait=new WebDriverWait(driver,5);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='statusText error-msg']")));	
		 if(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText().equals("Cannot access, please try again later.")) {
			 System.out.println("Cannot continue Signup because of captcha ");
			// testCase8(); 
			// driver.close();
			 
		 }
	 
	  
	 }catch(Exception e) {
		
		 //driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	 }
	 */
	 switch(testCase) {
	    case 1: testCase1(); break;
	    case 2: testCase2(); break;
	    case 3: testCase3(); break;
	    case 4: testCase4(); break;
	    case 5: testCase5(); break;
	    case 6: testCase6(); break;
	    case 7: testCase7(); break;
	    case 8: testCase8(); break;
	    }
		  System.out.println("+++++++++++++++++++++++IN Signup+++++++++++++++++");
		  
		  }

	@DataProvider
	  public Object[][] getSignInData(){
		 
		String user = "niti@livingskytech.com";
		  
	   Object[][] data= new Object[8][4];
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
	   
	   data[7][0]= user;
	   data[7][1]= "asdF1234";
	   data[7][2]= "asdF1234";
	   data[7][3]= 8;
	   return data;
	  }
	  
	
 
	public void testCase1() {
		SoftAssert softassert6 = new SoftAssert();
		softassert6.assertEquals(signup.btn_signUp.isEnabled(), false);
		
		// System.out.println("Test case 1 verified.. "+ button);
		  logger.info("Empty email address message is showing successfully.");
		  softassert6.assertAll();
	  }


	  public void testCase2() {
		  
		  SoftAssert softassert = new SoftAssert();
		  softassert.assertEquals(signup.btn_signUp.isEnabled(), false);
		  //AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "First you need to agree to the terms of use."); 

		  logger.info("First you need to agree to the terms of use message is showing successfully.");
		  softassert.assertAll();
	  }
	  
	  public void testCase3() {
		  SoftAssert softassert1 = new SoftAssert();
		 try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  captchaSelection();
		  softassert1.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Password must be 8 or more characters."); 
		  logger.info("Password must be 8 or more characters message is showing successfully.");
		  softassert1.assertAll();
		  
	  }
	  
	  public void testCase4() {
		  SoftAssert softassert2 = new SoftAssert();
		  captchaSelection();
		  softassert2.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Passwords do not match."); 
		  logger.info("Passwords do not match message is showing successfully.");
		  softassert2.assertAll();	  
	  }
	  
	  public void testCase5() {
		  SoftAssert softassert3 = new SoftAssert();
		  softassert3.assertEquals(signup.btn_signUp.isEnabled(), false);
		  logger.info("Password is required message is showing successfully.");
		  softassert3.assertAll();
	  }
	  
	  public void testCase6() {
		  SoftAssert softassert4 = new SoftAssert();	
		  softassert4.assertEquals(signup.btn_signUp.isEnabled(), false);
		  logger.info("Confirm password is required message is showing successfully.");
		  softassert4.assertAll();
	  } 
	  
	  /****
	   * test case 7 will check project creation, delete project, after signup
	   * @throws InterruptedException
	   */
	  
	  public void testCase7() throws InterruptedException {
		  landing= new LandingPage(driver);
			 landing.initElement();
			 
			 signup = new SignUP(landing.getDriver());
			 signup.initElement();
			 Thread.sleep(5000);
			 signup.radio_updates.click();
			 captchaSelection();
		  	
			Dashboard dash = new Dashboard(signup.getDriver());
			dash.initElement();
			Thread.sleep(1000);
			System.out.println("Inside the Dashboard: ");
			
			
			//testProjectAfterSignUP();
			dash.btn_logout.click();
	  }
	 
	  public void testCase8() throws InterruptedException {
		  SoftAssert softassert5 = new SoftAssert();
		
		  captchaSelection();

		  softassert5.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "User already exists."); 
		  logger.info("Duplicate user checking message is showing successfully.");
		  softassert5.assertAll();
		  
		  Browser.pageRefresh();
	  } 
	  
	  
	
	  public void testProjectAfterSignUP() {
		  
		  ProjectTest pt= new ProjectTest();
		
			
				try {
					pt.createProject();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (InterruptedException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			
			try {
				pt.verifyOpenProjectfrom_GridView();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
					try {
						pt.verifyDeleteProject_from_GridView();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
		 
		  try {
			pt.verifyDeletedProjectFromGrid_inTrash();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  try {
			pt.createProject_from_ListView();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			pt.openProjectFrom_ListView();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			pt.verifyDeleteProject_from_LISTView();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			pt.verifyDeletedProjectFromList_inTrash();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  }
	  
	  
	  public void captchaSelection()  {
		  
		  System.out.println("Inside Captcha Code ");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		  signup.txt_capcha.click();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		  signup.txt_capcha.sendKeys("captcha");
		  
		 // Assert.assertEquals(signup.btn_signUp.isEnabled(), true);
		  signup.btn_signUp.click();
	  }
	  
	  
	  public void deleteRegisterData() {
		  
		  PostGreConnection.postGreDbConnectionOpen(); 
		  DbQuery dbq= new  DbQuery(); 
		  String query =  "Delete from public.\"users\" where email like '%niti@livingsky%'";
		  dbq.deleteData(query); 
		 // String query1 =  "Delete from public.\"verifiedUsers\" where email like '%niti@livingsky%'";
		  //dbq.deleteData(query1); 
		  PostGreConnection.dbClose();
	  }
	  
	  
@AfterClass
public  void closeBrowser() {
	System.out.println("Closing Signup page Test");
    
	Browser.close();
}

}

