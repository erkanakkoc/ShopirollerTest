package base;

import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private String url;
	private String storeUrl, devStoreUrl, panelUrl, devPanelUrl;
	private Properties prop;
	private String invalidEmailTR,invalidEmailEN,invalidEmailAndPasswordTR,invalidEmailAndPasswordEN,panelMessageTR,panelMessageEN;

	public BasePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}

	public static WebDriver getDriver() throws IOException {
		return WebDriverInstance.getDriver();
	}

	public String getUrl() throws IOException {
		url = prop.getProperty("url");
		return url;

	}

	// Store URL

	public String getStoreUrl() throws IOException {
		storeUrl = prop.getProperty("storeurl");
		return storeUrl;

	}

	// Dev Store URL

	public String getDevStoreUrl() throws IOException {
		devStoreUrl = prop.getProperty("devstoreurl");
		return devStoreUrl;

	}
	
	// Panel URL

	public String getPanelUrl() throws IOException {
		panelUrl = prop.getProperty("panelurl");
		return panelUrl;

	}
	
	// Dev Panel URL

	public String getDevPanelUrl() throws IOException {
		devPanelUrl = prop.getProperty("devpanelurl");
		return devPanelUrl;

	}
	
	//Login Sistem Mesajları
	public String getInvalidEmailTRText() throws IOException {
		invalidEmailTR = "E-posta geçersiz";
		return invalidEmailTR;
	}
	public String getInvalidEmailENText() throws IOException {
		invalidEmailEN = "Email is invalid";
		return invalidEmailEN;
	}
	public String getInvalidEmailAndPasswordTRText() throws IOException {
		invalidEmailAndPasswordTR = "Oops! Kullanıcı adınız veya şifreniz yanlış.";
		return invalidEmailAndPasswordTR;
	}
	public String getInvalidEmailAndPasswordENText() throws IOException {
		invalidEmailAndPasswordEN = "Whoops! Your username or password is incorrect.";
		return invalidEmailAndPasswordEN;
	}
	
	
	public String getPanelMessageTRText() throws IOException{
		panelMessageTR = "Burada olduğun için mutluyuz. Hadi projelerine göz atalım.";
		return panelMessageTR;
	}
	
	public String getPanelMessageENText() throws IOException{
		panelMessageEN = "We are happy to be here. Have a nice day at work";
		return panelMessageEN;
	}
	
	
	

	public void takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		File destFile = new File(System.getProperty("user.dir") + "\\target\\screenshots\\" + timestamp() + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	/*public static void waitForElementInvisible(WebElement element, int timer) throws IOException {
		WebDriverWait wait = new WebDriverWait(getDriver(), timer);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
*/
}
