package qsp;
// Automate login 8using data driven testing.
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DataDriven {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	  public static void main(String[] args) throws IOException, InterruptedException {
      WebDriver driver=new ChromeDriver();
		FileInputStream fis= new FileInputStream("./data/rk.property.txt");
		Properties p= new Properties();
		p.load(fis);
		String user = p.getProperty("urname");
		String passwd = p.getProperty("pword");//handling property file
		
		FileInputStream excel= new FileInputStream("./data/Rk.xlsx");//handling Excel file.
		Workbook wb = WorkbookFactory.create(excel);
		String ur = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String pw = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(ur);
		driver.findElement(By.name("pwd")).sendKeys(pw);
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
		
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(passwd);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();	
		driver.close();	
	}
}
