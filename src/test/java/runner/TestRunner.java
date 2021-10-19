package runner;

import java.io.File;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import Common.ConfigManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/functioanlTest/secondFeature.feature",
		glue = {"stepDefenation"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true		
		)

public class TestRunner extends AbstractTestNGCucumberTests{
	@AfterClass
	public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File (ConfigManager.getInstance().getProperty("extentReoprt")));
	}
	

}

