package qsp;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles_Automate {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		    public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
			driver.findElement(By.xpath("(//div[@class=\"menu_icon\"])[4]")).click();
			driver.findElement(By.linkText("About your actiTIME")).click();
			Thread.sleep(1000);
	        driver.findElement(By.linkText("Read Service Agreement")).click();
	        String parnt = driver.getWindowHandle();
            Set<String> wh = driver.getWindowHandles();
            for(String page : wh)
            { 
            	driver.switchTo().window(page);
            }
          
          List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"header__menu\"]"));
          for( WebElement li:list) {
            	String header = li.getText();
            	System.out.println(header);
            }
          for(String a1:wh)
          {
        	  driver.switchTo().window(a1);
        	  Thread.sleep(1000);
        	  driver.close();
          }
	   
}}
