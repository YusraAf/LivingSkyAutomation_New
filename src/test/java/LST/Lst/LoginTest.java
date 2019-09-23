package LST.Lst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import LST.core.TestBase;

import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

import pageObjects.Browser;
import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
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
	 landing.initElement(log);
	  
	 log.txt_userName.sendKeys(username);
	 log.txt_password.sendKeys(password);
	 log.btn_login.click();
	 Thread.sleep(500);
 
	// Dashboard dash = new Dashboard(log.getDriver());
		
	// landing.initElement(dash);
	 //common = new CommonTask();
	 
	 switch(testCase){
		 case 1: testCase1(); break;
		 case 2: testCase2(); break;
		 case 3: testCase3(); break;
	 }
	 
	
Thread.sleep(500);

}

@Test(priority=3)
public void doSigninAssertion() { 

 AssertJUnit.assertEquals(driver.getTitle(), "Write Way");
 logger.info("Writeway title is displayed successfully.");
 //System.out.println("+++++++++++++++++++++++IN Assertion+++++++++++++++++");
}

@DataProvider
public Object[][] getLoginData(){
 
 Object[][] data= new Object[3][3];
 data[0][0]= "niti12@livingskytech.com";
 data[0][1]= "asdF1234";
 data[0][2]= 1;
 
 data[1][0]= "niti5@yopmail.com";
 data[1][1]= "asdF1234";
 data[1][2]= 2;
 
 data[2][0]= "niti@yopmail.com";
 data[2][1]= "";
 data[2][2]= 3;
 
 return data;
}
public void testCase1() throws InterruptedException {
	Dashboard dash = new Dashboard(log.getDriver());
	dash.initElement();
	dash.verifyPageUrl();
	 WebElement element = dash.link_projects;
		
		 // Actions builder = new Actions(driver);
		//  builder.moveToElement(element).click().build().perform();
		 
	 
	 common.moveMouse(element, driver);
	
	 AssertJUnit.assertEquals(dash.link_projects.getText(),"Projects");
	 logger.info("Projects is displayed in Dashboard.");
	 
	// System.out.println("++++++++In Side Try++++++++++++"+ dash.link_projects.getText());
	 WebElement element2 = dash.link_collections;
	 Actions builder2 = new Actions(driver);
	 builder2.moveToElement(element2).build().perform();
	 
	
	 /**
	  *  I will upload it later ..
	  */
	 //common.moveMouse(element2, driver);
	 //Thread.sleep(1000);
	 //driver.navigate().back();
	 //Thread.sleep(500);
	 
	 
	 AssertJUnit.assertEquals(dash.link_collections.getText(), "Collection");
	 logger.info("Collection is displayed in Dashboard.");
	 
	 dash.btn_logout.click();
}

public void testCase2() {
	 AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Wrong email or password was provided."); 
	 logger.info("Wrong login message is showing successfully.");
	 
	 Browser.pageRefresh();
}

public void testCase3() {
	 AssertJUnit.assertEquals(driver.findElement(By.xpath("//p[@class='statusText error-msg']")).getText(), "Password is required."); 
	 logger.info("Wrong login message is showing successfully.");
	 
	 Browser.pageRefresh();
}

@AfterClass
public void closeBrowser() {
	System.out.println("Closing Login page Test");
	Browser.close();
}


}

