package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test(description = "Verification of Manage News")
	public void verifyManageNewsIsWorkingProperly() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();

		String newsdescription = ExcelUtility.getStringData(1, 0, "managenews");
		ManageNewsPage managenews = new ManageNewsPage(driver);

		managenews.clickMoreInfo();
		managenews.clickNewButton();

		managenews.enterNews(newsdescription);
		managenews.clickSaveButton();
		Assert.assertTrue(managenews.isAlertMessageDisplayed());

	}

}
