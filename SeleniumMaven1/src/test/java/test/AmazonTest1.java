package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.PageObjectModel;

public class AmazonTest1 {

	
	@BeforeClass
	public static void initial_setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\driver\\chromedriver.exe");
		PageObjectModel.driver=new ChromeDriver();
		PageObjectModel.driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public static void setup() {
		
		PageObjectModel.get_url();
		
	}
	@Test
	public static void test() {
		
		PageObjectModel.work_flow();
	}
	@AfterMethod
	public static void tear_down() {
		
		PageObjectModel.driver.close();	
	}
}
