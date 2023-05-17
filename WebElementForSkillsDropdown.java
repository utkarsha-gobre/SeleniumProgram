package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementForSkillsDropdown {

	public static void main(String[] args) {
System.setProperty("webdriver,chrome,driver", "C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	WebElement	skillsDropDown = driver.findElement(By.id("Skills"));
	
	Select sel = new Select(skillsDropDown);
	
	//There are three method
	
	//sel.selectByIndex(0);
	//sel.selectByValue(null);
	//sel.selectByVisibleText(null);
	
	sel.selectByIndex(10);
		
		
		
		
		
	}

}
