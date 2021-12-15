package screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import pom.PageObjectModel;

public class Screenshot1 {
	
	public static void take_screenshot() {
	
	int i=1;
	File screenshot = ((TakesScreenshot) PageObjectModel.driver).getScreenshotAs(OutputType.FILE);
		
    
    //Copy the file to a location and use try catch block to handle exception
    try {
        FileUtils.copyFile(screenshot, new File("C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\Screenshots\\"+"SS"+i+".jpg"));
        
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
  }
}


