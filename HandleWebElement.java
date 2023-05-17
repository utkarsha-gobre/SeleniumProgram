package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleWebElement {

	public static void main(String[] args) {
    System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
    ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/Register.html");
	
	//for First Name, Last Name, Address,Email,NO.:
	
	driver.findElement(By.cssSelector("[placeholder='First Name']")).sendKeys("Utkarsha");
	
	driver.findElement(By.cssSelector("[placeholder='Last Name']")).sendKeys("Gobre");

	driver.findElement(By.cssSelector("[ng-model='Adress']")).sendKeys("Amravati");
	
	driver.findElement(By.cssSelector("[ng-model='EmailAdress']")).sendKeys("Utkarsha@gmail.com");
	
	driver.findElement(By.cssSelector("[type='tel']")).sendKeys("1234567890");
	
	// for RadioButton:*
	
	boolean rdoBtnStatus =driver.findElement(By.xpath("//input[@value='Male']")).isSelected();

	//boolean rdoBtnStatus =driver.findElement(By.xpath("//input[@value='feMale']")).isSelected();

	
	if(rdoBtnStatus==false) 
	{
		
	driver.findElement(By.xpath("//input[@value='Male']")).click();

		System.out.println(" FeMale button is not selected");
	}
	//for 3checkbox : Cricket,Movies,Hockey
	
	//driver.findElement(By.id("checkbox1")).click();//Cricket
	
	//driver.findElement(By.id("checkbox2")).click();//Movies

	//driver.findElement(By.id("checkbox3")).click();//Hockey

	List<WebElement> checkbox =   driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(WebElement box : checkbox)
	{
		box.click();
	}
	//for SelectSkill...By Using Static DropDown
	
	WebElement skillsDropDown = driver.findElement(By.id("Skills"));
	
	Select sel = new Select(skillsDropDown);
	
	//sel.selectByIndex(0);
	//sel.selectByValue(null));
	//sel.selectByVisibleText(null);
	
	
	sel.selectByVisibleText("Java");
	
	//sel.selectByIndex(5);
	
	//sel.selectByValue("Python");
	
	// for Date Of Birth Year
	
	WebElement yearskillsDropDown = driver.findElement(By.id("yearbox"));
	
	Select sel1 = new Select(yearskillsDropDown);
	
	sel1.selectByVisibleText("1995");
	
	//for month
	
	WebElement monthskillsDropDown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
	
	Select sel2 = new Select(monthskillsDropDown);

	
	sel2.selectByIndex(1);
	
	//for date
	
	WebElement dateskillsDropDown = driver.findElement(By.cssSelector("[placeholder='Day']"));
	
	Select sel3 = new Select(dateskillsDropDown);
	
	sel3.selectByValue("1");
	
	//for password
	
	driver.findElement(By.id("firstpassword")).sendKeys("Utkarsha");
	
	driver.findElement(By.id("secondpassword")).sendKeys("Utkarsha");
	
	//for submit button
	
	driver.findElement(By.cssSelector("#submitbtn")).click();
	
	//for refresh button
	
	//driver.findElement(By.cssSelector("#Button1")).click();
	
	
	
	
	
	}

}
