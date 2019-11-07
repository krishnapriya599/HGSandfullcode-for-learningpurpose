package test;

import org.testng.annotations.Test;

import util.Base;
import util.Utility;

public class UploadFileTest extends Base{
	@Test
	public void openBrowser() {
		launchBrowser();
		navigateToURL();
		Utility.loginToBenefitJunctionWithValidCredential();
		Utility.clickOnClientLink();
		Utility.openingESSCompanyDashboard();
		Utility.clickingOnUploadLinkUnderEmployeeSearchAndAddMenu();
		Utility.uploadEmployeeInformationTypeFile();
		Utility.verifyFileUploadedSuccessfullyOrNot();
	}
	
	
}
