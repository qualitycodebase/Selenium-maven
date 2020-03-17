package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMaven {

    //Declare static WebDriver driver;
	
	static WebDriver driver;
	static String URL = "https://www.google.com/";
	
	public static void main(String[] args) {
		
		//Instantiated a ChromeDriver instance
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
				
		// Open up the browser and navigate to google.com
		
		  driver.get(URL);
		
		// Sending a text to google search text field
		
		  driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium Tutorial");
		
		// Click enter keys from keyboard
		
		  WebElement textbox = driver.findElement(By.xpath("//*[@name='q']"));
		  textbox.sendKeys(Keys.RETURN);

	}
	
	

}
