package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {

	@Test (description="Verification of Manage Contactinfo")

	public void verifyManageContactInfo() throws IOException { 
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();

		ManageContactPage managecontact = new ManageContactPage(driver);
		managecontact.clickContactMoreInfo();
		managecontact.clickonEditButton();
		managecontact.editPhone();
		managecontact.editAddress();
		managecontact.clickonUpdateButton();
		Assert.assertTrue(managecontact.isAlertMessageIsDisplayed());

	}

}
