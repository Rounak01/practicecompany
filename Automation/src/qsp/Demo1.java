package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	} 
	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		
     driver.navigate().to("https://www.google.co.in/");
     driver.navigate().to("https://www.youtube.com/");
     driver.navigate().back();
     driver.navigate().forward();
     Thread.sleep(1000);// used to slow the process.
     driver.navigate().refresh();
     Thread.sleep(1000);
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.quit();
     

	}

}


