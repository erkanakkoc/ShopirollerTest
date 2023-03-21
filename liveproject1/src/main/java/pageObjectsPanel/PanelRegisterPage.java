package pageObjectsPanel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PanelRegisterPage extends BasePage{
	
public WebDriver driver;
	
	By loginBtn = By.cssSelector("a#kt_login_signup > u");
	By registerFullName = By.cssSelector("input[name='fullname']");
	By registerCountryCode = By.cssSelector(".phone-code-input-holder-container div");
	By registerPhone = By.cssSelector("input#phone-number-input");
	By registerEmail = By.cssSelector("input[name='email']");
	By registerPassword = By.cssSelector("input[name='password']");
	By registerBtn = By.cssSelector("button#kt_login_signup_submit");
	By registerTerms = By.cssSelector("div#terms > a:nth-of-type(1) > u");
	By registerPolicy = By.cssSelector("a:nth-of-type(2) > u");
	

	
	public PanelRegisterPage() throws IOException {
		super();
	}
	
	public WebElement getLoginBtn() throws IOException{
		this.driver = getDriver();
		return driver.findElement(loginBtn);
	}
	public WebElement getRegisterFullName() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerFullName);
	}
	public WebElement getRegisterCountryCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerCountryCode);
	}
	public WebElement getRegisterPhone() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerPhone);
	}
	public WebElement getRegisterEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerEmail);
	}
	public WebElement getRegisterPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerPassword);
	}
	public WebElement getRegisterBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerBtn);
	}
	public WebElement getRegisterTerms() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerTerms);
	}
	public WebElement getRegisterPolicy() throws IOException {
		this.driver = getDriver();
		return driver.findElement(registerPolicy);
	}
	

}
