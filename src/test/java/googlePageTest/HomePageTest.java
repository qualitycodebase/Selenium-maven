package googlePageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	
@Test
public void googleHomePage() {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	// Instantiate Selenium-WebDriver / Will open chrome driver 
	
	WebDriver driver  = new ChromeDriver();
	
	// Navigate to google page
	
	driver.get("https://www.google.com/");
	
	String ActualResult = driver.getTitle();
	
	String ExpectedResult = "Google";
	
	//System.out.print(ActualResult);
	
	// EXPECTED Google
	
	Boolean var = ActualResult.contains(ExpectedResult);
	
	// Verify the google title 
	
	Assert.assertEquals(ActualResult, ExpectedResult);
	
	// Close the browser
	driver.close();
	
}

}
