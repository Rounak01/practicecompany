package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.partialLinkText("Resources"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(element).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		ac.contextClick().perform();
		
//		Robot ro= new Robot();
//		ro.keyPress(KeyEvent.VK_CONTROL);
//		ro.keyPress(KeyEvent.VK_END);
//		ro.keyRelease(KeyEvent.VK_CONTROL);
//		ro.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String phone = driver.findElement(By.xpath("//p[contains(text(),\"Bengaluru, India\")]/../p[2]")).getText();
		System.out.println(phone);
		driver.close();
	}}

