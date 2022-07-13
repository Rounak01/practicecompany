package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action1 {
	private static final Object HackerEarth = null;
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		
		WebElement element = driver.findElement(By.partialLinkText("Resources"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(element).perform();
		WebElement a1 = driver.findElement(By.partialLinkText("Customers"));
		ac.doubleClick(a1).perform();
		//Thread.sleep(5000);
		WebElement a2 = driver.findElement(By.linkText("Read Full Story"));
		//Thread.sleep(5000);
		ac.doubleClick(a2).perform();
		
		String title = driver.getTitle();
		System.out.println(title);
//		if (title.equals("case"));
//				{
//			System.out.println("Display correct page");
//				}
				driver.close();
			
		
	}
	
}

