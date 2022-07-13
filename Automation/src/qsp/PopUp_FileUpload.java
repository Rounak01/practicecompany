package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_FileUpload {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	 public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
     driver.get("https://www.naukri.com/");
     driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
     driver.findElement(By.xpath("(//input[@type=\"text\"])[5]")).sendKeys("rounak100@gmail.com");
     driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("rounak09");
     driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
     driver.findElement(By.xpath("//div[text()=\"UPDATE PROFILE\"]")).click();
     
     driver.findElement(By.id("attachCV")).sendKeys("E:\\Rounak\\doc\\Rounak CV.docx");//directly using 
                                                                                          //absolute-path.
     //File f= new File("Rounak CV");//using relative path
     //String absolutepath = f.getAbsolutePath();//converting to absolutepath
     //driver.findElement(By.id("attachCV")).sendKeys(absolutepath);
     //System.out.println(absolutepath);
     Thread.sleep(10000);
     driver.close();
    
     
     

}
}