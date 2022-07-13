package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonAllingment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
	 int a = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).getLocation().getY();
	 int b = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).getLocation().getY();
	 int c = driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).getLocation().getY();
	 
	 if(a==b&&b==c)
	 {
	 System.out.println("allinged button");
	 }
	 else 
	 {
		 System.out.println("Not allinged");
	 }
	driver.close();
	}
}

		 
		

		
		