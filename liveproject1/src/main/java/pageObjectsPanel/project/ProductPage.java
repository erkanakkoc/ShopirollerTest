package pageObjectsPanel.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProductPage extends BasePage{

	public WebDriver driver;
	
	By title = By.xpath("/html//input[@id='title_']");
	By description = By.cssSelector("p-editor#description_ .ql-blank.ql-editor");
	
	//SEO Seçenekleri
	By slug = By.xpath("//form[@id='seo-container']/div[2]/div//input[@name='slug']");
	By pageTitle = By.xpath("//form[@id='seo-container']/div[2]/div//input[@name='pageTitle']");
	By slugDescription = By.xpath("//form[@id='seo-container']/div[2]/div//textarea[@name='description']");
	
	//Fiyatlandırma
	By productPrice = By.cssSelector(".row.ng-star-inserted .p-filled");
	By discountedPrice = By.cssSelector("[class='col-lg-6']:nth-of-type(2) .p-inputnumber-input");
	
	
	//Stok 
	// Buradaki arttırma ve azaltma butonları eklenmedi
	By stockCode = By.xpath("//form[@id='manage-product']/div[1]/div[1]/div[5]/div[@class='card-body']/div[1]/input[@type='text']");
	By numberOfStock = By.cssSelector("[class] .flex-column:nth-of-type(2) #minmax-buttons");
	By maximumSales = By.cssSelector("[class] .flex-column:nth-of-type(3) #minmax-buttons");
	
	//Varyant
	By addVariantTypeBtn = By.xpath("///button[@innertext=' Add Variant Type ']");
	
	//Kargo
	// Burası tamamlanacak 
	
	// Medya
	By addVideoLink = By.xpath("//?/span[@innertext='here']");
	By addPhoto = By.xpath("/html//p-fileupload[@id='image-uploader']//div[@class='p-fileupload-buttonbar']/span");
	
	By saveBtn = By.xpath("//form[@id='manage-product']/div[2]/div/button[@type='submit']");
	
	
	//EKSIKLER
	//Kategori seçimi
	//Marka seçimi
	//Vitrin seçimi
	//Ürün statüsü seçimi
	
	
	
	public ProductPage() throws IOException {
		super();
	}
	
	public WebElement getTitle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(title);
	}
	public WebElement getDescription() throws IOException {
		this.driver = getDriver();
		return driver.findElement(description);
	}
	public WebElement getSlug() throws IOException {
		this.driver = getDriver();
		return driver.findElement(slug);
	}
	public WebElement getPageTitle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(pageTitle);
	}
	public WebElement getSlugDescription() throws IOException {
		this.driver = getDriver();
		return driver.findElement(slugDescription);
	}
	public WebElement getProductPrice() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productPrice);
	}
	public WebElement getDiscountedPrice() throws IOException {
		this.driver = getDriver();
		return driver.findElement(discountedPrice);
	}
	public WebElement getStockCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(stockCode);
	}
	public WebElement getNumberOfStock() throws IOException {
		this.driver = getDriver();
		return driver.findElement(numberOfStock);
	}
	public WebElement getMaximumSales() throws IOException {
		this.driver = getDriver();
		return driver.findElement(maximumSales);
	}
	public WebElement getAddVariantTypeBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addVariantTypeBtn);
	}
	public WebElement getAddVideoLink() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addVideoLink);
	}
	public WebElement getAddPhoto() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addPhoto);
	}
	public WebElement getSaveBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(saveBtn);
	}
	

}
