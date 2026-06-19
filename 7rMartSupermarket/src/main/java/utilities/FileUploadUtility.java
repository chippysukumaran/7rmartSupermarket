package utilities;
	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.WebElement;

	public class FileUploadUtility {
		
	public void fileUploadingUsingSendKeys(WebElement element,String filepath)
	{
		element.sendKeys(filepath);
	}
	public void fileUploadingUsingRobotClass(WebElement element,String filepath) throws AWTException
	{
		 StringSelection ss=new StringSelection("C:\\Users\\Temp\\Downloads\\2026-05-12_Sukumaran_Chippy_1.pdf");//Store file path using StringSelection class. StringSelection stores the file path as text.
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); //copies file path into System clipboard same as ctrl+c
		   Robot ro=new Robot();//robot class is used to perform keyboard actions.
		   ro.delay(2500);
		   ro.keyPress(KeyEvent.VK_CONTROL);//KeyEvent is a class used to perform keyboard activity
		   ro.keyPress(KeyEvent.VK_V);
		   ro.keyRelease(KeyEvent.VK_CONTROL);
		   ro.keyRelease(KeyEvent.VK_V);
		   ro.keyPress(KeyEvent.VK_ENTER);
		   ro.keyRelease(KeyEvent.VK_ENTER);
	}
	}



