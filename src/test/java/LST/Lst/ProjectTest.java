package LST.Lst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	public void createProject() throws IOException, InterruptedException, Exception {
		  
		land= new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
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
		
		//driver.findElement(By.id("file")).click();
		pro.btn_addPhoto.click();
		
		
		//  File file = new File("/Users⁩/⁨chetankumarpatel⁩/Desktop/⁩ScreenShot2019-10-16at1.27.18PM.jpeg");
		ClipboardOwner owner = null; 
		Robot robot = new Robot();
		StringSelection stringSelection= new StringSelection("/Users⁩/⁨chetankumarpatel⁩/Desktop/⁩ScreenShot20191016at12718PM.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, owner);
		  
		robot.setAutoDelay(3000);
		  
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		  
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_K);
		  
		robot.setAutoDelay(3000);
	  
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		  
		//robot.setAutoDelay(3000);
		Thread.sleep(8000);  
		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("This is testing project");
			
		pro.btn_startProject.click();
		Thread.sleep(800);

		  /*
		pro.btn_addPhoto.click();
		
		WebElement frame =driver.switchTo().activeElement();
		System.out.println(frame.getText()+ "------");
		System.out.println(frame.getTagName()+ "-----");
		//frame.clear();
		//frame.click();
		frame.sendKeys("\\Users⁩\\chetankumarpatel⁩\\Desktop\\ScreenShot2019-10-16at1.27.18PM.png");
		Thread.sleep(10000);
		frame.click(); 
		Thread.sleep(100);
		System.out.println(frame.getText()+ "after------");
		System.out.println(frame.getTagName()+ "after-----");
		
		Thread.sleep(1000);
		
		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("This is testing project");
		
		pro.btn_startProject.click();
		Thread.sleep(800);
	*/	
		 
		////File Need to be imported
	  /*
		  File file = new File("/Users⁩/⁨chetankumarpatel⁩/Desktop/⁩ScreenShot2019-10-16at1.27.18PM.jpeg");
		   
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
		   
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  Thread.sleep(10000);
		  
		  pro.btn_startProject.click();
		*/  
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
