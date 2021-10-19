package Common;

public class TestContext {
	private DriverManager driverManager;
	private PageProjectManager pageProjectManager;
	
	public TestContext() {
		driverManager = new DriverManager();
		pageProjectManager= new PageProjectManager(driverManager.getDriver());
	}
	
	public DriverManager getDriver() {
		return driverManager;
	}
	
	public PageProjectManager getPageObject() {
		return pageProjectManager;
	}

}
