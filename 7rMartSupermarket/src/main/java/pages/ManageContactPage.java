package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactPage {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact'])[2]")
	WebElement contactmoreinfo;
	@FindBy(xpath = "//a[@role='button']")
	WebElement editbutton;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")
	WebElement address;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessage;

	public ManageContactPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickContactMoreInfo() {
		contactmoreinfo.click();
	}

	public void clickonEditButton() {
		editbutton.click();
	}

	public void editPhone() {
		phone.clear();
		phone.sendKeys("02345878");
	}

	public void editAddress() {
		address.clear();
		address.sendKeys("vollvergerstrasse 456");
	}

	public void clickonUpdateButton() {
		updatebutton.click();
	}
	
	public boolean isAlertMessageIsDisplayed()
	{
		return alertmessage.isDisplayed();
	}
	
	

}
