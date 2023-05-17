package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(  By.cssSelector("input[placeholder='First Name']")).sendKeys("Utkarsha");
		
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Gobre");
		driver.close();
	}

}
