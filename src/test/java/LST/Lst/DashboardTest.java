package LST.Lst;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Browser;

public class DashboardTest extends TestBase {
	
	SoftAssert softassert5 = new SoftAssert();
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das;
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		driver = Browser.getInstance();
		driver.get(baseUrl);
	}	
	 	
	@Test(priority=1) 
	public void createProject() throws IOException, InterruptedException {
		
		land= new LandingPage(driver);
		land.initElement(); 
		land.txt_login.click();
		 
		log =new LoginPage(land.getDriver());
		log.initElement();
		  
		log.txt_userName.sendKeys("niti@yopmail.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(10000);
	 
		das = new Dashboard(log.getDriver());
		das.initElement();
		
		das.btn_newProject.click();
	
		
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
