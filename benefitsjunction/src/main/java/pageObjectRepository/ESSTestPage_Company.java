package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ESSTestPage_Company {
	public WebDriver driver;

	// Constructor
	public ESSTestPage_Company(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Employee Search/Add
	@FindBy(id = "TVHomet3")
	WebElement employeeSearchAndAddLink;

	public WebElement employeeAdd_SearchLink() {
		return employeeSearchAndAddLink;
	}

	// Add link (under Employee Add and Search)
	@FindBy(id = "TVHomet6")
	WebElement addLink;

	public WebElement addLinkUnderEmployeeAddSection() {
		return addLink;
	}
	
	// Add link (under Employee Add and Search)
	@FindBy(id = "TVHomet7")
	WebElement uploadLink;

	public WebElement uploadLinkUnderEmployeeAddSection() {
		return uploadLink;
	}

	// Add new employee object
	// repository>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	// First Name
	@FindBy(id = "txtFirstName")
	WebElement firstname;

	public WebElement EnterFirstname() {
		return firstname;
	}

	// Middile Name
	@FindBy(id = "txtMiddleName")
	WebElement middlename;

	public WebElement EnterMiddletname() {
		return middlename;
	}

	// Last Name Field
	@FindBy(id = "txtLastName")
	WebElement lastname;

	public WebElement EnterLastname() {
		return lastname;
	}

	// Date of Birth datepicker
	@FindBy(id = "txtDOB")
	WebElement dateofbirth;

	public WebElement SelectDateofBirth() {
		return dateofbirth;
	}

	// SSN Field
	@FindBy(id = "txtSSN")
	WebElement ssn;

	public WebElement EnterSNNnumber() {
		return ssn;
	}

	// Hire Date date picker
	@FindBy(id = "txtHireDate")
	WebElement Hiredate;

	public WebElement SelectHireDate() {
		return Hiredate;
	}

	// Employee Id Field
	@FindBy(id = "txtEmpId")
	WebElement employeeid;

	public WebElement EnterEmployeeId() {
		return employeeid;
	}

	// WorkEmail Id Field
	@FindBy(id = "txtWorkEmail")
	WebElement workemail;

	public WebElement EnterWorkEmail() {
		return workemail;
	}

	// Job title Field
	@FindBy(id = "txtJobTitle")
	WebElement jobtitle;

	public WebElement JobTitle() {
		return jobtitle;
	}

	// Class drop down field
	@FindBy(id = "ddlClass")
	WebElement selectclassdropdown;

	public Select ClassDropDownlist() {
		return new Select(selectclassdropdown);
	}

	// Location drop down field
	@FindBy(id = "ddlLocation")
	WebElement selectlocation;

	public Select LocationDropDownlist() {
		return new Select(selectlocation);
	}

	// Division drop down
	@FindBy(id = "ddlDivision")
	WebElement selectdivision;

	public Select DivisionDropDownlist() {
		return new Select(selectdivision);
	}

	// Division date picker drop down field (after selection of CObra in division)
	@FindBy(id = "TxtDivEffDate")
	WebElement selectdivisiondate;

	public WebElement Divisiondate() {
		return selectdivisiondate;
	}

	// Department drop down field
	@FindBy(id = "ddlDepartment")
	WebElement selectdepartment;

	public Select DepartmentDropDownlist() {
		return new Select(selectdepartment);
	}

	// Country drop down field
	@FindBy(id = "ddlCountry")
	WebElement selectcountry;

	public Select CountrytDropDownlist() {
		return new Select(selectcountry);
	}

	// Status drop down field
	@FindBy(id = "ddlStatus")
	WebElement selectstatus;

	public Select StatusDropDownlist() {
		return new Select(selectstatus);
	}

	// Employee Type drop down field
	@FindBy(id = "ddlEmployeeType")
	WebElement selectemployeetype;

	public Select EmployeeTypeDropDownlist() {
		return new Select(selectemployeetype);
	}

	// PayCycle drop down field
	@FindBy(id = "ddlPayCycle")
	WebElement selectpaycycle;

	public Select PayCycleDropDownlist() {
		return new Select(selectpaycycle);
	}

	// Salary field
	@FindBy(id = "txtSalary")
	WebElement salary;

	public WebElement EnterSalary() {
		return salary;
	}

	// Salary period drop down
	@FindBy(id = "ddlSalaryPeriod")
	WebElement salaryperiod;

	public Select SalaryPerioddropdownlist() {
		return new Select(salaryperiod);
	}

	// User name field
	@FindBy(id = "txtUserId")
	WebElement enterusername;

	public WebElement EnterUserName() {
		return enterusername;
	}

	// Add Employee button
	@FindBy(id = "btnSubmit")
	WebElement Addemployeebutton;

	public WebElement addEmployeebutton() {
		return Addemployeebutton;

	}
	
	//AlertMessage after employee added successfully
	@FindBy(id="popup_message")
	WebElement alertMessage;
	
	public WebElement confirmationMessageAfterAddNewEmployeeDetails() {
		return alertMessage;
	}
	
	//OK link on pop up confirmation box
	@FindBy(id="popup_ok")
	WebElement oklink;
	
	public WebElement oklinkOnAddEmployeeConfirmationPopUp() {
		return oklink;
	}
	
	//After enter employee details proceed to employee login
	@FindBy(id="btnEmployeeLogin")
	WebElement employeeLogin;
	
	public WebElement loginAsEmployee() {
		return employeeLogin;
	}
	
	// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	
	//AlertMessage after employee added successfully

}
