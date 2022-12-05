package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By loginLink = By.linkText("Login");
	public By contactLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	public By homeLink = By.linkText("HOME");
	public By eventsLink = By.linkText("EVENTS");

	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchInput = By.cssSelector("input[class='search_field']");
	
	public void search(String text) {
		
		click(searchIcon);
		sendKeys(searchInput, text);
		click(searchIcon);
	}
	
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
		
	}
	
	public ContactsPage navigateToContact() {
		driver.findElement(contactLink).click();
		return new ContactsPage(driver);
		
	}
	
	//ContactPage contactPage = navigateToContact()

}
