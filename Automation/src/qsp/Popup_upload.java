package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_upload {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	 public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
     driver.get("file:///C:/Users/Dell/Desktop/upload.html");//static url
     
     //driver.findElement(By.id("cv")).sendKeys("E:\\\\Rounak\\\\doc\\\\rounak aadhar.pdf");//directly
                                                                                            //absolute-path.
      File f = new File("E:\\Rounak\\doc\\rounak resume.docx");//relative path
      String absolutepath = f.getAbsolutePath();
      driver.findElement(By.id("cv")).sendKeys(absolutepath);
      System.out.println(absolutepath);
     
}
}
