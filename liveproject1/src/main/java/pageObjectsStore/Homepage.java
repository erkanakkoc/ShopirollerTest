package pageObjectsStore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class Homepage extends BasePage{

	public WebDriver driver;
	
	By toggle = By.cssSelector(".icon-bars");
	By homepageLink = By.linkText("shopiroller-test-project");
	By loginLink = By.cssSelector(".wishlist-link > .icon-user");
	By shoppingLink = By.cssSelector(".icon-shopping-cart");

	public Homepage() throws IOException {
		super();
	}
	
	public WebElement getToggle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(toggle);
	}
	
	public WebElement getHomepageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}
	public WebElement getLoginLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loginLink);
	}
	public WebElement getShoppingLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shoppingLink);
	}
	
}
