package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import locators.Loc;
import screenshot.Screenshot1;

public class PageObjectModel {

	public static WebDriver driver;
	
	public static void get_url() {
		
		driver.get(Loc.url);
	}
	public static void implicit_wait() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	public static void work_flow() {
		
		Actions a = new Actions(driver);
		try {
			a.moveToElement(driver.findElement(Loc.Sign_in)).build().perform();
			driver.findElement(Loc.sign_in_btn).click();
			
			
		}
		catch(Exception e){
			
			System.out.println("In Catch Block with Exception:- "+e);
			Screenshot1.take_screenshot();
		}
		
	}
	
	public static void login_with_credentials() {
		
		try {
			driver.findElement(Loc.email).sendKeys("7278809034");
			driver.findElement(Loc.continue_btn).click();
			driver.findElement(Loc.password).sendKeys("Recovary1@");
			driver.findElement(Loc.sign_in_submit_btn).click();
			
		}
		catch(Exception e) {
			System.out.println("In Catch Block with Exception:- "+e);
			Screenshot1.take_screenshot();
		}
		
	}
	
	public static void verify_successful_login() {
		
		try {
			driver.findElement(Loc.All_btn).click();
			String str=driver.findElement(Loc.Hello_message).getText();
			//System.out.println(str);
			Assert.assertEquals(str, "Hello, Tathagata");
			
		}
		catch(Exception e) {
			System.out.println("In Catch Block with Exception:- "+e);
			Screenshot1.take_screenshot();
		}
		
		
	}
}
