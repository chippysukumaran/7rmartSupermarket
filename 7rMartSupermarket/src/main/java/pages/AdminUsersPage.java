package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUsersPage {
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	WebElement moreinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernamefield;
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordfield;
	@FindBy(xpath = "//select[@id='user_type']")
	WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessage;

	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMoreInfo() {
		moreinfo.click();
	}

	public void clickNewButton() {
		newbutton.click();
	}

	public void enterUsername(String username) {
		usernamefield.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordfield.sendKeys(password);
	}

	public void selectUserType() {
		PageUtility page = new PageUtility();
		page.drpDownVisaibleText(usertype, "Staff");

	}

	public void clickSaveButton() {
		savebutton.click();
	}

	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
}
