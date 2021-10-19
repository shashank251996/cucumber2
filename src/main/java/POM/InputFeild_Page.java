package POM;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class InputFeild_Page {
	
	public InputFeild_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.XPATH ,using="//*[contains(text(),'Edit')]")
	private WebElement edit_btn_input_page;
	
	@FindBy (how = How.XPATH,using = "//*[@id='fullName']")
	WebElement name_feild;
	
	@FindBy (how = How.XPATH,using = "//*[@id='join']")
	WebElement appending_feild;
	
	@FindBy (how = How.XPATH,using = "//*[@id='getMe']")
	WebElement getText_feild;
	
	@FindBy (how = How.XPATH,using = "//*[@id='clearMe']")
	WebElement clear_feild;
	
	@FindBy (how = How.XPATH,using = "//*[@id='noEdit']")
	WebElement disabled_feild;
	
	@FindBy (how = How.XPATH,using = "//*[@id='dontwrite']")
	WebElement readOnly_feild;
	
	public void playWithFeilds() throws InterruptedException	{
		
		edit_btn_input_page.click();
		name_feild.sendKeys("Shashank Gupta");
		
		appending_feild.sendKeys(Keys.END + " and having a good day");
		appending_feild.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
	
		String feildValue = getText_feild.getAttribute("value");
		System.out.println("Text inside feild is  :"+feildValue);
		
		clear_feild.clear();
		
		Boolean ab = disabled_feild.isEnabled();
		System.out.println("Is feild enabled :"+ab);
		
		  
		 boolean read = readOnly_feild.getAttribute("readOnly").equals("true");
		 System.out.println("Is feild Read Only :"+read);
		
	}
	

}
