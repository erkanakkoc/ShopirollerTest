package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreContentPanel extends BasePage{
	public WebDriver driver;
	//İndirim Kodu Alanı
	By promoTextbox = By.cssSelector("input[name='coupon_code']");
	By promoAddBtn = By.cssSelector(".cart-discount button");
	
	By deleteItemOne = By.cssSelector("tr:nth-of-type(1) .icon-close");
	By deleteItemTwo = By.cssSelector("tr:nth-of-type(2) .icon-close");
	
	By quantityIncreaseItemOne = By.cssSelector("tr:nth-of-type(1) .icon-plus");
	By quantityDecreaseItemOne = By.cssSelector("tr:nth-of-type(1) .icon-minus");
	
	By quantityIncreaseItemTwo = By.cssSelector("tr:nth-of-type(2) .icon-plus");
	By quantityDecreaseItemTwo = By.cssSelector("tr:nth-of-type(2) .icon-minus");
	
	By continueShoppingBtn = By.xpath("//span[contains(text(),'DEVAM')]");
	By checkoutBtn = By.xpath("//a[contains(text(),'SAYFASINA')] | //a[contains(text(),'CHECKOUT')]");
	
	By totalValue = By.cssSelector(".summary-total td:nth-of-type(2)");
	
	
	public StoreContentPanel() throws IOException {
		super();
	}
	
	public WebElement getPromoTextbox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoTextbox);
	}
	
	public WebElement getPromoAddBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoAddBtn);
	}
	
	public WebElement getDeleteItemOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteItemOne);
	}
	
	public WebElement getDeleteItemTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteItemTwo);
	}
	
	public WebElement getQuantIncreaseItemOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityIncreaseItemOne);
	}
	
	public WebElement getQuantDecreaseItemOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityDecreaseItemOne);
	}
	
	public WebElement getQuantIncreaseItemTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityIncreaseItemTwo);
	}
	
	public WebElement getQuantDecreaseItemTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(quantityDecreaseItemTwo);
	}
	
	
	
	public WebElement getContinueShopBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(continueShoppingBtn);
	}
	
	public WebElement getCheckoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkoutBtn);
	}
	
	public WebElement getTotalValue() throws IOException {
		this.driver = getDriver();
		return driver.findElement(totalValue);
	}
	
}
