package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StoreRegisterPage extends BasePage{
	
public WebDriver driver;
	
	By registerFullName = By.cssSelector("[name='register-fullname']");
	By registerEmail = By.cssSelector("[name='register-email']");
	By registerPassword = By.cssSelector("[name='register-password']");
	By registerPolicy = By.cssSelector("[for='register-policy']");
	By registerBtn = By.cssSelector("#register-btn span");

	
	public StoreRegisterPage() throws IOException {
		super();
	}
	
	public WebElement getRegisterFullName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerFullName);
	}
	public WebElement getRegisterEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerEmail);
	}
	public WebElement getRegisterPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerPassword);
	}
	public WebElement getRegisterPolicy() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerPolicy);
	}
	public WebElement getRegisterBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerBtn);
	}

}
