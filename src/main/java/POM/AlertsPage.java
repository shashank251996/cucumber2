package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends BasePage{
	
	
	
	public AlertsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(how=How.XPATH,using ="//a[contains(text(),'Dialog')]")
	WebElement gotoAlertPage_btn;
	
	@FindBy(how=How.XPATH,using ="//*[@id='accept']")
	WebElement aceptAlert_btn;
	
	@FindBy(how=How.XPATH,using ="//*[@id='confirm']")
	WebElement confirmPrintAlert_btn;
	
	@FindBy(how=How.XPATH,using ="//*[@id='prompt']")
	WebElement promptAlert_btn;
	
	@FindBy(how=How.XPATH,using ="//*[@id='modern']")
	WebElement sweetAlert_btn;
	
	@FindBy(how=How.XPATH,using ="//*[@class='modal-close is-largec']")
	WebElement modernAlert_btn;
	
	public void gotoAleratPge() {
		click(gotoAlertPage_btn);
	}
	
	public Alert alert() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.alertIsPresent());
		System.out.println("into alert");
		return driver.switchTo().alert();
		
	}
	
	public void acceptAlerts() {
		click(aceptAlert_btn);
		
		alert().accept();
		System.out.println("Alert 1 executed.");
		new WebDriverWait(driver, 5).until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
	}
	
	
	public void dismissAlert() {
		click(confirmPrintAlert_btn);
		
		System.out.println("Alert Content :"+alert().getText());
		alert().dismiss();
		new WebDriverWait(driver, 5).until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
		System.out.println("Alert 2 executed.");
	}
	
	
	public void typeInAlert() {
		click(promptAlert_btn);
			alert().sendKeys("Shashank");
			alert().accept();
		new WebDriverWait(driver, 5).until(ExpectedConditions.not(ExpectedConditions.alertIsPresent()));
		System.out.println("Alert 3 executed.");
	}
	
	
	public void  modernAlert() {
		click(sweetAlert_btn);
		jsclick(modernAlert_btn);
		System.out.println("Alert 4 executed.");
	}
	
	
	
	
	
}
