package com.shopiroller.devPanelTests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import base.HooksPanel;
import io.qameta.allure.Allure;
import pageObjectsPanel.PanelHomepage;
import pageObjectsPanel.PanelLoginPage;
import pageObjectsPanel.homepageButtons.PanelProfileBtn;

@Listeners(resources.Listeners.class)
public class LoginTests extends HooksPanel{

	PanelLoginPage login = new PanelLoginPage();
	BasePage base = new BasePage();
	PanelHomepage homepage = new PanelHomepage();
	
	public LoginTests() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test (priority = 1)
	public void LoginSuccessfully() throws IOException, InterruptedException {
		
		login.getSinginEmail().sendKeys("erkan.akkoc@mobiroller.com");
		login.getSinginPassword().sendKeys("Test1234");
		login.getSinginBtn().click();
		Allure.step("Doğru kullanıcı bilgileri girilip, giriş butonuna tıklandı");
		Thread.sleep(1000);
		
		if(base.getPanelMessageTRText().equals(homepage.getPanelMessage().getText())) {
			System.out.println("TR");
			Assert.assertTrue(true);
		} else if (base.getPanelMessageENText().equals(homepage.getPanelMessage().getText())) {
			System.out.println("EN");
			Assert.assertTrue(true);
		} else {
			System.out.println("Error");
			Assert.assertTrue(false);
		}
		
		Allure.step("Giriş başarılı oldu. Ekranda görünen yazı: " + homepage.getPanelMessage().getText());
		
		homepage.getProfileBtn().click();
		
		PanelProfileBtn profile = new PanelProfileBtn();
		profile.getLogoutBtn().click();
		Allure.step("Çıkış butonuna tıklandı.");
		Thread.sleep(1000);
	}
	
	
	@Test (priority = 2)
	public void LoginWithWrongEmail() throws IOException, InterruptedException {
		login.getSinginEmail().clear();
		login.getSinginEmail().sendKeys("erkan.akkoc@test.com");
		login.getSinginPassword().clear();
		login.getSinginPassword().sendKeys("Test1234");
		login.getSinginBtn().click();
		Allure.step("Yanlış Email adres ve Doğru şifre girilip, giriş butonuna tıklandı");
		
		Thread.sleep(2000);
		
		if(base.getInvalidEmailAndPasswordTRText().equals(login.getInvalidEmailAndPassword().getText())) {
			System.out.println("TR");
			Assert.assertTrue(true);
		} else if (base.getInvalidEmailAndPasswordENText().equals(login.getInvalidEmailAndPassword().getText())) {
			System.out.println("EN");
			Assert.assertTrue(true);
		} else {
			System.out.println("Error");
			Assert.assertTrue(false);
		}
		Allure.step("Gelen hata mesajı kontrol edildi. Hata Mesajı: " + login.getInvalidEmailAndPassword().getText());
		
	}
	
	
	@Test (priority = 3)
	public void LoginWithInvalidEmail() throws IOException, InterruptedException {
		login.getSinginEmail().clear();
		login.getSinginEmail().sendKeys("erkan.akkoc");
		login.getSinginPassword().clear();
		login.getSinginPassword().sendKeys("test1234");
		login.getSinginBtn().click();
		Allure.step("Geçersiz Email adres ve Doğru şifre bilgileri girilip, giriş butonuna tıklandı");
		Thread.sleep(1000);	

		if(base.getInvalidEmailTRText().equals(login.getInvalidEmail().getText())) {
			System.out.println("TR");
			Assert.assertTrue(true);
		} else if (base.getInvalidEmailENText().equals(login.getInvalidEmail().getText())) {
			System.out.println("EN");
			Assert.assertTrue(true);
		} else {
			System.out.println("Error");
			Assert.assertTrue(false);
		}			
		
		Allure.step("Gelen hata mesajı kontrol edildi. Hata Mesajı: " + login.getInvalidEmail().getText());
	}
	
	
	@Test (priority = 4)
	public void LoginWithWrongPassword() throws IOException, InterruptedException {
		login.getSinginEmail().clear();
		login.getSinginEmail().sendKeys("erkan.akkoc@mobiroller.com");
		login.getSinginPassword().clear();
		login.getSinginPassword().sendKeys("123456");
		login.getSinginBtn().click();
		Allure.step("Doğru Email adres ve Yanlış şifre bilgileri girilip, giriş butonuna tıklandı");

		Thread.sleep(1000);
		
		if(base.getInvalidEmailAndPasswordTRText().equals(login.getInvalidEmailAndPassword().getText())) {
			System.out.println("TR");
			Assert.assertTrue(true);
		} else if (base.getInvalidEmailAndPasswordENText().equals(login.getInvalidEmailAndPassword().getText())) {
			System.out.println("EN");
			Assert.assertTrue(true);
		} else {
			System.out.println("Error");
			Assert.assertTrue(false);
		}		
		Allure.step("Gelen hata mesajı kontrol edildi. Hata Mesajı: " + login.getInvalidEmailAndPassword().getText());
	}
	
	@Test (priority = 5)
	public void LoginWithWrongEmailAndPassword() throws IOException, InterruptedException {
		login.getSinginEmail().clear();
		login.getSinginEmail().sendKeys("erkan.akkoc@test.com");
		login.getSinginPassword().clear();
		login.getSinginPassword().sendKeys("123456");
		login.getSinginBtn().click();		
		Allure.step("Yanlış Email adres ve Yanlış şifre bilgileri girilip, giriş butonuna tıklandı");

		Thread.sleep(2000);
		
		if(base.getInvalidEmailAndPasswordTRText().equals(login.getInvalidEmailAndPassword().getText())) {
			System.out.println("TR");
			Assert.assertTrue(true);
		} else if (base.getInvalidEmailAndPasswordENText().equals(login.getInvalidEmailAndPassword().getText())) {
			System.out.println("EN");
			Assert.assertTrue(true);
		} else {
			System.out.println("Error");
			Assert.assertTrue(false);
		}
		Allure.step("Gelen hata mesajı kontrol edildi. Hata Mesajı: " + login.getInvalidEmailAndPassword().getText());
	}


}
