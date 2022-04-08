package org.task1;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.pojo.Pojotest;
import org.sample.Baseclass;
import org.testng.annotations.Test;

public class Sample2 extends Baseclass {

	  
	
	
	
@Test
	private void tc3() throws IOException {
		launchbrowser();
		launchurl("https://www.facebook.com/");
		maxwindow();
		Pojotest p = new Pojotest();
		
		WebElement qw = p.getUser();
		filltextbox(qw, "samiman");
		
		  
	
		
		
		//quit();
        System.out.println("Test3");
	}
//		@Test(enabled=false)
//	public void tc1() {
//	String title = togettiltle();
//		System.out.println("title:"+ title);
//	}
//	@Test(enabled=false)
//	public void tc2() {
//		togeturl(); 
//	}
//	
	
	
}
