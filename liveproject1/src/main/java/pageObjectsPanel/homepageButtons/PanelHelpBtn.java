package pageObjectsPanel.homepageButtons;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PanelHelpBtn extends BasePage{

	public WebDriver driver;
	
	By helpCenterBtn = By.cssSelector("[class='dropdown-menu p-0 m-0 dropdown-menu-anim-up dropdown-menu-sm dropdown-menu-right show'] .navi-item:nth-of-type(1) .navi-link");
	By giveFeedbackBtn = By.cssSelector("[class='dropdown-menu p-0 m-0 dropdown-menu-anim-up dropdown-menu-sm dropdown-menu-right show'] .navi-item:nth-of-type(2) .navi-link");
	By supportRequestBtn = By.cssSelector("[class='dropdown-menu p-0 m-0 dropdown-menu-anim-up dropdown-menu-sm dropdown-menu-right show'] .navi-item:nth-of-type(3) .navi-link");
	
	public PanelHelpBtn() throws IOException {
		super();
	}
	
	public WebElement getHelpCenterBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(helpCenterBtn);
	}
	public WebElement getGiveFeedbackBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(giveFeedbackBtn);
	}
	public WebElement getSupportRequestBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(supportRequestBtn);
	}

}
