package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class UserProfilePage extends BasePage{
	
public WebDriver driver;
	
	By homepageLink = By.xpath("/html//div[@class='page-wrapper']/header[@class='header header-7']//a[@href='https://shopiroller-test-project.dev.myshopiroller.com']/h6[.='shopiroller-test-project']");
	By logoutBtn = By.xpath("/html//div[@class='page-wrapper']/header[@class='header header-7']//nav[@class='main-nav']/ul//a[@href='https://shopiroller-test-project.dev.myshopiroller.com/logout']");
	

	public UserProfilePage() throws IOException {
		super();
	}
	
	public WebElement getHomepageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}
	
	public WebElement getLogoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(logoutBtn);
	}
	
	
}
