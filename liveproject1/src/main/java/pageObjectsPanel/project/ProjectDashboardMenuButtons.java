package pageObjectsPanel.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProjectDashboardMenuButtons extends BasePage{

	public WebDriver driver;
	
	By dashboardBtn = By.cssSelector("[data-menu-vertical] .menu-nav > [aria-haspopup='true']:nth-of-type(1) .menu-text");
	By orders = By.cssSelector(".menu-toggle .menu-link");
	By catalog = By.cssSelector("[text='catalog']");
	By products = By.cssSelector("li#catalog-menu  .menu-subnav > li:nth-of-type(1) > .dropdown-item.menu-link");
	By categories = By.cssSelector("li#catalog-menu  .menu-subnav > li:nth-of-type(2) > .dropdown-item.menu-link");
	By brands = By.cssSelector("li#catalog-menu  .menu-subnav > li:nth-of-type(3) > .dropdown-item.menu-link");
	By showcase = By.cssSelector("li#catalog-menu  .menu-subnav > li:nth-of-type(4) > .dropdown-item.menu-link");
	By variant = By.cssSelector("li#catalog-menu  .menu-subnav > li:nth-of-type(5) > .dropdown-item.menu-link");

	By clients = By.cssSelector("[data-menu-vertical] .menu-nav > .menu-item:nth-of-type(4) .menu-link");
	By statistic = By.cssSelector("[data-menu-vertical] .menu-nav > .menu-item:nth-of-type(5) .menu-link");
	By discounts = By.cssSelector("[data-menu-vertical] .menu-nav > .menu-item:nth-of-type(6) .menu-link");
	
	By salesChannelsBtn = By.cssSelector("[class='svg-inline--fa fa-plus-circle fa-w-16'] [fill]");
	By salesWebsite = By.cssSelector("li:nth-of-type(8) > .menu-link");
	By salesMobileApp = By.cssSelector("li:nth-of-type(9) > .menu-link");
	By salesShopiLink = By.cssSelector("li:nth-of-type(10) > .menu-link");
	
	By generalSettings = By.cssSelector("#general-settings-menu > span:nth-of-type(1)");
	By projectInformation = By.cssSelector("#general-settings-menu .dropdown-item");
	
	By storeSettings = By.cssSelector("#store-setting-menu .menu-toggle");
	By storeInformation = By.cssSelector("li#store-setting-menu  .menu-subnav > li:nth-of-type(1) > .dropdown-item.menu-link");
	By payment = By.cssSelector("li#store-setting-menu  .menu-subnav > li:nth-of-type(2) > .dropdown-item.menu-link");
	By legalPages = By.cssSelector("[kt-hidden-height='280'] .menu-item-parent:nth-of-type(3) .menu-link");
	By shippingAndDelivery = By.cssSelector("[kt-hidden-height='280'] .menu-item-parent:nth-of-type(4) .menu-link");
	By emailNotification = By.cssSelector("[kt-hidden-height='280'] .menu-item-parent:nth-of-type(5) .menu-link");
	By language = By.cssSelector("[kt-hidden-height] .menu-item-parent:nth-of-type(6) .dropdown-item");
	By regionAndLocalization = By.cssSelector("[kt-hidden-height] .ng-star-inserted .menu-link");
	
	By apps = By.cssSelector("#apps-menu .menu-toggle");
	By appStore = By.cssSelector("#app-store-menu-link .dropdown-item");
	By myApps = By.cssSelector("#my-apps-menu-link .dropdown-item");
	
	
	
	
	public ProjectDashboardMenuButtons() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public WebElement getDashboardBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(dashboardBtn);
	}
	public WebElement getOrders() throws IOException {
		this.driver = getDriver();
		return driver.findElement(orders);
	}
	public WebElement getCatalog() throws IOException {
		this.driver = getDriver();
		return driver.findElement(catalog);
	}
	public WebElement getProducts() throws IOException {
		this.driver = getDriver();
		return driver.findElement(products);
	}
	public WebElement getCategories() throws IOException {
		this.driver = getDriver();
		return driver.findElement(categories);
	}
	public WebElement getBrands() throws IOException {
		this.driver = getDriver();
		return driver.findElement(brands);
	}
	public WebElement getShowcase() throws IOException {
		this.driver = getDriver();
		return driver.findElement(showcase);
	}
	public WebElement getVariant() throws IOException {
		this.driver = getDriver();
		return driver.findElement(variant);
	}
	public WebElement getClients() throws IOException {
		this.driver = getDriver();
		return driver.findElement(clients);
	}
	public WebElement getStatistic() throws IOException {
		this.driver = getDriver();
		return driver.findElement(statistic);
	}
	public WebElement getDiscounts() throws IOException {
		this.driver = getDriver();
		return driver.findElement(discounts);
	}
	public WebElement getSalesChannelsBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(salesChannelsBtn);
	}
	public WebElement getSalesWebsite() throws IOException {
		this.driver = getDriver();
		return driver.findElement(salesWebsite);
	}
	public WebElement getSalesMobileApp() throws IOException {
		this.driver = getDriver();
		return driver.findElement(salesMobileApp);
	}
	public WebElement getSalesShopiLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(salesShopiLink);
	}
	public WebElement getGeneralSettings() throws IOException {
		this.driver = getDriver();
		return driver.findElement(generalSettings);
	}
	public WebElement getProjectInformation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(projectInformation);
	}
	public WebElement getStoreSettings() throws IOException {
		this.driver = getDriver();
		return driver.findElement(storeSettings);
	}
	public WebElement getStoreInformation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(storeInformation);
	}
	public WebElement getPayment() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payment);
	}
	public WebElement getLegalPages() throws IOException {
		this.driver = getDriver();
		return driver.findElement(legalPages);
	}
	public WebElement getShippingAndDelivery() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingAndDelivery);
	}
	public WebElement getEmailNotification() throws IOException {
		this.driver = getDriver();
		return driver.findElement(emailNotification);
	}
	public WebElement getLanguage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(language);
	}
	public WebElement getRegionAndLocalization() throws IOException {
		this.driver = getDriver();
		return driver.findElement(regionAndLocalization);
	}
	public WebElement getApps() throws IOException {
		this.driver = getDriver();
		return driver.findElement(apps);
	}
	public WebElement getAppStore() throws IOException {
		this.driver = getDriver();
		return driver.findElement(appStore);
	}
	public WebElement getMyApps() throws IOException {
		this.driver = getDriver();
		return driver.findElement(myApps);
	}

	
	
}
