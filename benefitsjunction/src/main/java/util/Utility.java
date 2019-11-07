package util;

import static org.testng.Assert.assertTrue;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pageObjectRepository.AddEmployeemodule;
import pageObjectRepository.Basic_Information_PlanSetup;
import pageObjectRepository.ClientSectionPage;
import pageObjectRepository.Copy_Plan_Setup;
import pageObjectRepository.Create_Plan_Setup;
import pageObjectRepository.ESSTestPage_Company;
import pageObjectRepository.ESSTest_EligibilityEnrollment;
import pageObjectRepository.EmployeeUploadPage;
import pageObjectRepository.Employee_PersonalInformation;
import pageObjectRepository.Frames;
import pageObjectRepository.HomePage;
import pageObjectRepository.LoginPage;


public class Utility extends Base {
	static JavascriptExecutor js = (JavascriptExecutor) driver;


	static LoginPage lp = new LoginPage(driver);
	static AddEmployeemodule addEmp = new AddEmployeemodule(driver);
	static Frames frm = new Frames(driver);
	static HomePage home = new HomePage(driver);
	static ClientSectionPage clientSection = new ClientSectionPage(driver);
	static ESSTestPage_Company essPage = new ESSTestPage_Company(driver);
	static Employee_PersonalInformation empPI = new Employee_PersonalInformation(driver);
	static EmployeeUploadPage empUpload = new EmployeeUploadPage(driver);
	static Copy_Plan_Setup copyplans= new Copy_Plan_Setup(driver);
	static ESSTest_EligibilityEnrollment EsstestEE= new ESSTest_EligibilityEnrollment(driver);
	static Create_Plan_Setup cpsus= new Create_Plan_Setup(driver);
	static Basic_Information_PlanSetup bips= new Basic_Information_PlanSetup(driver);

	public static void loginToBenefitJunctionWithValidCredential() {
		// login to Benefit junction
		lp.enterUsername().sendKeys(readPropertiesFile("validUsername"));
		lp.enterPassword().sendKeys(readPropertiesFile("validPassword"));
		lp.clickLoginButton().click();
	}

	public static void addNewEmployeeToESS() {

		/*// click on client menu from welcome page
		addEmp.clickOnclientmodule().click();

		// search company by company name
		addEmp.SearchCompany().sendKeys(readPropertiesFile("companyname"));
		addEmp.ClickonSubmitbutton().click();

		// Click on company name link
		addEmp.ESSTest().click();

		// Click on add employee link
		addEmp.EmployeeSearchAdd().click();
		addEmp.ClickonAdd_link().click();*/

		// Add New Employee details
		// Enter first name
		addEmp.EnterFirstname().sendKeys(readPropertiesFile("Firstname"));
		// Enter middle name
		addEmp.EnterMiddletname().sendKeys(readPropertiesFile("Middletname"));
		// Enter last name
		addEmp.EnterLastname().sendKeys(readPropertiesFile("Lastname"));
		// Enter Date of Birth
		addEmp.SelectDateofBirth().sendKeys(readPropertiesFile("DateofBirth"));
		// Enter SSN Number
		addEmp.EnterSNNnumber().sendKeys(readPropertiesFile("SNNnumber"));
		// Enter hire date
		addEmp.SelectHireDate().sendKeys(readPropertiesFile("HireDate"));
		// Enter emp id
		addEmp.EnterEmployeeId().sendKeys(readPropertiesFile("EmployeeId"));
		// Enter work email
		addEmp.EnterWorkEmail().sendKeys(readPropertiesFile("WorkEmail"));
		// Enter Job title
		addEmp.JobTitle().sendKeys(readPropertiesFile("JobTitle"));
		// Enter employee class
		addEmp.ClassDropDownlist().selectByVisibleText(readPropertiesFile("class"));
		// Select location
		addEmp.LocationDropDownlist().selectByVisibleText(readPropertiesFile("locationlist"));
		// Select division
		addEmp.DivisionDropDownlist().selectByVisibleText(readPropertiesFile("diviiondropdownlist"));
		// Enter division date
		waitFor10Seconds();
		//addEmp.Divisiondate().sendKeys(readPropertiesFile("selectdivisiondate"));
		// Select department
		addEmp.DepartmentDropDownlist().selectByVisibleText(readPropertiesFile("departdropdownlist"));
		//Select Country
		addEmp.CountrytDropDownlist().selectByVisibleText(readPropertiesFile("countrydropdownlist"));
		//Select status
		addEmp.StatusDropDownlist().selectByVisibleText(readPropertiesFile("statusdropdownlllist"));
		//Select employee type
		addEmp.EmployeeTypeDropDownlist().selectByVisibleText(readPropertiesFile("employeedropdownlist"));
		//Select Pay Cycle
		addEmp.PayCycleDropDownlist().selectByVisibleText(readPropertiesFile("paycycledropdownlist"));
		//Enter Salary	
		addEmp.EnterSalary().sendKeys(readPropertiesFile("salaryvalue"));
		//Enter Salary Period
		addEmp.SalaryPerioddropdownlist().selectByVisibleText(readPropertiesFile("perioddropdownlist"));
		//Enter UserName
		addEmp.EnterUserName().sendKeys(readPropertiesFile("usernamedisplay"));
		//Click on Add employee button
		addEmp.clickonAddemployeebutton().click();
		//Verify employee added sucessfully or not
		verifyNewEmployeeDetailsAddedSuccessfully();
		
		

	}
	// Method for add employee details on ESS Test Company
		public static void addingNewEmployeeDeatailsToESSAndLoginAsEmployee() {
			// switch back to default frame
			frm.switchToDefaultWindowOrFrame();
			// switch to client info middle frame
			frm.switchToClientInfoSectionFrame();
			// Enter first name
			essPage.EnterFirstname().sendKeys(readPropertiesFile("EnterFirstname"));
			// Enter middle name
			essPage.EnterMiddletname().sendKeys(readPropertiesFile("EnterMiddletname"));
			// Enter last name
			essPage.EnterLastname().sendKeys(readPropertiesFile("EnterLastname"));
			// Enter Date of Birth
			essPage.SelectDateofBirth().sendKeys(readPropertiesFile("SelectDateofBirth"));
			// Enter SSN Number
			essPage.EnterSNNnumber().sendKeys(readPropertiesFile("EnterSNNnumber"));
			// Enter hire date
			essPage.SelectHireDate().sendKeys(readPropertiesFile("SelectHireDate"));
			// Enter emp id
			essPage.EnterEmployeeId().sendKeys(readPropertiesFile("EnterEmployeeId"));
			// Enter work email
			essPage.EnterWorkEmail().sendKeys(readPropertiesFile("EnterWorkEmail"));
			// Enter Job title
			essPage.JobTitle().sendKeys(readPropertiesFile("JobTitle"));
			// Enter employee class
			essPage.ClassDropDownlist().selectByVisibleText(readPropertiesFile("selectclass"));
			// Select location
			essPage.LocationDropDownlist().selectByVisibleText(readPropertiesFile("selectlocationlist"));
			// Select division
			essPage.DivisionDropDownlist().selectByVisibleText(readPropertiesFile("selectdiviiondropdownlist"));
			// Select department
			essPage.DepartmentDropDownlist().selectByVisibleText(readPropertiesFile("selectdepartdropdownlist"));
			// Select Country
			essPage.CountrytDropDownlist().selectByVisibleText(readPropertiesFile("selectcountrydropdownlist"));
			// Select status
			essPage.StatusDropDownlist().selectByVisibleText(readPropertiesFile("selectstatusdropdownlllist"));
			// Select employee type
			essPage.EmployeeTypeDropDownlist().selectByVisibleText(readPropertiesFile("selectemployeedropdownlist"));
			// Select Pay Cycle
			essPage.PayCycleDropDownlist().selectByVisibleText(readPropertiesFile("selectpaycycledropdownlist"));
			// Enter Salary
			essPage.EnterSalary().sendKeys(readPropertiesFile("salaryvalue"));
			// Enter Salary Period
			essPage.SalaryPerioddropdownlist().selectByVisibleText(readPropertiesFile("selectperioddropdownlist"));
			// Enter UserName
			essPage.EnterUserName().sendKeys(readPropertiesFile("enterusernamedisplay"));
			// Clicking on addEmployee and login as employee
			essPage.loginAsEmployee().click();
		}
		// Method for click on client link on tab navigation menu
		public static void clickOnClientLink() {
			driver.switchTo().frame(frm.topTabFrame());
			home.clientTabLink().click();
		}

		// Method for opening ESS Test Company Dashboard or Home
		public static void openingESSCompanyDashboard() {
			frm.switchToDefaultWindowOrFrame();
			frm.switchToClientInfoSectionFrame();
			clientSection.enterSearchCompanyName().sendKeys(readPropertiesFile("companyname"));
			clientSection.submitForSearchCompany().click();
			clientSection.essCompanyNameLink().click();
		}

		// Method for clicking add/search employee left navigation link
		public static void clcikingOnEmployeeSearchAndAddLink() {
			frm.switchToDefaultWindowOrFrame();
			frm.switchToLeftMenuFrame();
			essPage.employeeAdd_SearchLink().click();
		}

		// Method opening add employee page
		public static void clickingOnAddLinkUnderEmployeeSearchAndAddMenu() {
			clcikingOnEmployeeSearchAndAddLink();
			essPage.addLinkUnderEmployeeAddSection().click();
		}

		// Method for verify new employee added or not
		public static void verifyNewEmployeeDetailsAddedSuccessfully() {
			Boolean alertP = driver.findElements(By.xpath("//*[@id='popup_container']")).size() != 0;
			assertTrue(alertP, "Add new employee details successfully");
			if (alertP)
				essPage.oklinkOnAddEmployeeConfirmationPopUp().click();
			System.out.println("System added employee details successfully");
		}

		// Method for add employee personal details
		public static void addEmployeePersonalDetails() {
			// select country from dropDown
			Select country = new Select(empPI.countryDropDownOption());
			country.selectByVisibleText(readPropertiesFile("employerPI_country"));

			// select gender
			if (readPropertiesFile("employerPI_gender").equalsIgnoreCase("Male"))
				empPI.maleRadioLink().click();
			else
				empPI.femaleRadioLink().click();

			// Enter Address Line 1 field
			empPI.addressLine1TextField().sendKeys(readPropertiesFile("employerPI_AddressLine1"));

			// Enter Zip Code
			empPI.zipCodeField().sendKeys(readPropertiesFile("employerPI_zipcode"));

			// Select martial status from drop down
			Select martialStatus = new Select(empPI.maritalStatusDropDownOption());
			martialStatus.selectByVisibleText(readPropertiesFile("employerPI_maritalstatus"));

			// Tobacoo user
			if (readPropertiesFile("employerPI_tobaccouser").equalsIgnoreCase("yes"))
				empPI.yesRadioLinkForTobaccoUser().click();
			else
				empPI.noRadioLinkForTobaccoUser().click();

			// click on submit button
			empPI.submitButton().click();

		}
		
		// Method opening upload page
		public static void clickingOnUploadLinkUnderEmployeeSearchAndAddMenu() {
			clcikingOnEmployeeSearchAndAddLink();
			essPage.uploadLinkUnderEmployeeAddSection().click();
		}
		
		//Method for upload employee information type file
		public static void uploadEmployeeInformationTypeFile() {
			frm.switchToDefaultWindowOrFrame();
			frm.switchToClientInfoSectionFrame();
			//Select file type from drop down
			Select fileDropDown = new Select(empUpload.fileTypeDropDown());
			fileDropDown.selectByVisibleText("Employee Information");
			//Select transaction type from drop down
			Select transactionDropDown = new Select(empUpload.transactionTypeDropDown());
			transactionDropDown.selectByVisibleText("All");
			//Upload File
			empUpload.upload_ChooseFileLink().sendKeys("E:\\AAKASH\\1.Projects\\HGS\\EmpData\\Employeeinfo_TestAbc.xls");
			//click on upload file button
			empUpload.uploadButton().click();
			//click on check box of Use Email Delivery Date
			empUpload.useEmailDeliveryDateCheckBox().click();
			//click on Now radio link
			empUpload.nowRadioButton().click();
			//Checked yes radio button on 
			empUpload.processChangesResultTermination_YES().click();
			empUpload.checkBenefitTerminalEmailBox().click();
			empUpload.checkOffActivationEmailBox().click();
			empUpload.finishButton().click();
			driver.switchTo().alert().accept();
		}
		
		//Method to verify file uploaded successfully or not
		public static void verifyFileUploadedSuccessfullyOrNot() {
			//Click on previous upload radio link
			empUpload.previousUploadRadioLink().click();
			String fileUploadStatus = empUpload.fileUploadStatus().getText();
			assertTrue(fileUploadStatus.equalsIgnoreCase("Running"), "file is not uploaded");
		}
		
		//Method for Click on EligibilityandEnrollment module on top menu
		public static void ClickonEligibilityandEnrollment()
		{
			frm.switchToSecondTopFrame();//ClickonEligibilityandEnrollment
			EsstestEE.ClickonEligibilityandEnrollment().click();
		}
		//Copy_Plan_Setup
		public static void Copy_Plan_Setup()
		{
		frm.switchToDefaultWindowOrFrame();
		frm.switchToLeftMenuFrame();
		EsstestEE.ClickonPlansetup().click();
		EsstestEE.Clickoncopyplanset().click();
		frm.switchToDefaultWindowOrFrame();
		frm.switchToClientInfoSectionFrame();
		copyplans.ClientDropDownlist().selectByVisibleText(readPropertiesFile("selectclientname"));
		copyplans.ClickPlantypedropdown().selectByVisibleText(readPropertiesFile("selectplantype"));
		copyplans.ClickPlantdropdown().selectByVisibleText(readPropertiesFile("selectplan"));
		copyplans.ClickCopytoPlan().selectByVisibleText(readPropertiesFile("selectcopytoplan"));
		copyplans.Clickonsavebutton().click();
		copyplans.clickonconfirmbutton().click();
		}
		
		//Create plan setup
		public static void Create_Plan_Setup()
		{
			frm.switchToDefaultWindowOrFrame();
			frm.switchToClientInfoSectionFrame();
			//Select PlanType
			cpsus.SelectPlantype().selectByVisibleText(readPropertiesFile("Plantypename"));
			//Click on Add New button
			cpsus.ClickonAddNew().click();
			//Select PlanType from dropdown
			cpsus.SelectPlantypevalues().selectByVisibleText(readPropertiesFile("Plantypevalues"));
			//Enter Plan Name in Field
			cpsus.EnterPlanname().sendKeys(readPropertiesFile("Planname"));
			//Select Effective Date
			cpsus.Clickondatepicker().sendKeys(readPropertiesFile("datepicker"));
			/*cpsus.SelectYear().sendKeys((readPropertiesFile("month")));
			cpsus.SelectMonth().sendKeys(readPropertiesFile("month"));
			cpsus.SelectDate().sendKeys(readPropertiesFile("date"));*/
			//Select Carrier from dropdown
			cpsus.SelectCarrier().selectByVisibleText(readPropertiesFile("Carrier"));
			cpsus.ClickonSavebutton().click();
		}
		
		//Method for Basic Information --> PlanSetup
		public static void Basic_Information_PlanSetup()
		{
			//frm.switchToDefaultWindowOrFrame();
			//frm.switchToClientInfoSectionFrame();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("FrmClientAdminMiddle");
			cpsus.SelectPlantype().selectByVisibleText(readPropertiesFile("Plantypename"));
			bips.ClickonPlanname().click();
			bips.selectplansubtype().selectByVisibleText(readPropertiesFile("plansubtype"));
			bips.EnterBrokername().sendKeys(readPropertiesFile("Brokername"));
			bips.EnterPolicy().sendKeys(readPropertiesFile("policy"));
			bips.selectplanexpirydate().sendKeys(readPropertiesFile("planexpirydate"));
			bips.EnterPlanAnniversary().sendKeys(readPropertiesFile("plananniversary"));
			bips.EnterCustommessage().sendKeys(readPropertiesFile("custommessage"));
			bips.Selectdocumentradiobutton().click();
			bips.uploaddocument().sendKeys("D:\\images.jpg");
			bips.ClickonUploadbutton().click();
			bips.SelectTwotier_Radiobutton().click();
			bips.SelectUpload_required_document().click();
			bips.SelectisMandatory().click();
			bips.ClickonIsMandatorychoosefilebutton().sendKeys("C:\\Users\\krishnapriya.y\\Desktop\\Sample files\\sample.doc");
			bips.ClickonUploadbutton1().click();
			bips.SelectReason_Required().click();
			bips.SelectPCP_Requried().click();
			bips.SelectPCP_Name_Enable().click();
			bips.SelectPCP_Name_required().click();
			bips.SelectPCP_Code_Enable().click();
			bips.SelectPCP_Code_required().click();
			bips.EnterPCP_Code_Character_Limit().sendKeys(readPropertiesFile("pcpcodecharacterlimit"));
			bips.SelectIs_plan_COBRA_eligible().click();
			bips.SelectAllow_Domestic_Partner_Coverage().click();
			bips.SelectAllow_opposite_sex_DP_Coverage().click();
			bips.SelectSupporting_Document_Required_for_Domestic_Partner_Enrollment().click();
			bips.SelectAllow_Temporary_SSN().click();
			bips.SelectNon_Contributory().click();
			bips.SelectInvoice_setup_is_required().click();
			bips.SelectDeduction_setup_is_required().click();
			bips.SelectEDI_Required().click();
			//Click on Save button In Basic Information page
			bips.ClickonsavebuttonInBI().click();
			//Click on OK button or Accept alert message
			Alert alertOK = driver.switchTo().alert();
			alertOK.accept();
			//Click on Next button
			bips.ClickonNextbutton().click();
			//In Eligibility Period Details page
			//Click on Add New button
			bips.ClickonAddNewbutton().click();
			//Click on Ok button in Alert
			Alert alertOK1 = driver.switchTo().alert();
			alertOK1.accept();
			//Enter Name
			bips.EnterName().sendKeys(readPropertiesFile("name"));
			//Select From date
			bips.SelectFrom_date().sendKeys(readPropertiesFile("fromdate"));
			//Select To date
			bips.SelectTo_date().sendKeys(readPropertiesFile("todate"));
			//Click on Save button
			bips.ClickonSavebutton().click();
			//Eligibility based on – Class
			bips.SelectMultiplevaluesEligibility_based_on_Class().selectByVisibleText(readPropertiesFile(("Multiplevalues1")));
			bips.SelectMultiplevaluesEligibility_based_on_Class().selectByVisibleText(readPropertiesFile(("Multiplevalues2")));
			bips.SelectMultiplevaluesEligibility_based_on_Class().selectByVisibleText(readPropertiesFile(("Multiplevalues3")));
			//Click on Add button
			bips.ClickonClassAddbutton().click();
			//Eligibility based on – Location
			bips.SelectMultiplevaluesEligibility_based_on_Location().selectByVisibleText(readPropertiesFile("Location1"));
			bips.SelectMultiplevaluesEligibility_based_on_Location().selectByVisibleText(readPropertiesFile("Location2"));
			bips.SelectMultiplevaluesEligibility_based_on_Location().selectByVisibleText(readPropertiesFile("Location3"));
			//Click on Add button
			bips.ClickonLocationAddbutton().click();
			//Eligibility based on – Division
			bips.SelectMultiplevaluesEligibility_based_on_Division().selectByVisibleText(readPropertiesFile("Division1"));
			bips.SelectMultiplevaluesEligibility_based_on_Division().selectByVisibleText(readPropertiesFile("Division2"));
			bips.SelectMultiplevaluesEligibility_based_on_Division().selectByVisibleText(readPropertiesFile("Division3"));
			//Click on Add button
			bips.ClickonDivisionAddbutton().click();
			//Eligibility based on – Department
			bips.SelectMultiplevaluesEligibility_based_on_Department().selectByVisibleText(readPropertiesFile("Department1"));
			bips.SelectMultiplevaluesEligibility_based_on_Department().selectByVisibleText(readPropertiesFile("Department2"));
			bips.SelectMultiplevaluesEligibility_based_on_Department().selectByVisibleText(readPropertiesFile("Department3"));
			//Click Addbutton
			bips.ClickonDepartmentAddbutton().click();
			//Eligibility based on – Country
			bips.SelectMultiplevaluesEligibility_based_on_Country().selectByVisibleText(readPropertiesFile("Country1"));
			bips.SelectMultiplevaluesEligibility_based_on_Country().selectByVisibleText(readPropertiesFile("Country2"));
			//Click on Add button
			bips.ClickonCountryAddbutton().click();
			//Eligibility based on – Zip code
			//bips.EnterZip_code().sendKeys(readPropertiesFile("zipcode"));
			//Select Exclude Zip Codes from Eligibility check box
			bips.SelectExclude_Zip_Codes_from_Eligibility().click();
			//Click on Add New button in Eligibility based on – Salary Section
			bips.ClickonEligibility_based_on_Salary().click();
			//Salary From
			bips.EnterSalary_From().sendKeys(readPropertiesFile("salaryfrom"));
			bips.EnterSalary_To().sendKeys(readPropertiesFile("salaryto"));
			//Click on Save buttonin Eligibility based on – Salary section
			bips.ClickonSalary_Savebutton().click();
			//Click on Save button in Eligibility Period Details
			bips.ClickonSavebutton_EligibilityPeriod().click();
			//Click on Ok button in Alert
			Alert alertOK2 = driver.switchTo().alert();
			alertOK2.accept();
			//Click on Next button in Eligibility Period Details page
			bips.ClickonNextbutton1().click();
			//Clcik on New Hires Type Edit Link
			bips.ClickonNew_Hires_EditLink().click();
			//Clickon select dropdown
			bips.ClickonDorpdown().click();
			//Select Date of Hire
			bips.SelectDateofHire().click();
			//Click on save button
			bips.ClickonSavebutton_NewHire().click();
			//Clickon Rehire edit link
			bips.ClickonRehire_Editlink().click();
			//Enter values in Within Field
			{
			      WebElement element = driver.findElement(By.id("txtRehireInput"));
			      Actions builder = new Actions(driver);
			      builder.doubleClick(element).perform();
			 }
			 driver.findElement(By.id("txtRehireInput")).sendKeys("2");
			 //Select Month in within drop down option
			 {
			        WebElement dropdown = driver.findElement(By.id("DDLRehireInput"));
			        dropdown.findElement(By.xpath("//option[. = 'Months']")).click();
			 }
			 driver.findElement(By.cssSelector("#DDLRehireInput > option:nth-child(2)")).click();
			    driver.findElement(By.cssSelector("#ERReHireWithInDays_divRule > div:nth-child(1)")).click();
			    driver.findElement(By.id("ERReHireWithInDays_RblElig2001")).click();
			    driver.findElement(By.cssSelector("#pnlEligibiltyRule tr:nth-child(7) > td")).click();
			    driver.findElement(By.cssSelector("#ERReHire_divRule > div:nth-child(1)")).click();
			    driver.findElement(By.id("ERReHire_RblElig2001")).click();
			    driver.findElement(By.id("btnsave")).click();
			//Click on Class edit link
			bips.ClickonClass_Editlink().click();
			//Click on Select a rules dropdown option
			bips.ClickonSelectarule_Class().click();
			//Select First radio button
			bips.ClickonFirst_radiobutton().click();
			//Click on Save button in class
			bips.Clickonsavebutton_inClass().click();
			//Click on Location edit link
			bips.ClickonLocation_Editlink().click();
			//Click on Select a rule in location
			bips.ClickonSelectarule_InLocation().click();
			//Click on Date of Location radio button
			bips.SelectDate_of_Locationradiobutton().click();
			//Click on Save button in Location
			bips.ClickonSavebutton_InLocation().click();
			//Click on Divison Edit link
			bips.ClickonDivision_Editlink().click();
			//Click on Select a rule dropdown option in Division
			bips.ClickonSelectarule_InDivision().click();
			//Select Date of Divison radio button
			bips.SelectDate_of_Divisonradiobutton().click();
			//Click on Save button in Divison
			bips.ClickonSavebutton_InDivison().click();
			//Click on Department Edit link
			bips.ClickonDepartment_Editlink().click();
			//Click on Select a rule dropdown department
			bips.ClickonSelectarule_InDepartment().click();
			//Click on Date of Department
			bips.SelectDate_of_Departmentadiobutton().click();
			//Click on Save button in Department
			bips.ClickonSavebutton_InDepartment().click();
			//Click on Status Termination edit link
			bips.StatusTermination_Editlink().click();
			//Click on Date of termination radio button
			bips.ClickonDate_of_terminationradiobutton().click();
			//Click on Save button
			bips.ClickonSavebutton_InStatus_Termination().click();
			//Click on Class edit link
			bips.ClickClassTermination_Editlink().click();
			//Click on Last day of month following date of termination
			bips.ClickonLast_day_of_month_following_date_of_termination().click();
			//Click on save button
			bips.ClickonSavebutton_InClass().click();
			//Location edit link
			bips.ClickonLocationTermination_Editlink().click();
			//Click on End of the pay cycle radio button
			bips.ClickonEnd_of_the_pay_cycle().click();
			//Click on Save button in Termination Rule For Location
			bips.ClickonSavebutton_InTerminationLocation().click();
			//Click on Division edit link
			bips.ClickonDivisionTermination_Editlink().click();
			//click on Date of termination radio button
			bips.ClickonDate_of_termination_radiobutton().click();
			//Save button in Termination Rule For Division
			bips.ClickonSavebutton_InDivison().click();
			//Click on Department edit link
			bips.ClickonDepartmentTermination_Editlink().click();
			//Click on Last day of month following date of termination
			bips.ClickonLast_day_of_month_following_date_of_termination_Department().click();
			//Click on Save button
			bips.ClickonSavebutton_InTerminationDepartment().click();
			//Click Work country edit link
			bips.ClickonWorkCountryTermination_Editlink().click();
			//Click on End of the pay cycle radio button
			bips.ClickonEnd_of_the_pay_cycle_InWorkCountry().click();
			//Click on save button
			bips.ClickonSavebutton_InTerminationWorkCountry().click();
			//Click on Save button in Waiting Period/Termination Rules page
			bips.ClickonSavebutton_inWaiting_Period_Termination().click();
			//Click on OK button or Accept alert message
			Alert alertOK3 = driver.switchTo().alert();
			alertOK3.accept();
			//Click on Next button in Waiting Period/Termination Rules page
			bips.ClickonNextbutton_inWaiting_Period_Termination().click();
			//Invoice Setup -- Carrier: Provider
			//Click on AddNewbutton in Invoice Setup page
			bips.ClickonAddNewbutton_inInvoiceSetup().click();
			//Click on OK button or Accept alert message
			Alert alertOK4 = driver.switchTo().alert();
			alertOK4.accept();
			//Enter Name
			bips.EnterName_RatePeriod().sendKeys(readPropertiesFile("Entername"));
			//Select From date
			bips.SelectFrom_date_RatePeriod().sendKeys(readPropertiesFile("SelectFromdate"));
			//Select To date
			bips.SelectTo_date_RatePeriod().sendKeys(readPropertiesFile("SelectTodate"));
			//Click on Save button
			bips.ClickonSavebutton_RatePeriod().click();
			//Select Full month premium radio button in Invoice Addition Retro Rules
			bips.ClickonFullmonthpremiumradiobutton().click();
			//Select Full month premium radio button in Invoice Termination Retro Rules
			bips.ClickonFullmonthpremium_Invoice_Termination().click();
			//Enter values in Addition Retro Cap
			bips.Entervalues_inAdditionRetroCap().sendKeys("9");
			//Select Fully Insured radio button in Funding Rules
			bips.ClickonFully_Insured_radio_button().click();
			//Enter values in Termination Retro Cap
			bips.Entervalues_inTerminationRetroCap().sendKeys("9");
			//Click on Save button
			bips.ClickonSavebutton_inInvoiceSetup().click();
			//Click on OK button or Accept alert message
			Alert alertOK5 = driver.switchTo().alert();
			alertOK5.accept();
			//Click on Next button
			bips.ClickonNextbutton_inInvoiceSetup().click();
			//Select PEPM - Flat rate radio button in Choose one of the following options
			bips.ClickonPEPM_Flatrate().click();
			//Click on Save button in Slab Rates Setup
			bips.ClickonSavebutton_inSlab_Rates_Setup().click();
			//Click on OK button or Accept alert message
			Alert alertOK6 = driver.switchTo().alert();
			alertOK6.accept();
			//Click on Next button
			bips.ClickonNextbutton_inSlab_Rates_Setup().click();
			//Click on AddNew button in Invoice Rates Setup
			bips.ClickonAddNewbutton_inInvoice_Rates_Setup().click();
			//Select Employee + Family option from Coverage drop down
			bips.SelectEmployeeFamily().selectByVisibleText(readPropertiesFile("EmployeeFamily"));
			//Enter Rating in EE Rate
			bips.Entervalues_EE_Rate_Field().sendKeys("9");
			//Enter Rating in Dep Rate
			bips.Entervalues_Dep_Rate_Field().sendKeys("9");
			//Enter Rating in Spouse Rate
			bips.Entervalues_Spouse_Rate_Field().sendKeys("9");
			//Enter Rating in Child Rate
			bips.Entervalues_Child_Rate_Field().sendKeys("9");
			//Enter Rating in Family Rate
			bips.Entervalues_Family_Rate_Field().sendKeys("9");
			//Enter values in Stop Loss
			bips.Entervalues_StopLoss_Field().sendKeys("9");
			//Benefit Admin Charges
			bips.Entervalues_Benefit_Admin_Chargess_Field().sendKeys("9");
			//Select ESS&Test&Sub1 option from Location dropdown
			bips.SelectLocation().selectByVisibleText("Test1");
			//Click on Save button in Coverage section
			bips.ClickonSavebutton_Coverage().click();
			//Click on Save button in Invoice Rates Setup page
			bips.ClickonSavebutton_InInvoice_Rates_Setup().click();
			//Click on OK button or Accept alert message
			Alert alertOK7 = driver.switchTo().alert();
			alertOK7.accept();
			//Click on Next button in Invoice Rates Setup page
			bips.ClickonNextbutton_InInvoice_Rates_Setup().click();
			//Click on AddNew button in Deduction Setup
			bips.ClickonAddNewbutton_Deducation().click();
			//Click on OK button or Accept alert message
			Alert alertOK8 = driver.switchTo().alert();
			alertOK8.accept();
			//Enter Name
			bips.EnterName_RatePeriod_Deducation().sendKeys(readPropertiesFile("NameRatePeriod"));
			//Select Fromdate
			bips.SelectFrom_date_RatePeriod_Deducation().sendKeys(readPropertiesFile("Fromdate"));
			//Select Todate
			bips.SelectTo_date_RatePeriod_Deducation().sendKeys(readPropertiesFile("Todate"));
			//Enter Payroll code
			bips.EnterPayrollCodes().sendKeys("99");
			//Click on Save button
			bips.ClickonSavebuttonRate_Period().click();
			//Select Full cycle deduction radio button in Addition Rules
			bips.ClickonAdditionRulesradiobutton().click();
			//Select Full cycle deduction radio button in Termination Rules
			bips.ClickonAdditionRulesradiobutton1().click();
			//Click on AddNew button in Deduction Rate Structure Setup
			bips.ClickonAddNewbuttonDeduction_Rate_Structure_Setup().click();
			//Click on Enrollment Coverage checkbox
			bips.ClickonEnrollment_Coverage_checkbox().click();
			//Click on Department check box
			bips.ClickonDepartment_checkbox().click();
			//Click on Class check box
			bips.ClickonClass_checkbox().click();
			//Click on Location Check box
			bips.ClickonLocation_checkbox().click();
			//Click on JobTitle Checkbos
			bips.ClickonJobTitle_checkbox().click();
			//Click on Salary Check box
			bips.ClickonSalary_checkbox().click();
			//Click on Save button in Deduction Rate Structure Setup section
			bips.ClickonSavebutton_Deduction_Rate_Structure_Setup().click();
			//Click on save button in Deduction Setup
			bips.ClickonSavebutton_Deduction_Setup().click();
			//Click on OK button or Accept alert message
			Alert alertOK9 = driver.switchTo().alert();
			alertOK9.accept();
			//Click on Next button in Deduction Setup page
			bips.ClickonNextbutton_Deduction_Setup().click();
			//Click on Add New button
			bips.ClickonAddNewbutton_Deducation().click();
			//Select Coverage from dropdown
			bips.SelectCoveragedropdown().selectByVisibleText("Employee + Family");
			//Select Department
			bips.SelectDepartmentdropdown().selectByVisibleText("Dep-15090");
			//Select Class drop down
			bips.SelectClassdropdown().selectByVisibleText("Custom Mail test");
			//Select Location fron dropdown
			bips.SelectLocationdropdown().selectByVisibleText("ESS&Test&Sub1");
			//Enter JobTitle in field
			bips.EnterValuesin_JobTilteField().sendKeys("QA");
			//Enter values in Salary field
			bips.EnterValuesin_SalaryField().sendKeys("9000000000");
			//Enter values in EEshare field
			bips.EnterValuesin_EEshareField().sendKeys("50");
			//Enter values in ERshare field
			bips.EnterValuesin_ERShareField().sendKeys("50");
			//Select ShareType from dropdown field
			bips.SelectShareTypedropdown().selectByVisibleText("$");
			//Etner Values in FI Equivalence field
			bips.Entervaluein_FIEquivalenceField().sendKeys("10");
			//Click on Save button
			bips.ClickonSavebuttonRate().click();
			//Click on save button in Deduction and Premium Setup page
			bips.ClickonSavebutton_Deduction_and_Premium_Setup().click();
			//Click on OK button or Accept alert message
			Alert alertOK11 = driver.switchTo().alert();
			alertOK11.accept();
			//Click on Submit button
			bips.ClickonSubmitbutton().click();
			//Click on OK button or Accept alert message
			/*Alert alertOK12 = driver.switchTo().alert();
			alertOK12.accept();*/
			String alertMessage = "";
			alertMessage = driver.switchTo().alert().getText();// get alertmessage
			driver.switchTo().alert().accept();
			System.out.println(alertMessage);
		}
}