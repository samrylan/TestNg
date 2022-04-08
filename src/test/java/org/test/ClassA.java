package org.test;

import java.io.IOException;
import java.util.Date;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.WebElement;
import org.pojo.Pojotest;
import org.sample.Baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ClassA extends Baseclass {
     
	
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
    
	@Parameters({"username","pass"})
	@Test
	private void tc1hotel( @Optional("samrylan")  String username,@Optional("Z98EIO")   String pass) {

		launchbrowser();
		launchurl("http://www.adactin.com/HotelApp/");
		maxwindow();
		towait();
		Pojotest p = new Pojotest();
		filltextbox(p.getTxtuser(), username);
		filltextbox(p.getPass(), pass);
		clk(p.getLogin());
		quit(); 		
	}
	 @DataProvider(name="username")
	 public static Object[][] dataprovider() {
		 return new Object[][]{
		 {"sam","345678"},
		 {"samrylan","Z98EIO"},
		 {"rylan","Z98EIO"},
	};
}
}
