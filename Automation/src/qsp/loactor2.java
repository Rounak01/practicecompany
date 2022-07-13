package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loactor2 {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		}

		public static void main(String[] args)
		{
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
		
			boolean e = driver.findElement(By.xpath("//img[contains(@class,'logo')]")).isDisplayed();
			if (e==true)
			{
				System.out.println("passed");
			}
			else {
				System.out.println("failed");
			}
			//Thread.sleep(2000);
			driver.close();
	}
	}
