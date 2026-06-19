package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	

	public void drpDownVisaibleText(WebElement element,String text)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
	}

	public void dropDownValue(WebElement element,String value)
	{
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public void dropDownIndex(WebElement element,int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
		
		
	}
	
	public void dragAndDrop(WebDriver driver,WebElement source,WebElement target)
	
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
	
	public void javaScriptExecuterScrolldown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)","");
	}
	
	public void javaScriptClick(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public void javaScriptExecuterSendKeys(WebDriver driver,WebElement element,String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Selenium';", element);
	}
}
		
	


