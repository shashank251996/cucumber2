package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;






public class DriverManager {
	
	private static DriverManager driverManager;
	private static WebDriver driver ;
	private static String driverPath;
	private static String driverType ;

	
	
	public DriverManager() {
		driverPath = ConfigManager.getInstance().getProperty("driverPath")+"/chromedriver.exe";
		driverType = ConfigManager.getInstance().getProperty("browser");
		//System.out.println("driver path is :"+driverPath);
		//driverPath = System.getProperty("user.dir") + "/src/test/resources/driver/chromedriver.exe";
	}
	
	public static DriverManager getInstance() {
		return (driverManager==null)?driverManager = new DriverManager():driverManager;
	}
	
	public WebDriver getDriver(){
		
		if (driver==null) driver= new DriverManager().createDriver();


	return driver;
	}
	
	private WebDriver createDriver() {
		switch (driverType) {
		
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			break;
		case "firefox" :
			driver = new FirefoxDriver();
			break;
			
		case "IE" :
			driver = new InternetExplorerDriver();
			break;

		
		}
		
		return driver;
		
	}
	
	public void CloseDriver() {
		driver.close();
		driver.quit();
	}
	

	
}
