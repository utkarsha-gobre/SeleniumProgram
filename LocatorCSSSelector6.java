package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector6 {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.cssSelector(".form-control")).sendKeys("Utkarsha");
		
		driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Utkarsha123");
		
		driver.findElement(By.cssSelector("[value='Login']")).click();
		
		
	}

}
