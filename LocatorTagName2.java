package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class LocatorTagName2 {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//broken links
		
		List<WebElement> links = (List<WebElement>) driver.findElements(By.tagName("a"));
		
		int linkTotal =   driver.findElements(By.tagName("a")).size();
		
		System.out.println(linkTotal);
		
		driver.close();
		
		for(int i = 0; i <linkTotal; i++ )
		{
			String link = links.get(i).getAttribute("href");
			
			System.out.println(link);
	}

}
}
