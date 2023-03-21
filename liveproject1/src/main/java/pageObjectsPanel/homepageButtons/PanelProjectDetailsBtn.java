package pageObjectsPanel.homepageButtons;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PanelProjectDetailsBtn extends BasePage{

	public WebDriver driver;
	
	By dashboardBtn = By.cssSelector("[class] [role='menuitem']:nth-of-type(1)");
	By productsBtn = By.cssSelector("[class] [role='menuitem']:nth-of-type(2)");
	By ordersBtn = By.cssSelector("[class] [role='menuitem']:nth-of-type(3)");
	By statisticsBtn = By.cssSelector("[class] [role='menuitem']:nth-of-type(4)");
	By deleteProjectBtn = By.cssSelector("[class] [role='menuitem']:nth-of-type(5)");
	
	
	public PanelProjectDetailsBtn() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getDashboardBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(dashboardBtn);
	}
	public WebElement getProductsBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productsBtn);
	}
	public WebElement getOrdersBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ordersBtn);
	}
	public WebElement getStatisticsBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(statisticsBtn);
	}
	public WebElement getDeleteProjectBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteProjectBtn);
	}

}
