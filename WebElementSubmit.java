package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		boolean sbtbtn = driver.findElement(By.id("submitbtn")).isEnabled();
		
		//Thread.sleep(5000);
		
		System.out.println(sbtbtn);
		
		driver.findElement(By.id("submitbtn")).click();
 
		
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("Button1")).click();
		
	}

}
