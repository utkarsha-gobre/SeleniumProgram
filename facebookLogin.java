package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookLogin {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	

	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.name("email")).sendKeys("utkarshagobre3@gmail.com");
    driver.findElement( By.name("pass")).sendKeys("Utkarsha****");
	driver.findElement(By.name("login")).click();
	//String title = driver.getTitle();
	//System.out.println(title);
	
	}
}