package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkSpace_Page extends BasePage {
	WebDriver driver;
	
	public WorkSpace_Page(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(how=How.XPATH ,using="//*[@id='testing']")
	private WebElement tab_workSpace;
	
	

	
	public void click_workSpace_tab() throws InterruptedException {
		
			click(tab_workSpace);
			
	
	}
	

	
	

}
