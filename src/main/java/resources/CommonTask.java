package resources;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class CommonTask {

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

	
public int randomNumber() {
	
	return (int)(Math.random()*2000);
}

	  public void verifyTextOnThePage(String expected, String path, WebDriver driver1)
      {

          try
          {
              if (driver1.findElement(By.xpath(path)).getText().contains(expected))
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


      public void clickOnLink(String path, WebDriver driver1)
      {
          WebElement upLoadVolData = driver1.findElement(By.xpath(path));
         // System.Threading.Thread.Sleep(7000);
          //driver1.manage().timeouts().ImplicitlyWait(TimeSpan.FromSeconds(15));

          upLoadVolData.click();
        //  driver1.manage().timeouts().ImplicitlyWait(TimeSpan.FromSeconds(15));

      }

      public void moveMouse(WebElement el, WebDriver driver) throws InterruptedException
      {
          Actions action = new Actions(driver);
           action.moveToElement(el).click().perform();
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
 public WebDriver childWindowHandler (WebDriver driver, WebElement el, String pageUrl, String parentWindow) {
	 //String parentWindow = driver.getWindowHandle();
	 el.click();
	 //Thread.sleep(200);
	 
	 for (String childWindow : driver.getWindowHandles()) {
		 driver.switchTo().window(childWindow);
	 }
	 boolean actualUrl = driver.getCurrentUrl().contains(pageUrl);
     System.out.println("Link Url====>" + actualUrl);
     
	// AssertJUnit.assertEquals(actualUrl, true);
     
	 //driver.close();
	// driver.switchTo().window(parentWindow);
	 return driver;
	 
	 
 }
 public WebDriver backToParentWinFromChildWin (WebDriver driver, String parentWindow) {

	 driver.close();
	 driver.switchTo().window(parentWindow);
	 return driver;
	 
 }
} 
