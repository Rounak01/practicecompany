package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popup_Authentication {
		static
		{
		    System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");	
		}
		public static void main(String[] args) throws InterruptedException  {
	     WebDriver driver = new FirefoxDriver();
	    //driver.get("https://the-internet.herokuapp.com/basic_auth");//W/0 input login,pswd.
	   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//With login=pswd=login.
	     Thread.sleep(10000);
	    driver.close();
		}
		
}
