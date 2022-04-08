package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	public static WebDriver d;
	public static Select s;
	public static Select r;
	public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
		public static void launchEdge() {
     WebDriverManager.edgedriver().setup();
      d = new EdgeDriver();
		}

		public static void launchedge(String Url) {
   d.get(Url);
		}
	

	public static void quit() {
		driver.quit();
	}
	// launch url
	public static void launchurl(String url) {
		driver.get(url);
	}

	//to gettitle
	public static String togettiltle() {
		String title = driver.getTitle();
		return title;
	}
	//		togeturl
	public static void togeturl() {
		String curl = driver.getCurrentUrl();
		System.out.println("url:"+curl);
	}

	//to maximize window
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	//to wait
	public static void towait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	//login
	public static void filltextbox(WebElement e, String val) {
		e.sendKeys(val);
	}
	//click
	public static void clk(WebElement e) {
		e.click();
	}
	//select
	public static void Select(WebElement e, String val) {
		s= new Select(e);
		s.selectByValue(val);

	}
	// to read excel
	public static String readexcel(int rowno,int cellno) throws IOException {
		File fil=new File("G:\\eclipse workspace\\Book\\excel\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(fil);
		XSSFWorkbook book = new XSSFWorkbook(fin);
		XSSFSheet sh1 = book.getSheet("Sheet2");
		XSSFRow row = sh1.getRow(rowno);
		XSSFCell cell = row.getCell(cellno);
		//type
		int type = cell.getCellType();
		String name="";

		if (type==1) {
			name = cell.getStringCellValue();
		}
		else {
			double d = cell.getNumericCellValue();
			long l= (long)d;//downcasting
			name = String.valueOf(l);  
		}

		return name;

	}

	public static String gettext(WebElement e) {
		String t = e.getAttribute("value");
		return t;
	} 

	// get screen shot
	public static void Screenshot(WebElement e,String name) throws IOException {
		TakesScreenshot t= (TakesScreenshot)e;//
		File sc = t.getScreenshotAs(OutputType.FILE);
		File dest= new File("G:\\eclipse workspace\\Book\\snap\\"+name+".png");
		FileUtils.copyFile(sc, dest);
	}
	//get name screen shot
//	public static String getname() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("enter the filename");
//		String name = scan.next();
//
//		return name;}

}



