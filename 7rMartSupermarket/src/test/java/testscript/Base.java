package testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constant;
import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {

	public WebDriver driver;
	public Properties properties;
	public FileInputStream fileinput;
@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void browserInitialization(String browser) throws Exception {
	
	if(browser.equalsIgnoreCase("Edge"))
	{
		driver=new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("FireFox"))	
	{
	
	driver=new FirefoxDriver();
	}
	else
	{
		throw new Exception("Invalid");
	}
		try {
			properties = new Properties();
			fileinput = new FileInputStream(Constant.CONFIGFILE);
			properties.load(fileinput);

		} catch (Exception e) {
			System.out.println(e);
		}

		
		// driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICITWAIT));
		driver.manage().window().maximize(); // To maximize the screen
	}

	 @AfterMethod(alwaysRun=true)
	public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility scrShot = new ScreenshotUtility(); // creating obj
			scrShot.getScreenShot(driver, iTestResult.getName());
			
		}
		driver.quit();
	}
}

