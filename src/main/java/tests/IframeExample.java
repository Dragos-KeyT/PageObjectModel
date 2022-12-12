package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class IframeExample extends BaseTest {
	
	@Test
	public void iframeExampleTest() {
		
		app.menu.navigateTo(app.menu.contactLink);
		app.contact.zoomMap(app.contact.zoomIn);
		
		
		
	}

}
