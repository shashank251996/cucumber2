package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage  extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how = How.XPATH,using= "//*[@id=\"navbar-menu\"]/div[2]/div/div/a[2]" )
	private WebElement login_btn;
	
	@FindBy(how = How.XPATH,using= "//*[@name='email']" )
	private WebElement input_email;
	
	@FindBy(how = How.XPATH,using= "//*[@name='password']" )
	private WebElement input_password;
	
	@FindBy(how = How.XPATH,using= "(//*[contains(text(),'LOGIN')])[2]" )
	private WebElement submit_btn;
	
	@FindBy(how = How.XPATH,using= "//h1[contains(text(),\"LetCode with Koushik\")]" )
	private WebElement centerHeading;
	
	public void click_login_btn() {
		this.click(login_btn);
	}
	
	
	public LoginPage Submit_credentials() throws InterruptedException {
		jsclick(submit_btn);
		waitForElementToBeDisplayed(centerHeading, 5);
		return this;
	}
	
	public LoginPage login(String userName, String password) throws InterruptedException {
		senKeys(input_email, userName);
	    senKeys(input_password, password);
		return this;
	}
	
	

}
