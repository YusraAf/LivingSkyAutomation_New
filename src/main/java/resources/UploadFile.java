package resources;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class UploadFile {

//Property prop = new Property();

/*
 *  Funtion to set the value in clipboard
 */
private static void setClipboardData(String string) {
    // StringSelection is a class that can be used for copy and paste
    // operations.
    StringSelection stringSelection = new StringSelection(string);
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
}

/*
 *  Function to upload the file using robot class
 */
public void upload(String fileLocation) throws Exception {

    // Setting clipboard with file location
    setClipboardData(fileLocation);

    // native key strokes for CTRL, V and ENTER keys
    Robot robot = new Robot();

    Thread.sleep(2000);
String os="windows";
    switch (os) { // Pass your OS platform name here, I am using properties file where OS name is saved you can as a string.

    case "mac":
/*
        if (!System.getProperty("browser").equalsIgnoreCase("chrome")) { // In mac machine for chrome you need to switch focus to upload dialog again I have saved browser name in properties file you can pass it as string.
            robot.keyPress(KeyEvent.VK_META);
            System.out.println("---------------In MAC---------------");
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_TAB);
        }
        robot.delay(2000);
        System.out.println("---------------In MAC Chrome˝---------------");
        
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
    	
    	// Cmd + Tab is needed since it launches a Java app and the browser looses focus
    	 
    	robot.keyPress(KeyEvent.VK_META);
    	 
    	robot.keyPress(KeyEvent.VK_TAB);
    	 
    	robot.keyRelease(KeyEvent.VK_META);
    	 
    	robot.keyRelease(KeyEvent.VK_TAB);
    	 
    	robot.delay(500);
    	 
    	//Open Goto window
    	 
    	robot.keyPress(KeyEvent.VK_META);
    	 
    	robot.keyPress(KeyEvent.VK_SHIFT);
    	 
    	robot.keyPress(KeyEvent.VK_G);
    	 
    	robot.keyRelease(KeyEvent.VK_META);
    	 
    	robot.keyRelease(KeyEvent.VK_SHIFT);
    	 
    	robot.keyRelease(KeyEvent.VK_G);
    	 
    	//Paste the clipboard value
    	 
    	robot.keyPress(KeyEvent.VK_META);
    	 
    	robot.keyPress(KeyEvent.VK_V);
    	 
    	robot.keyRelease(KeyEvent.VK_META);
    	 
    	robot.keyRelease(KeyEvent.VK_V);
    	 
    	//Press Enter key to close the Goto window and Upload window
    	 
    	robot.keyPress(KeyEvent.VK_ENTER);
    	 
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	 
    	robot.delay(500);
    	 
    	robot.keyPress(KeyEvent.VK_ENTER);
    	 
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
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
