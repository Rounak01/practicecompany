package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocator 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/demo11.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		
	}

}
