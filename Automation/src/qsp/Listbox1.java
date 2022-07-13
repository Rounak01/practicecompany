package qsp;
// using SingleSelect//Select dob.
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//go to fb ->click create account->select month listbox.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	//setting path
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("Create New Account")).click();//wrong way to select path.
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement listbox1 = driver.findElement(By.id("day"));
		WebElement listbox2 = driver.findElement(By.id("month"));
		WebElement listbox3 = driver.findElement(By.id("year"));
		Select s1= new Select(listbox1);
		Select s2= new Select(listbox2);
		Select s3= new Select(listbox3);
		
		
	    s1.selectByIndex(8);
	    s2.selectByValue("6");
		s3.selectByVisibleText("1992");
		
		//s1.deselectByIndex(8);// we can't use deselect method in singleselect listbox.
		Thread.sleep(2000);
		//s.deselectByIndex(4);
		driver.close();

}
}
