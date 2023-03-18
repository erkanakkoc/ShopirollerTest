package com.shopiroller.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import io.qameta.allure.Allure;
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
		Homepage home = new Homepage();
		//JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		//jse.executeScript("arguments[0].scrollIntoView()", home.getLoginLink()); 
		
		home.getLoginLink().click();
		Allure.step("Giriş sayfasına geçildi");
		StoreLoginPage loginPage = new StoreLoginPage();
		loginPage.getSinginEmail().sendKeys("erkan.akkoc@mobiroller.com");
		loginPage.getSinginPassword().sendKeys("123456");
		loginPage.getSinginBtn().click();
		Allure.step("Hesaba giriş yapıldı");
		
		UserProfilePage userProfilePage = new UserProfilePage();
		userProfilePage.getHomepageLink().click();
		
		StoreHomepage storeHome = new StoreHomepage();
		storeHome.getProdOne().click();
		Allure.step("Ürün seçildi");
		Thread.sleep(2000);
		
		StoreProductPage storeProd = new StoreProductPage();
		
		//Varyant Seçimi
		/*
		Select option = new Select(storeProd.getSizeOption());
		option.selectByVisibleText("Medium");
		*/
		
		storeProd.getQuantIncrease().click();
		Allure.step("Ürün sayısı arttırıldı");
		storeProd.getAddToCartBtn().click();
		Allure.step("Ürün sepete eklendi");
		Thread.sleep(3000);
		
		StoreContentPanel cPanel = new StoreContentPanel();
		
		//İndirim Kodu Ekleme
		/*
		cPanel.getPromoTextbox().sendKeys("2USD");
		cPanel.getPromoAddBtn().click();
		Thread.sleep(2000);
		*/
		
		cPanel.getCheckoutBtn().click();
		Allure.step("Ödeme sayfasına geçildi");
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
		Allure.step("Fatura bilgisi girildi");
		
		paymentPage.getShippingNameField().sendKeys("Erkan Akkoç");
		paymentPage.getShippingPhoneField().sendKeys("05547085086");
		paymentPage.getShippingEmailField().sendKeys("erkan.akkoc@mobiroller.com");
		paymentPage.getShippingCountryField().sendKeys("Türkiye");
		paymentPage.getShippingStateField().sendKeys("Bayraklı");
		paymentPage.getShippingCityField().sendKeys("İzmir");
		paymentPage.getShippingAddressField().sendKeys("Test Adresi");
		paymentPage.getShippingZipCodeField().sendKeys("35510");
		Allure.step("Kargo bilgisi girildi");
		
		Thread.sleep(2000);
		
		// Kapıda ödeme seçili geldiği için şimdilik pasif
		//paymentPage.getPayAtDoor().click();
		
		paymentPage.getCompleteOrder().click();
		Allure.step("Sipariş tamamlandı");
	}

}
