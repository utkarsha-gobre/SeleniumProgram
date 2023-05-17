package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
	
		driver.findElement(By.xpath("//input[@ngmodel='EmailAdress']")).sendKeys("Demo@123gmail.com");
		
	    driver.findElement(By.xpath("//input[@ngmodel='Phone']")).sendKeys("1234567890");

	
	
	
	}

}
