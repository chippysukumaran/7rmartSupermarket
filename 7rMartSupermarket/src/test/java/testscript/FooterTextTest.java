package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FooterTextPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class FooterTextTest extends Base {

	@Test(description = "Verification of FooterTextInfo")

	public void verifyFooterText() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();

		String addressdetail = ExcelUtility.getStringData(1, 0, "footextupdate");
		String emaildetail = ExcelUtility.getStringData(1, 1, "footextupdate");

		FooterTextPage footertext = new FooterTextPage(driver);

		footertext.clickMoreInfo();
		footertext.clickeditButton();
		footertext.editAddress(addressdetail);
		footertext.editEmail(emaildetail);
		footertext.editPhone();
		footertext.clickUpdateButton();

		Assert.assertTrue(footertext.isAlertMessageIsVisible());

	}

}
