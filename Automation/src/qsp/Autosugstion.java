package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Autosugstion {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();//to remove Login popup
		
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone");
		List<WebElement> autosug = driver.findElements(By.xpath("//div[@class=\"lrtEPN _17d0yO\"]"));
		
		int count= autosug.size();
		
		for(int i=0;i<count;i++) {
		 String text1 = autosug.get(i).getText();
		 System.out.println(text1);
	   }
		System.out.println("total count "+count);
		autosug.get(count-1).click();//click last sugestion.
		Thread.sleep(2000);
		//driver.close();

}
}

