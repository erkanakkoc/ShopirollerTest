package com.shopiroller.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Hooks;
import io.qameta.allure.Allure;
import pageObjects.Homepage;
import pageObjects.StoreContentPanel;
import pageObjects.StoreHomepage;
import pageObjects.StoreLoginPage;
import pageObjects.StoreProductPage;
import pageObjects.UserProfilePage;

public class AllureReportTest extends Hooks {

	public AllureReportTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void AllureTest() throws IOException, InterruptedException {
		Homepage home = new Homepage();
		//JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		//jse.executeScript("arguments[0].scrollIntoView()", home.getLoginLink()); 
		
		home.getLoginLink().click();
		Allure.step("Login sayfasına geçildi");
		
		StoreLoginPage loginPage = new StoreLoginPage();
		loginPage.getSinginEmail().sendKeys("erkan.akkoc@mobiroller.com");
		loginPage.getSinginPassword().sendKeys("123456");
		loginPage.getSinginBtn().click();
		Allure.step("Giriş yapıldı");
		
		UserProfilePage userProfilePage = new UserProfilePage();
		userProfilePage.getHomepageLink().click();
		Allure.step("Anasayfaya gidildi");
		
		StoreHomepage storeHome = new StoreHomepage();
		storeHome.getProdOne().click();
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
		Allure.step("Sepete Eklendi");
		
		Thread.sleep(2000);

		StoreContentPanel cPanel = new StoreContentPanel();
	

		
		cPanel.getContinueShopBtn().click();
		Allure.step("Alışverişe Devam Et butonuna tıklandı");
		
		storeProd.getHomepageLink().click();
		Allure.step("Anasayfa butonuna tıklandı");
		
		//hata versin diye eklendi
		storeProd.getQuantIncrease().click();
		Allure.step("Ürün sayısı arttırıldı");
		storeProd.getAddToCartBtn().click();
		Allure.step("Sepete Eklendi");
		
	}

}
