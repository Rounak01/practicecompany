package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoPUp_Alert_confirmation {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	 public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.get("http://demo.automationtesting.in/Alerts.html");
    
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
     Thread.sleep(5000);
     Alert a= driver.switchTo().alert();//move to alert box
     String text = a.getText();
     System.out.println(text);
     a.accept();//TO click ok
     
     driver.close();
     
	}

}
