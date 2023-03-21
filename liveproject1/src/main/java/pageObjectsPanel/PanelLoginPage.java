package pageObjectsPanel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PanelLoginPage extends BasePage{

	public WebDriver driver;
	
	By singinEmail = By.cssSelector("input[name='email']");
	By singinPassword = By.cssSelector("input[name='password']");
	By singinBtn = By.cssSelector("button#kt_login_signin_submit");
	By forgetPasswordBtn = By.cssSelector("a#kt_login_forgot");
	By registerBtn = By.cssSelector("a#kt_login_signup > u");

	//Uyarı Mesajları
	By invalidEmailAndPassword = By.cssSelector(".alert-text");
	By invalidEmail = By.cssSelector(".pl-0 > span");
	By invalidEmail2 = By.cssSelector(".alert-text .font-weight-bolder");
	By requiredEmail = By.xpath("//?/span[@innertext=' Email is required ' or @innertext=' Email gerekli ']");
	
	
	
	public PanelLoginPage() throws IOException {
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
	public WebElement getInvalidEmailAndPassword() throws IOException {
		this.driver = getDriver();
		return driver.findElement(invalidEmailAndPassword);
	}
	public WebElement getInvalidEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(invalidEmail);
	}
	public WebElement getInvalidEmail2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(invalidEmail2);
	}
	public WebElement getRequiredEmail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(requiredEmail);
	}
	
}
