package pageObjectsStore;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreProductPage extends BasePage{
	
	public WebDriver driver;
	
	By sizeOption = By.cssSelector(".product-details > div:nth-of-type(3)");
	By quantityIncrease = By.cssSelector(".icon-plus");
	By quantityDecrease = By.cssSelector(".icon-minus");
	By addToCartBtn = By.cssSelector("#add-cart-btn");
	By homepageLink = By.xpath("/html/body[@class='loaded']//div[@class='sticky-wrapper']//a[@href='https://shopiroller-test-project.dev.myshopiroller.com']/h6[.='shopiroller-test-project']");

	public StoreProductPage() throws IOException {
		super();
	}
	
	public WebElement getSizeOption() throws IOException {
		this.driver = getDriver();
		return driver.findElement(sizeOption);
	}
	
	public WebElement getQuantIncrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityIncrease);
	}
	
	public WebElement getQuantDecrease() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityDecrease);
	}
	
	public WebElement getAddToCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement getHomepageLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homepageLink);
	}
	
}
