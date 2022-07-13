package qsp;
//wap to put data back to excel.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ExcelFile2 {
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
 public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
 WebDriver driver= new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	FileInputStream fis= new FileInputStream("./data/Rk.xlsx");
	Workbook fac = WorkbookFactory.create(fis);
    int num = fac.getSheet("sheet1").getLastRowNum();
    for(int i=1;i<=num;i++) {
    	if (i%2==0) {
    	fac.getSheet("sheet1").getRow(i).getCell(2).setCellValue("Passed");
        }
    }
    FileOutputStream fos= new FileOutputStream("./data/Rk.xlsx");//open excel in write mode and convert file
    fac.write(fos);//actual writing , saving the workbook
    driver.close();//mandatory in file data updating
}
}