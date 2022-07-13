package qsp;

//wap to fetch data from excel.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ExcelFile {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	    public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileInputStream fis= new FileInputStream("./data/Rk.xlsx");//convert external res file to java readable file
		Workbook wb = WorkbookFactory.create(fis);
		String un = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String pw = wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(un+ " " +pw);
		
		
		int count = wb.getSheet("sheet1").getLastRowNum();
		System.out.println(count);
	    for(int i=1;i<=count;i++) {
			 String un1 = wb.getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
		     String pw1 = wb.getSheet("sheet1").getRow(i).getCell(1).getStringCellValue();
		     System.out.println(un1+ " " +pw1);
		}
		//driver.close();

}
}
