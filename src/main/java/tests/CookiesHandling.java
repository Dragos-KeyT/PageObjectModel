package tests;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CookiesHandling extends BaseTest{
	
	
	@Test(priority = 1)
	public void addCookie() throws InterruptedException {
		
		//Cookie cookie = new Cookie("name", "value");
		
		driver.manage().addCookie(new Cookie("MyCookie", "My cookie value"));
		
		Thread.sleep(3000);
		
	}
	
	@Test(priority = 2)
	public void getCookieNamed() {
		
		Cookie cokkie = driver.manage().getCookieNamed("PHPSESSID");
		System.out.println(cokkie);
	}
	
	@Test(priority = 3)
	public void getAllCookies() {
		
		Set<Cookie> allCookies= driver.manage().getCookies();
		System.out.println(allCookies);
	}
	
	@Test(priority = 4)
	public void deleteCookieNamed() {
		driver.manage().deleteCookieNamed("MyCookie");
		
		System.out.println("---------------------------");
		Set<Cookie> allCookies= driver.manage().getCookies();
		System.out.println(allCookies);
	}
	
	@Test(priority=5)
	public void deleteAllCookies() {
		
		driver.manage().deleteAllCookies();
		
		
		System.out.println("-------------2------------");
		Set<Cookie> allCookies= driver.manage().getCookies();
		System.out.println(allCookies);
	}
	

}
