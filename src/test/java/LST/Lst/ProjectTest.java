package LST.Lst;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Project;
import pageObjects.Trash;
import resources.Browser;

public class ProjectTest  extends TestBase {
	
	SoftAssert softassert5 = new SoftAssert();
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das;
	private Project pro;
	private Trash trs;
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		driver = Browser.getInstance();
		driver.get(baseUrl);
		
		land= new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		land.initElement(); 
		land.txt_login.click();
		 
		log =new LoginPage(land.getDriver());
		log.initElement();
		  
		log.txt_userName.sendKeys("niti@livingskytech.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(1000);
	 
		//das = new Dashboard(log.getDriver());
	}	
	 
	@Test(priority=1) 
	public void createProject() throws IOException, InterruptedException, Exception {
		  
		das = new Dashboard(driver);
		das.initElement();
		
		das.btn_newProject.click();
		
		pro = new Project(das.getDriver());
		pro.initElement();
		
		String  projectName = System.getProperty("projectName");
		pro.nav_startTypingProjectName.sendKeys(projectName);
		Thread.sleep(1000);
		
		//driver.findElement(By.id("file")).click();
		//pro.btn_addPhoto.click();
		pro.btn_startProject.click();
		
		
		Thread.sleep(1000);
		
		das.link_projects.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//try {
		//AssertJUnit.assertEquals(pro.txt_first_Project_Title_frm_grid.getText(),projectName);
		//}catch(AssertionError ae) {
		//	System.out.println(ae);
		//}
		
		System.out.println("Project NAme out: "+ pro.txt_first_Project_Title_frm_grid.getText());
		
		/*ClipboardOwner owner = null; 
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
		Thread.sleep(800);*/

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
	
	public void verifyAllElements_Project_Grid() {
		
	}
	
	
	@Test(priority=2)
	public void verifyOpenProjectfrom_GridView() throws InterruptedException {
		//das.link_projects.click();
		
		Actions builder = new Actions(driver);
		builder.moveToElement(pro.btn_first_Project_open_grid).build().perform();
		pro.btn_first_Project_open_grid.click();
	
		builder.moveToElement(pro.tab_two_inside_project).build().perform();
		pro.tab_two_inside_project.click();
		//Thread.sleep(10000);
		AssertJUnit.assertTrue(pro.tab_two_inside_project.isDisplayed());
	}
	
	@Test(priority=3)
	
    public void verifyDeleteProject_from_GridView() throws IOException, InterruptedException, Exception {
          
        das.link_projects.click();
        
        Actions builder = new Actions(driver);
        
		builder.moveToElement(pro.icon_grid).build().perform();
		pro.icon_grid.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
	
		
        WebElement hover = pro.thumbnail_first_Project_from_Grid;
        
        builder.moveToElement(hover).build().perform();
        pro.btn_deleteProject_grid.click();
        builder.moveToElement(pro.btn_delete_confirm_grid).build().perform();
        pro.btn_delete_confirm_grid.click();
       
    }
	
	@Test(priority=4)
	public void verifyDeletedProjectFromGrid_inTrash() throws InterruptedException {
	
	das.link_trash.click();
	
	if(driver.getCurrentUrl().contains("dashboard/deleted")) {
		 Thread.sleep(1000);
		
	
	 trs= new Trash(driver);
	trs.initElement();
	 String pName =  trs.thumbnail_project_title.getText();
	 AssertJUnit.assertEquals(pName, System.getProperty("projectName"));
	 //driver.findElement(By.className("project-name")).getText();

	
	 
	}
	
	}
	@Test(priority=5)
	  public void verifyRestoreProjectFromTrash_Gridview() throws IOException, InterruptedException, Exception {
          
			
	       
	        Actions builder = new Actions(driver);
	        
			builder.moveToElement(trs.iconTrash_grid).build().perform();
			trs.iconTrash_grid.click();
			
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
			 
	        WebElement restoreGrid = trs.thumbnail_first_Trash_from_Grid;
	        
	        builder.moveToElement(restoreGrid).build().perform();
	        trs.btn_restoreTrash_grid.click();
	        Thread.sleep(200);
	        
	    }
	@Test(priority=6)
	public void createProject_from_ListView() throws InterruptedException {
		das.link_projects.click();
		pro.initElement();
		Actions builder = new Actions(driver);
		builder.moveToElement(pro.icon_list).build().perform();
		pro.icon_list.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/button[1]"))));
		pro.btn_newProject_inside_project.click();

	
		String  projectName = System.getProperty("projectName")+ " LIST";
		System.out.println("Project Name list view: "+projectName);
		
		pro.nav_startTypingProjectName.sendKeys(projectName);
		Thread.sleep(1000);
		
		pro.btn_startProject.click();
		Thread.sleep(1000);
	}

@Test(priority=7)
	public void openProjectFrom_ListView() throws InterruptedException   {
		das.link_projects.click();
		
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]"))));
		// Thread.sleep(2000);
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		js.executeScript("arguments[0].click();", pro.btn_first_Project_open_list);
		
		
		//this is not implemented yet
		/*builder.moveToElement(pro.tab_two_inside_project).build().perform();
		pro.tab_two_inside_project.click();
		Thread.sleep(10000);
		AssertJUnit.assertTrue(pro.tab_two_inside_project.isDisplayed());*/
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test(priority=8)
	 public void verifyDeleteProject_from_LISTView() throws IOException, InterruptedException, Exception {
         
	        das.link_projects.click();
	       pro.initElement();
	      Actions builder = new Actions(driver);
	     	
			WebDriverWait wait=new WebDriverWait(driver,30);
			  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		
			
	     WebElement hover = pro.thumbnail_first_Project_from_List;
	     builder.moveToElement(hover).build().perform();
			 // JavascriptExecutor js = (JavascriptExecutor)driver;	
				
				//js.executeScript("arguments[0].click();", pro.thumbnail_first_Project_from_List);
				//js.executeScript("arguments[0].click();", pro.btn_deleteProject_list);
				
	       pro.btn_deleteProject_list.click();
	        builder.moveToElement(pro.btn_delete_confirm_list).build().perform();
	        pro.btn_delete_confirm_list.click();
	        
	        
	    }
	@Test(priority=9)
	public void verifyDeletedProjectFromList_inTrash() throws InterruptedException {
		das.initElement();
	
        Thread.sleep(2000);
      
	    das.link_trash.click();

	if(driver.getCurrentUrl().contains("dashboard/deleted")) {
		 Thread.sleep(5000);
		
	System.out.println("In Side url "+driver.getCurrentUrl());
	Trash trs= new Trash(das.getDriver());
	
	
	trs.initElement();
	 String pName =  trs.txt_Project_Title_frm_List.getText();
	 String  projectName = System.getProperty("projectName")+ " LIST";
	 AssertJUnit.assertEquals(pName, projectName);
	 //driver.findElement(By.className("project-name")).getText();
	System.out.println("Project Name from List: "+pName);
	
  //  das.btn_logout.click();
	 
	}
	
	}
	@Test(priority=10)	
    public void verifyRestoreProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Trash Page =====> Verify Restore Project From Trash_Listview");
        Actions builder = new Actions(driver);
        
		builder.moveToElement(trs.iconTrash_list).build().perform();
		trs.iconTrash_list.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		 
        WebElement restoreList = trs.thumbnail_first_Trash_from_List;
        
        builder.moveToElement(restoreList).build().perform();
        trs.btn_restoreTrash_list.click();
        Thread.sleep(200);
        
    }
	@Test(priority=11)	
	 public void verifyDeleteForeverProjectFromTrash_Gridview() throws IOException, InterruptedException, Exception {
	       
		 verifyDeleteProject_from_GridView();
		 
		 
		   das.link_trash.click();
	       
			trs.initElement();
			logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Gridview");
			// WebDriverWait iconTrash_grid=new WebDriverWait(driver, 30);
			// iconTrash_grid.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/div[1]/button[1]/*")));
	        Actions builder = new Actions(driver); 
	        
			//builder.moveToElement(trs.iconTrash_grid).build().perform();
		//	trs.iconTrash_grid.click();
			
		//	WebDriverWait wait=new WebDriverWait(driver, 20);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
			
	        WebElement deleteForeverGrid = trs.thumbnail_first_Trash_from_Grid;
	       
	       // WebDriverWait wait2=new WebDriverWait(driver, 30);
		   // wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]")));
			
	        builder.moveToElement(deleteForeverGrid).build().perform();
	        trs.btn_deleteForever_Trash_grid.click();
	        Thread.sleep(200);
	        builder.moveToElement(trs.txt_deleteTrash_confirm_grid).build().perform();
	        trs.txt_deleteTrash_confirm_grid.sendKeys("DELETE");
	        trs.btn_deleteTrash_confirmClick_grid.click();
	        Thread.sleep(200);
	       
	    }
	
@Test(priority=12)	
	 public void verifyDeleteForeverProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {   
		   
		Actions builder = new Actions(driver);
	   builder.moveToElement(pro.icon_list).build().perform();
			pro.icon_list.click();
			Thread.sleep(200);			
		 verifyDeleteProject_from_LISTView();
		 
		 	das.link_trash.click();
	       
			trs.initElement();
			logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Listview");
	     
			
	        WebElement deleteForeverList = trs.thumbnail_first_Trash_from_List;
	        
	        builder.moveToElement(deleteForeverList).build().perform();
	        trs.btn_deleteForever_Trash_list.click();
	        Thread.sleep(200);
	        builder.moveToElement(trs.txt_deleteTrash_confirm_list).build().perform();
	        trs.txt_deleteTrash_confirm_list.sendKeys("DELETE");
	        trs.btn_deleteTrash_confirmClick_list.click();
	        Thread.sleep(200);
	        
	    }
	@Test(priority=13)
	  public void verifyDeleteALLProjectFromTrash() throws IOException, InterruptedException, Exception {
	       das.link_projects.click();
		  for(int i=0;i<3;i++) {
		  createProject();
		  verifyDeleteProject_from_LISTView();
		  }
		  
	        das.link_trash.click();
	       
			trs.initElement();
			logger.info("This is inside in Trash Page =====> Verify EmoptyTrash Project From Trash");
	        Actions builder = new Actions(driver);
			
			builder.moveToElement(trs.btn_emptyTrash).build().perform();
			trs.btn_emptyTrash.click();
			
	       // WebElement emptyTrash = trash.txt_EmotyTrash_confirm;
	        
	        builder.moveToElement(trs.txt_EmotyTrash_confirm).build().perform();
	        trs.txt_EmotyTrash_confirm.sendKeys("DELETE ALL");
	        Thread.sleep(200);
	        trs.btn_EmotyTrash_confirmClick.click();
	        Thread.sleep(200);
	        
	    }
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
