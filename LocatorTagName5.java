package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName5 {

	private static int i;

	public static void main(String[] args) {
 System.setProperty("Webdriver,chrome.driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
 ChromeDriver driver = new ChromeDriver();
 
 driver.get("https://www.amazon.in/");
 
 driver.manage().window().maximize();
 
 List<WebElement> links = (List<WebElement>) driver.findElements(By.tagName("a"));
 
 int linkTotal = driver.findElements(By.tagName("a")).size();
 
 System.out.println(linkTotal);
 
 driver.close();
 
 for(int i = 0; i< linkTotal; i++);
 {
	 String link = links.get(i).getAttribute("href");
	 
	 System.out.println(link);
 }
	
	
	
	
	
	
	}

}
