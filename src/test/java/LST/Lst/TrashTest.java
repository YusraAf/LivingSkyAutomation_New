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
	private LoginTest log;
	private Dashboard das;
	private Trash trash;
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		driver = Browser.getInstance();
		driver.get(baseUrl);
		log =new LoginTest();
		log.doSignin("niti@yopmail.com", "asdF1234");;
		
		Thread.sleep(1000);
	}
	
	
	@Test(priority=1)	
    public void verifyTrashAttributesFromTrash() throws IOException, InterruptedException, Exception {

		das = new Dashboard(driver);
		das.initElement();
		trash = new Trash(das.getDriver());
		trash.initElement();
       
        das.link_trash.click();
        Thread.sleep(2000);
        
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
