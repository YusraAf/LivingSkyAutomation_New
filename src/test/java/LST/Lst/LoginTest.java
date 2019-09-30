package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import LST.core.TestBase;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Browser;
import resources.CommonTask;

public class LoginTest extends TestBase{
	
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage landing;
	private LoginPage log;
	private CommonTask common;
	
@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {
	//basePageNavigation();
	driver = Browser.getInstance();
	driver.get(baseUrl);
	
	}	

@Test(priority=1)
public void verifyLoginPageAttributes() throws InterruptedException {
	
	landing= new LandingPage(driver);
	landing.initElement();
	landing.txt_login.click();
	 Thread.sleep(500);
	 log =new LoginPage(landing.getDriver());
	 log.initElement();
	 AssertJUnit.assertTrue(log.txt_userName.isDisplayed());
	 logger.info("Email textbox is displayed.");
	 AssertJUnit.assertTrue(log.txt_password.isDisplayed());
	 logger.info("Password textbox is displayed.");
	 AssertJUnit.assertTrue(log.btn_login.isDisplayed());
	 logger.info("Login Button is displayed.");
	 AssertJUnit.assertTrue(log.radio_remember_me.isDisplayed());
	 logger.info("Remember Me radio is displayed.");
	 AssertJUnit.assertTrue(log.btn_signInFb.isDisplayed());
	 logger.info("SigninFB button is displayed.");
	 AssertJUnit.assertTrue(log.btn_signInGoogle.isDisplayed());
	 logger.info("SigninGoogle button is displayed.");
	 
}


@Test(dataProvider= "getLoginData",priority=2) 
public void doSignin(String username, String password, int testCase) throws IOException, InterruptedException {
	 System.out.println("UserName : "+ username);
	 landing= new LandingPage(driver);
	 landing.initElement(); 
	 landing.txt_login.click();
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 log =new LoginPage(landing.getDriver());
	 log.initElement();
	  
	 log.txt_userName.sendKeys(username);
	 log.txt_password.sendKeys(password);
	 log.btn_login.click();
	 Thread.sleep(500);
 
	// Dashboard dash = new Dashboard(log.getDriver());
		
	// landing.initElement(dash);
	 //common = new CommonTask();
	 
	 switch(testCase){
		 case 1: testCase1(driver); break;
		 case 2: testCase2(driver); break;
		 case 3: testCase3(driver); break;
		 case 4: testCase4(driver); break;
		 
	 }
	 	
	 Thread.sleep(500);

}

@Test(priority=3)
public void doSigninAssertion() { 
	
	 AssertJUnit.assertEquals(driver.getTitle(), "Write Way");
	 logger.info("Write way title is displayed successfully.");
	 //System.out.println("+++++++++++++++++++++++IN Assertion+++++++++++++++++");
}

	@DataProvider
	public Object[][] getLoginData(){
 
	 Object[][] data= new Object[4][3];
	 data[0][0]= "niti12@livingskytech.com";
	 data[0][1]= "asdF1234";
	 data[0][2]= 1;
 
	 data[1][0]= "niti5@yopmail.com";
	 data[1][1]= "asd12934";
	 data[1][2]= 2;
	 
	 data[2][0]= "niti@yopmail.com";
	 data[2][1]= "";
	 data[2][2]= 3;
	 
	 data[3][0]= "";
	 data[3][1]= "asdF1234";
	 data[3][2]= 4;
 
	 return data;
}

public void testCase1(WebDriver driver) throws InterruptedException {
	Dashboard dash = new Dashboard(log.getDriver());
	dash.initElement();
	dash.verifyPageUrl();
	WebElement element = dash.link_projects;
		
		 // Actions builder = new Actions(driver);
		//  builder.moveToElement(element).click().build().perform();
	 common = new CommonTask();
	 
	 common.moveMouse(element, driver);
	
	 AssertJUnit.assertEquals(dash.link_projects.getText(),"Projects");
	 logger.info("Projects is displayed in Dashboard.");
	 
	 System.out.println("++++++++In Side Testcase1++++++++++++");
	 WebElement element2 = dash.link_collections;
	
	 common.moveMouse(element2, driver);
	
	 /**
	  *  I will upload it later ..
	  */
	 //common.moveMouse(element2, driver);
	 //Thread.sleep(1000);
	 //driver.navigate().back();
	 //Thread.sleep(500);
	 	 
	 AssertJUnit.assertEquals(dash.link_collections.getText(), "Collection");
	 logger.info("Collection is displayed in Dashboard.");
	 Thread.sleep(200);
	 dash.btn_logout.click();
}

public void testCase2(WebDriver driver) throws InterruptedException {
	 AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Wrong email or password was provided."); 
	 logger.info("Wrong login message is showing successfully.");
	 Thread.sleep(200);
	 Browser.pageRefresh();
}

public void testCase3(WebDriver driver) throws InterruptedException {
	 AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Password is required."); 
	 logger.info("Password is required message is showing successfully.");
	 Thread.sleep(200);
	 Browser.pageRefresh();
}

public void testCase4(WebDriver driver) throws InterruptedException {
	 AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Email address is required."); 
	 logger.info("Email address is required message is showing successfully.");
	 Thread.sleep(200);
	 Browser.pageRefresh();
}

@AfterClass
public void closeBrowser() {
	System.out.println("Closing Login page Test");
	Browser.close();
}

}

