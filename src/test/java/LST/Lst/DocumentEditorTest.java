package LST.Lst;

import java.io.IOException;
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

import LST.core.TestBase;
import pageObjects.Dashboard;
import pageObjects.DocumentEditor;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Project;
import resources.Browser;
import resources.CommonTask;

public class DocumentEditorTest extends TestBase {
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginPage log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
	private DocumentEditor doce;
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
public void createDocumentWithArea() throws IOException, InterruptedException, Exception {

	das = new Dashboard(driver);
	das.initElement();
	
	das.btn_newProject.click();
	
	pro = new Project(das.getDriver());
	pro.initElement();
	
	String  projectName = "Project_With_Document";
			
	pro.nav_startTypingProjectName.sendKeys(projectName);
	Thread.sleep(1000);
	
	
	pro.btn_addDescription.click();
	Thread.sleep(400);
	pro.nav_addprojectdescription.sendKeys("This is test project with document");
	
	pro.btn_startProject.click();
	Thread.sleep(100);
	
		logger.info("This is inside in Document Editor Page =====> Creating document on the Document Editor");
		doce = new DocumentEditor(pro.getDriver());
		doce.initElement();
		
		System.out.println("Document name is ----> " + doce.documentName_DocumentEditor.getText());
	//WebDriverWait wait = new WebDriverWait(driver, 50);
	//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")));
		
	
	WebElement title = doce.nav_title_DocumentEditor;
	//JavascriptExecutor executor = (JavascriptExecutor)driver;
	//executor.executeScript("arguments[0].click();", ele);
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//com.moveMouseAndClick(ele);
		//Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		action.click(title).sendKeys("Living Sky Technologies").perform();
		Thread.sleep(1000);
		
		com.moveMouseAndClick(doce.plusIcon_DocumentEditor);

		WebElement subtitle = doce.nav_subTitle_DocumentEditor;
		
		action.click(subtitle).sendKeys("About Living Sky Technologies").perform();
		Thread.sleep(1000);
		com.moveMouseAndClick(doce.plusIcon_DocumentEditor);
		WebElement body = doce.nav_body_DocumentEditor;
		
		action.click(body).sendKeys("Empowering creators everywhere.\n" + 
				"What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched.\n" + 
				"\n" + 
				"In an era of endless digital distractions, creating content can be burdened by the need to format content. The goal of Living Sky Technologies is to stamp out these distractions and guide the content creator down a clear, productive path. The Living Sky team understands how the process of modern writing can cause distractions and impair the flow of productivity. Our software is able to establish patterns from the seemingly random nature of drafting, formatting, and editing to enhance the writing and content creation process.").perform();
		Thread.sleep(7000);
}


	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Document Editor page Test");
		Browser.close();
	}
	
}


