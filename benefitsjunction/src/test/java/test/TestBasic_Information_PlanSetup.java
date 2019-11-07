package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Base;
import util.Utility;

public class TestBasic_Information_PlanSetup extends Base{
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
	
	@Test(priority=0)
	public void EnterBasic_Information_PlanSetup()
	{
		Utility.Basic_Information_PlanSetup();
	}

}



