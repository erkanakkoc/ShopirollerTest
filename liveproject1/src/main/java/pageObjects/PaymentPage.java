package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PaymentPage extends BasePage{
	
	public WebDriver driver;
	
	By billingNameField = By.id("billing_nameSurname");
	By billingPhoneField = By.id("billing_phoneNumber");
	By billingEmailField = By.id("billing_email");
	By billingCountryField =By.id("billing_country");
	By billingStateField = By.id("billing_state");
	By billingCityField = By.id("billing_city");
	By billingAddressField = By.id("billing_addressLine");
	By billingZipCodeField = By.id("billing_zipCode");
	
	
	//Eğer Şirketseniz kısmı
	By billingCompanyNameField = By.cssSelector("input[name='billing_companyName']");
	By billingTaxNumberField = By.cssSelector("input[name='billing_taxNumber']");
	By billingTaxOfficeField = By.cssSelector("input[name='billing_taxOffice']");
	
	
	//Teslimat Adresi
	By shippingNameField = By.id("shipping_nameSurname");
	By shippingPhoneField = By.id("shipping_phoneNumber");
	By shippingEmailField = By.id("shipping_email");
	By shippingCountryField = By.id("shipping_country");
	By shippingStateField = By.id("shipping_state");
	By shippingCityField = By.id("shipping_city");
	By shippingAddressField = By.id("shipping_addressLine");
	By shippingZipCodeField = By.id("shipping_zipCode");
	
	By orderNotesField = By.cssSelector("textarea[name='order_notes']");

	By payAtDoor = By.xpath("//div[@id='heading-pad']//a[@role='button']");
	By payByCard = By.xpath("//div[@id='heading-3ds']//a[@role='button']");
	
	By completeOrder = By.cssSelector(".btn-order");
	
	
	public PaymentPage() throws IOException {
		super();
	}
	
	public WebElement getBillingNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingNameField);
	}
	public WebElement getBillingPhoneField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingPhoneField);
	}
	public WebElement getBillingEmailField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingEmailField);
	}
	public WebElement getBillingCountryField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingCountryField);
	}
	public WebElement getBillingStateField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingStateField);
	}
	public WebElement getBillingCityField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingCityField);
	}
	public WebElement getBillingAddressField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingAddressField);
	}
	public WebElement getBillingZipCodeField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingZipCodeField);
	}
	
	
	public WebElement getBillingCompanyNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingCompanyNameField);
	}
	public WebElement getBillingTaxNumberField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingTaxNumberField);
	}
	public WebElement getBillingTaxOfficeField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(billingTaxOfficeField);
	}
	
	
	public WebElement getShippingNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingNameField);
	}
	public WebElement getShippingPhoneField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingPhoneField);
	}
	public WebElement getShippingEmailField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingEmailField);
	}
	public WebElement getShippingCountryField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingCountryField);
	}
	public WebElement getShippingStateField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingStateField);
	}
	public WebElement getShippingCityField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingCityField);
	}
	public WebElement getShippingAddressField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingAddressField);
	}
	public WebElement getShippingZipCodeField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(shippingZipCodeField);
	}
	
	
	public WebElement getOrderNotesField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(orderNotesField);
	}
	
	public WebElement getPayAtDoor() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payAtDoor);
	}
	
	public WebElement getPayByCard() throws IOException {
		this.driver = getDriver();
		return driver.findElement(payByCard);
	}
	
	
	public WebElement getCompleteOrder() throws IOException {
		this.driver = getDriver();
		return driver.findElement(completeOrder);
	}
}
