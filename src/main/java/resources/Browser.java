 package resources;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.browsermob.proxy;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
//import net.lightbody.bmp.core.*;
public class Browser {
 
	 private static WebDriver driver;
	
	 public static WebDriver getInstance() {
	        if (driver == null) {
	        	
	            driver = getDefaultBrowser();
	            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        }
	        return driver;
	    }
	 public static void initBrowser()  {
		
		 cleanCookieCache();
		 setSize();
	        
	    }
	
	 
	 public static void setSize() {
		 
		 driver.manage().window().maximize();
	 } 
	 private static WebDriver getDefaultBrowser() {
		 
	        return getABrowser(System.getProperty("Browser"));
	    }

	    private static WebDriver getABrowser(final String browserName) {
	        if ("chrome".equals(browserName)) {
	            return initChrome();
	        } else if ("firefox".equals(browserName)) {
	            return initFirefox();
	        } else if ("safari".equals(browserName)) {
	            return initSafari();
	        } else {
	            throw new RuntimeException("No Valid Browser Found");
	        }
	    }
	    
	 
	    
	    private static WebDriver initIE() {
	        WebDriverManager.iedriver().arch32().setup();

	        driver = new InternetExplorerDriver();
	        initBrowser();
	        return driver;
	    }
	    
	    private static WebDriver initSafari() {
	    	WebDriver driver = new SafariDriver();
	    	
	   
	    	// initBrowser();
	    	driver.manage().window().maximize();
		     
		        return driver;
	    }

	    private static WebDriver initFirefox() {
	       
	    	WebDriverManager.firefoxdriver().setup();
	    	
		       driver = new FirefoxDriver();
		       driver.manage().window().maximize();
		       initBrowser();
		       return driver;
	    /*	
	    	BrowserMobProxy proxy = new BrowserMobProxyServer();
	        proxy.start(0);

	        // get the Selenium proxy object
	        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
	        String proxyOption = "--proxy-server=" + seleniumProxy.getHttpProxy();
	        
	        
	        proxy.addRequestFilter((request, contents, messageInfo)->{
	            request.headers().add("x-qa-super-user-token", "NWQwNGE5OWUtY2Y3OC0xMWU5LWJkY2ItMmEyYWUyZGJjY2U0");
	            System.out.println(request.headers().entries().toString());
	            return null;
	        });

		       FirefoxOptions option = new FirefoxOptions();
		       option.addArguments(proxyOption);
		       option.setProxy(seleniumProxy);
		   
	        // start the browser up
	         driver = new FirefoxDriver(option);
	         initBrowser();
	        return driver;*/
	    }

	    private static void disableDetailLoggingFirefox() {
	        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");//disable debug logging
	    } 
	    
	    public static String setProxy() {
	    	 // start the proxy
	        BrowserMobProxy proxy = new BrowserMobProxyServer();
	        proxy.start(0);

	        // get the Selenium proxy object
	        Proxy seleniumProxy = ClientUtil.createSeleniumProxy(proxy);
	     
	        proxy.addRequestFilter((request, contents, messageInfo)->{
	        request.headers().add("x-qa-super-user-token", "NWQwNGE5OWUtY2Y3OC0xMWU5LWJkY2ItMmEyYWUyZGJjY2U0");
	        System.out.println(request.headers().entries().toString());
	         return null;
	        });
	        
	        proxy.addResponseFilter((response, contents, messageInfo) -> {
	            //if ((contents.getContentType().startsWith("application/json"))) {
	              //  contents.setTextContents("");
	            //}
	            System.out.println(" Response: "+ response.headers().entries().toString());
	        }); 
	        
	        String proxyOption = "--proxy-server=" + seleniumProxy.getHttpProxy();
	       
	      
	        return proxyOption;
	    }

	/*  private static WebDriver initChrome() {
	       WebDriverManager.chromedriver().setup();
	        //WebDriverManager.chromedriver().version("77").setup();
	       // driver = new ChromeDriver();
	        //-------setup proxy here//
	       String proxyOption = setProxy();
	       
	        ChromeOptions option = new ChromeOptions();
	        option.addArguments(proxyOption);
	        option.addArguments("--window-size=1920,1080");
	        option.addArguments("--start-maximized");
	        option.addArguments("--ignore-certificate-errors");
	        //option.addArguments("--headless");
	       
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	       
	        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	        capabilities.setCapability(ChromeOptions.CAPABILITY, option);
	       // capabilities.setCapability(CapabilityType.PROXY, seleniumProxy);
	        driver = new ChromeDriver(option);
	        initBrowser();
	       
	     
	        return driver;
	    }
	*/
	   
	  private static WebDriver initChrome() {
		       WebDriverManager.chromedriver().setup();
		        //WebDriverManager.chromedriver().version("77").setup();
		       driver = new ChromeDriver();
		       driver.manage().window().maximize();
		       return driver;
		       
	    }
	    public static void pageRefresh() {
	    	driver.navigate().refresh();
	    }
	    
	    public static void goBackPreviousPage() {
	    	
	    	driver.navigate().back();
	    }
	    public void ClearChromeHistory() throws InterruptedException

	    {
	        //Navigate to History
	        driver.navigate().to("chrome://settings/clearBrowserData");//clearBrowsingDataDialog

	        WebElement ClearData = driver.findElement(By.id("clearBrowsingDataConfirm"));
	        ClearData.click();
	        Thread.sleep(5000);
	        
	    }

	    public void ClearBrowserCookies() throws InterruptedException
	    {
	    	driver.manage().deleteAllCookies();//delete all cookies
	    	Thread.sleep(5000); //wait 5 seconds to clear cookies.
	    }
	    
	    public void clearChromeBrowserData() throws InterruptedException 
	    {
	    	driver.get("chrome://settings/clearBrowserData");
	    	//  driver.wait(2);
	    	Thread.sleep(2000);
    
	    	driver.findElement(By.id("clearBrowsingDataConfirm")).click();
	    }
	    
	    private static void cleanCookieCache()
	    {
	    	driver.manage().getCookies().clear();
	    	driver.manage().deleteAllCookies();

	    }


	    public static void close() 
	    {
	    	//driver.close();
	    	
	    	driver.quit();
	    	driver = null;// to avoid closing time of browser by JVM
	    }

}
