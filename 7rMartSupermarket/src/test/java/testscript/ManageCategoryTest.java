package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	
	
	@Test(description="Verify ManageCategory functionality")
	
	public void verifyManageCategoryFunctionality() throws IOException
	{
		String username = ExcelUtility.getStringData(1, 0, "login");
		String password = ExcelUtility.getStringData(1, 1, "login");

		LoginPage loginpage = new LoginPage(driver);

		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSigninButton();
		
		
		ManageCategoryPage managecategory=new ManageCategoryPage(driver);
		managecategory.clickonCategoryMoreInfo();
		managecategory.clickonNewButton();
		managecategory.enterCategory();
		managecategory.chooseCategory();
		managecategory.clickSaveButton();
		Assert.assertTrue(managecategory.isAlertMessageIsDisplayed());
		
	}

}
