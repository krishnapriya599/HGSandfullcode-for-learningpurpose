package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Base;
import util.Utility;

public class TestCopy_Plan_Setup extends Base{
	@BeforeTest()
	public void openBrowser()
	{
		launchBrowser();
		navigateToURL();
	}
	@Test(priority=0)
	public void loginDemo()
	{
		Utility.loginToBenefitJunctionWithValidCredential();
	}
	@Test(priority=1)
	public void Clientlink()
	{
		Utility.clickOnClientLink();
	}
	@Test(priority=2)
	public void ESScompany()
	{
		Utility.openingESSCompanyDashboard();
	}
	
	@Test(priority=3)
	public void EligibilityandEnrollment()
	{
		Utility.ClickonEligibilityandEnrollment();
	}
	
	@Test(priority=4)//ClickonEligibilityandEnrollment
	public void CopyPlanSetup()
	{
		Utility.Copy_Plan_Setup();
		
	}
	
}



