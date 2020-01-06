package resources;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;



public class UploadFile {

	
	Robot robot ;
//Property prop = new Property();

/*
 *  Funtion to set the value in clipboard
 */
public void setClipboardData(String string) {
    // StringSelection is a class that can be used for copy and paste
    // operations.
    StringSelection stringSelection = new StringSelection(string);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
}


public  void useCommandTab() throws AWTException, InterruptedException {
	robot = new Robot();
	robot.keyPress(KeyEvent.VK_META);
    
    robot.keyPress(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_TAB);
    robot.keyRelease(KeyEvent.VK_META);
    TimeUnit.SECONDS.sleep(1);
    robot.delay(1000);
}

public void uploadFileInMac() throws InterruptedException, AWTException {
	robot = new Robot();
	
	 robot.keyPress(KeyEvent.VK_SHIFT);
     robot.delay(200);
     robot.keyPress(KeyEvent.VK_META);
     robot.delay(2000);
     robot.keyPress(KeyEvent.VK_G);
     
     robot.delay(200);
     robot.keyRelease(KeyEvent.VK_G);
     robot.delay(200);
     robot.keyRelease(KeyEvent.VK_META);
     robot.delay(200);
     robot.keyRelease(KeyEvent.VK_SHIFT);
     robot.delay(200);
     TimeUnit.SECONDS.sleep(1);
     
     robot.keyPress(KeyEvent.VK_META);
     robot.keyPress(KeyEvent.VK_V);
     robot.delay(500);
     
     robot.keyRelease(KeyEvent.VK_V);
     robot.keyRelease(KeyEvent.VK_META);
     
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
     robot.delay(2000);
     robot.keyPress(KeyEvent.VK_ENTER);
     robot.keyRelease(KeyEvent.VK_ENTER);
	
}

/*
 *  Function to upload the file using robot class
 */
public void upload(String fileLocation) throws Exception {
	
//	robot = new Robot();
    
	
	// Setting clipboard with file location
    setClipboardData(fileLocation);

    // native key strokes for CTRL, V and ENTER keys
  

   Thread.sleep(1000);
  // String os="mac";
    switch (System.getProperty("os")) { // Pass your OS platform name here, I am using properties file where OS name is saved you can as a string.

    case "mac":

       /* if (!System.getProperty("browser").equalsIgnoreCase("chrome")) { // In mac machine for chrome you need to switch focus to upload dialog again I have saved browser name in properties file you can pass it as string.
            robot.keyPress(KeyEvent.VK_META);
            System.out.println("---------------In MAC---------------");
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_TAB);
        }*/
    	
    	
    	useCommandTab();
       
    	uploadFileInMac();
    	
    	
    	break;

    case "windows":

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        break;

    }

}
}
