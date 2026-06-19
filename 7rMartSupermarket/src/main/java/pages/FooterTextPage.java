package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class FooterTextPage {

	public WebDriver driver;
	PageUtility page = new PageUtility();

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext'])[3]")
	WebElement moreinfo;
	@FindBy(xpath = "(//a[@role='button'])[1]")
	WebElement edit;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")
	WebElement address;
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	@FindBy(xpath = "//button[@name='Update']")
	WebElement update;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessage;

	public FooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMoreInfo() {
		moreinfo.click();
	}

	public void clickeditButton() {
		edit.click();
	}

	public void editAddress(String addressupdate) {
		address.clear();
		address.sendKeys(addressupdate);
	}

	public void editEmail(String emailupdate) {
		email.clear();
		email.sendKeys(emailupdate);
	}

	public void editPhone() {
		phone.clear();
		phone.sendKeys("025478965547");
	}

	public void clickUpdateButton() {

		page.javaScriptClick(driver, update);
	}

	public boolean isAlertMessageIsVisible() {
		return alertmessage.isDisplayed();
	}

}
