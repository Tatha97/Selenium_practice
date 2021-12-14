package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import locators.Loc;

public class PageObjectModel {

	public static WebDriver driver;
	
	public static void get_url() {
		
		driver.get(Loc.url);
	}
	public static void implicit_wait() {
		
		
	}
	public static void work_flow() {
		
		Actions a = new Actions(driver);
		try {
			a.moveToElement(driver.findElement(Loc.Sign_in)).build().perform();;
			
		}
		catch(Exception e){
			
			System.out.println("In Catch Block with Exception:- "+e);
		}
		
	}
}
