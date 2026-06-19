package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//label[@for='remember']")
	WebElement rememberme;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;
	@FindBy(xpath = "//p[text()='Dashboard']")
	WebElement dashboard;
	@FindBy(xpath = "//div[contains(@class,'dismissible')]")
	WebElement alert;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String username1) {
		username.sendKeys(username1);
	}

	public void enterPassword(String password1) {
		password.sendKeys(password1);
	}

	public void clickRememeberme() {
		rememberme.click();
	}

	public void clickSigninButton() {
		signin.click();
	}

	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();

	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();

	}
}
