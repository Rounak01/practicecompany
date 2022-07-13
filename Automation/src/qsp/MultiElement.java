package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiElement {
static
{
    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
}
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.google.com");
		driver.switchTo().activeElement().sendKeys("apple");
		//driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(1000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//span[contains(text(),'apple')]"));
		
		int count= lists.size();
		System.out.println(count);//count no.of suggestion.
		
		for(int i=0;i<count;i++)
		{
			  String e = lists.get(i).getText();
			System.out.println(e);// text of all auto suggestion.

		}
		
		//lists.get(0).click();//select first suggestion.
	    lists.get(count-1).click();//select last suggestion.
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		driver.close();
		
		

	}

}
