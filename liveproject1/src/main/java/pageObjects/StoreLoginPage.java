package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreLoginPage extends BasePage{
	public WebDriver driver;
	
	By singinEmail = By.xpath("/html//input[@id='singin-email']");
	By singinPassword = By.xpath("/html//input[@id='singin-password']");
	By singinBtn = By.xpath("//div[@id='signin']/form[@action='https://shopiroller-test-project.dev.myshopiroller.com/loginPost']//span[.='Oturum Aç ']");
	By forgetPasswordBtn = By.cssSelector(".forgot-link");
	By registerBtn = By.xpath("/html//a[@id='register-tab']");

	
	public StoreLoginPage() throws IOException {
		super();
	}
	
	public WebElement getSinginEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(singinEmail);
	}
	public WebElement getSinginPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(singinPassword);
	}
	public WebElement getSinginBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(singinBtn);
	}
	public WebElement getForgetPasswordBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(forgetPasswordBtn);
	}
	public WebElement getRegisterBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerBtn);
	}
	
	
}
