package LST.Lst;

import java.awt.AWTException;
import java.awt.Desktop.Action;
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
import org.openqa.selenium.Keys;
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
import pageObjects.Workspace;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.ProjectDashboard;
import pageObjects.Trash;
import resources.Browser;
import resources.CommonTask;
import resources.UploadFile;

public class ProjectDashboardTest  extends TestBase {
	
	//SoftAssert softassert5 = new SoftAssert();
	public static Logger logger = LogManager.getLogger(TestBase.class.getName());
	private LandingPage land;
	private LoginTest log;
	private Workspace das = new Workspace(driver);
	private ProjectDashboard pro;
	private Trash trs = new Trash(driver);
	private CommonTask com  = new CommonTask(driver);;
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {	
		
		driver = Browser.getInstance();
		driver.get(baseUrl);
		
		log =new LoginTest();

		log.doSignin("chetan+19@livingskytech.com", "abcd1234");

		Thread.sleep(1000);

	}	
	
	@Test(priority=1) 
	public void verifyCreateNewFolderUsingPlusBottonTest() throws IOException, InterruptedException, Exception {
		
		//das.initElement();
		
		//das.btn_newProject.click();
		logger.info("This is inside in Project Dashboard Page =====> Verify Create a New Folder using Plus button from Left sidebar");
		pro = new ProjectDashboard(driver);
		pro.initElement();
	
		com.moveMouseAndClick(pro.btn_Plus_CreateNewFolder_Sidebar);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		pro.link_MyProjects_Sidebar.click();
		
		com.moveMouseAndClick(pro.thumbnail_first_Folder_from_Grid);
		
		String  folderName = System.getProperty("folderName");
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(pro.text_first_Folder_Title_from_grid.getText(),folderName);
		Thread.sleep(3000);		
		
		System.out.println("Folder Name out: "+ pro.text_first_Folder_Title_from_grid.getText());
		sa.assertAll();
		
		//pro.icon_ViewDetails_ProjectDashboard_UniversalMenu.click();
		
	}
	
	@Test(priority=2)
	
    public void verifyFolderActionMenuOptions_GridViewTest() throws IOException, InterruptedException, Exception {
          
		logger.info("This is inside in Project Dashboard Page =====> Verify All Action Menu Options of Folder");
		
		pro.link_MyProjects_Sidebar.click();
	
		com.moveMouseAndClick(pro.thumbnail_first_Folder_from_Grid);
		
		WebElement folderActionMenu = pro.thumbnail_first_Folder_from_Grid;
		
		Actions action= new Actions(driver);
		//action.contextClick(projectActionMenu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		action.contextClick(folderActionMenu).build().perform();
		
		AssertJUnit.assertTrue(pro.actionMenu_Rename_Folder.isDisplayed());
		logger.info("Rename option is displayed for folder inside the action menu.");
		
		AssertJUnit.assertTrue(pro.actionMenu_Trash_Folder.isDisplayed());
		logger.info("Trash option is displayed for folder inside the action menu.");
		Thread.sleep(2000);		
	}

	@Test(priority=3)

	public void verifyRenameFolder_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Renaming folder name using Action Menu");
		com.mouseHoverOnly(pro.actionMenu_Rename_Folder);
		pro.actionMenu_Rename_Folder.click();
		//pro.actionMenu_Rename_Project.clear();
	    driver.findElement(By.xpath("//input[@value='Untitled Folder']")).sendKeys("FolderNameRenamed");
	    Thread.sleep(2000);		
    }
		
	@Test(priority=4)

	public void verifyTrashFolder_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Trash Folder using Action Menu");
	
		pro.link_MyProjects_Sidebar.click();
		
		com.moveMouseAndClick(pro.thumbnail_first_Folder_from_Grid);
		
		WebElement folderActionMenu = pro.thumbnail_first_Folder_from_Grid;
		
		Actions action= new Actions(driver);
		//action.contextClick(projectActionMenu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		action.contextClick(folderActionMenu).build().perform();
		Thread.sleep(2000);
		com.mouseHoverOnly(pro.actionMenu_Trash_Folder);
		pro.actionMenu_Trash_Folder.click();
		Thread.sleep(2000);
		
    }

	@Test(priority=5) 
	public void verifyCreateProjectUsingNewProjectButtonTest() throws IOException, InterruptedException, Exception {
		
		das.initElement();
		
		//das.btn_newProject.click();
		logger.info("This is inside in Project Dashboard Page =====> Verify Create a New Project using New Project button");
		pro = new ProjectDashboard(das.getDriver());
		pro.initElement();
	
		com.moveMouseAndClick(pro.btn_NewProject_ProjectsTopbar);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		
		com.moveMouseAndClick(das.icon_BackArrow_Workspace_UniversalMenu);
		Thread.sleep(2000);
		
		pro.link_MyProjects_Sidebar.click();
	
		com.moveMouseAndClick(pro.thumbnail_first_Project_from_Grid);
		
		String  projectName = System.getProperty("projectName");
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(pro.text_first_Project_Title_from_grid.getText(),projectName);
		Thread.sleep(3000);		
		
		System.out.println("Project Name out: "+ pro.text_first_Project_Title_from_grid.getText());
		sa.assertAll();
	}	
		//pro.icon_ViewDetails_ProjectDashboard_UniversalMenu.click();
		
		/*
		int number = com.randomNumber();
		String  projectName = System.getProperty("projectName");
				
		pro.nav_startTypingProjectName.sendKeys(projectName+number);
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
		
	
	public boolean elementHasClass(WebElement element, String active) {
	    return element.getAttribute("class").contains(active);
	}*/
	
	@Test(priority=6)
	
    public void verifyProjectActionMenuOptions_GridViewTest() throws IOException, InterruptedException, Exception {
          
		logger.info("This is inside in Project Dashboard Page =====> Verify All Action Menu Options of Project");
		
		pro.link_MyProjects_Sidebar.click();
	
		com.moveMouseAndClick(pro.thumbnail_first_Project_from_Grid);
		
		WebElement projectActionMenu = pro.thumbnail_first_Project_from_Grid;
		
		Actions action= new Actions(driver);
		//action.contextClick(projectActionMenu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		action.contextClick(projectActionMenu).build().perform();
		
		AssertJUnit.assertTrue(pro.actionMenu_Rename_Project.isDisplayed());
		logger.info("Rename option is displayed for project inside the action menu.");
		
		AssertJUnit.assertTrue(pro.actionMenu_addToFavourites_Project.isDisplayed());
		logger.info("Add to Favoutites option is displayed for project inside the action menu.");
		
		AssertJUnit.assertTrue(pro.actionMenu_viewDetails_Project.isDisplayed());
		logger.info("View details option is displayed for project inside the action menu.");
		
		AssertJUnit.assertTrue(pro.actionMenu_trash_Project.isDisplayed());
		logger.info("Trash option is displayed for project inside the action menu.");
		
	}

	@Test(priority=7)

	public void verifyRenameProject_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Renaming project name using Action Menu");
		
		com.mouseHoverOnly(pro.actionMenu_Rename_Project);
		
		pro.actionMenu_Rename_Project.click();
		//pro.actionMenu_Rename_Project.clear();
	    driver.findElement(By.xpath("//input[@value='Untitled Project']")).sendKeys("ProjectNameRenamed");
		
    }
		
	@Test(priority=8)

	public void verifyAddToFavouritesProject_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Add To Favourites project using Action Menu");
	
		pro.link_MyProjects_Sidebar.click();
		
		com.moveMouseAndClick(pro.thumbnail_first_Project_from_Grid);
		
		WebElement projectActionMenu = pro.thumbnail_first_Project_from_Grid;
		
		Actions action= new Actions(driver);
		//action.contextClick(projectActionMenu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		action.contextClick(projectActionMenu).build().perform();
		
		com.mouseHoverOnly(pro.actionMenu_addToFavourites_Project);
		
		pro.actionMenu_addToFavourites_Project.click();
		Thread.sleep(1000);
	}
		
	@Test(priority=9)

	public void verifyFavouritedProject_From_FavouriteTest() throws IOException, InterruptedException, Exception {
			
		logger.info("This is inside in Project Dashboard Page =====> Verify Favourited project from Favourite folder");
		
		pro.link_Favorites_Sidebar.click();
		
		com.moveMouseAndClick(pro.thumbnail_first_Project_from_Favorites);
		
		String  renameProjectName = System.getProperty("renameProjectName");
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(pro.text_first_Project_title_from_Favorites.getText(),renameProjectName);
		Thread.sleep(3000);		
		
		System.out.println("Project Name out from Favorites: "+ pro.text_first_Project_title_from_Favorites.getText());
		sa.assertAll();
		
    }

	@Test(priority=10)

	public void verifyOpeningViewDetails_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Opening Project View Details pane using Action Menu");
	
		pro.link_MyProjects_Sidebar.click();
		
		com.moveMouseAndClick(pro.thumbnail_first_Project_from_Grid);
		
		WebElement projectActionMenu = pro.thumbnail_first_Project_from_Grid;
		
		Actions action= new Actions(driver);
		//action.contextClick(projectActionMenu).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		action.contextClick(projectActionMenu).build().perform();
		
		com.mouseHoverOnly(pro.actionMenu_viewDetails_Project);
		
		pro.actionMenu_viewDetails_Project.click();
		Thread.sleep(1000);
	}

	@Test(priority=11)

	public void verifyUploadingProjectImage_FromViewDetails_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Uploading Project Image from View Details pane");
		
		com.mouseHoverOnly(pro.sidebar_ProjectDetails);
		
		String filepath=System.getProperty("user.dir")+"/Images/MyImage3.jpeg";
		com.moveMouseAndClick(pro.link_UploadImage_ProjectDetails);

		UploadFile upfile = new UploadFile();
		upfile.upload(filepath);

		Thread.sleep(1000);
		
    }


	@Test(priority=12)

	public void verifyRenameProjectTitle_FromViewDetails_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {

		com.mouseHoverOnly(pro.sidebar_ProjectDetails);
		com.moveMouseAndClick(pro.txt_ProjectTitle_ProjectDetails);
		
		WebElement projectTitle = pro.txt_ProjectTitle_ProjectDetails;

		Actions select = new Actions(driver);
		select.doubleClick(projectTitle).build().perform();
		
		//pro.txt_ProjectTitle_ProjectDetails.sendKeys(Keys.CONTROL + "a");
		pro.txt_ProjectTitle_ProjectDetails.sendKeys("WriteWay Project");
		Thread.sleep(1000);
			
	}

	@Test(priority=13)

	public void verifyRenameAuthorName_FromViewDetails_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(pro.sidebar_ProjectDetails);
		com.moveMouseAndClick(pro.txt_addAuthor_ProjectDetails);
	
		pro.txt_addAuthor_ProjectDetails.clear();
		//WebElement projectAuthor = pro.txt_addAuthor_ProjectDetails;
	
		//pro.txt_addAuthor_ProjectDetails.sendKeys(Keys.CONTROL + "a");

		//Actions select = new Actions(driver);
		//select.doubleClick(projectAuthor).build().perform();
		
		pro.txt_addAuthor_ProjectDetails.sendKeys("Living Sky Technologies");
		Thread.sleep(1000);
			
	}

	@Test(priority=14)

	public void verifyAddProjectDescription_FromViewDetails_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		com.mouseHoverOnly(pro.sidebar_ProjectDetails);
		com.moveMouseAndClick(pro.txt_addDescription_ProjectDetails);
		
		pro.txt_addDescription_ProjectDetails.sendKeys("This is my first WriteWay Project.");
		Thread.sleep(1000);
		
		pro.btn_closeDetailsPane_ProjectDetails.click();
		
	}

	@Test(priority=15)
	
	public void verifyTrashProject_Using_ActionMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Deleting project using Action Menu");
	
		pro.link_MyProjects_Sidebar.click();
		
		com.moveMouseAndClick(pro.thumbnail_first_Project_from_Grid);
		
		WebElement projectActionMenu = pro.thumbnail_first_Project_from_Grid;
		
		Actions action= new Actions(driver);
		action.contextClick(projectActionMenu).build().perform();
		
		com.mouseHoverOnly(pro.actionMenu_trash_Project);
		
		pro.actionMenu_trash_Project.click();
		Thread.sleep(1000);
	}
		
	@Test(priority=16)
		
	public void verifyTrashedProject_From_TrashTest() throws IOException, InterruptedException, Exception {		
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Deleted project From Trash Folder");
		
		trs.initElement();
		com.moveMouseAndClick(trs.link_Trash_Sidebar);
		
		com.moveMouseAndClick(trs.thumbnail_first_Trash_from_Grid);
		
		String  projectNamefrmTrash = System.getProperty("trashProjectName");
		
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(trs.txt_first_Trash_Project_from_Grid.getText(),projectNamefrmTrash);
		Thread.sleep(3000);		
		
		System.out.println("Project Name out from Trash: "+ trs.txt_first_Trash_Project_from_Grid.getText());
		sa.assertAll(); 

  	}

	@Test(priority=18)

	public void verifyCreateNewFolder_Using_ContextMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Creating a new folder using Context Menu");

		//pro.link_MyProjects_Sidebar.click();

		WebElement contextMenu = pro.container_ProjectDashboard_grid_view;

		Actions action= new Actions(driver);
		action.contextClick(contextMenu).build().perform();
		Thread.sleep(1000);

		com.moveMouseAndClick(pro.contextMenu_NewFolderCreation);
		Thread.sleep(3000);

	}

	@Test(priority=17)

	public void verifyCreateNewProject_Using_ContextMenu_GridViewTest() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Project Dashboard Page =====> Verify Creating a new project using Context Menu");

		pro.link_MyProjects_Sidebar.click();
		WebElement contextMenu = pro.container_ProjectDashboard_grid_view;

		Actions action= new Actions(driver);
		action.contextClick(contextMenu).build().perform();
		Thread.sleep(1000);

		com.moveMouseAndClick(pro.contextMenu_NewProjectCreation);
		Thread.sleep(2000);

		com.moveMouseAndClick(das.icon_BackArrow_Workspace_UniversalMenu);
		Thread.sleep(2000);

		pro.link_MyProjects_Sidebar.click();

	}
	
	@Test(priority=19)

	public void verifyCreateNewProject_Using_Keyboard_GridViewTest() throws IOException, InterruptedException, Exception {
		
	pro.link_MyProjects_Sidebar.click();
		
	com.moveMouseAndClick(pro.container_ProjectDashboard_grid_view);
	
	Actions action= new Actions(driver);
	action.keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(10000);
	
	/*WebElement ac = pro.container_ProjectDashboard_grid_view;
	Actions action= new Actions(driver);
	action.moveToElement(ac).click().keyDown(Keys.SHIFT).sendKeys("p").build().perform();
	Thread.sleep(10000);*/
	
	}
	
	
	@Test(priority=20)

	public void verifyCreateNewFolder_Using_Keyboard_GridViewTest() throws IOException, InterruptedException, Exception {
		
	com.moveMouseAndClick(das.icon_BackArrow_Workspace_UniversalMenu);
	Thread.sleep(2000);
	
	pro.link_MyProjects_Sidebar.click();
		
	com.moveMouseAndClick(pro.container_ProjectDashboard_grid_view);
	
	Actions action= new Actions(driver);
	action.keyDown(Keys.SHIFT).sendKeys("f").keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(10000);

	}
	
	/*
	@Test(priority=2)
	public void verifyOpenProjectfrom_GridView() throws InterruptedException {
		//das.link_projects.click();
		pro = new Project(das.getDriver());
		pro.initElement();
		com.moveMouseAndClick(pro.btn_first_Project_open_grid);
		Thread.sleep(500);
		com.mouseHoverOnly(pro.tab_document_inside_project);
		
		AssertJUnit.assertTrue(pro.tab_document_inside_project.isDisplayed());
		
		com.moveMouseAndClick(pro.tab_ideas_inside_project);
		//Thread.sleep(10000);
		AssertJUnit.assertTrue(pro.tab_ideas_inside_project.isDisplayed());
	}
	
	@Test(priority=3)
	
    public void verifyDeleteProject_from_GridView() throws IOException, InterruptedException, Exception {
          
        das.link_projects.click();
       

        com.moveMouseAndClick(pro.icon_grid);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
	
        WebElement hover = pro.thumbnail_first_Project_from_Grid;
        
        com.mouseHoverOnly(hover);
        Thread.sleep(2000);
        
        pro.btn_deleteProject_grid.click();
        com.moveMouseAndClick(pro.btn_delete_confirm_grid);
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
	//String pName =  trs.thumbnail_project_title.getText();
	//AssertJUnit.assertEquals(pName, System.getProperty("projectName"));
	//driver.findElement(By.className("project-name")).getText();

	}
	
	}
	
	@Test(priority=5)
	  public void verifyRestoreProjectFromTrash_Gridview() throws IOException, InterruptedException, Exception {
          
			com.moveMouseAndClick(trs.iconTrash_grid);
			
			WebDriverWait wait=new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
			 
	        WebElement restoreGrid = trs.thumbnail_first_Trash_from_Grid;
	        
	       com.mouseHoverOnly(restoreGrid);
	        trs.btn_restoreTrash_grid.click();
	        Thread.sleep(200);
	        
	    }
	
	@Test(priority=6) 
	public void verifyUndoProjectFromTrash_GridView() throws IOException, InterruptedException, Exception {
	
		com.moveMouseAndClick(trs.iconTrash_grid);
		Thread.sleep(300);
		        
		WebDriverWait wait1=new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]")));
		         //html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]/div[2]
		com.moveMouseAndClick(trs.undoProjectFromTrash_GridView);
		Thread.sleep(300);
		}

	@Test(priority=7)
	public void createProject_from_ListView() throws InterruptedException {
		das.link_projects.click();
		pro.initElement();
		
		com.moveMouseAndClick(pro.icon_list);
		
		//WebDriverWait wait=new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/button[1]"))));
		Thread.sleep(1000);
		
		//builder.moveToElement(pro.btn_newProject_inside_project).build().perform();
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
		//Thread.sleep(2000);
		  
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		js.executeScript("arguments[0].click();", pro.btn_first_Project_open_list);
		
		//this is not implemented yet
		com.moveMouseAndClick(pro.tab_document_inside_project);
		Thread.sleep(1000);
		AssertJUnit.assertTrue(pro.tab_document_inside_project.isDisplayed());
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
		
	     com.mouseHoverOnly(pro.thumbnail_first_Project_from_List);
			
	     // JavascriptExecutor js = (JavascriptExecutor)driver;	
				
		//js.executeScript("arguments[0].click();", pro.thumbnail_first_Project_from_List);
		//js.executeScript("arguments[0].click();", pro.btn_deleteProject_list);
				
	     pro.btn_deleteProject_list.click();
	     com.moveMouseAndClick(pro.btn_delete_confirm_list);
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
	
    // das.btn_logout.click();
	 
	}
	
	}
	@Test(priority=11)	
    public void verifyRestoreProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {
		
		logger.info("This is inside in Trash Page =====> Verify Restore Project From Trash_Listview");
		
		com.moveMouseAndClick(trs.iconTrash_list);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		 
        WebElement restoreList = trs.thumbnail_first_Trash_Project_from_List;
        
        com.mouseHoverOnly(restoreList);
        trs.btn_restoreTrash_list.click();
        Thread.sleep(200);
        
    }

	@Test(priority=12) 
	public void verifyUndoProjectFromTrash_ListView() throws IOException, InterruptedException, Exception {
	 	
		com.moveMouseAndClick(trs.iconTrash_list);
		Thread.sleep(300);
		        
		WebDriverWait wait1=new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]")));
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/ul[1]/li[1]/div[1]/section[1]")));
		WebElement undo = trs.undoProjectFromTrash_ListView;
		        
		com.mouseHoverOnly(undo);
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
			
			
			com.moveMouseAndClick(trs.iconTrash_grid);
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
			
	        com.mouseHoverOnly(deleteForeverGrid);
	        trs.btn_deleteForever_Trash_grid.click();
	        Thread.sleep(200);
	        com.mouseHoverOnly(trs.txt_deleteTrash_confirm_grid);
	       
	        trs.txt_deleteTrash_confirm_grid.sendKeys("DELETE");
	        trs.btn_deleteTrash_confirmClick_grid.click();
	        Thread.sleep(200);
	       
	    }
	
	 @Test(priority=14)	
	 public void verifyDeleteForeverProjectFromTrash_Listview() throws IOException, InterruptedException, Exception {   
		   
		 	com.moveMouseAndClick(pro.icon_list);
			Thread.sleep(200);			
		 
		//	verifyDeleteProject_from_LISTView();
		 
		 	das.link_trash.click();
	       
			trs.initElement();
			logger.info("This is inside in Trash Page =====> Verify DeleteForever Project From Trash_Listview");
			
			WebDriverWait wait=new WebDriverWait(driver, 50);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/section[1]/div[1]")));
		    
			Thread.sleep(400);
	        WebElement deleteForeverList = trs.thumbnail_first_Trash_Project_from_List;
	        
	        com.mouseHoverOnly(deleteForeverList);
	        //deleteForeverList.click();
	        //Thread.sleep(500);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='control__content-btn delete-action delete-forever-list']")));
		  
	        trs.btn_deleteForever_Trash_list.click();
	        Thread.sleep(500);
	        com.mouseHoverOnly(trs.txt_deleteTrash_confirm_list);
	        trs.txt_deleteTrash_confirm_list.sendKeys("DELETE");
	        trs.btn_deleteTrash_confirmClick_list.click();
	        Thread.sleep(200);
	        
	    }

	@Test(priority=15)
	public void verify_Project_Grid_List() throws InterruptedException {
		das.link_projects.click();
		Thread.sleep(200);
		pro.initElement();
		com.moveMouseAndClick(pro.icon_grid);
		SoftAssert sa =new SoftAssert();
		sa.assertTrue(pro.container_grid_view.isDisplayed(),"It is in Grid View.");
		das.link_projects.click();
		
			com.moveMouseAndClick(pro.icon_list);
		
			sa.assertTrue(pro.container_list_view.isDisplayed(),"It is in List View.");
			sa.assertAll();
	 }
  public void verifyDropDownForSorting() throws InterruptedException{
	
	  das.link_projects.click();
      
      /***
       * Creating multiple project
       */
/* 451	  for(int i=0;i<3;i++) {  
		  createProject_from_ListView();
	     
	  	}
  	} 

  	@Test(priority=16)
	public void verifyDeleteALLProjectFromTrash() throws IOException, InterruptedException, Exception {
	       das.link_projects.click();
	       
	      /***
	       * Creating multiple project
	       */
/* 464	       for(int i=0;i<3;i++) {
			 createProject_from_ListView();
		     verifyDeleteProject_from_LISTView();
	       }
		  
	       das.link_trash.click();
	       
	       trs.initElement();
	       logger.info("This is inside in Trash Page =====> Verify EmoptyTrash Project From Trash");
	       
	       
	       com.moveMouseAndClick(trs.btn_emptyTrash);
			
	       // WebElement emptyTrash = trash.txt_EmotyTrash_confirm;
	        
	      com.mouseHoverOnly(trs.txt_EmotyTrash_confirm);
	       trs.txt_EmotyTrash_confirm.sendKeys("DELETE ALL");
	       Thread.sleep(200);
	       trs.btn_EmotyTrash_confirmClick.click();
	       Thread.sleep(200);
	        
	    }

@Test(priority=17)    
public void verifySortingDropDownFromProject() throws IOException, InterruptedException, Exception {

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
/* 540	Thread.sleep(3000);
	
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
	} 593 */ 

	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing Dashboard page Test");
		Browser.close();
	}

}
