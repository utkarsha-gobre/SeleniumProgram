package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassWebElementAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
	    ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.cssSelector("[id='Register']")).click();
		
		Thread.sleep(2000);
	
	//direct handle
	
	  driver.switchTo().alert().accept();
	
	//we can store that object in variable
	   
	// Alert alt   = driver.switchTo().alert();
	 
	// String alertText = alt.getText();
	 
	 //System.out.println(alertText);
	 
	// Alert alt1 = alt1.accept();
	 
	 
	 

	
	}

}
