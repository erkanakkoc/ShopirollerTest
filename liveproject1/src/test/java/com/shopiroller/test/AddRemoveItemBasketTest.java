package com.shopiroller.test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.Hooks;
import io.qameta.allure.Allure;
import junit.framework.Assert;
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
		Allure.step("Kullanıcı profili açıldı ve Anasayfaya geçildi");

		StoreHomepage storeHome = new StoreHomepage();
		storeHome.getProdOne().click();
		Allure.step("İlk ürün seçildi");
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
		
		Thread.sleep(2000);

		StoreContentPanel cPanel = new StoreContentPanel();
	

		cPanel.getContinueShopBtn().click();
		Allure.step("Alışverişe devam et butonuna tıklandı");
		storeProd.getHomepageLink().click();
		storeHome.getProdTwo().click();
		Allure.step("İkinci ürün seçildi");
		storeProd.getAddToCartBtn().click();
		Allure.step("Ürün Sepete eklendi");
		
		cPanel.getDeleteItemOne().click();
		Allure.step("Ürün sepetten silindi");
		//Element görünene kadar beklemesini sağla
		//waitForElementInvisible(cPanel.getDeleteItemOne(), 10);

		
		
		System.out.println(cPanel.getTotalValue().getText());
		
		// Sepet Tutarını Doğrulamak için
		//Assert.assertEquals(cPanel.getTotalValue().getText(), "566.18547 ₺");
		
	}
	
	

}
