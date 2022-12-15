package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavascripExecutorTest extends BaseTest{
	
	
	//@Test
	public void example1() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//driver.get(null);
		//driver.navigate().to(null);
		jse.executeScript("window.location='https://emag.ro'");
		
		//driver.navigate().back();
		jse.executeScript("window.history.go(-1)");
		
		//driver.navigate().forward();
		jse.executeScript("window.history.forward(-1)");
		
		//1
		driver.navigate().refresh();
		//2
		jse.executeScript("window.history.go(0)");
		//3
		Actions action =  new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		//4
		driver.get(driver.getCurrentUrl());
		
	}
	
	
	//@Test
	public void example2() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		//alternativa pentru click
//		jse.executeScript("arguments[0].click()", app.menu.getWebElement(app.menu.searchIcon));
		//alternativa pentru sendKeys
//		jse.executeScript("arguments[0].value='cooking'", app.menu.getWebElement(app.menu.searchInput));
		//alternativa pentru click
//		jse.executeScript("arguments[0].click()", app.menu.getWebElement(app.menu.searchIcon));
		
	//	jse.executeScript("arguments[0].click();arguments[1].value='cooking';",app.menu.getWebElement(app.menu.searchIcon),app.menu.getWebElement(app.menu.searchInput));
		
		
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");
		jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking'");
		jse.executeScript("document.getElementsByClassName('icon-search')[0].click()");

		//alternativa pentru isDisplayed
		jse.executeScript("document.getElementsByClassName('post_title')[0].checkVisibility()");
		
		
		//alternativa pentru getText
		String bookTitle =jse.executeScript("return document.getElementsByClassName('post_title')[0].childNodes[0].innerHTML").toString();
		System.out.println(bookTitle);
		
		
		//alternativa pentru getTitle
		String pageTitle = jse.executeScript("return document.title").toString();
		System.out.println(pageTitle);
		
		
		//alternativa pentru getCurrentURl
		String currentUrl = jse.executeScript("return document.URL").toString();
		System.out.println(currentUrl);;
		
		
		Thread.sleep(5000);	
	}
	
	
	@Test
	public void example3() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		System.out.println(driver.getTitle());
		
		jse.executeScript("window.SchimbTitlul = function(){ document.title = 'Alt titlu!'};"
				+ "window.SchimbTitlul.call()");
		
		System.out.println(driver.getTitle());
		
		String javaScriptHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover', true);"
				+ "arguments[0].dispatchEvent(obiect);";
		
		jse.executeScript(javaScriptHover, app.menu.getWebElement(app.menu.blogLink));
		jse.executeScript(javaScriptHover, app.menu.getWebElement(app.menu.aboutLink));

	}
	
	
	

}
