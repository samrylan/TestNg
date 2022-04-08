package org.test;

import java.io.IOException;

import org.pojo.Pojotest;
import org.sample.Baseclass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassB extends Baseclass {
        
        
        
    
	@Test(dataProvider="username",dataProviderClass=ClassA.class)
	private void tc3( String username, String pass) {
		launchbrowser();
		launchurl("http://www.adactin.com/HotelApp/");
		maxwindow();
		Pojotest p = new Pojotest();
		filltextbox(p.getTxtuser(), username);
		filltextbox(p.getPass(), pass);
		clk(p.getLogin());
		quit(); 		
	
        System.out.println("Test3");
	}
	}
	
