package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllBrowser {
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String browsername) {
		if (browsername.contains("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.contains("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		} 
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get("http://www.adactin.com/HotelApp/");
        

	}   
}
