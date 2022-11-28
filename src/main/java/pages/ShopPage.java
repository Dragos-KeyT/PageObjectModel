package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {
	
	public WebDriver driver;
	//public Select selectDropDown;
	
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;		
	}
	

	public By orderDropDown = By.name("orderby");
	
	
	public void filterByValue(String value) {
		
		WebElement element =  driver.findElement(orderDropDown);
		Select selectDropDown =  new Select(element);
		selectDropDown.selectByValue(value);
		
	}
	
	public void filterByIndex(int index) {
		WebElement element =  driver.findElement(orderDropDown);
		Select selectDropDown =  new Select(element);
		selectDropDown.selectByIndex(index);
	}
	
	public void filterByVisibleText(String text) {
		WebElement element =  driver.findElement(orderDropDown);
		Select selectDropDown =  new Select(element);
		selectDropDown.selectByVisibleText(text);;
	}
	
	public String getCurrentSelectedOption() {
		WebElement element =  driver.findElement(orderDropDown);
		Select selectDropDown =  new Select(element);
		return selectDropDown.getFirstSelectedOption().getText();
	}
	
}
