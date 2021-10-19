package POM;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Page {
	
	public DropDown_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	

	@FindBy(how= How.XPATH, using ="//a[contains(text(),'Drop-Down')]")	
	WebElement dropDownPage_btn;
	
	@FindBy(how= How.XPATH, using ="//*[@id='fruits']")	
	WebElement visibletext_dropDown;
	
	@FindBy(how= How.XPATH, using ="//*[@id='superheros']")	
	WebElement superHero_dropDown;
	
	@FindBy(how= How.XPATH, using ="//*[@id='lang']")	
	WebElement lastLang_dropDown;
	
	@FindBy(how= How.XPATH, using ="//*[@id='country']")	
	WebElement country_dropDown;
	
	public void gotoDropdownPage () {
		dropDownPage_btn.click();
	}
	
	public void visibleTextdropdown(String text) {
		
	Select select = new Select(visibletext_dropDown);
	select.selectByVisibleText(text);
		
	}
	
	public void multiSelectTextdropdown(int index) {
		
		Select select = new Select(superHero_dropDown);
		System.out.println("is this multi select dropDown :"+select.isMultiple());
		select.selectByIndex(index);
		
			
		}
	
	public void lastProgrmmingLang(){
		Select select = new Select(lastLang_dropDown);
	    List<WebElement> list = new ArrayList<WebElement>();
	   list =   select.getOptions();
	   
	   int LastElement = list.size();
	   
	   select.selectByIndex(LastElement-1);
		
		
	}
	
	public void getSelectoption(String value) {
		Select select = new Select(country_dropDown);
		select.selectByValue(value);
		
		System.out.println("Selected option is :"+select.getFirstSelectedOption());
	}
	
	public void setDropdown() {
		visibleTextdropdown("Apple");
		multiSelectTextdropdown(10);
		getSelectoption("India");
	}
	
	
}
