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
	public WebElement img_wwFooter;
	
	@FindBy(xpath="//p[contains(text(),'Get updates on the latest features and promotions.')]")
	@CacheLookup
	public WebElement text_getPromoFooter;
	
	@FindBy(xpath="//input[@placeholder='Enter your email address']")
	@CacheLookup
	public WebElement textbox_enterEmailFooter;
	
	@FindBy(xpath="//button[contains(text(),'Subscribe')]")
	@CacheLookup
	public WebElement btn_subscribeFooter;
	
	@FindBy(xpath="//div[contains(text(),'Product')]")
	@CacheLookup
	public WebElement text_productFooter;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[1]")
	@CacheLookup
	public WebElement link_overviewFooter;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[2]")
	@CacheLookup
	public WebElement link_pricingFooter;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[3]")
	@CacheLookup
	public WebElement link_tryforfreeFooter;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[4]")
	@CacheLookup
	public WebElement link_signInFooter;
	
	@FindBy(xpath="//div[@class='top']//div[1]//ul[1]//li[4]")
	@CacheLookup
	public WebElement link_FaqFooter;
	
	@FindBy(xpath="//div[contains(text(),'Partnership')]")
	@CacheLookup
	public WebElement text_partnershipFooter;
	
	@FindBy(xpath="//a[@name='Initiatives']")
	@CacheLookup
	public WebElement link_initiativesFooter;
	
	@FindBy(xpath="//a[@name='Business']")
	@CacheLookup
	public WebElement link_businessFooter;
	
	@FindBy(xpath="//a[@name='Education']")
	@CacheLookup
	public WebElement link_educationFooter;
	
	@FindBy(xpath="//a[@name='Research']")
	@CacheLookup
	public WebElement link_researchFooter;
	
	@FindBy(xpath="//div[contains(text(),'Company')]")
	@CacheLookup
	public WebElement text_companyFooter;
	
	@FindBy(xpath="//a[@name='Our Story']")
	@CacheLookup
	public WebElement link_ourStoryFooter;
	
	@FindBy(xpath="//a[@name='Careers']")
	@CacheLookup
	public WebElement link_careersFooter;
	
	@FindBy(xpath="//a[@name='News']")
	@CacheLookup
	public WebElement link_newsFooter;
	
	@FindBy(xpath="//a[@name='Contact Us']")
	@CacheLookup
	public WebElement link_contactUsFooter;
	
	@FindBy(xpath="//a[@name='Living Sky Tech']")
	@CacheLookup
	public WebElement link_livingSkyTechFooter;
	
	@FindBy(xpath="//a[@name='Privacy']")
	@CacheLookup
	public WebElement link_privacyFooter;
	
	@FindBy(xpath="//a[@name='Accessibility']")
	@CacheLookup
	public WebElement link_accessibilityFooter;
	
	@FindBy(xpath="//a[@name='Terms']")
	@CacheLookup
	public WebElement link_termsFooter;
	
	@FindBy(xpath="//a[@name='Facebook']//img")
	@CacheLookup
	public WebElement link_facebookImgFooter;
	
	@FindBy(xpath="//a[@name='LinkedIn']//img")
	@CacheLookup
	public WebElement link_linkedInImgFooter;
	
	@FindBy(xpath="//a[@name='Youtube']//img")
	@CacheLookup
	public WebElement link_youTubeImgFooter;
}
