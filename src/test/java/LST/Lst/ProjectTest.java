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
import resources.CommonTask;

public class ProjectTest  extends TestBase {
	
	//SoftAssert softassert5 = new SoftAssert();
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das;
	private Project pro;
	private Trash trs;
	private CommonTask com ;
	
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
		com = new CommonTask(driver);
		das = new Dashboard(driver);
		das.initElement();
		
		das.btn_newProject.click();
		
		pro = new Project(das.getDriver());
		pro.initElement();
		//int number = com.randomNumber();
		String  projectName = System.getProperty("projectName");
				
		pro.nav_startTypingProjectName.sendKeys(projectName);
		Thread.sleep(1000);
		
		//driver.findElement(By.id("file")).click();
		//pro.btn_addPhoto.click();
		
		
		File file = new File("Images/project_image.jpeg"); 
		WebElement fileBrowser =  pro.btn_addPhoto;
		String path = file.getAbsolutePath(); 
		pro.btn_addPhoto.sendKeys(path);
		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("This is testing project");
		
		pro.btn_startProject.click();
		
		
		Thread.sleep(1000);
		
		das.link_projects.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(pro.txt_first_Project_Title_frm_grid.getText(),projectName);
				
		
		System.out.println("Project NAme out: "+ pro.txt_first_Project_Title_frm_grid.getText());
		sa.assertAll();
		
	}
	
	public boolean elementHasClass(WebElement element, String active) {
	    return element.getAttribute("class").contains(active);
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
        Thread.sleep(2500);
        //WebDriverWait wait1=new WebDriverWait(driver, 50);
        //wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]")));
    }
	
	@Test(priority=4)
	public void verifyDeletedProjectFromGrid_inTrash() throws InterruptedException {
		Thread.sleep(5000);
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
	public void verifyUndoProjectFromTrash_GridView() throws IOException, InterruptedException, Exception {
	
		Actions builder = new Actions(driver);
		builder.moveToElement(trs.iconTrash_grid).build().perform();
		trs.iconTrash_grid.click();
		Thread.sleep(300);
		        
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]")));
		         //html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]/div[2]
		WebElement undo = trs.undoProjectFromTrash_GridView;
		        
		builder.moveToElement(undo).build().perform();
		trs.undoProjectFromTrash_GridView.click();
		Thread.sleep(300);
		}

	@Test(priority=7)
	public void createProject_from_ListView() throws InterruptedException {
		das.link_projects.click();
		pro.initElement();
		Actions builder = new Actions(driver);
		builder.moveToElement(pro.icon_list).build().perform();
		pro.icon_list.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/button[1]"))));
		Thread.sleep(1000);
		pro.btn_newProject_inside_project.click();
		
		String  projectName = System.getProperty("projectName")+ " LIST";
		//+com.randomNumber();
		System.out.println("Project Name list view: "+projectName);
		
		pro.nav_startTypingProjectName.sendKeys(projectName);
		Thread.sleep(1000);
		
		pro.btn_startProject.click();
		
	}

	@Test(priority=8)
	public void openProjectFrom_ListView() throws InterruptedException   {
		
		Thread.sleep(1000);
	
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
	
	 @Test(priority=9)
	 public void verifyDeleteProject_from_LISTView() throws IOException, InterruptedException, Exception {
		Thread.sleep(1000);
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
	     Thread.sleep(1000);          
	    }
	@Test(priority=10)
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
	@Test(priority=11)	
    public void verifyRestoreProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Trash Page =====> Verify Restore Project From Trash_Listview");
        Actions builder = new Actions(driver);
        
		builder.moveToElement(trs.iconTrash_list).build().perform();
		trs.iconTrash_list.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		 
        WebElement restoreList = trs.thumbnail_first_Trash_Project_from_List;
        
        builder.moveToElement(restoreList).build().perform();
        trs.btn_restoreTrash_list.click();
        Thread.sleep(200);
        
    }

	@Test(priority=12) 
	public void verifyUndoProjectFromTrash_ListView() throws IOException, InterruptedException, Exception {
	 	
		Actions builder = new Actions(driver);
		builder.moveToElement(trs.iconTrash_list).build().perform();
		trs.iconTrash_list.click();
		Thread.sleep(300);
		        
		WebDriverWait wait1=new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]")));
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]")));
		WebElement undo = trs.undoProjectFromTrash_ListView;
		        
		builder.moveToElement(undo).build().perform();
		trs.undoProjectFromTrash_ListView.click();
		Thread.sleep(300);
		}
	
	 @Test(priority=13)	
	 public void verifyDeleteForeverProjectFromTrash_Gridview() throws IOException, InterruptedException, Exception {
	       
		// verifyDeleteProject_from_GridView();
		    
		    das.link_trash.click();
	        Thread.sleep(300);
	        
			trs.initElement();
			logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Gridview");
			Actions builder = new Actions(driver);
			builder.moveToElement(trs.iconTrash_grid).build().perform();
			trs.iconTrash_grid.click();
			Thread.sleep(300);
			
			// WebDriverWait iconTrash_grid=new WebDriverWait(driver, 30);
			// iconTrash_grid.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/div[1]/button[1]/*")));
	       // Actions builder = new Actions(driver); 
	        
			//builder.moveToElement(trs.iconTrash_grid).build().perform();
		//	trs.iconTrash_grid.click();
			
		//	WebDriverWait wait=new WebDriverWait(driver, 20);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
			
	        WebElement deleteForeverGrid = trs.thumbnail_first_Trash_from_Grid;
	       
	        //WebDriverWait wait2=new WebDriverWait(driver, 30);
		    //wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]")));
			
	        builder.moveToElement(deleteForeverGrid).build().perform();
	        trs.btn_deleteForever_Trash_grid.click();
	        Thread.sleep(200);
	        builder.moveToElement(trs.txt_deleteTrash_confirm_grid).build().perform();
	        trs.txt_deleteTrash_confirm_grid.sendKeys("DELETE");
	        trs.btn_deleteTrash_confirmClick_grid.click();
	        Thread.sleep(200);
	       
	    }
	
	 @Test(priority=14)	
	 public void verifyDeleteForeverProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {   
		   
		 Actions builder = new Actions(driver);
		 builder.moveToElement(pro.icon_list).build().perform();
			pro.icon_list.click();
			Thread.sleep(200);			
		 
		//	verifyDeleteProject_from_LISTView();
		 
		 	das.link_trash.click();
	       
			trs.initElement();
			logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Listview");
			
			WebDriverWait wait=new WebDriverWait(driver, 50);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		    
			Thread.sleep(400);
	        WebElement deleteForeverList = trs.thumbnail_first_Trash_Project_from_List;
	        
	        builder.moveToElement(deleteForeverList).build().perform();
	        //deleteForeverList.click();
	        //Thread.sleep(500);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='control__content-btn delete-action delete-forever-list']")));
		  
	        trs.btn_deleteForever_Trash_list.click();
	        Thread.sleep(500);
	        builder.moveToElement(trs.txt_deleteTrash_confirm_list).build().perform();
	        trs.txt_deleteTrash_confirm_list.sendKeys("DELETE");
	        trs.btn_deleteTrash_confirmClick_list.click();
	        Thread.sleep(200);
	        
	    }

	@Test(priority=15)
	public void verify_Project_Grid_List() throws InterruptedException {
		das.link_projects.click();
		Thread.sleep(200);
		pro.initElement();
		Actions builder = new Actions(driver);
        
		builder.moveToElement(pro.icon_grid).build().perform();
		pro.icon_grid.click();
		SoftAssert sa =new SoftAssert();
		sa.assertTrue(pro.container_grid_view.isDisplayed(),"It is in Grid View.");
		das.link_projects.click();
		
			builder.moveToElement(pro.icon_list).build().perform();
			pro.icon_list.click();
		
			sa.assertTrue(pro.container_list_view.isDisplayed(),"It is in List View.");
			sa.assertAll();
	 }
  public void verifyDropDownForSorting() throws InterruptedException{
	
	  das.link_projects.click();
      
      /***
       * Creating multiple project
       */
	  for(int i=0;i<3;i++) {
		  createProject_from_ListView();
	     
	  	}
  	}

  	@Test(priority=16)
	public void verifyDeleteALLProjectFromTrash() throws IOException, InterruptedException, Exception {
	       das.link_projects.click();
	       
	      /***
	       * Creating multiple project
	       */
	       for(int i=0;i<3;i++) {
			 createProject_from_ListView();
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

@Test(priority=17)    
public void verifyAllProjectFromProject() throws IOException, InterruptedException, Exception {

	com = new CommonTask(driver);
	das = new Dashboard(driver);
	
	das.initElement();
	pro = new Project(das.getDriver());
	pro.initElement();
	
	int number = com.randomNumber();
	String  projectName = System.getProperty("projectName");
	
for(int i=1;i<=5;i++) {
	
	das.link_projects.click();
    Thread.sleep(3000);
    das.initElement();
	das.btn_newProject.click();
	pro.initElement();			
	pro.nav_startTypingProjectName.sendKeys(i+projectName);
	Thread.sleep(1000);
	
	pro.btn_startProject.click();
	
	Thread.sleep(1000);

}

	das.link_projects.click();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	

   /* Actions builder = new Actions(driver);


    Actions builder = new Actions(driver);
    builder.moveToElement(pro.icon_grid).build().perform();
	pro.icon_grid.click();
    

    WebElement project = pro.container_grid_view;
    builder.moveToElement(project).build().perform();
    List<WebElement> allproject = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div"));
    
    
    System.out.println("All project=======>" + allproject.size());

    for(WebElement b : allproject) {
    String proTitle= b.findElement(By.className("card-project__title")).getText();
    System.out.println(proTitle);
     // verifyDeleteProject_from_GridView();
      }*/
	Thread.sleep(3000);
	
    driver.findElement(By.cssSelector(".dropdown-button__text")).click();
    Thread.sleep(600);
    System.out.println("Checking "+driver.findElement(By.cssSelector("reach-portal > div > div > div:nth-child(1)")).getText()); 
    // Xpath for first child
    driver.findElement(By.xpath("//reach-portal/div/div/div")).click();
   
    //driver.findElement(By.cssSelector("reach-portal > div > div > div:nth-child(1)")).click();
    
    //Sort Button
    driver.findElement(By.xpath("//div[@id=\'root\']/div/section/header/div[2]/button")).click();
    Thread.sleep(1000);
    System.out.println("SELECT LAst Modified: "+ pro.txt_first_Project_Title_frm_grid.getText()); 
   
   	SoftAssert sa =new SoftAssert();
	sa.assertEquals(pro.txt_first_Project_Title_frm_grid.getText(),"5WriteWayTest_Project");
	
	
    WebElement element = driver.findElement(By.xpath("//reach-portal/div/div/div[2]"));
    Actions builder1 = new Actions(driver);
    builder1.moveToElement(element).clickAndHold().perform();
    
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//reach-portal/div/div/div[2]")).click();
    Thread.sleep(1000);

    sa.assertEquals(driver.findElement(By.className("card-project__title")).getText(),"1WriteWayTest_Project");

    System.out.println("Select Title: "+driver.findElement(By.className("card-project__title")).getText()); 
    
   // -----
    
    driver.findElement(By.cssSelector(".dropdown-button__text")).click();
    
   // driver.findElement(By.xpath("//reach-portal/div/div/div")).click();
    
    //driver.findElement(By.cssSelector("reach-portal > div > div > div:nth-child(1)")).click();
    
    //Sort Button
    WebElement element1 = driver.findElement(By.xpath("//reach-portal/div/div/div"));
    
    builder1.moveToElement(element1).clickAndHold().perform();
    
    
    driver.findElement(By.xpath("//reach-portal/div/div/div")).click();
    Thread.sleep(1000);
    System.out.println("SELECT Last Modified again: "+ pro.txt_first_Project_Title_frm_grid.getText()); 
   
    Thread.sleep(1000);
	sa.assertEquals(pro.txt_first_Project_Title_frm_grid.getText(),"5WriteWayTest_Project");
    sa.assertAll();
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
