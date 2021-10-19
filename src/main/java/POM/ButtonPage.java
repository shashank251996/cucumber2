package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {
	
	public ButtonPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how= How.XPATH, using ="//a[contains(text(),'Click')]")
	WebElement click_for_Page;
	
	@FindBy(how= How.XPATH, using ="//button[contains(text(),'Goto Home')]")
	WebElement goToHome_btn;
	
	@FindBy(how= How.XPATH, using ="//*[@id='position']")
	WebElement findLocation_btn;
	
	@FindBy(how= How.XPATH, using ="//*[@id='color']")
	WebElement findColour_btn;
	
	@FindBy(how= How.XPATH, using ="//*[@id='property']")
	WebElement heightWidth_btn;
	
	@FindBy(how= How.XPATH, using ="//*[@id='isDisabled']")
	WebElement disabled_btn;
	
	public  void Buttons() throws InterruptedException {
		
		click_for_Page.click();
		Thread.sleep(2000);
		
		System.out.println("location of button is : "+findLocation_btn.getLocation());
		System.out.println("Colur of button is: "+findColour_btn.getCssValue("color"));
		System.out.println("Size of given button is: "+heightWidth_btn.getSize());
		System.out.println("Is button enabled :"+disabled_btn.isEnabled());
		goToHome_btn.click();
		Thread.sleep(1000);
		
		
		
		
	}

}
