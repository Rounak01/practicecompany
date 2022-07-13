package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_childwindow1 {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
		Set<String> tab = driver.getWindowHandles();
		System.out.println(tab.size());
		for(String adres:tab)
		{
			Thread.sleep(3000);
			System.out.println(adres);//address
			driver.switchTo().window(adres);//switch control to window address.
			String title = driver.getTitle();
			System.out.println(title);	
			driver.close();
		}
		//driver.quit();
	}

}
