package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.ShopPage;
import utils.BaseTest;

public class DropdownTest extends BaseTest{
	
	
	@Test(priority = 1, groups="ProductFunctioanlity")
	public void selectByValueTest() {
		
		app.menu.navigateTo(app.menu.shopLink);
		app.shop.filterByValue("price-desc");
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/?orderby=price-desc");
		assertEquals(app.shop.getCurrentSelectedOption(), "Sort by price: high to low");	
	}
	
	@Test(priority = 2, groups="ProductFunctioanlity")
	public void selectByIndexTest() {
		menu.navigateTo(menu.shopLink);
		//ShopPage shop = new ShopPage(driver);
		app.shop.filterByIndex(3);
		assertEquals(app.shop.getCurrentSelectedOption(), "Sort by latest");
	}
	
	@Test(priority = 3, groups="ProductFunctioanlity")
	public void selectByVisibleTextTest() {
		menu.navigateTo(menu.shopLink);
		ShopPage shop = new ShopPage(driver);
		shop.filterByVisibleText("Sort by popularity");
		assertEquals(shop.getCurrentSelectedOption(), "Sort by popularity");
	}
	
	@Test(priority = 4)
	public void example() throws InterruptedException {
		
		menu.navigateTo(menu.shopLink);
		WebElement dropdown =  driver.findElement(By.name("orderby"));// incarca in memorie un webelement (pe un id de sesiune)
		Select select = new Select(dropdown);// primeste webelementul
		select.selectByIndex(2);// se folosete de webelement si face refresh (si se ia alt id de sesiune)
		Thread.sleep(3000);
		select.selectByVisibleText("Sort by popularity");// se folosete de webelement (crapa cu element is not attached to the page document)
		

		
	}
	
	

}
