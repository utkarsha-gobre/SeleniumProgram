package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementOrOption {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Cricket or Hockey
		
	List<WebElement>  checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement box : checkbox) 
		{
			
			if(box.getAttribute("value").equals("Cricket")|| box.getAttribute("value").equals("Hockey"))
			{
			
			  box.click();
			}
		}
		
	}

}
