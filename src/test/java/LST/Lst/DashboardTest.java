package LST.Lst;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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
import pageObjects.Project;
import resources.Browser;

public class DashboardTest extends TestBase {
	
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
	public void createProject() throws IOException, InterruptedException {
		
		land= new LandingPage(driver);
		land.initElement(); 
		land.txt_login.click();
		 
		log =new LoginPage(land.getDriver());
		log.initElement();
		  
		log.txt_userName.sendKeys("niti@livingskytech.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
	//	Thread.sleep(5000);
	 
		das = new Dashboard(log.getDriver());
		das.initElement();
		
		//das.btn_newProject.click();
	
		
	}
	//@Test(priority=2) 
	public void verifyAllProjectFromProject() throws IOException, InterruptedException, Exception {
		ProjectTest pt= new ProjectTest();
		   das = new Dashboard(log.getDriver());
		     das.initElement();
		     
		    das.link_projects.click();
		    
		    for(int i=0; i<5;i++) {
		    pt.createProject();
		    
		    }
		    Thread.sleep(200);
		   pro = new Project(das.getDriver());
		     pro.initElement();
		     Actions builder = new Actions(driver);
		    WebElement project = pro.container_grid_view;
		    builder.moveToElement(project).build().perform();
		    List<WebElement> allproject = project.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div"));
		    
		    
		    System.out.println("All project=======>" + allproject.size());
		    for(WebElement b : allproject) {
		        String proTitle= b.findElement(By.className("card-project__title")).getText();
		        System.out.println(proTitle);
		        pt.verifyDeleteProject_from_GridView();
		        }
			}
	
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
