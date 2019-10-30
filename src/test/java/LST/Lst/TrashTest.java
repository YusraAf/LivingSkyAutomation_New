package LST.Lst;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Trash;
import resources.Browser;


public class TrashTest  extends TestBase {
	
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das;
	private Trash trash;
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		driver = Browser.getInstance();
		driver.get(baseUrl);
	}
	
	@Test(priority=1)	
    public void verifyRestoreProjectFromTrash_Gridview() throws IOException, InterruptedException, Exception {
          
		land= new LandingPage(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		land.initElement(); 
		logger.info("This is inside in Trash Page =====> Verify Restore Project From Trash_Gridview");
		land.txt_login.click();
		 
		log =new LoginPage(land.getDriver());
		log.initElement();
		  
		log.txt_userName.sendKeys("niti@livingskytech.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(1000);
	 
		das = new Dashboard(log.getDriver());
		das.initElement();
		
        das.link_trash.click();
        
        trash = new Trash(das.getDriver());
		trash.initElement();
       
        Actions builder = new Actions(driver);
        
		builder.moveToElement(trash.iconTrash_grid).build().perform();
		trash.iconTrash_grid.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		 
        WebElement restoreGrid = trash.thumbnail_first_Trash_from_Grid;
        
        builder.moveToElement(restoreGrid).build().perform();
        trash.btn_restoreTrash_grid.click();
        Thread.sleep(200);
        
    }
	
	@Test(priority=2)	
    public void verifyRestoreProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Trash Page =====> Verify Restore Project From Trash_Listview");
        Actions builder = new Actions(driver);
        
		builder.moveToElement(trash.iconTrash_list).build().perform();
		trash.iconTrash_list.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[2]")));
		 
        WebElement restoreList = trash.thumbnail_first_Trash_from_List;
        
        builder.moveToElement(restoreList).build().perform();
        trash.btn_restoreTrash_list.click();
        Thread.sleep(200);
        
    }

	@Test(priority=3)	
    public void verifyDeleteForeverProjectFromTrash_Gridview() throws IOException, InterruptedException, Exception {
	       
        das.link_trash.click();
       
		trash.initElement();
		logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Gridview");
		// WebDriverWait iconTrash_grid=new WebDriverWait(driver, 30);
		// iconTrash_grid.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/div[1]/button[1]/*")));
        Actions builder = new Actions(driver); 
        
		builder.moveToElement(trash.iconTrash_grid).build().perform();
		trash.iconTrash_grid.click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		
        WebElement deleteForeverGrid = trash.thumbnail_first_Trash_from_Grid;
       
       // WebDriverWait wait2=new WebDriverWait(driver, 30);
	   // wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[1]")));
		
        builder.moveToElement(deleteForeverGrid).build().perform();
        trash.btn_deleteForever_Trash_grid.click();
        Thread.sleep(200);
        builder.moveToElement(trash.txt_deleteTrash_confirm_grid).build().perform();
        trash.txt_deleteTrash_confirm_grid.sendKeys("DELETE");
        trash.btn_deleteTrash_confirmClick_grid.click();
        Thread.sleep(200);
       
    }
	
	@Test(priority=4)	
    public void verifyDeleteForeverProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {   
		
        das.link_trash.click();
       
		trash.initElement();
		logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Listview");
        Actions builder = new Actions(driver);
		//WebDriverWait iconTrash_list=new WebDriverWait(driver, 40);
		//iconTrash_list.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/header[1]/div[2]/div[1]/button[2]/*")));
		
		builder.moveToElement(trash.iconTrash_list).build().perform();
		trash.iconTrash_list.click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		
        WebElement deleteForeverList = trash.thumbnail_first_Trash_from_List;
        
        builder.moveToElement(deleteForeverList).build().perform();
        trash.btn_deleteForever_Trash_list.click();
        Thread.sleep(200);
        builder.moveToElement(trash.txt_deleteTrash_confirm_list).build().perform();
        trash.txt_deleteTrash_confirm_list.sendKeys("DELETE");
        trash.btn_deleteTrash_confirmClick_list.click();
        Thread.sleep(200);
        
    }
	
	@Test(priority=5)	
    public void verifyEmoptyTrashProjectFromTrash() throws IOException, InterruptedException, Exception {
	       
        das.link_trash.click();
       
		trash.initElement();
		logger.info("This is inside in Trash Page =====> Verify EmoptyTrash Project From Trash");
        Actions builder = new Actions(driver);
		
		builder.moveToElement(trash.btn_emptyTrash).build().perform();
		trash.btn_emptyTrash.click();
		
       // WebElement emptyTrash = trash.txt_EmotyTrash_confirm;
        
        builder.moveToElement(trash.txt_EmotyTrash_confirm).build().perform();
        trash.txt_EmotyTrash_confirm.sendKeys("DELETE ALL");
        Thread.sleep(200);
        trash.btn_EmotyTrash_confirmClick.click();
        Thread.sleep(200);
        
    }

	@Test(priority=6)	
    public void verifyTrashAttributesFromTrash() throws IOException, InterruptedException, Exception {
	       
        das.link_trash.click();
       
		trash.initElement();
		
		AssertJUnit.assertTrue(trash.iconTrash_grid.isDisplayed());
		logger.info("Grid Icon is displayed on the Trash Page.");
		AssertJUnit.assertTrue(trash.iconTrash_list.isDisplayed());
		logger.info("List Icon is displayed on the Trash Page.");
		AssertJUnit.assertTrue(trash.dropDownbtn_sortBylastModifiedTrash.isDisplayed());
		logger.info("Drop Down menu is displayed on the Trash Page.");
		AssertJUnit.assertTrue(trash.nav_SearchProjectFromTrash.isDisplayed());
		logger.info("Search for a Project is displayed on the Trash Page.");
		AssertJUnit.assertTrue(trash.btn_emptyTrash.isDisplayed());
		logger.info("Empty Trash is displayed on the Trash Page.");
        das.btn_logout.click();
    }
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
