package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	public WebDriver driver;

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'])[1]")
	WebElement moreinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newelement;
	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	WebElement enternews;
	@FindBy(xpath = "//button[@name='create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessage;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMoreInfo() {
		moreinfo.click();

	}

	public void clickNewButton() {

		newelement.click();

	}

	public void enterNews(String news) {

		enternews.sendKeys(news);

	}

	public void clickSaveButton() {

		savebutton.click();

	}

	public boolean isAlertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}
}
