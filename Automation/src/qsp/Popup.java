package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	static
	{
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[text()=\"click the button to display a confirm box \"]")).click();
	    Alert pop = driver.switchTo().alert();//control transfer to popup
	    pop.dismiss();
	    WebElement msg = driver.findElement(By.xpath("//p[@id=\"demo\"]"));
	    System.out.println(msg.getText());
	}
	
}
