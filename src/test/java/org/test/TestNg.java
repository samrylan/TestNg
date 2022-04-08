package org.test;

import java.util.Date;

import org.sample.Baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg extends Baseclass {

	@BeforeClass
	private void bcf() {
		System.out.println("Before class started");
	}
	@AfterClass
	private void acf() {
System.out.println("After class end");
	}
	@BeforeMethod
	private void bm() {
          Date d = new Date();
          System.out.println(d);
	}
	@AfterMethod
	private void am() {
  Date d1 = new Date();
  System.out.println(d1);
	}
	 
	@Test(enabled=false)
	private void tc1() {
System.out.println("Test1");
	}
	@Test(priority=-4)
	private void tc2() {
System.out.println("Test2");
	}
	
	@Test(enabled=false)
	private void tc3() {
		launchbrowser();
		launchurl("http://www.adactin.com/HotelApp/");
		maxwindow();
		quit();
        System.out.println("Test3");
	}




}

