package com.shopiroller.test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ExtentManager;
import base.Hooks;
import pageObjects.Homepage;
import pageObjects.StoreContentPanel;
import pageObjects.StoreHomepage;
import pageObjects.StoreLoginPage;
import pageObjects.StoreProductPage;
import pageObjects.UserProfilePage;

@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends Hooks{

	public AddRemoveItemBasketTest() throws IOException {
		super();
	}
	
	@Test
	public void addRemoveItem() throws InterruptedException, IOException {
		
		ExtentManager.log("Starting AddRemoveItemBasketTest...");
		
		
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
		Thread.sleep(1000);
		
		StoreProductPage storeProd = new StoreProductPage();
		ExtentManager.pass("Have successfully reached the Product Page");
		//Varyant Seçimi
		/*
		Select option = new Select(storeProd.getSizeOption());
		option.selectByVisibleText("Medium");
		*/
		
		storeProd.getQuantIncrease().click();
		ExtentManager.pass("Have successfully increased quentity");
		storeProd.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added product to basket");
		Thread.sleep(1000);
		
		StoreContentPanel cPanel = new StoreContentPanel();
		cPanel.getContinueShopBtn().click();
		
		storeProd.getHomepageLink().click();
		ExtentManager.pass("Reached to the Store Products Page");
		storeHome.getProdTwo().click();
		ExtentManager.pass("Reached the Product Page");
		storeProd.getAddToCartBtn().click();
		ExtentManager.pass("Have successfully added product to basket");
		
		cPanel.getDeleteItemOne().click();
		ExtentManager.pass("Have successfully deleted product from basket");
		//Element görünene kadar beklemesini sağla
		//waitForElementInvisible(cPanel.getDeleteItemOne(), 10);

		
		
		System.out.println(cPanel.getTotalValue().getText());
		
		// Sepet Tutarını Doğrulamak için
		/*
		try {
			Assert.assertEquals(cPanel.getTotalValue().getText(), "566.18547 ₺");
			ExtentManager.pass("The total amount matches the expected amount");
		} catch(AssertionError e) {
			Assert.fail("Cart amount did not match the expexted amount, it found " + cPanel.getTotalValue().getText() + " expected 566.18547 ₺");
			ExtentManager.fail("The total amount did not match the expected amount");
		}
		
		*/
		
	}

}
