package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://mail.google.com/");
		//Thread.sleep(2000);
		//driver.navigate().to("https://accounts.google.com");
		//driver.close();
		
		driver.get("https://www.youtube.com/");
		String html=driver.getPageSource();
		System.out.println(html);
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
