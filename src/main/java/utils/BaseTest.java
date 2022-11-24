package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.MenuPage;

public class BaseTest {

	public WebDriver driver;
	public MenuPage menu;
	
	@BeforeClass
	public void setup() {
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://keybooks.ro");
		
		menu =  new MenuPage(driver);
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	//	driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	//	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(6000);
		driver.quit();
	}
	
	
}
