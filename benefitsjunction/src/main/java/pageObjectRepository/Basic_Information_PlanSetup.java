package pageObjectRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Basic_Information_PlanSetup {
public WebDriver driver;
JavascriptExecutor js;
	
	public Basic_Information_PlanSetup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}
	//plan type from drop down
	@FindBy(id="ddlPlanType")
	WebElement plantype;
	
	public Select SelectPlantype()
	{
		return new Select(plantype);
	}
	//Click on Plan Name
	@FindBy(linkText="Vision test 16")
	WebElement planname;
	
	public WebElement ClickonPlanname()
	{
		return planname;
	}
	
	//Basic Information for Plan Setup
	//Select Plan sub type
	@FindBy(name="ddlPlnSubType")
	WebElement plansubtype;
	
	public Select selectplansubtype()
	{
		return new Select(plansubtype);
	}
	
	//Broker Field
	@FindBy(name="txtBroker")
	WebElement broker;
	
	public WebElement EnterBrokername()
	{
		return broker;
	}
	
	//Policy Field
	@FindBy(name="txtPolicy")
	WebElement Policy;
	
	public WebElement EnterPolicy()
	{
		return Policy;
	}
	
	//Planexpiry date
	@FindBy(name="txtPEpairyDate")
	WebElement planexpirydate;
	
	public WebElement selectplanexpirydate()
	{
		return planexpirydate;
	}
	
	//Plan Anniversary
	@FindBy(name="txtPlnAniversary")
	WebElement PlanAnniversary;
	
	public WebElement EnterPlanAnniversary()
	{
		return PlanAnniversary;
	}
	
	//Custom Message
	@FindBy(id="txtNotes_designEditor")
	WebElement Custommessage;
	
	public WebElement EnterCustommessage()
	{
		return Custommessage;
	}
	
	//Select option for Documents radio button 
	@FindBy(name= "plndoc")
	WebElement document;
	
	public WebElement Selectdocumentradiobutton()
	{
		return document;
	}
	
	//uploading document -- Plan Document -- Clickon Choose File
	@FindBy(id="fuPlanDocument")
	WebElement choosefilebutton;
	
	public WebElement uploaddocument()
	{
		return choosefilebutton;
	}
	
	//Upload button
	@FindBy(name="btnPlanDocument")
	WebElement uploadbutton;
	
	public WebElement ClickonUploadbutton()
	{
		return uploadbutton;
	}
	
	//Coverage Format Radio button -- Two Tier
	@FindBy(id= "rblTiers_0")
	WebElement twotier_radiobutton;
	
	public WebElement SelectTwotier_Radiobutton()
	{
		return twotier_radiobutton;
	}
	
	//Select Upload required document check box under Allow Waiving Coverage
	@FindBy(id= "chkWaiverFormRqrd")
	WebElement Uploadrequireddocument;
	
	public WebElement SelectUpload_required_document()
	{
		return Uploadrequireddocument;
	}
	
	//Select Is Mandatory checkbox
	@FindBy(id= "chkIsWaiverFormReq")
	WebElement IsMandatory;
	
	public WebElement SelectisMandatory()
	{
		return IsMandatory;
	}
	
	//Is Mandatory Choosefile button
	@FindBy(name= "fuWaiverFormsuprtdoc")
	WebElement MChoosefile;
	
	public WebElement ClickonIsMandatorychoosefilebutton()
	{
		return MChoosefile;
	}
	
	//Click on Upload button for Ismandory uploaddocument
	@FindBy(name="btnWaiverFormsuprtdoc")
	WebElement Muploadbutton;
	
	public WebElement ClickonUploadbutton1()
	{
		return Muploadbutton;
	}
	
	//Reason Required Check box
	@FindBy(id= "chkWaiverReasonRq")
	WebElement resonrequired;
	
	public WebElement SelectReason_Required()
	{
		return resonrequired;
	}
	
	//PCP Requried checkbox
	@FindBy(id= "chkPCPRequired")
	WebElement PCPRequried;
	
	public WebElement SelectPCP_Requried()
	{
		return PCPRequried;
	}
	
	//PCP Name Enable
	@FindBy(id= "chkPCPNameEnable")
	WebElement PCPNameEnable;
	
	public WebElement SelectPCP_Name_Enable()
	{
		return PCPNameEnable;
	}
	
	//PCP Name required
	@FindBy(id= "chkPCPNameRequired")
	WebElement PCPNamerequired;
	
	public WebElement SelectPCP_Name_required()
	{
		return PCPNamerequired;
	}
	
	//PCP Code Enable
	@FindBy(id= "chkPCPCodeEnable")
	WebElement PCPCodeEnable;
	
	public WebElement SelectPCP_Code_Enable()
	{
		return PCPCodeEnable;
	}
	
	//PCP Code required
	@FindBy(id= "chkPCPCodeRequired")
	WebElement PCPCoderequired;
	
	public WebElement SelectPCP_Code_required()
	{
		return PCPCoderequired;
	}
	
	//PCP Code Character Limit
	@FindBy(id="txtPCPCodelimit")
	WebElement PCPCodeCharacterLimit;
	
	public WebElement EnterPCP_Code_Character_Limit()
	{
		return PCPCodeCharacterLimit;
	}
	
	//Is plan COBRA eligible
	@FindBy(id="ChkIsplnCobraelgbl")
	WebElement IsplanCOBRAeligible;
	
	public WebElement SelectIs_plan_COBRA_eligible()
	{
		return IsplanCOBRAeligible;
	}
	
	//Allow Domestic Partner Coverage
	@FindBy(id="ChkAllowDPCoverage")
	WebElement AllowDomesticPartnerCoverage;
	
	public WebElement SelectAllow_Domestic_Partner_Coverage()
	{
		return AllowDomesticPartnerCoverage;
	}
	
	//Allow opposite sex DP Coverage Radtio button
	@FindBy(id="rbtnAllwOppSex")
	WebElement AllowoppositesexDPCoverage;
	
	public WebElement SelectAllow_opposite_sex_DP_Coverage()
	{
		return AllowoppositesexDPCoverage;
	}
	
	//Supporting Document Required for Domestic Partner Enrollment
	@FindBy(id="ChkAffidavit")
	WebElement SupportingDocumentRequiredforDomesticPartnerEnrollment;
	
	public WebElement SelectSupporting_Document_Required_for_Domestic_Partner_Enrollment()
	{
		return SupportingDocumentRequiredforDomesticPartnerEnrollment;
	}
	
	//Allow Temporary SSN
	@FindBy(id="ChkAllowTSSN")
	WebElement AllowTemporarySSN;
	
	public WebElement SelectAllow_Temporary_SSN()
	{
		return AllowTemporarySSN;
	}
	
	//Non Contributory
	@FindBy(id="ChkNonContributory")
	WebElement NonContributory;
	
	public WebElement SelectNon_Contributory()
	{
		return NonContributory;
	}
	
	//Invoice setup is required
	@FindBy(id="ChkInvoice")
	WebElement Invoicesetupisrequired;
	
	public WebElement SelectInvoice_setup_is_required()
	{
		return Invoicesetupisrequired;
	}
	
	//Deduction setup is required
	@FindBy(id="ChkDeduction")
	WebElement Deductionsetupisrequired;
	
	public WebElement SelectDeduction_setup_is_required()
	{
		return Deductionsetupisrequired;
	}
	
	//EDI Required
	@FindBy(id="ChkEDI")
	WebElement EDIRequired;
	
	public WebElement SelectEDI_Required()
	{
		return EDIRequired;
	}
	
	
	//Click on Save button in Basic Information page
	@FindBy(id="btnSave")
	WebElement savebutton_InBasicInformation;
	
	public WebElement ClickonsavebuttonInBI()
	{
		return savebutton_InBasicInformation;
	}
	
	//Next button
	@FindBy(id="btnOK")
	WebElement Nextbutton;
	
	public WebElement ClickonNextbutton()
	{
		return Nextbutton;
	}
	
	//Eligibility Period Details
	//Add New button
	@FindBy(id="btnAddNew")
	WebElement addnew;
	
	public WebElement ClickonAddNewbutton()
	{
		return addnew;
	}
	
	//Name Field
	@FindBy(id="GridView2_ctl02_txtGroupName")
	WebElement namefield;
	
	public WebElement EnterName()
	{
		return namefield;
	}
	
	//From date
	@FindBy(id= "GridView2_ctl02_txtFromDate")
	WebElement fromdate;
	
	public WebElement SelectFrom_date()
	{
		return fromdate;
	}
	
	//To date
	@FindBy(id= "GridView2_ctl02_txtToDate")
	WebElement todate;
	
	public WebElement SelectTo_date()
	{
		return todate;
	}
		
		//Save button
	@FindBy(id="GridView2_ctl02_btnUpdate")
	WebElement savebutton;
	
	public WebElement ClickonSavebutton()
	{
		return savebutton;
	}
	
	//Eligibility based on – Class
	@FindBy(id="lbxAvailableClasses")
	WebElement EligibilitybasedonClass;
	
	public Select SelectMultiplevaluesEligibility_based_on_Class()
	{
		return new Select(EligibilitybasedonClass);
	}
	
	//Add button
	@FindBy(id="btnAddClass")
	WebElement ClassAddbutton;
	
	public WebElement ClickonClassAddbutton()
	{
		return ClassAddbutton;
	}
	
	//Eligibility based on – Location
	@FindBy(id="lbxAvailableLocations")
	WebElement EligibilitybasedonLocation;
	
	public Select SelectMultiplevaluesEligibility_based_on_Location()
	{
		return new Select(EligibilitybasedonLocation);
	}
	
	//Add button
	@FindBy(id="btnAddLocation")
	WebElement LocationAddbutton;
	
	public WebElement ClickonLocationAddbutton()
	{
		return LocationAddbutton;
	}
	
	//Eligibility based on – Division
	@FindBy(id="lbxAvailableDivisions")
	WebElement EligibilitybasedonDivision;
	
	public Select SelectMultiplevaluesEligibility_based_on_Division()
	{
		return new Select(EligibilitybasedonDivision);
	}
	
	//Add button
	@FindBy(id="btnAddDivision")
	WebElement DivisionAddbutton;
	
	public WebElement ClickonDivisionAddbutton()
	{
		return DivisionAddbutton;
	}
	
	//Eligibility based on – Department
	@FindBy(id="lbxAvailableDept")
	WebElement EligibilitybasedonDepartment;
	
	public Select SelectMultiplevaluesEligibility_based_on_Department()
	{
		return new Select(EligibilitybasedonDepartment);
	}
	
	//Add button
	@FindBy(id="btnAddDept")
	WebElement DepartmentAddbutton;
	
	public WebElement ClickonDepartmentAddbutton()
	{
		return DepartmentAddbutton;
	}
	
	//Eligibility based on – Country
	@FindBy(id="lbxAvailableCountries")
	WebElement EligibilitybasedonCountry;
	
	public Select SelectMultiplevaluesEligibility_based_on_Country()
	{
		return new Select(EligibilitybasedonCountry);
	}
	
	//Add button
	@FindBy(id="btnAddCountry")
	WebElement CountryAddbutton;
	
	public WebElement ClickonCountryAddbutton()
	{
		return CountryAddbutton;
	}
	
	//Eligibility based on – Zip code
	@FindBy(id="txtZipCode")
	WebElement Zipcode;
	
	public WebElement EnterZip_code()
	{
		return Zipcode;
	}
	
	//Exclude Zip Codes from Eligibility Checkbox
	@FindBy(id="chkIsExclude")
	WebElement ExcludeZipcode;
	
	public WebElement SelectExclude_Zip_Codes_from_Eligibility()
	{
		return ExcludeZipcode;
	}
	
	//Add New button in Eligibility based on – Salary section
	@FindBy(id="btnAddEligSal")
	WebElement SalaryAddNewbutton;
	
	public WebElement ClickonEligibility_based_on_Salary()
	{
		return SalaryAddNewbutton;
	}
	
	//Salary From Field
	@FindBy(id="GVSalRanges_ctl02_gdvTxtFromSal")
	WebElement SalaryFromField;
	
	public WebElement EnterSalary_From()
	{
		return SalaryFromField;
	}
	
	//Salary To
	@FindBy(id="GVSalRanges_ctl02_gdvTxtToSal")
	WebElement SalaryToField;
	
	public WebElement EnterSalary_To()
	{
		return SalaryToField;
	}
	
	//Save button in Eligibility based on – Salary Section
	@FindBy(id="GVSalRanges_ctl02_btnUpdate")
	WebElement SalarySavebutton;
	
	public WebElement ClickonSalary_Savebutton()
	{
		return SalarySavebutton;
	}
	
	//Save button in Eligibility Period Details page for complete page
	@FindBy(id="btnSave")
	WebElement SavebuttonEligibilityPeriod;
	
	public WebElement ClickonSavebutton_EligibilityPeriod()
	{
		return SavebuttonEligibilityPeriod;
	}
	
	//Next button in Eligibility Period Details
	@FindBy(id="btnEligNext")
	WebElement Nextbutton1;
	
	public WebElement ClickonNextbutton1()
	{
		return Nextbutton1;
	}
	
	//Waiting Period/Termination Rules page
	//Waiting Period Rules section
	//New Hires Type -- Edit link
	@FindBy(linkText="Edit")
	WebElement edit;
	
	public WebElement ClickonNew_Hires_EditLink()
	{
		return edit;
	}
	//Click on Select a Rule dropdown
	@FindBy(id="ERUC_divRule")
	WebElement selectdropdown;
	
	public WebElement ClickonDorpdown()
	{
		return selectdropdown;
	}
	
	//Select Date of Hire Radio button
	@FindBy(id= "ERUC_RblElig2001")
	WebElement dateofHire;
	
	public WebElement SelectDateofHire()
	{
		return dateofHire;
	}
	
	//Save button in Waiting Period Rule For New Hire popup
	@FindBy(id="btnsave")
	WebElement Savebutton;
	
	public WebElement ClickonSavebutton_NewHire()
	{
		return Savebutton;
	}
	
	//Rehire type --Edit link
	@FindBy(id="GridEligibleRules_ctl03_lnbEditSPLRule")
	WebElement rehireeditlink;
	
	public WebElement ClickonRehire_Editlink()
	{
		return rehireeditlink;
	}
	
	//Waiting Period Rule For Rehire
	//Within Field
	@FindBy(id="txtRehireInput")
	WebElement withinfield;
	
	public WebElement EnterValuesin_WithInField()
	{
		return withinfield;
	}
	
	//Within Dropdown Option
	@FindBy(id="DDLRehireInput")
	WebElement Withindropdownoption;
	
	public Select Selectwithin_Month()
	{
		return new Select(Withindropdownoption);
	}	
	//Class Edit Link
	@FindBy(id="GridEligibleRules_ctl04_lnbEditSPLRule")
	WebElement classeditlink;
	
	public WebElement ClickonClass_Editlink()
	{
		return classeditlink;
	}
	
	//Waiting Period Rule For Class
	//Select a rule drop down
	@FindBy(id="ERUC_divRule")
	WebElement Selecetaruleinclass;
	
	public WebElement ClickonSelectarule_Class()
	{
		return Selecetaruleinclass;
	}
	
	//Date of Class
	@FindBy(id="ERUC_RblElig2001")
	WebElement DateofClass;
	
	public WebElement ClickonFirst_radiobutton()
	{
		return DateofClass;
	}	
	//Save button in class
	@FindBy(id="btnsave")
	WebElement savebuttoninclass;
	
	public WebElement Clickonsavebutton_inClass()
	{
		return savebuttoninclass;
	}
	
	//Location Edit link
	@FindBy(id="GridEligibleRules_ctl05_lnbEditSPLRule")
	WebElement LocationEditlink;
	
	public WebElement ClickonLocation_Editlink()
	{
		return LocationEditlink;
	}
	
	//Select a rule drop down option
	@FindBy(id="ERUC_divRule")
	WebElement Selectaruleinlocation;
	
	public WebElement ClickonSelectarule_InLocation()
	{
		return Selectaruleinlocation;
	}
	
	//Date of Location
	@FindBy(id="ERUC_RblElig2001")
	WebElement DateofLocation;
	
	public WebElement SelectDate_of_Locationradiobutton()
	{
		return DateofLocation;
	}
	
	//Save button in location
	@FindBy(id="btnsave")
	WebElement Savebuttonlocation;
	
	public WebElement ClickonSavebutton_InLocation()
	{
		return Savebuttonlocation;
	}
	
	//Division Edit link
	@FindBy(id="GridEligibleRules_ctl06_lnbEditSPLRule")
	WebElement DivisionEditlink;
	
	public WebElement ClickonDivision_Editlink()
	{
		return DivisionEditlink;
	}
	
	//Select a rule drop down option
	@FindBy(id="ERUC_divRule")
	WebElement Selectaruleindivision;
		
	public WebElement ClickonSelectarule_InDivision()
	{
		return Selectaruleindivision;
	}
		
	//Date of Divison
	@FindBy(id="ERUC_RblElig2001")
	WebElement DateofDivison;
		
	public WebElement SelectDate_of_Divisonradiobutton()
	{
		return DateofDivison;
	}
		
	//Save button in Divison
	@FindBy(id="btnsave")
	WebElement SavebuttonDivison;
		
	public WebElement ClickonSavebutton_InDivison()
	{
		return SavebuttonDivison;
	}
	
	//Department Edit link
	@FindBy(id="GridEligibleRules_ctl07_lnbEditSPLRule")
	WebElement DepartmentEditlink;
	
	public WebElement ClickonDepartment_Editlink()
	{
		return DepartmentEditlink;
	}
	
	//Select a rule drop down option
	@FindBy(id="ERUC_divRule")
	WebElement Selectaruleindepartment;
		
	public WebElement ClickonSelectarule_InDepartment()
	{
		return Selectaruleindepartment;
	}
	
	//Date of Department
	@FindBy(id="ERUC_RblElig2001")
	WebElement DateofDepartment;
		
	public WebElement SelectDate_of_Departmentadiobutton()
	{
		return DateofDepartment;
	}
	
	//Save button in Department
	@FindBy(id="btnsave")
	WebElement SavebuttonDepartment;
			
	public WebElement ClickonSavebutton_InDepartment()
	{
		return SavebuttonDepartment;
	}
	
	//Termination Rules section
	//Status Termination Edit link
	@FindBy(id="GridViewTermination_ctl02_lnbEditTerminateRule")
	WebElement StatusTerminationEditlink;
	
	public WebElement StatusTermination_Editlink()
	{
		return StatusTerminationEditlink;
	}
	
	//Termination Rule For Status Termination
	//Date of termination
	@FindBy(id="rbtnlTerminationRules_0")
	WebElement Dateoftermination;
		
	public WebElement ClickonDate_of_terminationradiobutton()
	{
		return Dateoftermination;
	}
	
	//Save button in Department
	@FindBy(id="btnsave")
	WebElement SavebuttonStatusTermination;
			
	public WebElement ClickonSavebutton_InStatus_Termination()
	{
		return SavebuttonStatusTermination;
	}
	
	//Class Edit link
	@FindBy(id="GridViewTermination_ctl03_lnbEditTerminateRule")
	WebElement ClassTerminationEditlink;
	
	public WebElement ClickClassTermination_Editlink()
	{
		return ClassTerminationEditlink;
	}
	
	//Last day of month following date of termination
	@FindBy(id="rbtnlTerminationRules_1")
	WebElement LastdayofmonthfollowingDateoftermination;
		
	public WebElement ClickonLast_day_of_month_following_date_of_termination()
	{
		return LastdayofmonthfollowingDateoftermination;
	}
	
	//Save button in Termination Rule For Class
	@FindBy(id="btnsave")
	WebElement SavebuttonTerminationRuleForClass;
			
	public WebElement ClickonSavebutton_InClass()
	{
		return SavebuttonTerminationRuleForClass;
	}
	
	//Location edit link
	@FindBy(id="GridViewTermination_ctl04_lnbEditTerminateRule")
	WebElement LocationTerminationEditlink;
	
	public WebElement ClickonLocationTermination_Editlink()
	{
		return LocationTerminationEditlink;
	}
	
	//End of the pay cycle radio button
	@FindBy(id="rbtnlTerminationRules_2")
	WebElement Endofthepaycycleradiobutton;
		
	public WebElement ClickonEnd_of_the_pay_cycle()
	{
		return Endofthepaycycleradiobutton;
	}
	
	//Save button in Termination Rule For Location
	@FindBy(id="btnsave")
	WebElement SavebuttonTerminationRuleForLocation;
			
	public WebElement ClickonSavebutton_InTerminationLocation()
	{
		return SavebuttonTerminationRuleForLocation;
	}
	
	//Division Edit link
	@FindBy(id="GridViewTermination_ctl05_lnbEditTerminateRule")
	WebElement DivisionTerminationEditlink;
	
	public WebElement ClickonDivisionTermination_Editlink()
	{
		return DivisionTerminationEditlink;
	}
	
	//Date of termination Radio button
	@FindBy(id="rbtnlTerminationRules_0")
	WebElement Dateofterminationradiobutton;
		
	public WebElement ClickonDate_of_termination_radiobutton()
	{
		return Dateofterminationradiobutton;
	}
	
	//Save button in Termination Rule For Division
	@FindBy(id="btnsave")
	WebElement SavebuttonTerminationRuleForDivision;
			
	public WebElement ClickonSavebutton_InTerminationDivision()
	{
		return SavebuttonTerminationRuleForDivision;
	}
	
	//Department Edit link
	@FindBy(id="GridViewTermination_ctl06_lnbEditTerminateRule")
	WebElement DepartmentTerminationEditlink;
	
	public WebElement ClickonDepartmentTermination_Editlink()
	{
		return DepartmentTerminationEditlink;
	}
	
	//Last day of month following date of termination radio button
	@FindBy(id="rbtnlTerminationRules_1")
	WebElement LastdayofmonthfollowingDateofterminationDepartment;
		
	public WebElement ClickonLast_day_of_month_following_date_of_termination_Department()
	{
		return LastdayofmonthfollowingDateofterminationDepartment;
	}
	
	//Save button in Termination Rule For Department
	@FindBy(id="btnsave")
	WebElement SavebuttonTerminationRuleForDepartment;
			
	public WebElement ClickonSavebutton_InTerminationDepartment()
	{
		return SavebuttonTerminationRuleForDepartment;
	}
	
	//Work Country Edit link
	@FindBy(id="GridViewTermination_ctl07_lnbEditTerminateRule")
	WebElement WorkCountryTerminationEditlink;
	
	public WebElement ClickonWorkCountryTermination_Editlink()
	{
		return WorkCountryTerminationEditlink;
	}
	
	//Click on End of the pay cycle radio button
	@FindBy(id="rbtnlTerminationRules_2")
	WebElement Endofthepaycycleradiobuttoninworkcountry;
		
	public WebElement ClickonEnd_of_the_pay_cycle_InWorkCountry()
	{
		return Endofthepaycycleradiobuttoninworkcountry;
	}
	
	//Save button in Termination Rule For Work Country
	@FindBy(id="btnsave")
	WebElement SavebuttonTerminationRuleForWorkCountry;
			
	public WebElement ClickonSavebutton_InTerminationWorkCountry()
	{
		return SavebuttonTerminationRuleForWorkCountry;
	}
	
	
	//Save button in Waiting Period/Termination Rules page
	@FindBy(id="btnFinalSave")
	WebElement Finalsavebutton;
	
	public WebElement ClickonSavebutton_inWaiting_Period_Termination()
	{
		return Finalsavebutton;
	}
	
	//Next button in Waiting Period/Termination Rules page
	@FindBy(id="btnnext")
	WebElement NextbuttonWaitingPeriod;
	
	public WebElement ClickonNextbutton_inWaiting_Period_Termination()
	{
		return NextbuttonWaitingPeriod;
	}
	//Invoice Setup page
	//Carrier: Privider section
	//Add New button 
	@FindBy(id="btnAddNew")
	WebElement AddNewbutton_inInvoiceSetup;
	
	public WebElement ClickonAddNewbutton_inInvoiceSetup()
	{
		return AddNewbutton_inInvoiceSetup;
	}
	
	//New Field in Rate Period Details section
	@FindBy(id="GridView2_ctl02_txtGroupName")
	WebElement namefieldRatePeriod;
	
	public WebElement EnterName_RatePeriod()
	{
		return namefieldRatePeriod;
	}
	
	//From date
	@FindBy(id= "GridView2_ctl02_txtFromDate")
	WebElement fromdateRatePeriod;
	
	public WebElement SelectFrom_date_RatePeriod()
	{
		return fromdateRatePeriod;
	}
	
	//To date
	@FindBy(id= "GridView2_ctl02_txtToDate")
	WebElement todateRatePeriod;
	
	public WebElement SelectTo_date_RatePeriod()
	{
		return todateRatePeriod;
	}
		
		//Save button
	@FindBy(id="GridView2_ctl02_btnUpdate")
	WebElement savebuttonRatePeriod;
	
	public WebElement ClickonSavebutton_RatePeriod()
	{
		return savebuttonRatePeriod;
	}
	
	//Select Full month premium radio button in Invoice Addition Retro Rules Section
	@FindBy(id="rdlAddtionRules_0")
	WebElement FullmonthpremiumRadiobutton;
	
	public WebElement ClickonFullmonthpremiumradiobutton()
	{
		return FullmonthpremiumRadiobutton;
	}
	
	//Select Full month premium radio button in Invoice Termination Retro Rules
	@FindBy(id="rdlTermRetroRules_0")
	WebElement FullmonthpremiumRadiobutton1;
	
	public WebElement ClickonFullmonthpremium_Invoice_Termination()
	{
		return FullmonthpremiumRadiobutton1;
	}
	
	//Addition Retro Cap Field
	@FindBy(id="txtAddRetroCap")
	WebElement 	AdditionRetroCap;
	
	public WebElement Entervalues_inAdditionRetroCap()
	{
		return AdditionRetroCap;
	}
	
	//Termination Retro Cap Field
	@FindBy(id="txtTermRetroCap")
	WebElement 	TerminationRetroCap;
	
	public WebElement Entervalues_inTerminationRetroCap()
	{
		return TerminationRetroCap;
	}
	
	//Fully Insured radio button in Funding Rules
	@FindBy(id="rdlFunding_0")
	WebElement 	FullyInsuredradiobutton;
	
	public WebElement ClickonFully_Insured_radio_button()
	{
		return FullyInsuredradiobutton;
	}
	
	//Save button in Invoice Setup
	@FindBy(id="btnSave")
	WebElement 	SavebuttoninInvoiceSetup;
	
	public WebElement ClickonSavebutton_inInvoiceSetup()
	{
		return SavebuttoninInvoiceSetup;
	}
	
	//Next button in Invoice Setup
	@FindBy(id="btnNext")
	WebElement 	NextbuttoninInvoiceSetup;
	
	public WebElement ClickonNextbutton_inInvoiceSetup()
	{
		return NextbuttoninInvoiceSetup;
	}
	
	//PEPM - Flat rate Radio button in Choose one of the following options
	@FindBy(id="rblPEPMRates_0")
	WebElement 	PEPMFlatrate;
	
	public WebElement ClickonPEPM_Flatrate()
	{
		return PEPMFlatrate;
	}
	
	//Save button in Slab Rates Setup
	@FindBy(id="btnSave")
	WebElement 	SavebuttoninSlabRatesSetup;
		
	public WebElement ClickonSavebutton_inSlab_Rates_Setup()
	{
		return SavebuttoninSlabRatesSetup;
	}
		
	//Next button in Slab Rates Setup
	@FindBy(id="btnNext")
	WebElement 	NextbuttoninSlabRatesSetup;
	
	public WebElement ClickonNextbutton_inSlab_Rates_Setup()
	{
		return NextbuttoninSlabRatesSetup;
	}
	
	//Add rates using excel file in Invoice Rates Setup
	/*@FindBy(id="rblRatesAddingChoice_0")
	WebElement Addratesusingexcelfileradiobutton;
	
	public WebElement ClickonAddratesusingexcelfileradiobutton()
	{
		return Addratesusingexcelfileradiobutton;
	}
	
	//Choose file to update
	@FindBy(id="fuRatesFile")
	WebElement ChooseAdratesusingexcelfile;
	
	public WebElement ClickonChooseFilebutton()
	{
		return ChooseAdratesusingexcelfile;
	}
	
	//Upload button
	@FindBy(id="btnUpload")
	WebElement UploadbuttonRatefiles;
	
	public WebElement ClickonUploadbutton_inaddrates()
	{
		return UploadbuttonRatefiles;	
	}*/
	
	//Add New button and enter all coverage details
	@FindBy(id="btnAddNew")
	WebElement 	AddNewbuttonInvoiceRatesSetup;
	
	public WebElement ClickonAddNewbutton_inInvoice_Rates_Setup()
	{
		return AddNewbuttonInvoiceRatesSetup;
	}
	
	//Coverage drop down option
	@FindBy(id="gvRates_ctl02_ddlGV1Cvrg")
	WebElement EmployeeFamily;
	
	public Select SelectEmployeeFamily()
	{
		return new Select(EmployeeFamily);
	}
	
	//EE Rate Field
	@FindBy(id="gvRates_ctl02_TextBox3")
	WebElement 	EERateField;
	
	public WebElement Entervalues_EE_Rate_Field()
	{
		return EERateField;
	}
	
	//Dep Rate Field
	@FindBy(id="gvRates_ctl02_TextBox4")
	WebElement 	DepRateField;
	
	public WebElement Entervalues_Dep_Rate_Field()
	{
		return DepRateField;
	}
	
	//Spouse Rate Field
	@FindBy(id="gvRates_ctl02_TextBox5")
	WebElement 	SpouseRateField;
	
	public WebElement Entervalues_Spouse_Rate_Field()
	{
		return SpouseRateField;
	}
	
	//Child Rate Field
	@FindBy(id="gvRates_ctl02_TextBox6")
	WebElement 	ChildRateField;
		
	public WebElement Entervalues_Child_Rate_Field()
	{
		return ChildRateField;
	}
	
	//Family Rate Field
	@FindBy(id="gvRates_ctl02_TextBox7")
	WebElement 	FamilyRateField;
			
	public WebElement Entervalues_Family_Rate_Field()
	{
		return FamilyRateField;
	}
	
	//Stop Loss Field
	@FindBy(id="gvRates_ctl02_TextBox10")
	WebElement 	StopLossField;
				
	public WebElement Entervalues_StopLoss_Field()
	{
		return StopLossField;
	}
	
	//Benefit Admin ChargesField
	@FindBy(id="gvRates_ctl02_TextBox9")
	WebElement 	BenefitAdminChargesField;
					
	public WebElement Entervalues_Benefit_Admin_Chargess_Field()
	{
		return BenefitAdminChargesField;
	}
	
	//Location dropdown field
	@FindBy(id="gvRates_ctl02_ddlLocation")
	WebElement Location;
	
	public Select SelectLocation()
	{
		return new Select(Location);
	}
	
	//Save button in Coverage section
	@FindBy(id="gvRates_ctl02_btnUpdate")
	WebElement 	SavebuttonCoverage;
					
	public WebElement ClickonSavebutton_Coverage()
	{
		return SavebuttonCoverage;
	}
	
	//Save button in Invoice Rates Setup page
	@FindBy(id="btnSave")
	WebElement 	SavebuttoninInvoiceRatesSetup;
					
	public WebElement ClickonSavebutton_InInvoice_Rates_Setup()
	{
		return SavebuttoninInvoiceRatesSetup;
	}
	
	//Next button in Invoice Rates Setup page
	@FindBy(id="btnFinalizeSetup")
	WebElement 	NextbuttoninInvoiceRatesSetup;
					
	public WebElement ClickonNextbutton_InInvoice_Rates_Setup()
	{
		return NextbuttoninInvoiceRatesSetup;
	}
	
	//Deducation setup
	//Add New button
	@FindBy(id="btnAddNew")
	WebElement addnewDeducation;
	
	public WebElement ClickonAddNewbutton_Deducation()
	{
		return addnewDeducation;
	}
	
	//Name Field
	@FindBy(id="GridView2_ctl02_txtGroupName")
	WebElement namefieldDeducation;
	
	public WebElement EnterName_RatePeriod_Deducation()
	{
		return namefieldDeducation;
	}
	
	//From date
	@FindBy(id= "GridView2_ctl02_txtFromDate")
	WebElement fromdateRatePeriod_Deducation;
	
	public WebElement SelectFrom_date_RatePeriod_Deducation()
	{
		return fromdateRatePeriod_Deducation;
	}
	
	//To date
	@FindBy(id= "GridView2_ctl02_txtToDate")
	WebElement todateRatePeriod_Deducation;
	
	public WebElement SelectTo_date_RatePeriod_Deducation()
	{
		return todateRatePeriod_Deducation;
	}
	
	//Payroll Codes Field
	@FindBy(id= "GridView2_ctl02_txtPlanCode")
	WebElement PayrollCodes;
	
	public WebElement EnterPayrollCodes()
	{
		return PayrollCodes;
	}
		
	//Save button in Rate Period section
	@FindBy(id="GridView2_ctl02_btnUpdate")
	WebElement savebuttonRatePeriod1;
	
	public WebElement ClickonSavebuttonRate_Period()
	{
		return savebuttonRatePeriod1;
	}
	
	//Deduction Retro Rules
	//Addition Rules in Employee Retro Rules Select
	@FindBy(id="RblEmpAddRetro_0")
	WebElement AdditionRules;
	
	public WebElement ClickonAdditionRulesradiobutton()
	{
		return AdditionRules;
	}
	
	//Termination Rules
	@FindBy(id="RblEmpTermRetro_0")
	WebElement TerminationRules;
	
	public WebElement ClickonAdditionRulesradiobutton1()
	{
		return TerminationRules;
	}
	
	//Deduction Rate Structure Setup
	//AddNew button
	@FindBy(id="btnAddNewRates")
	WebElement btnAddNewRates;
	
	public WebElement ClickonAddNewbuttonDeduction_Rate_Structure_Setup()
	{
		return btnAddNewRates;
	}
	
	//Enrollment Coverage
	@FindBy(id="grdRateStruct_ctl02_grdchkERCoverage")
	WebElement EnrollmentCoveragecheckbox;
	
	public WebElement ClickonEnrollment_Coverage_checkbox()
	{
		return EnrollmentCoveragecheckbox;
	}
	
	//Department
	@FindBy(id="grdRateStruct_ctl02_grdchkDept")
	WebElement Departmentcheckbox;
	
	public WebElement ClickonDepartment_checkbox()
	{
		return Departmentcheckbox;
	}
	
	//Class
	@FindBy(id="grdRateStruct_ctl02_grdchkClass")
	WebElement Classcheckbox;
	
	public WebElement ClickonClass_checkbox()
	{
		return Classcheckbox;
	}
	
	//Location
	@FindBy(id="grdRateStruct_ctl02_grdchkLocation")
	WebElement Locationcheckbox;
	
	public WebElement ClickonLocation_checkbox()
	{
		return Locationcheckbox;
	}
	
	//JobTitle
	@FindBy(id="grdRateStruct_ctl02_grdchkJobTitle")
	WebElement JobTitlecheckbox;
	
	public WebElement ClickonJobTitle_checkbox()
	{
		return JobTitlecheckbox;
	}
	
	//Salary
	@FindBy(id="grdRateStruct_ctl02_grdchkSalary")
	WebElement Salarycheckbox;
	
	public WebElement ClickonSalary_checkbox()
	{
		return Salarycheckbox;
	}
	
	//Save button in Deduction Rate Structure Setup section
	@FindBy(id="grdRateStruct_ctl02_btnUpdate")
	WebElement Savebuttondrss;
	
	public WebElement ClickonSavebutton_Deduction_Rate_Structure_Setup()
	{
		return Savebuttondrss;
	}
	
	//Save button in Deduction Setup
	@FindBy(id="btnSave")
	WebElement SavebuttonDeductionSetup;
	
	public WebElement ClickonSavebutton_Deduction_Setup()
	{
		return SavebuttonDeductionSetup;
	}
	
	//Next button in Deduction Setup
	@FindBy(id="btnNext")
	WebElement NextbuttonDeductionSetup;
	
	public WebElement ClickonNextbutton_Deduction_Setup()
	{
		return NextbuttonDeductionSetup;
	}
	//Deduction and Premium Setup page
	//Add New button
	@FindBy(id="btnAddNew")
	WebElement Addnewbutton;
	
	public WebElement ClickonAddbuttonin_Deduction()
	{
		return Addnewbutton;
	}
	
	//Coverage drop down
	@FindBy(css="#gvRates_ctl02_ddlDG1Cvrg")
	WebElement Coveragedropdown;
	
	public Select SelectCoveragedropdown()
	{
		return new Select(Coveragedropdown);
	}
	
	//Department
	@FindBy(id="gvRates_ctl02_ddlDept")
	WebElement Departmentdropdown;
	
	public Select SelectDepartmentdropdown()
	{
		return new Select(Departmentdropdown);
	}
	
	//Class
	@FindBy(id="gvRates_ctl02_ddlClass")
	WebElement Classdropdown;
	
	public Select SelectClassdropdown()
	{
		return new Select(Classdropdown);
	}
	
	//Location
	@FindBy(id="gvRates_ctl02_ddlLoc")
	WebElement Locationdropdown;
	
	public Select SelectLocationdropdown()
	{
		return new Select(Locationdropdown);
	}
	
	//JobTilte
	@FindBy(id="gvRates_ctl02_txtJobTitle")
	WebElement JobTilteField;
	
	public WebElement EnterValuesin_JobTilteField()
	{
		return JobTilteField;
	}
	
	//Salary
	@FindBy(id="gvRates_ctl02_txtSalary")
	WebElement SalaryField;
	
	public WebElement EnterValuesin_SalaryField()
	{
		return SalaryField;
	}
	
	//EEshare
	@FindBy(id="gvRates_ctl02_txtEEShare")
	WebElement EEshareField;
	
	public WebElement EnterValuesin_EEshareField()
	{
		return EEshareField;
	}
	
	//ERShare
	@FindBy(id="gvRates_ctl02_txtERShare")
	WebElement ERShareField;
	
	public WebElement EnterValuesin_ERShareField()
	{
		return ERShareField;
	}
	
	//ShareType
	@FindBy(id="gvRates_ctl02_ddlDG1ShareType")
	WebElement ShareTypedropdown;
	
	public Select SelectShareTypedropdown()
	{
		return new Select(ShareTypedropdown);
	}
	
	//FI Equivalence
	@FindBy(id="gvRates_ctl02_txtIncome")
	WebElement FIEquivalenceField;
	
	public WebElement Entervaluein_FIEquivalenceField()
	{
		return FIEquivalenceField;
	}	
	
	//Save button in Deduction and Premium Setup
	@FindBy(id="gvRates_ctl02_btnUpdate")
	WebElement SavebuttonRates;
	
	public WebElement ClickonSavebuttonRate()
	{
		return SavebuttonRates;
	}
	//Save button in Deduction and Premium Setup
	@FindBy(id="btnSave")
	WebElement SavebuttonDeductionandPremiumSetup;
	
	public WebElement ClickonSavebutton_Deduction_and_Premium_Setup()
	{
		return SavebuttonDeductionandPremiumSetup;
	}
	
	//Submit nutton
	@FindBy(id="BtnNext")
	WebElement Submitbutton;
	
	public WebElement ClickonSubmitbutton()
	{
		return Submitbutton;
	}
}
