package qsp;
//dwload file frm naukri.com  
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUP_dnload1 {
	static
	{
	    System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");	
	}
	 public static void main(String[] args) throws InterruptedException, AWTException {
     WebDriver driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
     driver.get("https://www.naukri.com/nlogin/login");
     Thread.sleep(5000);
     driver.findElement(By.id("usernameField")).sendKeys("rounak100@gmail.com");
     driver.findElement(By.id("passwordField")).sendKeys("rounak09");
     driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
     Thread.sleep(15000);
     driver.findElement(By.xpath("//div[text()=\"UPDATE PROFILE\"]")).click();
     driver.findElement(By.xpath("(//i[text()=\"Download\"])[1]")).click();
     
     Robot R= new Robot();
     R.keyPress(KeyEvent.VK_ALT);
     R.keyPress(KeyEvent.VK_S);
     Thread.sleep(5000);
     R.keyRelease(KeyEvent.VK_ALT);
     R.keyPress(KeyEvent.VK_ENTER);
     driver.close();
	 }
}