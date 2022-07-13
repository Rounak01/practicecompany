package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp_Downlod {
	static
	{
	    System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");	
	}
	 public static void main(String[] args) throws InterruptedException, AWTException {
     WebDriver driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     driver.get("https://www.selenium.dev/");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();
     driver.findElement(By.linkText("4.1.2")).click();
     Thread.sleep(5000);
     Robot r1= new Robot();//virtual-key control
     r1.keyPress(KeyEvent.VK_CONTROL);
     r1.keyPress(KeyEvent.VK_LEFT);
     Thread.sleep(1000);
     r1.keyRelease(KeyEvent.VK_CONTROL);
     r1.keyPress(KeyEvent.VK_ENTER);
     driver.close();    
}
}