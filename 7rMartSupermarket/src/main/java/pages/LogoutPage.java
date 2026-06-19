package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LogoutPage {

	public WebDriver driver;
	PageUtility page = new PageUtility();

	@FindBy(xpath = "//a[contains(@class,'nav-link') and @data-toggle='dropdown']")
	WebElement menubar;
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/logout'])[1]")
	WebElement logout;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signinbutton;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMenuBar() {
		menubar.click();
	}

	public void clickLogoutButton() {
		page.javaScriptClick(driver, logout);
	}

	public boolean isLoginButtonDisplayed() {
		return signinbutton.isDisplayed();
	}
}
	


