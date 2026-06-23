package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LogoutPage;
import utilities.ExcelUtility;

public class LogoutTest extends Base {

	@Test(description="Verification of Logout Functionality",groups= {"regression"})

	public void verifysuccessfulLogout() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);

		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();

		LogoutPage logoutpage = new LogoutPage(driver);
		logoutpage.clickMenuBar();
		logoutpage.clickLogoutButton();
		boolean signin = logoutpage.isLoginButtonDisplayed();
		Assert.assertTrue(signin);

	}

}

