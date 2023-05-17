package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\Software\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=* 	");
		ChromeDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		List<WebElement>googleSearchResult =   (List<WebElement>) driver.findElement(By.className("sbct"));
		
		
		driver.close();
		//for looping statement
		int elsesize = googleSearchResult.size();
		System.out.println(elsesize);
		for(int i = 0;i<elsesize; i++) 
		{
			googleSearchResult.get(i).getText();
		

		}
	}

}
