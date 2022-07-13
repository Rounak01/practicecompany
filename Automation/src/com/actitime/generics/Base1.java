package com.actitime.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	WebDriver driver;
	
	@BeforeClass
	public void openbrowser() {	
    driver=new ChromeDriver();	
	}
	
	@AfterClass
	public void closebrowser() {
	driver.close();
	}
	
	@BeforeMethod
		public void Login() {
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
		}
	
	@AfterMethod
	public void Logout() {
		driver.findElement(By.linkText("Logout")).click();
	}
  }
