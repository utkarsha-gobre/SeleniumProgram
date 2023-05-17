package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPathTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
       String data =  driver.findElement(By.xpath("//label[contains[@id,'u_2_b')")).getText();
		System.out.println(data);	
	}

}
