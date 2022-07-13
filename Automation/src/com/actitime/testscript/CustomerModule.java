package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test(priority=1)
	public void createcustomer() {
		System.out.println("hi1");
		Reporter.log("Hello1")   ;
		Reporter.log("bye1",true);
	}
	@Test(invocationCount=2)
	public void modifycustomer() {
		System.out.println("hi2");
		Reporter.log("Hello2");
		Reporter.log("bye2",true);
	}
	@Test(priority=9)
	public void deletecustomer() 
	{
		System.out.println("hi3");
		Reporter.log("Hello3");
		Reporter.log("bye3",true);
		Assert.fail();
	}
}
