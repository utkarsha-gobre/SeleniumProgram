package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatoeClassName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
