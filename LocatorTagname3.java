package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagname3 {

	public static void main(String[] args) {

System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		int linkTotal = links.size();
		
		for(int i = 0; i<linkTotal; i++) {
			
			String link = links.get(i).getAttribute("href");
			
			System.out.println(link);
		}
		
	}

}
