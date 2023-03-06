package com.shopiroller.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.PaymentPage;
import pageObjects.StoreContentPanel;
import pageObjects.StoreHomepage;
import pageObjects.StoreLoginPage;
import pageObjects.StoreProductPage;
import pageObjects.UserProfilePage;

@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {

	public OrderCompleteTest() throws IOException {
		super();
	}
	
	@Test
	public void endToEndTest() throws InterruptedException, IOException {
		
		ExtentManager.log("Starting OrderCompleteTest...");

		
		Homepage home = new Homepage();
		//JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		//jse.executeScript("arguments[0].scrollIntoView()", home.getLoginLink()); 
		
		home.getLoginLink().click();
		
		StoreLoginPage loginPage = new StoreLoginPage();
		ExtentManager.pass("Have successfully reached the Store Login Page");
		loginPage.getSinginEmail().sendKeys("erkan.akkoc@mobiroller.com");
		loginPage.getSinginPassword().sendKeys("123456");
		loginPage.getSinginBtn().click();
		
		UserProfilePage userProfilePage = new UserProfilePage();
		ExtentManager.pass("Have successfully reached the User Profile Page");
		userProfilePage.getHomepageLink().click();
		
		StoreHomepage storeHome = new StoreHomepage();
		ExtentManager.pass("Have successfully reached the Store Products Page");
		storeHome.getProdOne().click();
		Thread.sleep(2000);
		
		StoreProductPage storeProd = new StoreProductPage();
		ExtentManager.pass("Have successfully reached the Product Page");

		
		//Varyant Seçimi
		/*
		Select option = new Select(storeProd.getSizeOption());
		option.selectByVisibleText("Medium");
		*/
		
		//storeProd.getQuantIncrease().click();
		storeProd.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added product to basket");

		
		Thread.sleep(3000);
		
		StoreContentPanel cPanel = new StoreContentPanel();
		ExtentManager.pass("Have successfully reached the shopping cart page");

		//İndirim Kodu Ekleme
		/*
		cPanel.getPromoTextbox().sendKeys("2USD");
		cPanel.getPromoAddBtn().click();
		Thread.sleep(2000);
		*/
		
		cPanel.getCheckoutBtn().click();
		ExtentManager.pass("Have successfully selected the checkout button");
		Thread.sleep(3000);
		
		PaymentPage paymentPage = new PaymentPage();
		paymentPage.getBillingNameField().sendKeys("Erkan Akkoç");
		paymentPage.getBillingPhoneField().sendKeys("05547085086");
		paymentPage.getBillingEmailField().sendKeys("erkan.akkoc@mobiroller.com");
		paymentPage.getBillingCountryField().sendKeys("Türkiye");
		paymentPage.getBillingStateField().sendKeys("Bayraklı");
		paymentPage.getBillingCityField().sendKeys("İzmir");
		paymentPage.getBillingAddressField().sendKeys("Test Adresi");
		paymentPage.getBillingZipCodeField().sendKeys("35510");
		
		ExtentManager.pass("Have successfully entered billing information");
		
		paymentPage.getShippingNameField().sendKeys("Erkan Akkoç");
		paymentPage.getShippingPhoneField().sendKeys("05547085086");
		paymentPage.getShippingEmailField().sendKeys("erkan.akkoc@mobiroller.com");
		paymentPage.getShippingCountryField().sendKeys("Türkiye");
		paymentPage.getShippingStateField().sendKeys("Bayraklı");
		paymentPage.getShippingCityField().sendKeys("İzmir");
		paymentPage.getShippingAddressField().sendKeys("Test Adresi");
		paymentPage.getShippingZipCodeField().sendKeys("35510");
		ExtentManager.pass("Have successfully entered shipping information");
		Thread.sleep(2000);
		// Kapıda ödeme seçili geldiği için şimdilik pasif
		//paymentPage.getPayAtDoor().click();
		//ExtentManager.pass("Have successfully chose Payment Method");
		
		//paymentPage.getCompleteOrder().click();
		//ExtentManager.pass("Have successfully completed order");
	}
}
