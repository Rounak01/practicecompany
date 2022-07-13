package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Childwindow {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		 WebElement tab = driver.findElement(By.xpath("//button[text()=\"New Window\"]"));
		 tab.click();
		 tab.click();
		 String parent = driver.getWindowHandle();//parent
	      Set<String> pop = driver.getWindowHandles();//parent and child.
		int count= pop.size();
		System.out.println(count);
		
		for(String a1:pop)
		{
			Thread.sleep(3000);
			System.out.println(a1);
			driver.switchTo().window(a1);
			//driver.getTitle();
			if(a1.equals(parent))//close only parent window
			{}
			else//close all child window.
			{
			driver.close();
		    }	
		}
	}

}
