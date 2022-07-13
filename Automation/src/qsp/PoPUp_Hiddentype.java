package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PoPUp_Hiddentype {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     
	 //driver.get("https://www.careinsurance.com/");
	 //driver.findElement(By.xpath("//div[@class=\"res_btn open_sidenav nav-icon set_div_a\"]")).click();
	 //driver.findElement(By.xpath("//a[text()=\"Renew\"]")).click();//click renew button.
	 
	 driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	 driver.findElement(By.xpath("//input[@id=\"policynumber\"]")).sendKeys("123");
	 driver.findElement(By.id("alternative_number")).sendKeys("9852098520");
	 
	 driver.findElement(By.id("dob")).click();
     WebElement var1 = driver.findElement(By.className("ui-datepicker-month"));
     Select s1= new Select(var1);
     s1.selectByIndex(5);
     
     WebElement var2 = driver.findElement(By.className("ui-datepicker-year"));
     Select s2= new Select(var2);
     s2.selectByValue("1990");
     
     driver.findElement(By.xpath("//a[text()=\"9\"]")).click();
     
	 driver.findElement(By.xpath("//button[text()=\"Lets Renew\"]")).click();
	  String check = driver.findElement(By.id("policynumberError")).getText();
	 if (check =="Please enter valid Policy No.");
	 {
	 System.out.println("pass");
	 }	
	 driver.close();
	}
}
