package stepDefenation;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;

import Common.DriverManager;
import Common.TestContext;
import POM.LoginPage;
import dataProvider.JsonUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	WebDriver driver;
	LoginPage login;
	DriverManager driverManager;
	TestContext testContext;
	
	 public LoginPageSteps(TestContext context) {
		// TODO Auto-generated constructor stub
		testContext = context;
		login = testContext.getPageObject().getLogin();
		
		
	}
	
	@Given("^I am using Chrome browser$")
	public void i_am_using_Chrome_browser() {
		
		
		driver = DriverManager.getInstance().getDriver();

		driver.manage().window().maximize();

	}

	@Given("^letsCode\\.io url is launched$")
	public void letscode_io_url_is_launched() {

		driver.get("https://letcode.in/");

	}

	@When("^I click on Login Button$")
	public void i_click_on_Login_Button() throws InterruptedException {
		login.click_login_btn();
		System.out.println("Clicked button");

	}

	@When("^Login using valid \"([^\"]*)\"$")
	public void login_using_valid_user(String user) throws InterruptedException {
//		login = pageProject.getLogin();
		JSONObject userData = JsonUtility.getJsonData(user);
		String userName=(String) userData.get("userName");
		String password=(String) userData.get("password");
		login.login(userName,password);

	}

	@Then("^I am able to login sucessfully$")
	public void i_am_able_to_login_sucessfully() throws InterruptedException {
//		login = pageProject.getLogin();
		Thread.sleep(2000);

		login.Submit_credentials();

	}

}
