package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomationTestingDemo {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	
	driver.navigate().back();
	
	System.out.println("We are on index.html page");
	
	Thread.sleep(5000);
	
	driver.navigate().forward();
	
	System.out.println("we are on register.html page");
	
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	
	Thread.sleep(5000);
	
	driver.close();
	

	}

}
