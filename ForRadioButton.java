package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForRadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		boolean rdoBtnStatus = driver.findElement(By.xpath("//input[@value='FeMale']")).isSelected();
		
		if(rdoBtnStatus==false) 
		{
			driver.findElement(By.xpath("//input[@value='FeMale']")).click();

		}
	}

}
