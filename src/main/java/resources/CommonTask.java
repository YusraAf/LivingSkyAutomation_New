package resources;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class CommonTask extends PageBase {

	
	
	public CommonTask(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public List<WebElement> getLiElementInUl(WebElement path) {
		
		WebElement ul_element = path;
        List<WebElement> li_All = ul_element.findElements(By.tagName("li"));
        System.out.println(li_All.size());
       /* for(int i = 0; i < li_All.size(); i++){
            System.out.println(li_All.get(i).getText());
        }*/
        //OR
        for(WebElement element : li_All){
            System.out.println(element.getText());
        }
		return li_All;
	} 

	
public static int randomNumber() {
	
	return (int)(Math.random()*20);
}

	  public void verifyTextOnThePage(String expected, String path)
      {

          try
          {
              if (driver.findElement(By.xpath(path)).getText().contains(expected))
              //if (expected == (driver.FindElement(By.XPath(path)).Text))
              {
                  System.out.println(expected + " text is on this page");
              }
              else
              {
            	  System.out.println(expected + " text is NOT on this page");
                  //throw new WebDriverException(exception.Message);
              }
          }

          catch (WebDriverException e)
          {
              throw new WebDriverException(e);
          }

      }


      public void clickOnLink(String path)
      {
          WebElement upLoadVolData = driver.findElement(By.xpath(path));
         // System.Threading.Thread.Sleep(7000);
          //driver1.manage().timeouts().ImplicitlyWait(TimeSpan.FromSeconds(15));

          upLoadVolData.click();
        //  driver1.manage().timeouts().ImplicitlyWait(TimeSpan.FromSeconds(15));

      }

      public void moveMouseAndClick(WebElement el) throws InterruptedException
      {
          Actions action = new Actions(driver);
           action.moveToElement(el).build().perform();
           el.click();
          Thread.sleep(500);
        
      }
      
      public void mouseHoverOnly(WebElement el) throws InterruptedException
      {
          Actions action = new Actions(driver);
           action.moveToElement(el).build().perform();
          
          Thread.sleep(500);
        
      }

   /*
    * 
    *public void moveMouse(IWebElement el, IWebDriver driver)
        {
            // it will click on the element
            Actions action = new Actions(driver);
            System.Threading.Thread.Sleep(7000);
            driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(20));

            try
            {
                action.MoveToElement(el).Click().Perform();
                System.Threading.Thread.Sleep(7000);
                driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(20));
            }
            catch (WebDriverException e)
            {
                Console.WriteLine("Exception was raised on locating element: " + e.Message);
            }

        }

        public void MouseOver(IWebElement el, IWebDriver driver)
        {
            //it will just mousehover on the element

            Console.WriteLine("In MouseOver");
            Actions action = new Actions(driver);
            System.Threading.Thread.Sleep(7000);
            driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(20));

            try
            {
                action.MoveToElement(el).Build().Perform();
                System.Threading.Thread.Sleep(7000);
                driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(20));
            }

            catch (WebDriverException e)
            {
                Console.WriteLine("Exception was raised on locating element: " + e.Message);
            }
        }


        public void selectDropDown(String id, String text, IWebDriver driver)
        {
            System.Threading.Thread.Sleep(7000);
            try
            {
                new SelectElement(driver.FindElement(By.Id(id))).SelectByText(text);
                System.Threading.Thread.Sleep(7000);
            }
            catch (WebDriverException e)
            {
                Console.WriteLine("Exception was raised on locating element: " + e.Message);
            }
        }

        public void textCompareinAlert(IAlert alert, IWebDriver driver)
        {
            String alertText = alert.Text;
            if (alertText.Equals("No Data available for selected combination"))
            {
                //TakeScreenshot(driver, "ABC.Jpeg");
                Console.WriteLine("Text is matched.");                
                alert.Dismiss();
            }

            else if (alertText.Equals("Pack is not available for TOTAL EMEA.Please select clusters BALTICS/NORDICS/UK-IRELAND (or their respective countries),or individual countries BULGARIA/CROATIA/ROMANIA/SERBIA/SLOVENIA/ITALY/PORTUGAL to view Pack Report."))
            {
                Console.WriteLine("Pack is not available");
                alert.Dismiss();

            }

            else
            {
                Console.WriteLine("There is some mismatch in the text.");
            }
        }


        public void TakeScreenshot(IWebDriver driver, string imagename)
        {
            try
            {
               
                System.Threading.Thread.Sleep(7000);
                ITakesScreenshot screenshotDriver = driver as ITakesScreenshot;

                Screenshot screenshot = screenshotDriver.GetScreenshot();
                Console.WriteLine("Checking the Screenshot debug  "+screenshot.ToString());
                string saveLocation = @"C:\MyStuff\Professional\J&J\SeleniumScript\" + imagename;
                screenshot.SaveAsFile(saveLocation, ImageFormat.Jpeg);

            }
            catch (Exception ex)
            {
                Console.WriteLine("Image not found");
            }
        }


    * 
    */
      
    public static void takeScreenShot(String methodAndClass) throws IOException {

   	 TakesScreenshot ts = (TakesScreenshot)driver;
   	 File source = ts.getScreenshotAs(OutputType.FILE);
   	 String dest = "screenshots/"+methodAndClass+".png";
   	 File destination = new File(dest);
   	 FileUtils.copyFile(source, destination);
   	 
    }
      
 public List<Object> childWindowHandler (WebElement el, String pageUrl, String parentWindow) throws InterruptedException {
	
	 el.click();
	 //Thread.sleep(200);
	 
	 for (String childWindow : driver.getWindowHandles()) {
		 driver.switchTo().window(childWindow);
	 }
	 boolean actualUrl = driver.getCurrentUrl().contains(pageUrl);
	 Thread.sleep(400);
     System.out.println("Link Url====>" + actualUrl);
     

     List<Object> listOne = new ArrayList<Object>();
     listOne.add(driver);
     listOne.add(actualUrl);
    

	// AssertJUnit.assertEquals(actualUrl, true);
     

	 //driver.close();
	// driver.switchTo().window(parentWindow);
	 return listOne;
	 
	 
 }
 public WebDriver backToParentWinFromChildWin (String parentWindow) {

	driver.close();
	driver.switchTo().window(parentWindow);
    return driver;
 } 
 
 
 public void dragAndDrop(WebElement element, WebElement target) {
	 
	//tried possible way 1
//		(new Actions(driver)).clickAndHold(element).moveToElement(target1).release().perform();
		
		//tried possible way 2
		
	 /*
	   new Actions(driver)
		.clickAndHold(dragPoint)
		.moveByOffset(0, -10)
		.moveToElement(dropPoint,0,10)
		.release()
		.build()
		.perform();

	  */
		
		//tried possible way 3
		//(new Actions(driver)).dragAndDropBy(element, 1079,195).build().perform();
		
		
		//tried possible way 4
		//Action dragAndDrop = action.clickAndHold(element).moveToElement(target1).click().release(target1).build();
		//dragAndDrop.perform();
		
		//tried possible way 5
		final String java_script =
				"var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
				                "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
				                "ction(format,data){this.items[format]=data;this.types.append(for" +
				                "mat);},getData:function(format){return this.items[format];},clea" +
				                "rData:function(format){}};var emit=function(event,target){var ev" +
				                "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
				                "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
				                "dragstart',src);emit('dragenter',tgt);emit('dragover',tgt);emit(" +
				                "'drop',tgt);emit('dragend',src);";
		
		
		        ((JavascriptExecutor)driver).executeScript(java_script, element, target);
				  
 }
 
 public void dragAndDrop2(WebElement element, WebElement target) {
	 
		//tried possible way 1
//			(new Actions(driver)).clickAndHold(element).moveToElement(target1).release().perform();
			
			//tried possible way 2
			
		 /*
		   new Actions(driver)
			.clickAndHold(dragPoint)
			.moveByOffset(0, -10)
			.moveToElement(dropPoint,0,10)
			.release()
			.build()
			.perform();

		  */
			
			//tried possible way 3
			//(new Actions(driver)).dragAndDropBy(element, 1079,195).build().perform();
			
			
			//tried possible way 4
			//Action dragAndDrop = action.clickAndHold(element).moveToElement(target1).click().release(target1).build();
			//dragAndDrop.perform();
			
			//tried possible way 5
		/*	final String java_script =
					"var src=arguments[0],tgt=arguments[1];var dataTransfer={dropEffe" +
					                "ct:'',effectAllowed:'all',files:[],items:{},types:[],setData:fun" +
					                "ction(format,data){this.items[format]=data;this.types.append(for" +
					                "mat);},getData:function(format){return this.items[format];},clea" +
					                "rData:function(format){}};var emit=function(event,target){var ev" +
					                "t=document.createEvent('Event');evt.initEvent(event,true,false);" +
					                "evt.dataTransfer=dataTransfer;target.dispatchEvent(evt);};emit('" +
					                "dragstart',src);"
					                + "var mouseMove = function(){\r\n" + 
					                "  var evt = document.createEvent(\"MouseEvents\");\r\n" + 
					                "  evt.initMouseEvent(\"mousemove\", true, true, window, 1, 1, 1, 1100, 400, false, false, false, false, 0, tgt);\r\n" + 
					                "  document.body.dispatchEvent(evt);\r\n" + 
					                "}\r\n" + 
					                "\r\n" + 
					                "mouseMove();"
					                + ""
					                + "emit('dragenter',tgt);emit('dragover',tgt);emit(" +
					                "'drop',tgt);emit('dragend',src);";
			
			*/
	 
			
		      
	 
	 final String java_script ="var selectorDrag = arguments[0], selectorDrop= arguments[1];var triggerDragAndDrop = function (selectorDrag, selectorDrop) {\r\n" + 
	 		"  // function for triggering mouse events\r\n" + 
	 		"  var fireMouseEvent = function (type, elem, centerX, centerY) {\r\n" + 
	 		"    var evt = document.createEvent('MouseEvents');\r\n" + 
	 		"    evt.initMouseEvent(type, true, true, window, 1, 1, 1, centerX, centerY, false, false, false, false, 0, elem);\r\n" + 
	 		"    elem.dispatchEvent(evt);\r\n" + 
	 		"  };\r\n" + 
	 		"  // fetch target elements\r\n" + 
	 		"  var elemDrag = document.querySelector(selectorDrag);\r\n" + 
	 		"  var elemDrop = document.querySelector(selectorDrop);\r\n" + 
	 		"  if (!elemDrag || !elemDrop) return false;\r\n" + 
	 		"  // calculate positions\r\n" + 
	 		"  var pos = elemDrag.getBoundingClientRect();\r\n" + 
	 		"  var center1X = Math.floor((pos.left + pos.right) / 2);\r\n" + 
	 		"  var center1Y = Math.floor((pos.top + pos.bottom) / 2);\r\n" + 
	 		"  pos = elemDrop.getBoundingClientRect();\r\n" + 
	 		"  var center2X = Math.floor((pos.left + pos.right) *2 / 3);\r\n" + 
	 		"  var center2Y = Math.floor((pos.top + pos.bottom) / 2);\r\n" + 
	 		"  console.log('(' + center1X + ', ' + center1Y + ') (' + center2X + ', ' + center2Y + ')');\r\n" + 
	 		"  // mouse over dragged element and mousedown\r\n" + 
	 		"  fireMouseEvent('mousemove', elemDrag, center1X, center1Y);\r\n" + 
	 		"  fireMouseEvent('mouseenter', elemDrag, center1X, center1Y);\r\n" + 
	 		"  fireMouseEvent('mouseover', elemDrag, center1X, center1Y);\r\n" + 
	 		"  fireMouseEvent('mousedown', elemDrag, center1X, center1Y);\r\n" + 
	 		"  // start dragging process over to drop target\r\n" + 
	 		"  fireMouseEvent('dragstart', elemDrag, center1X, center1Y);\r\n" + 
	 		"  fireMouseEvent('drag', elemDrag, center1X, center1Y);\r\n" + 
	 		"  fireMouseEvent('mousemove', elemDrag, center1X, center1Y);\r\n" + 
	 		"  fireMouseEvent('drag', elemDrag, center2X, center2Y);\r\n" + 
	 		"  fireMouseEvent('mousemove', elemDrop, center2X, center2Y);\r\n" + 
	 		"  // trigger dragging process on top of drop target\r\n" + 
	 		"  fireMouseEvent('mouseenter', elemDrop, center2X, center2Y);\r\n" + 
	 		"  fireMouseEvent('dragenter', elemDrop, center2X, center2Y);\r\n" + 
	 		"  fireMouseEvent('mouseover', elemDrop, center2X, center2Y);\r\n" + 
	 		"  fireMouseEvent('dragover', elemDrop, center2X, center2Y);\r\n" + 
	 		"  // release dragged element on top of drop target\r\n" + 
	 		"  fireMouseEvent('drop', elemDrop, center2X, center2Y);\r\n" + 
	 		"  fireMouseEvent('dragend', elemDrag, center2X, center2Y);\r\n" + 
	 		"  fireMouseEvent('mouseup', elemDrag, center2X, center2Y);\r\n" + 
	 		"  return true;\r\n" + 
	 		"};triggerDragAndDrop(selectorDrag, selectorDrop);";
	 
	 
	 ((JavascriptExecutor)driver).executeScript(java_script,element,target);
					  
	 }
 
} 
