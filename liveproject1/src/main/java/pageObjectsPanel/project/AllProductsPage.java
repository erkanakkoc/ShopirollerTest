package pageObjectsPanel.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class AllProductsPage extends BasePage{

	public WebDriver driver;
	
	By addNewProduct = By.cssSelector(".btn.btn-light-primary.ml-3");
	By importProduct = By.cssSelector("div#import-export .navi.py-4 > li:nth-of-type(1) > .navi-link");
	By exportProduct = By.cssSelector("div#import-export .navi.py-4 > li:nth-of-type(2) > .navi-link");
	By productStatus = By.cssSelector("tr:nth-of-type(1) > td:nth-of-type(4) > .product-badge > span");
	
	//İlk ürüne göre işlem yapıyor
	By editProduct = By.xpath("//tr[1]/td[8]/button[@innertext='Edit' or @innertext='Düzenle']");
	By actionBtn = By.cssSelector(".p-datatable-tbody .ng-star-inserted:nth-of-type(1) [aria-haspopup]");
	By copyProduct = By.xpath("//div[@id='cdk-overlay-1']/div[@role='menu']/div/div/button/span[@innertext='Copy' or @innertext='Kopyala']");
	By unpublishProduct = By.xpath("//div[@id='cdk-overlay-1']/div[@role='menu']/div/div/button/span[@innertext='Unpublish' or @innertext='Yayından Kaldır']");
	By publishProduct = By.xpath("//div[@id='cdk-overlay-1']/div[@role='menu']/div/div/button/span[@innertext='Publish' or @innertext='Yayınla']");
	By previewProduct = By.xpath("//div[@id='cdk-overlay-1']/div[@role='menu']/div/div/button/span[@innertext='Preview' or @innertext='Ön İzleme']");
	By deleteProduct = By.xpath("//div[@id='cdk-overlay-1']/div[@role='menu']/div/div/button/span[@innertext='Delete Product' or @innertext='Ürünü Sil']");
	
	
	
	//Ürüne göre i'ye değer verip o üründeki düzenlemeye tıklama
	// //tr["+ i +"]/td[8]/button[@innertext='Edit' or @innertext='Düzenle']
	
	//Ürüne göre aksiyona tıklama
/* 
	private String i; // i ye değer atayıp bunun hangi ürünün aksiyonunu çalıştıracağını belirtebiliriz.
	By actionBtn = By.cssSelector(".p-datatable-tbody .ng-star-inserted:nth-of-type("+ i +") [aria-haspopup]");	
	By copyProduct = By.xpath("//div[@role='menu']/div/div/button/span[@innertext='Copy' or @innertext='Kopyala']");
	By unpublishProduct = By.xpath("//div[@role='menu']/div/div/button/span[@innertext='Unpublish' or @innertext='Yayından Kaldır']");
	By publishProduct = By.xpath("//div[@role='menu']/div/div/button/span[@innertext='Publish' or @innertext='Yayınla']");
	By previewProduct = By.xpath("//div[@role='menu']/div/div/button/span[@innertext='Preview' or @innertext='Ön İzleme']");
	By deleteProduct = By.xpath("//div[@role='menu']/div/div/button/span[@innertext='Delete Product' or @innertext='Ürünü Sil']");
*/
	
	
	//EKSIKLER
	// Ürünlere yapılan genel aksiyon. Örneğin: Tüm ürünleri silme
	// Sıralama
	// Filtreleme
	// Arama
	// Dil Değiştirme
	// Ürünlerde diğer sayfaya geçme
	// Ürün bilgilerini doğrulama
	
	
	public AllProductsPage() throws IOException {
		super();
	}
	
	public WebElement getAddNewProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addNewProduct);
	}
	public WebElement getImportProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(importProduct);
	}
	public WebElement getExportProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(exportProduct);
	}
	public WebElement getProductStatus() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productStatus);
	}
	public WebElement getEditProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(editProduct);
	}
	public WebElement getActionBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(actionBtn);
	}
	public WebElement getCopyProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(copyProduct);
	}
	public WebElement getUnpublishProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(unpublishProduct);
	}
	public WebElement getPublishProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(publishProduct);
	}
	public WebElement getPreviewProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(previewProduct);
	}
	public WebElement getDeleteProduct() throws IOException {
		this.driver = getDriver();
		return driver.findElement(deleteProduct);
	}
	

}
