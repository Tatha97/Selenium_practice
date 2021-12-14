import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;




public class Test1 {

	
	@BeforeClass
	public void before() {
		
	//RestAssured.useRelaxedHTTPSValidation();
		
	}
	@Test
	public static void open_browser() {
		
		/*WebDriver d;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TSANYAL\\eclipse-workspace\\SeleniumMaven1\\driver\\chromedriver.exe");
		
		d= new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();*/ ////
		
		Response resp=when().get("http://thedemosite.co.uk/");
		
		System.out.println(resp.getStatusCode());
		
		//given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
		
		
	}
	
}
