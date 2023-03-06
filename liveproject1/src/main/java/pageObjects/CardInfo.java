package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CardInfo extends BasePage{
	
	public WebDriver driver;
	
	By cardHolderNameField = By.xpath("/html//input[@id='card_cardHolderName']");
	By cardNumberField = By.xpath("/html//input[@id='card_cardNumber']");
	By cardExpireMonthField = By.xpath("/html//input[@id='card_expireMonth']");
	By cardExpireYearField = By.xpath("/html//input[@id='card_expireYear']");
	By cardCvcField = By.xpath("/html//input[@id='card_cvc']");

	By orderBtn = By.xpath("/html//form[@id='form']//button[@type='submit']/span[2]");
	
	public CardInfo() throws IOException {
		super();
	}
	
	public WebElement getCardHolderNameField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cardHolderNameField);
	}
	
	public WebElement getCardNumberField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cardNumberField);
	}
	
	public WebElement getCardExpireMonthField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cardExpireMonthField);
	}
	
	public WebElement getCardExpireYearField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cardExpireYearField);
	}
	
	public WebElement getCardCvcField() throws IOException {
		this.driver = getDriver();
		return driver.findElement(cardCvcField);
	}
	
	public WebElement getOrderBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(orderBtn);
	}
}
