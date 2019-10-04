package resources;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener{
	
	//public WebDriver driver;
	//CommonTask com = new CommonTask(super.driver);
	public void onFinish(ITestContext context) {
		System.out.println("Test started- "+context.getName());
		 
	}
	
	public void onStart(ITestContext context) {
	    // not implemented
		System.out.println("Test started- "+context.getName());
	  }
	
	
	public void onTestStart(ITestResult result) {
	    // not implemented
		System.out.println("Test started- "+result.getName());
		 
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	  public void onTestSuccess(ITestResult result) {
	    // not implemented
		  System.out.println("Test started- "+result.getName());
		  
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public void onTestFailure(ITestResult result) {
	    // not implemented
		  String methodAndClass = result.getMethod()+result.getName()+CommonTask.randomNumber();
		  try {
			CommonTask.takeScreenShot(methodAndClass);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
		  System.out.println("Test started- "+result.getName());
		  
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	    System.out.println("Test started- "+result.getName());
	    
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
	   * and calling all their Configuration methods.
	   */
	
}
