package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorXPathAbsolute {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")).sendKeys("Utkarsha");
	
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")).sendKeys("Gobre");
	
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea")).sendKeys("Amravati");
	
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")).sendKeys("Demo@123");
	
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input")).sendKeys("1234567890");
	
	    driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input")).sendKeys("female");
	
	    driver.findElement(By.xpath("/html/body")).sendKeys("Marathi");
	
	
	}
	
	
	
	

}
