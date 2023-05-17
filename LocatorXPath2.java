package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPath2 {

	public static void main(String[] args) {
    System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Utkarsha");
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Gobre");
	    
	    driver.findElement(By.xpath("//input[//input[@ng-model='EmailAdress']")).sendKeys("Demo@123gmail.com");
	
	    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("1234567890");

	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Demo@123");

	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Demo@123");

	}

}
