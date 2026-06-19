package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(description = "Verification Login Page Functionality with correct Username and Password")

	public void verifyUserLoginWithValidUserNameAndValidPassword() throws IOException {
		// String username="admin";
		// String password="admin";
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		// loginpage.clickRememeberme();
		loginpage.clickSigninButton();
		boolean homepage = loginpage.isDashboardDisplayed();
		Assert.assertTrue(homepage);

	}

	@Test(description = "Verification Login Page Functionality with correct Username and invalid Password")

	public void verifyUserLoginWithValidUserNameAndInvalidPassword() throws IOException {
		// String username1= "admin";
		// String password1="admi";
		String username = ExcelUtility.getStringData(2, 0, "loginpage");
		String password = ExcelUtility.getStringData(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickRememeberme();
		loginpage.clickSigninButton();
		boolean alertmessage = loginpage.isAlertDisplayed();
		Assert.assertTrue(alertmessage);

	}

	@Test(description = "Verification Login Page Functionality with invalid Username and  Valid Password")
	public void verifyUserLoginWithInvalidUserNameAndValidPassword() throws IOException {
		// String username1= "admins";
		// String password1="admin";
		String username = ExcelUtility.getStringData(3, 0, "loginpage");
		String password = ExcelUtility.getStringData(3, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickRememeberme();
		loginpage.clickSigninButton();

	}

	@Test(description = "Verification Login Page Functionality with invalid Username and Password")
	public void verifyUserLoginwithInvalidUsernameandInvalidPassword() throws IOException {
		// String username1= "admind";
		// String password1="adming";
		String username = ExcelUtility.getStringData(4, 0, "loginpage");
		String password = ExcelUtility.getStringData(4, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickRememeberme();
		loginpage.clickSigninButton();
	}

}
