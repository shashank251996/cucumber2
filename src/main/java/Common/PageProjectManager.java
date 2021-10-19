package Common;

import org.openqa.selenium.WebDriver;

import POM.AlertsPage;
import POM.BasePage;
import POM.ButtonPage;
import POM.DropDown_Page;
import POM.InputFeild_Page;
import POM.LoginPage;
import POM.WorkSpace_Page;

public class PageProjectManager {
	
	private WebDriver driver;
	private AlertsPage alert;
	private ButtonPage button;
	private DropDown_Page dropDown;
	private InputFeild_Page inputFeild;
	private LoginPage login;
	private WorkSpace_Page work;
	private BasePage basePage;

	public  PageProjectManager(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public AlertsPage getAlers() {
		return (alert==null)?alert= new AlertsPage(driver):alert;
	}
	
	public ButtonPage getbuttons() {
		return (button==null)?button= new ButtonPage(driver):button;
	}
	
	public DropDown_Page getDropdown() {
		return (dropDown==null)?dropDown= new DropDown_Page(driver):dropDown;
	}
	
	public InputFeild_Page getInputFeild() {
		return(inputFeild== null)?inputFeild= new InputFeild_Page(driver):inputFeild;
	}
	
	public LoginPage getLogin() {
		return (login==null)? login=new LoginPage(driver):login;
	}
	
	public WorkSpace_Page getWorkSpace() {
		return(work==null)?work =new WorkSpace_Page(driver):work;
	}
	
	public BasePage getBasePage() {
		return(basePage==null)? basePage= new BasePage(driver):basePage;
	}
}
