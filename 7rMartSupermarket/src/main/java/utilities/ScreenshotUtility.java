package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility {
	
	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver; // TakesScreenshot capture the current situation of the
															// browser
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//This takes the Screenshot.Store it as temporary file
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//add date and time to screenshot
		File f1 = new File(System.getProperty("user.dir") + "//outputScreenShot");//Folder creation,outputScreenshot is the file name
																					
																					
		if (!f1.exists()) {
			f1.mkdirs(); // create a folder, if it does not exist
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
				+ ".png";//Decide final screenshot path.file name+time and date, image extention
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination); // To move the screenshot from one location to another location
	}

}
