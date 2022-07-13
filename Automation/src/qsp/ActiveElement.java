package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	static {
   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

   public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("rounak");//sendkeys used to type the text
	  driver.close();
		

	}

}
