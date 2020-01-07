package LST.Lst;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	private LoginTest log;
	private Dashboard das = new Dashboard(driver);
	private Project pro;
	private DocumentEditor doce;
	private CommonTask com  = new CommonTask(driver);
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		
		driver = Browser.getInstance();
		driver.get(baseUrl);
		
		log =new LoginTest();
		log.doSignin("test8@gmail.com", "asdF1234");;
		
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
		
		System.out.println("Document name is ----> " + doce.tab_documentName_DocumentEditor.getText());
	//WebDriverWait wait = new WebDriverWait(driver, 50);
	//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/section[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]")));
		
	
	WebElement title = doce.nav_FirstTitle_DocumentEditor;
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
				"What if an idea could exist interrupted, flowing freely from the imagination to the page? What if the research didn’t draw you away from the page, or formatting didn’t drag out the process? Answering these questions has led the Living Sky Technologies team to discover a way to simplify the creativity process by building a platform from which any content creator can be launched.").perform();
		Thread.sleep(1000);
}

@Test(priority=2) 	
public void verifyEnterkayDocumentWithArea() throws IOException, InterruptedException, Exception {

		System.out.println("Document name is ----> " + doce.tab_documentName_DocumentEditor.getText());
	
		Actions action = new Actions(driver);
		
		com.moveMouseAndClick(doce.mousehover_SecondCard_DocumentEditor);
		WebElement secondTitle = doce.nav_SecondTitle_DocumentEditor;
		
		action.click(secondTitle).sendKeys("Living Sky Technologies2" + Keys.ENTER).perform();
		Thread.sleep(1000);
		
}

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Document Editor page Test");
		Browser.close();
	}
	
}


