package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;

public class ManageCategoryPage {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[2]")
	WebElement categorymoreinfo;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newbutton;
	@FindBy(xpath = "//input[@name='category']")
	WebElement entercategory;
	@FindBy(xpath = "(//span[text()='discount'])[1]")
	WebElement selectgroup;
	@FindBy(xpath = "//input[@name='main_img']")
	WebElement fileuploadbutton;
	@FindBy(xpath = "//button[@name='create']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessage;

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickonCategoryMoreInfo() {

		categorymoreinfo.click();
	}

	public void clickonNewButton() {

		newbutton.click();
	}

	public void enterCategory() {

		entercategory.sendKeys("Red Fruits");
	}

	public void chooseCategory() {

		selectgroup.click();
	}

	public void fileUpload() {
		FileUploadUtility fileupload = new FileUploadUtility();
		fileupload.fileUploadingUsingSendKeys(fileuploadbutton, Constant.IMAGEFILE);
	}

	public void clickSaveButton() {

		savebutton.click();

	}

	public boolean isAlertMessageIsDisplayed() {
		return alertmessage.isDisplayed();
	}
}
