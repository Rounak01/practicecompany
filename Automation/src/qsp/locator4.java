package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator4 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement e = driver.findElement(By.linkText("Create New Account"));
		e.click();
		Thread.sleep(2000);//compulsary
		  int f = driver.findElement(By.xpath("//span[@class=\"_5k_2 _5dba\"]")).getLocation().getX();
		
		Thread.sleep(2000);
		System.out.println(f);
		//System.out.println(f);
		//System.out.println(g);
		driver.close();
	}
	}

		