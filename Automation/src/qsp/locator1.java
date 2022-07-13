package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1
{static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://selfcare.bsnl.co.in/tungsten/UI/facelets/login.xhtml");
		//driver.findElement(By.tagName("div")).click();
		//driver.findElement(By.className("header"));
		driver.navigate().back();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/Dell/Desktop/rk.html");
		  driver.findElement(By.tagName("a")).click();
		  
		  
        
		//driver.findElement(By.linkText("rounak")).click();
		
		//Thread.sleep(2000);
		driver.quit();
		

	}

}
