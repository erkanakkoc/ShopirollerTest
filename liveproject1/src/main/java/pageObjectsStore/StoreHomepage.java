package pageObjectsStore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreHomepage extends BasePage{
	
	public WebDriver driver;
	
	By productOne = By.linkText("Test");
	By productTwo = By.linkText("Quarter Pounder");
	By productThree = By.linkText("Coca Cola");
	
	public StoreHomepage() throws IOException {
		super();
	}
	
	public WebElement getProdOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productOne);
	}
	
	public WebElement getProdTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productTwo);
	}
	
	public WebElement getProdThree() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productThree);
	}

}
