package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHome {
	
	/*Test Steps
	 * 1. Launch Chrome browser
	 * 2. Navigate to google.com
	 * 3. Find the title of the page
	 * 4. Verify the actual vs expected result
	 * 
	 * //System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		//WebDriver driver = new FirefoxDriver();
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the driver path
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		// Instantiate Selenium-WebDriver / Will open chrome driver 
		
		WebDriver driver  = new ChromeDriver();
		
		// Navigate to google page
		
		driver.get("https://www.google.com/");
		
		String ActualResult = driver.getTitle();
		
		String ExpectedResult = "Google2020";
		
		//System.out.print(ActualResult);
		
		// EXPECTED Google
		
		Boolean var = ActualResult.contains(ExpectedResult);
		
		
		// TestNG , Junit
		
		
	if (var) {
		System.out.println("Test passed");
	}else {
		System.out.println("Test Failed");
	}
		
		
		

	}

}
