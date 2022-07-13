package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demofirefox
{
	static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) 
	{
		
	   WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		driver.navigate().to("https://www.facebook.com/");
		driver.close();

	}
}
