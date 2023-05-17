package Selenium;

import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		   
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		
		
		List<WebElement> searchResult = driver.findElements(By.xpath(""));
		
		int numberOfElements =searchResult.size() ;
		
		System.out.println(numberOfElements);
		
	
	}
}
