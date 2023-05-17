package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector2 {

	public static void main(String[] args) 
	{

    System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("Elon");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Demo@123");
		
		
		
		
		
		
	}

}
