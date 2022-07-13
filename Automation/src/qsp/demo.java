  package qsp;


import org.openqa.selenium.chrome.ChromeDriver;
public class demo 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");// setting path of driver,generic path
	}

	public static void main(String[] args) throws InterruptedException
	{
	  //System.setProperty("Webdriver.chrome.driver","E:\\java eclipse\\Automation\\driver" );
	  
		ChromeDriver driver = new ChromeDriver();//open chrome  driver
		driver.get("https://www.facebook.com/");
		String Title= driver.getTitle();
		System.out.println(Title);
		Thread.sleep(3000);//delay process
		driver.close();
		
	}

}
