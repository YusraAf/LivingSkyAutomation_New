package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class LoginPage extends PageBase{
	
	
	public LoginPage(WebDriver driver) {
	
		super(driver);
		this.setUrl("login");
	}
//page factory
	//--update on jan 2021
@FindBy(name= "email")
@CacheLookup
public WebElement txt_userName;

//--update on jan 2021
@FindBy(name= "password")
@CacheLookup
public WebElement txt_password;

//--update on jan 2021
@FindBy(xpath= "//body/reach-portal[2]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
@CacheLookup
public WebElement btn_login;

//--update on jan 2021
@FindBy(xpath="//span[@class='check']")
public WebElement radio_remember_me;

@FindBy(xpath= "//div[contains(text(),'Sign in with Facebook')]")
@CacheLookup
public WebElement btn_signInFb;

@FindBy(xpath= "//div[contains(text(),'Sign in with Google')]")
@CacheLookup
public WebElement btn_signInGoogle;

}
