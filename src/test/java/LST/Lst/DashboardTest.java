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

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Browser;

public class DashboardTest extends TestBase {
	
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
	public void verifyDashboardPageAttributes() throws IOException, InterruptedException {
		
		land= new LandingPage(driver);
		land.initElement(); 
		land.txt_login.click();
		 
		log =new LoginPage(land.getDriver());
		log.initElement();
		  
		log.txt_userName.sendKeys("niti12@livingskytech.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(200);
	 
		das = new Dashboard(log.getDriver());
		das.initElement();
		das.verifyPageUrl();
		
		AssertJUnit.assertTrue(das.link_projects.isDisplayed());
		logger.info("Projects is displayed on dashboard.");
		
		WebElement element =das.link_projects; 
		Actions builder = new Actions(driver); 
		builder.moveToElement(element).build().perform(); 
		  
		AssertJUnit.assertTrue(das.link_favourites.isDisplayed());
		logger.info("Favourites is displayed on dashboard.");
		  
		AssertJUnit.assertTrue(das.link_trash.isDisplayed());
		logger.info("Trash is displayed on dashboard.");
		
		AssertJUnit.assertTrue(das.link_collections.isDisplayed());
		logger.info("Collection is displayed on dashboard.");
		
		AssertJUnit.assertTrue(das.link_myAccount.isDisplayed());
		logger.info("My Account is displayed on dashboard.");
		
		AssertJUnit.assertTrue(das.link_settings.isDisplayed());
		logger.info("Settings is displayed on dashboard.");
		
		das.btn_newProject.click();
		
		AssertJUnit.assertTrue(das.btn_startProject.isDisplayed());
		logger.info("Start Project button is displayed on dashboard.");
		
		AssertJUnit.assertTrue(das.btn_addDescription.isDisplayed());
		logger.info("Add Description button is displayed on dashboard.");
		
		AssertJUnit.assertTrue(das.btn_addPhoto.isDisplayed());
		logger.info("Add Photo button is displayed on dashboard.");
	
		AssertJUnit.assertTrue(das.nav_startTypingProjectName.isDisplayed());
		logger.info("Start typing your project name is displayed on dashboard.");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Login page Test");
		Browser.close();
	}


}
