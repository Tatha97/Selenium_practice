package test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.PageObjectModel;

public class AmazonTest1 {

	
	/*@BeforeClass
	public static void initial_setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\driver\\chromedriver.exe");
		PageObjectModel.driver=new ChromeDriver();
		PageObjectModel.driver.manage().window().maximize();
		PageObjectModel.implicit_wait();
	}*/
	
	@BeforeMethod
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\driver\\chromedriver.exe");
		PageObjectModel.driver=new ChromeDriver();
		PageObjectModel.driver.manage().window().maximize();
		PageObjectModel.implicit_wait();
		PageObjectModel.get_url();
		
	}
	@Test(groups= {"strong_ties"})
	public static void test1() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\driver\\chromedriver.exe");
		PageObjectModel.driver=new ChromeDriver();
		PageObjectModel.driver.manage().window().maximize();
		PageObjectModel.implicit_wait();
		PageObjectModel.get_url();
		
		PageObjectModel.work_flow();
		
	}
	@Test(groups= {"strong_ties"})
	public static void test2() throws IOException {
		

		PageObjectModel.login_with_credentials();

		
	}
	@Test(groups= {"strong_ties"})
	public static void test3() throws IOException {
		

		PageObjectModel.verify_successful_login();
		
	}
	
	
	@AfterMethod
	public static void tear_down() {
		
		PageObjectModel.driver.close();	
	}
}
