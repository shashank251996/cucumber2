package POM;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import Common.ConfigManager;
import io.cucumber.java.Scenario;




public class BasePage {
	
	WebDriverWait wait;
	WebDriver driver;
	public String screenShotDir = ConfigManager.getInstance().getProperty("screenShotDir");
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public BasePage click(WebElement element) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
		return this;
	}
	
	public BasePage jsclick(WebElement element) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		return this;
	}
	
	public BasePage senKeys(WebElement element, String text) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
		return this;
	}
	
	public BasePage waitForElementToBeDisplayed(WebElement element, int timeout) {
		wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
		return this;
	}
	
	public void getScreenshot(Scenario scenario) {
		File destination = null;
		byte[] screenshotFile = null;
		String screenshotName = scenario.getName().replace(" ", "_");
		File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String date = new SimpleDateFormat("dd_MM_YY_hh_mm_ss").format(new Date()).toString();
		
		if(Files.exists(Paths.get(screenShotDir))){
		try {
			FileUtils.cleanDirectory(new File(System.getProperty("user.dir") + "/screenshots"));
			destination = new File(System.getProperty("user.dir") + "/screenshots/"+screenshotName+date+".png");
			FileUtils.copyFile(sourcePath,destination);
			screenshotFile = FileUtils.readFileToByteArray(destination);
			Reporter.addScreenCaptureFromPath(destination.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
		
			
		}
		
	}
	

}
