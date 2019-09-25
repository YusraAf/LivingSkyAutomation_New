package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class SignUP extends PageBase{
	
	public SignUP(WebDriver driver) {
		
		super(driver);
		this.setUrl("signup");
	} 
	
	
@FindBy(name= "email")
@CacheLookup
public WebElement txt_userName;

@FindBy(name= "password")
@CacheLookup
public WebElement txt_password;

@FindBy(name= "confirmPassword")
@CacheLookup
public WebElement txt_confirmPassword;

@FindBy(css = ".check:nth-child(3)")
@CacheLookup
public WebElement radio_termsandCond;

@FindBy(xpath= "//div[@class='form-groups']//div[2]//div[1]//label[1]//span[1]")
@CacheLookup
public WebElement radio_updates;	

@FindBy(css = ".btn-text")
@CacheLookup
public WebElement btn_signUp;

@FindBy(name = "answer")
@CacheLookup
public WebElement txt_capcha;

@FindBy(xpath = "//*[@name='arrowCircleRight']")
//(css = ".continue > svg")
@CacheLookup
public WebElement btn_capcha;

@FindBy(xpath="//div[contains(text(),'Sign up with Facebook')]")
@CacheLookup
public WebElement btn_Facebook;

@FindBy(xpath="//div[contains(text(),'Sign up with Google')]")
@CacheLookup
public WebElement btn_Google;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]/span[2]/a[1]")
@CacheLookup
public WebElement link_TermsPolicy;

@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/label[1]/span[2]/a[2]")
@CacheLookup
public WebElement link_PrivacyPolicy;

@FindBy(xpath="//p[@class='statusText error-msg']")
@CacheLookup
public WebElement text_ErrorMSg;


}
