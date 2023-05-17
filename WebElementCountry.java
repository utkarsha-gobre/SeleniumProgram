package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCountry {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
driver.findElement(By.cssSelector("[role='combobox']")).click();

driver.findElement(By.xpath("//input[@type='search']")).sendKeys("a");

Thread.sleep(5000);
//driver.findElement(By.xpath("//input[@type='search']")).sendKeys("India");

List<WebElement> searchResult = driver.findElements(By.cssSelector("[type='search']"));

int numberofElements = searchResult.size();
{
	System.out.println(numberofElements);


for(WebElement element :searchResult)
{
	String elementTxt = element.getText();
	
	if(elementTxt.contains("India"))
	{
		element.click();
		
		//driver.findElement(By.cssSelector("[value='India']")).click();
	}
}


	}
}
}
	


