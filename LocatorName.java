package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("Demo@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Demo123");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
