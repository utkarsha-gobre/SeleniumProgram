package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://demo.automationtesting.in/Register.html");
		 
		 driver.findElement(By.cssSelector("#submitbtn")).click();
	
		 
		 Thread.sleep(5000);
		 
		 
	 driver.findElement(By.cssSelector("#Button1")).click();
	
	}

}
