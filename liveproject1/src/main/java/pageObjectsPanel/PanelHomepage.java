package pageObjectsPanel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class PanelHomepage extends BasePage{

public WebDriver driver;
	
	By homeLogo = By.cssSelector("img[alt='Shopiroller logo']");
	By searchBar = By.cssSelector(".form-control.form-control-solid");
	By newProjectBtn = By.cssSelector("button#new-application__btn");
	By helpBtn = By.cssSelector(".topbar .dropdown-toggle [fill]");
	By profileBtn = By.cssSelector("[class='mt-10px ng-star-inserted'] .font-size-h5");
	By projectDetailsBtn = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(1) [class='svg-inline--fa fa-ellipsis-h fa-w-16 fa-lg']");
	By loadMoreBtn = By.cssSelector(".btn.btn-secondary.ng-star-inserted.p-3.p-button.p-component.p-element.px-10");

	By panelMessage = By.cssSelector("app-greeting .text-muted");
	
	By project1 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(1) .card-body");
	By project2 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(2) .card-body");
	By project3 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(3) .card-body");
	By project4 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(4) .card-body");
	By project5 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(5) .card-body");
	By project6 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(6) .card-body");
	By project7 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(7) .card-body");
	By project8 = By.cssSelector("[class] [class='col-xl-6 ng-star-inserted']:nth-of-type(8) .card-body");

	
	public PanelHomepage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getHomeLogo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(homeLogo);
	}
	public WebElement getSearchBar() throws IOException {
		this.driver = getDriver();
		return driver.findElement(searchBar);
	}
	public WebElement getProjectBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(newProjectBtn);
	}
	public WebElement getHelpBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(helpBtn);
	}
	public WebElement getProfileBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileBtn);
	}
	public WebElement getProjectDetailsBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(projectDetailsBtn);
	}
	public WebElement getLoadMoreBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(loadMoreBtn);
	}
	
	
	public WebElement getPanelMessage() throws IOException {
		this.driver = getDriver();
		return driver.findElement(panelMessage);
	}
	
	
	
	
	public WebElement getProject1() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project1);
	}
	public WebElement getProject2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project2);
	}
	public WebElement getProject3() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project3);
	}
	public WebElement getProject4() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project4);
	}
	public WebElement getProject5() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project5);
	}
	public WebElement getProject6() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project6);
	}
	public WebElement getProject7() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project7);
	}
	public WebElement getProject8() throws IOException {
		this.driver = getDriver();
		return driver.findElement(project8);
	}
	
	

}
