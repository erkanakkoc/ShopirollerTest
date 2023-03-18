package resources;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BasePage;
import io.qameta.allure.Attachment;

public class Listeners extends BasePage implements ITestListener{

	public Listeners() throws IOException {
		super();
	}
	
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
		
	}
	
	@Attachment(value = "Ekran Görüntüleri", type ="image/png")
	public byte[] saveScreenshotPNG(WebDriver driver) {
		return((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}
	
	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("Test started : " + iTestContext.getName());
		try {
			iTestContext.setAttribute("WebDriver", BasePage.getDriver());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("Test Finished : " + iTestContext.getName());
	}
	
	
	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("Test Success : " + getTestMethodName(iTestResult));
	}
	
	
	public void onTestFailure(ITestResult iTestResult) {
		
		
		System.out.println("Test Failed : " + getTestMethodName(iTestResult));
		
		Object testClass = iTestResult.getInstance();

		try {
			WebDriver driver = BasePage.getDriver();
			if(driver instanceof WebDriver) {
				System.out.println(getTestMethodName(iTestResult) + "için Ekran görüntüsü alındı.");
				//saveTextLog(getTestMethodName(iTestResult) + " screenshot taken");
				saveScreenshotPNG(driver);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			saveTextLog(getTestMethodName(iTestResult) + " için ekran görüntüsü alınamadı.");
		}
		
		
		saveTextLog(getTestMethodName(iTestResult) + " başarısız oldu ve ekran görüntüsü alındı.");
		
		/*
		try {
			WebDriver driver = BasePage.getDriver();
			if (driver instanceof WebDriver) {
				System.out.println("Screenshot captured for : " + getTestMethodName(iTestResult));
			}
			saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		/*
		try {
			takeSnapShot(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
			
	}
	
	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("Test Skipped : " + getTestMethodName(iTestResult));
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test Failed but it is defined success ratio : " + getTestMethodName(iTestResult));
	}
	

}
