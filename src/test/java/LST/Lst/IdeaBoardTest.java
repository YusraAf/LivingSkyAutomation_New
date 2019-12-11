package LST.Lst;

import java.io.File;
import java.io.FileReader;
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
import resources.Browser;
import resources.CommonTask;

public class IdeaBoardTest extends TestBase {
	
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
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
		  
		log.txt_userName.sendKeys("niti@livingskytech.com"); 
		log.txt_password.sendKeys("asdF1234");
		log.btn_login.click();
		Thread.sleep(1000);
	
	}	

	
@Test(priority=1) 	
public void createNewIdeaWithParagraphAndImageAndScrolling() throws IOException, InterruptedException, Exception {
	
	
	//das = new Dashboard(driver);
	das.initElement();
	
	das.btn_newProject.click();
	
	pro = new Project(das.getDriver());
	pro.initElement();
	
	String  projectName = "Project_With_Idea";
			
	pro.nav_startTypingProjectName.sendKeys(projectName);
	Thread.sleep(1000);
	
	
	pro.btn_addDescription.click();
	Thread.sleep(400);
	pro.nav_addprojectdescription.sendKeys("This is test project with idea");
	
	pro.btn_startProject.click();
	Thread.sleep(100);
	
		logger.info("This is inside in IdeaBoard Page =====> Creating new idea on the Idea Board");
		idb = new Ideaboard(pro.getDriver());
		idb.initElement();
		
		idb.btn_newIdea_IdeaBoard.click();
		Thread.sleep(800);
		//idb.nav_startTyping_Canvas.sendKeys("About Living Sky Technologies Empowering creators everywhere. What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched. In an era of endless digital distractions, creating content can be burdened by the need to format content. The goal of Living Sky Technologies is to stamp out these distractions and guide the content creator down a clear, productive path. The Living Sky team understands how the process of modern writing can cause distractions and impair the flow of productivity. Our software is able to establish patterns from the seemingly random nature of drafting, formatting, and editing to enhance the writing and content creation process. Vision Our vision is to provide a suite of products and services that are indispensable to content creators across all disciplines. Mission  The mission of Living Sky Technologies is to streamline your workflow by making content creation more efficient.");
		
	/*	idb.nav_startTyping_Canvas.sendKeys("About Living Sky Technologies Empowering creators everywhere.\n"+ 
				"\n" + "What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched."+ 
				"\n" + "In an era of endless digital distractions, creating content can be burdened by the need to format content. The goal of Living Sky Technologies is to stamp out these distractions and guide the content creator down a clear, productive path. The Living Sky team understands how the process of modern writing can cause distractions and impair the flow of productivity. Our software is able to establish patterns from the seemingly random nature of drafting, formatting, and editing to enhance the writing and content creation process." + 
				"\n" + "Vision" + 
				"\n" + "Our vision is to provide a suite of products and services that are indispensable to content creators across all disciplines." + 
				"\n" + "Mission" + 
				"\n" + "The mission of Living Sky Technologies is to streamline your workflow by making content creation more efficient.");
		*/
		
		
		
		idb.nav_startTyping_Canvas.sendKeys(System.getProperty("paragraph") +" \n "+System.getProperty("paragraph2") +" \n " +System.getProperty("paragraph3")+" \n " +System.getProperty("paragraph4")+" \n " +System.getProperty("paragraph5"));
		
		Thread.sleep(2000);
		com.mouseHoverOnly(idb.objectCreationControlBar_container_Canvas);
		
		File file = new File("Images/project_image.jpeg"); 
		String path = file.getAbsolutePath(); 
		idb.iconCamera_Canvas.sendKeys(path);
		
		idb.nav_imageTitle_imageEditor.sendKeys("Add Image testing with paragraph in chrome browser");
		idb.nav_imageCaption_imageEditor.sendKeys("Image added with paragraph on dated 121119");
		idb.nav_imageAttribution_imageEditor.sendKeys("tested");
		Thread.sleep(2000);
		
		idb.btn_imageSaveClose_imageEditor.click();
		Thread.sleep(2000);
		
		idb.btn_canvasSaveClose_Canvas.click();
		Thread.sleep(200);
		das.link_projects.click();
		Thread.sleep(500);
		com.moveMouseAndClick(pro.btn_first_Project_open_grid);
		Thread.sleep(2000);
}

@Test(priority=2) 	
public void createNewIdeaWithImageObject() throws IOException, InterruptedException, Exception {
	idb = new Ideaboard(pro.getDriver());
	idb.initElement();
	idb.btn_newIdea_IdeaBoard.click();
	Thread.sleep(800);
	
	File file = new File("Images/images2.jpeg"); 
	String path = file.getAbsolutePath(); 
	idb.iconCamera_Canvas.sendKeys(path);
	
	idb.nav_imageTitle_imageEditor.sendKeys("Add Image ");
	idb.nav_imageCaption_imageEditor.sendKeys("Image Caption added");
	idb.nav_imageAttribution_imageEditor.sendKeys("Image Object attribute");
	Thread.sleep(2000);
	
	idb.btn_imageSaveClose_imageEditor.click();
	Thread.sleep(2000);
	
	idb.btn_canvasSaveClose_Canvas.click();
	Thread.sleep(200);
	pro = new Project(das.getDriver());
	pro.initElement();
	das.initElement();
	das.link_projects.click();
	Thread.sleep(500);
	com.moveMouseAndClick(pro.btn_first_Project_open_grid);
	Thread.sleep(2000);
}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Idea Board page Test");
		Browser.close();
	}
	
}
