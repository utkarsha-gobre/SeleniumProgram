package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoeLinlText {

	public static void main(String[] args) {
	System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Gmail")).click();
	
	
	
	
	}

}
