package stepDefenation;

import Common.TestContext;
import POM.WorkSpace_Page;
import io.cucumber.java.en.Then;

public class WorkSpacePageSteps {

	WorkSpace_Page work;
	TestContext testContext;

	 public WorkSpacePageSteps(TestContext context) {
		// TODO Auto-generated constructor stub
		 testContext = context;
		 work = testContext.getPageObject().getWorkSpace();
		 
	}
	
	
	@Then("^goto WorkSpace tab$")
	public void check_WorkSpace_tab_should_be_displayed() throws InterruptedException {
//		work = pageProject.getWorkSpace();
		work.click_workSpace_tab();

	}
}
