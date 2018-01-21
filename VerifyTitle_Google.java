import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerifyTitle_Google {
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","...\\chromedriver.exe"); // Run using Google Chrome
		//driver = newChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","...\\IEDriverServer.exe"); // Run using Internet Explorer
		//driver = newInternetExplorerDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		driver.get("https://www.google.com");
		
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Google";
		
		assertEquals(ActualTitle, ExpectedTitle);
	}

}