package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HooksPanel extends BasePage{

	public HooksPanel() throws IOException {
		super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		getDriver().get(getDevPanelUrl());
	}
	
	@AfterTest
	public void tearDown() {
		WebDriverInstance.cleanupDriver();
	}

}
