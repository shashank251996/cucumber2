package stepDefenation;

import Common.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	TestContext testContext;
	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void BeforeSteps() {
		System.out.println("Start Test Case");
	}
	
	
	@After(order = 0)
	public void AfterSteps() {
		testContext.getDriver().CloseDriver();
	}
	@After (order =1)
	public void screenshotAtFail(Scenario scenario) {
		if(scenario.isFailed()) {
			testContext.getPageObject().getBasePage().getScreenshot(scenario);
		}		
	}
	
	

}
	
	
	

