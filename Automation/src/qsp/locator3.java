package qsp;
//check dimension same or not. for username, password textbox.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		     int e1 = driver.findElement(By.id("username")).getSize().getHeight(); 
		     int e2 = driver.findElement(By.xpath("//input[@id='username']")).getSize().getWidth(); 
		    int f1 = driver.findElement(By.xpath("//input[@name='pwd']")).getSize().getHeight();
		    int f2 = driver.findElement(By.xpath("//input[@name='pwd']")).getSize().getWidth();
		//Thread.sleep(2000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(f1);
		System.out.println(f2);
		
		if ( e1==f1&& e2==f2)
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("failed");
		}
		
       driver.close();
	}

}
