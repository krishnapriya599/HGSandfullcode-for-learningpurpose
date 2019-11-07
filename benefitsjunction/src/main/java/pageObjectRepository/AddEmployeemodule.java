package pageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddEmployeemodule {
public  WebDriver driver;
	
	public AddEmployeemodule(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Add Employee details page
	//First name Field
	@FindBy(id= "txtFirstName")
	WebElement firstname;
	public WebElement EnterFirstname()
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrmClientAdminMiddle");
		return firstname;
	}
	//Middle Name field
	@FindBy(id= "txtMiddleName")
	WebElement middlename;
	public WebElement EnterMiddletname()
	{
		return middlename;
	}
	//Last Name Field
	@FindBy(id= "txtLastName")
	WebElement lastname;
	public WebElement EnterLastname()
	{
		return lastname;
	}
	//Date of Birth datepicker
	@FindBy(id="txtDOB")
	WebElement dateofbirth;
	public WebElement SelectDateofBirth()
	{
		return dateofbirth;
	}
	//SSN Field
	@FindBy(id= "txtSSN")
	WebElement ssn;
	public WebElement EnterSNNnumber()
	{
		return ssn;
	}
	//Hire Date date picker
	@FindBy(id ="txtHireDate")
	WebElement Hiredate;
	public WebElement SelectHireDate()
	{
		return Hiredate;
	}
	//Employee Id Field
	@FindBy(id= "txtEmpId")
	WebElement employeeid;
	public WebElement EnterEmployeeId()
	{
		return employeeid;
	}
	//WorkEmail Id Field
	@FindBy(id= "txtWorkEmail")
	WebElement workemail;
	public WebElement EnterWorkEmail()
	{
		return workemail;
	}
	//Jobtitle Field
	@FindBy(id="txtJobTitle")
	WebElement jobtitle;
	public WebElement JobTitle()
	{
		return jobtitle;
	}
	//Class dropdown field
	@FindBy(id= "ddlClass")
	WebElement selectclassdropdown;
	public Select ClassDropDownlist()
	{
		return new Select(selectclassdropdown);
	}
	//Location drop down field
	@FindBy(id= "ddlLocation")
	WebElement selectlocation;
	public Select LocationDropDownlist()
	{
		return new Select(selectlocation);
	}
	//Division drop down field
	@FindBy(id= "ddlDivision")
	WebElement selectdivision;
	public Select DivisionDropDownlist()
	{
		return new Select(selectdivision);
	}
	//Division date picker
	
	
	@FindBy(id= "TxtDivEffDate")
	WebElement selectdivisiondate;
	public WebElement Divisiondate()
	{
		return selectdivisiondate;
	}
	//Department drop down field
	@FindBy(id= "ddlDepartment")
	WebElement selectdepartment;
	public Select DepartmentDropDownlist()
	{
		return new Select(selectdepartment);
	}
	//Country drop down field
	@FindBy(id= "ddlCountry")
	WebElement selectcountry;
	public Select CountrytDropDownlist()
	{
		return new Select(selectcountry);
	}
	//Status drop down field
	@FindBy(id= "ddlStatus")
	WebElement selectstatus;
	public Select StatusDropDownlist()
	{
		return new Select(selectstatus);
	}
	//Employee Type drop down field
	@FindBy(id ="ddlEmployeeType")
	WebElement selectemployeetype;
	public Select EmployeeTypeDropDownlist()
	{
		return new Select(selectemployeetype);
	}
	//Paycycle drop down field
	@FindBy(id= "ddlPayCycle")
	WebElement selectpaycycle;
	public Select PayCycleDropDownlist()
	{
		return new Select(selectpaycycle);
	}
	//Salary field
	@FindBy(id= "txtSalary")
	WebElement salary;
	public WebElement EnterSalary()
	{
		return salary;
	}
	//Salary period drop down
	@FindBy(id ="ddlSalaryPeriod")
	WebElement salaryperiod;
	public Select SalaryPerioddropdownlist()
	{
		return new Select(salaryperiod);
	}
	//Username field
	@FindBy(id= "txtUserId")
	WebElement enterusername;
	public WebElement EnterUserName()
	{
		return enterusername;
	}
	//Add Employee button
	@FindBy(id= "btnSubmit")
	WebElement Addemployeebutton;
	public WebElement clickonAddemployeebutton()
	{
		return Addemployeebutton;
		
	}
	//Logout link
	/*@FindBy(id ="anLOut")
	WebElement logout;	
	public WebElement clicklogoutlinl()
	{ driver.switchTo().frame("FrmTabs");
		return logout;
	}*/
}
