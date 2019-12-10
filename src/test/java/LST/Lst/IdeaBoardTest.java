package LST.Lst;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.Ideaboard;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Project;
import pageObjects.Trash;
import resources.Browser;
import resources.CommonTask;

public class IdeaBoardTest extends TestBase {
	
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das;
	private Project pro;
	private Trash trs;
	private Ideaboard idb;
	private CommonTask com  = new CommonTask(driver);
	
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
		  
		log.txt_userName.sendKeys("test8@gmail.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(1000);
	
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
		
		File file = new File("Images/project_image.jpeg"); 
		WebElement fileBrowser =  pro.btn_addPhoto;
		String path = file.getAbsolutePath(); 
		pro.btn_addPhoto.sendKeys(path);
		pro.btn_addDescription.click();
		Thread.sleep(400);
		pro.nav_addprojectdescription.sendKeys("This is testing project");
		
		pro.btn_startProject.click();
		Thread.sleep(100);
		
	}
	
	
@Test(priority=2) 	
public void createNewIdea() throws IOException, InterruptedException, Exception {
	
		logger.info("This is inside in IdeaBoard Page =====> Creating new idea on the Idea Board");
		idb = new Ideaboard(pro.getDriver());
		idb.initElement();
		
		idb.btn_newIdea_IdeaBoard.click();
		
		idb.nav_startTyping_Canvas.sendKeys("About Living Sky Technologies Empowering creators everywhere. What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched. In an era of endless digital distractions, creating content can be burdened by the need to format content. The goal of Living Sky Technologies is to stamp out these distractions and guide the content creator down a clear, productive path. The Living Sky team understands how the process of modern writing can cause distractions and impair the flow of productivity. Our software is able to establish patterns from the seemingly random nature of drafting, formatting, and editing to enhance the writing and content creation process. Vision Our vision is to provide a suite of products and services that are indispensable to content creators across all disciplines. Mission  The mission of Living Sky Technologies is to streamline your workflow by making content creation more efficient.");
		
		com.mouseHoverOnly(idb.objectCreationControlBar_container_Canvas);
		
		idb.btn_canvasSaveClose_Canvas.click();
		Thread.sleep(200);
		das.link_projects.click();
		Thread.sleep(500);
		com.moveMouseAndClick(pro.btn_first_Project_open_grid);
		Thread.sleep(10000);
}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Idea Board page Test");
		Browser.close();
	}
	
}
