package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test(description = "Verification of AdminUsersInfo")

	public void verifyAdminUsersMoreInfo() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();

		//String adminusername = ExcelUtility.getStringData(1, 0, "adminlogin");
		String adminpassword = ExcelUtility.getStringData(1, 1, "adminlogin");
		
		FakerUtility fakerutility=new FakerUtility();
		String adminusername=fakerutility.creatARandomFirstName();

		AdminUsersPage adminusers = new AdminUsersPage(driver);

		adminusers.clickMoreInfo();
		adminusers.clickNewButton();
		adminusers.enterUsername(adminusername);
		adminusers.enterPassword(adminpassword);
		adminusers.selectUserType();
		adminusers.clickSaveButton();
		Assert.assertTrue(adminusers.isAlertMessageDisplayed());

	}

}
