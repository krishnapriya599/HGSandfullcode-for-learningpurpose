package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Base;
import util.Utility;

public class TestAddemployee  extends Base{
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
	public void Clientmenu()
	{
		Utility.clickOnClientLink();
	}
	
	@Test(priority=2)
	public void SearchACompany()
	{
		Utility.openingESSCompanyDashboard();
	}
	
	@Test(priority=3)
	public void ClickonAddemployeesLink()
	{
		Utility.clickingOnAddLinkUnderEmployeeSearchAndAddMenu();
	}
	@Test(priority=4)
	public void Addemployeepage()
	{
		Utility.addNewEmployeeToESS();
	}
}
