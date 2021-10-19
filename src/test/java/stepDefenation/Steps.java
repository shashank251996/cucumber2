//package stepDefenation;
//
//
//
//import org.openqa.selenium.WebDriver;
//
//import Common.ConfigManager;
//import Common.DriverManager;
//import Common.PageProjectManager;
//import POM.AlertsPage;
//import POM.ButtonPage;
//import POM.DropDown_Page;
//import POM.InputFeild_Page;
//import POM.LoginPage;
//import POM.WorkSpace_Page;
//import cucumber.api.java.After;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Steps {
//
//	
//	public static WebDriver driver  = DriverManager.getInstance().getDriver();
//	LoginPage login;
//	WorkSpace_Page work;
//	InputFeild_Page input;
//	ButtonPage button;
//	DropDown_Page drop;
//	AlertsPage alert ;
//	PageProjectManager pageProject;
//	@Given("^I am using Chrome browser$")
//	public void i_am_using_Chrome_browser() {
//		
//		
//		
//
//		driver.manage().window().maximize();
//
//	}
//
//	@Given("^letsCode\\.io url is launched$")
//	public void letscode_io_url_is_launched() {
//
//		driver.get("https://letcode.in/");
//
//	}
//
//	@When("^I click on Login Button$")
//	public void i_click_on_Login_Button() throws InterruptedException {
//		pageProject = new PageProjectManager(driver);
//		login = pageProject.getLogin();
//		login.click_login_btn();
//
//	}
//
//	@When("^Login using valid cedentials$")
//	public void login_using_valid_cedentials() throws InterruptedException {
////		login = pageProject.getLogin();
//		login.enter_details();
//
//	}
//
//	@Then("^I am able to login sucessfully$")
//	public void i_am_able_to_login_sucessfully() throws InterruptedException {
////		login = pageProject.getLogin();
//		Thread.sleep(2000);
//
//		login.Submit_credentials();
//
//	}
//
//	@Then("^goto WorkSpace tab$")
//	public void check_WorkSpace_tab_should_be_displayed() throws InterruptedException {
//		work = pageProject.getWorkSpace();
//		work.click_workSpace_tab();
//
//	}
//
//	@Then("^check different type of feilds at Input page$")
//	public void check_different_type_of_feilds_at_Input_page() throws InterruptedException {
//		input = pageProject.getInputFeild();
//		input.playWithFeilds();
//
//	}
//
//	@Then("^check what all buttons can do$")
//	public void check_what_all_buttons_can_do() throws InterruptedException {
//		
//		driver.navigate().to(ConfigManager.getInstance().getProperty("url"));
//		button = pageProject.getbuttons();
//		button.Buttons();
//		driver.navigate().back();
//
//	}
//
//	@Then("^goto DropDown Page$")
//	public void goto_DropDown_Page() {
//		// Write code here that turns the phrase above into concrete actions
//		drop = pageProject.getDropdown();
//		drop.gotoDropdownPage();
//	}
//
//	@Then("^check different type of dropdown handeling$")
//	public void check_different_type_of_dropdown_handeling() {
//		
//		drop = pageProject.getDropdown();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		drop.setDropdown();
//		drop.lastProgrmmingLang();
//
//	}
//	
//	@Then("^goto alert Page and handel different alerts$")
//	public void goto_alert_Page_and_handel_different_alerts() throws InterruptedException {
//		
//	alert = pageProject.getAlers();
//	alert.gotoAleratPge();
//	alert.acceptAlerts();
//   alert.dismissAlert();
//	alert.modernAlert();
//	alert.typeInAlert();
//		
////		driver = DriverManager.getInstance().getDriver();
////		Thread.sleep(2000);
//	//	System.out.println("  "+driver.findElement(By.xpath(null)));
////		driver.findElement(By.xpath("//*[@id='accept']")).click();
////		Thread.sleep(2000);
////		Alert alert = driver.switchTo().alert();
////		System.out.println("into alerat");
////		alert.accept();
//	}
//
//	
//@After
//public void tearDown() {
//	driver.quit();
//}
//}
