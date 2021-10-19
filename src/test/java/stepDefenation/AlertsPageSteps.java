package stepDefenation;

import Common.TestContext;
import POM.AlertsPage;
import io.cucumber.java.en.Then;

public class AlertsPageSteps {

	AlertsPage alert;

	TestContext testContext;

	public AlertsPageSteps(TestContext context) {
		// TODO Auto-generated constructor stub
		testContext = context;
		alert = testContext.getPageObject().getAlers();

	}

	@Then("^goto alert Page and handel different alerts$")
	public void goto_alert_Page_and_handel_different_alerts() throws InterruptedException {

		alert.gotoAleratPge();
		alert.acceptAlerts();
		alert.dismissAlert();
		alert.modernAlert();
		alert.typeInAlert();

	}

}
