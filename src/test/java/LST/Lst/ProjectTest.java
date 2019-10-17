package LST.Lst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Project;
import resources.Browser;

public class ProjectTest  extends TestBase {
	
	SoftAssert softassert5 = new SoftAssert();
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das;
	private Project pro;
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		driver = Browser.getInstance();
		driver.get(baseUrl);
	}	
	 	
	@Test(priority=1) 
	public void createProject() throws IOException, InterruptedException, AWTException {
		
		land= new LandingPage(driver);
		land.initElement(); 
		land.txt_login.click();
		 
		log =new LoginPage(land.getDriver());
		log.initElement();
		  
		log.txt_userName.sendKeys("niti@yopmail.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(1000);
	 
		das = new Dashboard(log.getDriver());
		das.initElement();
		
		das.btn_newProject.click();
		
		pro = new Project(das.getDriver());
		pro.initElement();
	
		pro.nav_startTypingProjectName.sendKeys("Write Way");
		Thread.sleep(1000);
		
		pro.btn_addPhoto.click();
		
		WebElement frame =driver.switchTo().activeElement();
		System.out.println(frame.getText()+ "------");
		System.out.println(frame.getTagName()+ "-----");
		frame.clear();
		frame.click();
		frame.sendKeys("/Users⁩/nitijabin⁩/MyStuff⁩/2019-08-20_09-47-47.jpeg");
		  
		System.out.println(frame.getText()+ "after------");
		System.out.println(frame.getTagName()+ "after-----");
		
		
		  Thread.sleep(10000);
			
		  
		  
		  
		////File Need to be imported
	/*	  
		  File file = new File("/Users⁩/nitijabin⁩/2019-08-20_09-47-47");
		   
		  StringSelection stringSelection= new StringSelection(file.getPath());
		   
		  //Copy to clipboard Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   
		  Robot robot = new Robot();
		   
		  // Cmd + Tab is needed since it launches a Java app and the browser looses focus
		   
		  robot.keyPress(KeyEvent.VK_META);
		   
		  robot.keyPress(KeyEvent.VK_TAB);
		   
		  robot.keyRelease(KeyEvent.VK_META);
		   
		  robot.keyRelease(KeyEvent.VK_TAB);
		   
		  //robot.delay(500);
		   
		  //Open Goto window
		   
		  robot.keyPress(KeyEvent.VK_META);
		   
		  robot.keyPress(KeyEvent.VK_SHIFT);
		   
		  robot.keyPress(KeyEvent.VK_G);
		   
		  robot.keyRelease(KeyEvent.VK_META);
		   
		  robot.keyRelease(KeyEvent.VK_SHIFT);
		   
		  robot.keyRelease(KeyEvent.VK_G);
		   
		  //Paste the clipboard value
		   
		  robot.keyPress(KeyEvent.VK_META);
		   
		  robot.keyPress(KeyEvent.VK_V);
		   
		  robot.keyRelease(KeyEvent.VK_META);
		   
		  robot.keyRelease(KeyEvent.VK_V);
		   
		  //Press Enter key to close the Goto window and Upload window
		   
		  robot.keyPress(KeyEvent.VK_ENTER);
		   
		  robot.keyRelease(KeyEvent.VK_ENTER);
		   
		 // robot.delay(500);
		   
		  robot.keyPress(KeyEvent.VK_ENTER);
		   
		  robot.keyRelease(KeyEvent.VK_ENTER);*/
		  
		  Thread.sleep(10000);
		  
		  //pro.btn_startProject.click();
	}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
