package org.task1;

import java.util.Date;

import org.sample.Baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 extends Baseclass {

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
	
	@Test
	private void tc4() {
     launchurl("http://www.adactin.com/HotelApp/");
     quit();
     launchurl("https://mvnrepository.com/artifact/com.beust/jcommander/1.27");
     quit();
	}

}
