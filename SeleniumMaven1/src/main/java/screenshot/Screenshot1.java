package screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;


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
	
	public static String screenshotpath;

    public static void captureScreenshot(String methodName) throws IOException {

        //Using GregorianCalendar to fetch the time details
        Calendar cal = new GregorianCalendar();
        //Month value is always 1 less than actual. For February, MONTH would return 1 
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int sec = cal.get(Calendar.SECOND);
        int min = cal.get(Calendar.MINUTE);
        int date = cal.get(Calendar.DATE);
        int day = cal.get(Calendar.HOUR_OF_DAY);

        //Take screen shot and store it in volatile memory with reference name scrFile
        File scrFile = ((TakesScreenshot) PageObjectModel.driver).getScreenshotAs(OutputType.FILE);
        try {

            //Create unique file name and store in under screenshot folder of root directory
            screenshotpath = "C:\\Users\\TSANYAL\\git\\repository\\SeleniumMaven1\\Screenshots\\" + methodName + "_" + year + "_" + date+ "_" + (month + 1) + "_" + day + "_" + min + "_" + sec + ".jpeg";
            
            //Copy the file to destination
            FileHandler.copy(scrFile, new File(screenshotpath));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }
}


