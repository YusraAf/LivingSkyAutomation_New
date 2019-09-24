package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FooterNavigation extends PageBase{
	
public WebDriver driver;
	
	public FooterNavigation(WebDriver driver)
	{
		super(driver); 
	}
	
	@FindBy(xpath="//div[@class='left']//img")
	@CacheLookup
	public WebElement wwImg_Footer;
	
	@FindBy(xpath="//p[contains(text(),'Get updates on the latest features and promotions.')]")
	@CacheLookup
	public WebElement getPromo_Footer;
	
	@FindBy(xpath="//input[@placeholder='Enter your email address']")
	@CacheLookup
	public WebElement enterEmail_Footer;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe')]")
	@CacheLookup
	public WebElement subscribe_Footer;
	
	@FindBy(xpath="//div[contains(text(),'Product')]")
	@CacheLookup
	public WebElement product_Footer;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[1]")
	@CacheLookup
	public WebElement overview_Footer;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[2]")
	@CacheLookup
	public WebElement pricing_Footer;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[3]")
	@CacheLookup
	public WebElement tryforfree_Footer;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[4]")
	@CacheLookup
	public WebElement signIn_Footer;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[4]")
	@CacheLookup
	public WebElement FAQ_Footer;
	
	@FindBy(xpath="//div[contains(text(),'Partnership')]")
	@CacheLookup
	public WebElement partnership_Footer;
	
	@FindBy(xpath="//a[@name='Initiatives']")
	@CacheLookup
	public WebElement Initiatives_Footer;
	
	@FindBy(xpath="//a[@name='Business']")
	@CacheLookup
	public WebElement business_Footer;
	
	@FindBy(xpath="//a[@name='Education']")
	@CacheLookup
	public WebElement education_Footer;
	
	@FindBy(xpath="//a[@name='Research']")
	@CacheLookup
	public WebElement research_Footer;
	
	@FindBy(xpath="//div[contains(text(),'Company')]")
	@CacheLookup
	public WebElement company_Footer;
	
	@FindBy(xpath="//a[@name='Our Story']")
	@CacheLookup
	public WebElement ourStory_Footer;
	
	@FindBy(xpath="//a[@name='Careers']")
	@CacheLookup
	public WebElement careers_Footer;
	
	@FindBy(xpath="//a[@name='News']")
	@CacheLookup
	public WebElement news_Footer;
	
	@FindBy(xpath="//a[@name='Contact Us']")
	@CacheLookup
	public WebElement contactUs_Footer;
	
	@FindBy(xpath="//a[@name='Living Sky Tech']")
	@CacheLookup
	public WebElement livingSkyTech_Footer;
	
	@FindBy(xpath="//a[@name='Privacy']")
	@CacheLookup
	public WebElement privacy_Footer;
	
	@FindBy(xpath="//a[@name='Accessibility']")
	@CacheLookup
	public WebElement accessibility_Footer;
	
	@FindBy(xpath="//a[@name='Terms']")
	@CacheLookup
	public WebElement terms_Footer;
	
	@FindBy(xpath="//a[@name='Facebook']//img")
	@CacheLookup
	public WebElement facebookImg_Footer;
	
	@FindBy(xpath="//a[@name='LinkedIn']//img")
	@CacheLookup
	public WebElement linkedInImg_Footer;
	
	@FindBy(xpath="//a[@name='Youtube']//img")
	@CacheLookup
	public WebElement youtubeImg_Footer;
}
