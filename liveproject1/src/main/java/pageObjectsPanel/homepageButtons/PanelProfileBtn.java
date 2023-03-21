package pageObjectsPanel.homepageButtons;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PanelProfileBtn extends BasePage{

	public WebDriver driver;
	
	By profileBtn = By.xpath("//div[@id='user-panel-menu']//ul/li[2]/span");
	By logoutBtn = By.xpath("//div[@id='user-panel-menu']//ul/li[3]/span");
	
	
	public PanelProfileBtn() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getProfileBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileBtn);
	}
	public WebElement getLogoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(logoutBtn);
	}

}
