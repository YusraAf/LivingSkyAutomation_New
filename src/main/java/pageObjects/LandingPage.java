package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import resources.PageBase;

public class LandingPage extends PageBase{
	
	
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
	}
	 
	@FindBy(css="a[href*='signup']")
	@CacheLookup
	public WebElement txt_signup;
	
	@FindBy(css="a[href*='login']")
	@CacheLookup
	public WebElement txt_login;
	/*
	@FindBy(xpath="//div[@class='header-content']//div[1]//nav[1]//ul[1]")
	@CacheLookup
	public WebElement navBar_HeaderContent1;
	
	@FindBy(xpath="//div[2]//nav[1]//ul[1]")
	@CacheLookup
	public WebElement navBar_HeaderContent2;*/
	@FindBy(xpath="//a[@name='Try it for free']")
	@CacheLookup
	public WebElement navBar_HeaderContent3;

	@FindBy(xpath="//div[@class='main']/div[2]/div/div/div/a[1]")
	@CacheLookup
	public WebElement btn_Tryforfree;
	
	@FindBy(xpath="//div[@class='main']/div[2]/div/div/div/a[2]")
	@CacheLookup
	public WebElement btn_LearnMore;
	
	@FindBy(xpath="//div[@class='cta-link']/button")
	@CacheLookup
	public WebElement btn_TryLiveDemo;
	
	@FindBy(xpath="//h2[contains(text(),'Writing - the way it should be.')]")
	@CacheLookup
	public WebElement text_Writing;
	
	@FindBy(xpath="//div[@class='benefits']/div[1]/img")
	@CacheLookup
	public WebElement img_NoLimitions;
	@FindBy(xpath="//div[@class='benefits']/div[2]/img")
	@CacheLookup
	public WebElement img_Cloudbased;
	@FindBy(xpath="//div[@class='benefits']/div[3]/img")
	@CacheLookup
	public WebElement img_Mindmaps;
	@FindBy(xpath="//div[@class='benefits']/div[4]/img")
	@CacheLookup
	public WebElement img_RefManager;
	@FindBy(xpath="//div[@class='benefits']/div[5]/img")
	@CacheLookup
	public WebElement img_AutoFormat;
	@FindBy(xpath="//div[@class='benefits']/div[6]/img")
	@CacheLookup
	public WebElement img_ThemeDesigner;
	@FindBy(xpath="//div[@class='benefits']/div[7]/img")
	@CacheLookup
	public WebElement img_ArtIntelligence;
	@FindBy(xpath="//div[@class='benefits']/div[8]/img")
	@CacheLookup
	public WebElement img_MultipleDevices;
	@FindBy(xpath="//h4[contains(text(),'No limitations')]")
	@CacheLookup
	public WebElement lbl_NoLimitions;
	@FindBy(xpath="//h4[contains(text(),'Cloud-based')]")
	@CacheLookup
	public WebElement lbl_Cloudbased;
	@FindBy(xpath="//h4[contains(text(),'Mindmaps')]")
	@CacheLookup
	public WebElement lbl_Mindmaps;
	@FindBy(xpath="//h4[contains(text(),'Reference manager')]")
	@CacheLookup
	public WebElement lbl_RefManager;
	@FindBy(xpath="//h4[contains(text(),'Auto-formatting')]")
	@CacheLookup
	public WebElement lbl_AutoFormat;
	@FindBy(xpath="//h4[contains(text(),'Theme designer')]")
	@CacheLookup
	public WebElement lbl_ThemeDesigner;
	@FindBy(xpath="//h4[contains(text(),'Artificial intelligence')]")
	@CacheLookup
	public WebElement lbl_ArtIntelligence;
	@FindBy(xpath="//h4[contains(text(),'Multiple Devices')]")
	@CacheLookup
	public WebElement lbl_MultipleDevices;
	@FindBy(xpath="//div[@class='benefits']/div[1]/p")
	@CacheLookup
	public WebElement text_NoLimitions;
	@FindBy(xpath="//div[@class='benefits']/div[2]/p")
	@CacheLookup
	public WebElement text_Cloudbased;
	@FindBy(xpath="//div[@class='benefits']/div[3]/p")
	@CacheLookup
	public WebElement text_Mindmaps;
	@FindBy(xpath="//div[@class='benefits']/div[4]/p")
	@CacheLookup
	public WebElement text_RefManager;
	@FindBy(xpath="//div[@class='benefits']/div[5]/p")
	@CacheLookup
	public WebElement text_AutoFormat;
	@FindBy(xpath="//div[@class='benefits']/div[6]/p")
	@CacheLookup
	public WebElement text_ThemeDesigner;
	@FindBy(xpath="//div[@class='benefits']/div[7]/p")
	@CacheLookup
	public WebElement text_ArtIntelligence;
	@FindBy(xpath="//div[@class='benefits']/div[8]/p")
	@CacheLookup
	public WebElement text_MultipleDevices;
	@FindBy(xpath="//div[contains(text(),'Plan')]")
	@CacheLookup
	public WebElement text_Plan;
	@FindBy(xpath="//div[contains(text(),'Write')]")
	@CacheLookup
	public WebElement text_Write;
	@FindBy(xpath="//div[contains(text(),'Publish')]")
	@CacheLookup
	public WebElement text_Publish;
	@FindBy(xpath="//div[@class='stacked-text']/div[1]/div[1]/img")
	@CacheLookup
	public WebElement img_Plan;
	@FindBy(xpath="//div[@class='stacked-text']/div[2]/div[2]/img")
	@CacheLookup
	public WebElement img_Write;
	@FindBy(xpath="//div[@class='stacked-text']/div[1]/div[2]/img")
	@CacheLookup
	public WebElement img_Publish;
}
