package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_handling {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	    public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("C:\\Users\\Dell\\Desktop\\frame.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("apple");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("orange");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys(" banana");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys(" papaya");
		Thread.sleep(3000);
		driver.close();
		
	}

}
