package pageObjectsPanel.project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ProjectNavbar extends BasePage{

	public WebDriver driver;
	
	By projectsToggle = By.cssSelector(".topbar app-apps-drop-down .dropdown-toggle [fill]");
	By currentProject = By.cssSelector(".mt-10px.ng-star-inserted > div#apps-drop-down  ul > li:nth-of-type(1) > .navi-link");
	By project2 = By.cssSelector(".mt-10px.ng-star-inserted > div#apps-drop-down  ul > li:nth-of-type(2) > .navi-link");
	By project3 = By.cssSelector(".mt-10px.ng-star-inserted > div#apps-drop-down  ul > li:nth-of-type(3) > .navi-link");
	By project4 = By.cssSelector(".mt-10px.ng-star-inserted > div#apps-drop-down  ul > li:nth-of-type(4) > .navi-link");
	By project5 = By.cssSelector(".mt-10px.ng-star-inserted > div#apps-drop-down  ul > li:nth-of-type(5) > .navi-link");
	By allProjects = By.cssSelector(".mt-10px.ng-star-inserted > div#apps-drop-down .btn.btn-block.btn-outline-dark.font-weight-bold");

	By helpBtn = By.cssSelector("[class='svg-inline--fa fa-question-circle fa-w-16 fa-lg'] [fill]");
	By helpCenter = By.cssSelector("[class='dropdown-menu p-0 m-0 dropdown-menu-anim-up dropdown-menu-sm dropdown-menu-right show'] .navi-item:nth-of-type(1) .navi-link");
	By giveFeedback = By.cssSelector("[class='dropdown-menu p-0 m-0 dropdown-menu-anim-up dropdown-menu-sm dropdown-menu-right show'] .navi-item:nth-of-type(2) .navi-link");
	By supportRequest = By.cssSelector("[class='dropdown-menu p-0 m-0 dropdown-menu-anim-up dropdown-menu-sm dropdown-menu-right show'] .navi-item:nth-of-type(3) .navi-link");

	By notificationsBtn = By.cssSelector("[class='svg-inline--fa fa-bell fa-w-14 fa-lg'] [fill]");
	By packageInformation = By.cssSelector(".topbar  button > span");
	
	By profileToggle = By.cssSelector("app-user-panel-menu .font-size-h5");
	By profileInfo = By.cssSelector(".text-break .font-weight-bold");
	By profileBtn = By.cssSelector("div#user-panel-menu  .navi.py-4 > li:nth-of-type(2) > .cursor-pointer.navi-link");
	By logoutBtn = By.cssSelector("li:nth-of-type(3) > .cursor-pointer.navi-link");
	
	
	public ProjectNavbar() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getProjectsToggle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(projectsToggle);
	}
	public WebElement getCurrentProject() throws IOException {
		this.driver = getDriver();
		return driver.findElement(currentProject);
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
	public WebElement getAllProjects() throws IOException {
		this.driver = getDriver();
		return driver.findElement(allProjects);
	}
	public WebElement getHelpBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(helpBtn);
	}
	public WebElement getHelpCenter() throws IOException {
		this.driver = getDriver();
		return driver.findElement(helpCenter);
	}
	public WebElement getGiveFeedback() throws IOException {
		this.driver = getDriver();
		return driver.findElement(giveFeedback);
	}
	public WebElement getSupportRequest() throws IOException {
		this.driver = getDriver();
		return driver.findElement(supportRequest);
	}
	public WebElement getNotificationsBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(notificationsBtn);
	}
	public WebElement getPackageInformation() throws IOException {
		this.driver = getDriver();
		return driver.findElement(packageInformation);
	}
	public WebElement getProfileToggle() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileToggle);
	}
	public WebElement getProfileInfo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileInfo);
	}
	public WebElement getProfileBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(profileBtn);
	}
	public WebElement getLogoutBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(logoutBtn);
	}
	

}
