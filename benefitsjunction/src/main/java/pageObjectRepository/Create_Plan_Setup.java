package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Plan_Setup {
public WebDriver driver;
	
	public Create_Plan_Setup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Select Plan type from dropdown field
	@FindBy(id="ddlPlanType")
	WebElement plantype;
	
	public Select SelectPlantype()
	{
		return new Select(plantype);
	}
	
	//Click on Add New button
	@FindBy(name="btnAdd")
	WebElement addnew;
	
	public WebElement ClickonAddNew()
	{
		return addnew;
		
	}
	
	//Again Select Plan type values from drop down
	@FindBy(xpath = "//*[contains(@id,'gvDdlPlanType')]")
	WebElement pplantype;
	
	public Select SelectPlantypevalues()
	{
		return new Select(pplantype);
	}//Plan Name missing
	
	//Enter Plan name
	@FindBy(xpath="//*[contains(@id,'txtPlan')]")
	WebElement planname;
	
	public WebElement EnterPlanname()
	{
		return planname;
	}
	
	//date picker
	@FindBy(xpath="//*[contains(@id,'txtPlanEffDate')]")
	WebElement datepicker;
	
	public WebElement Clickondatepicker()
	{
		return datepicker;
	}
	
	/*//Select year
	@FindBy(className="ajax__calendar_year")
	WebElement year;
	
	public WebElement SelectYear()
	{
		return year;
	}
	
	//Select Month
	@FindBy(className="ajax__calendar_month")
	WebElement month;
	
	public WebElement SelectMonth()
	{
	return month;
	}
	
	//Select date
	@FindBy(className="ajax__calendar_day")
	WebElement Date;
	
	public WebElement SelectDate()
	{
		return Date;
	}*/
	
	//Select Carrier Privider
	@FindBy(xpath="//*[contains(@id,'gvDdlProvider')]")
	WebElement SelectCarrier;
	
	public Select SelectCarrier()
	{
		return new Select(SelectCarrier);
	}
	
	@FindBy(linkText="Save")
	WebElement Save;
	
	public WebElement ClickonSavebutton()
	{
	return Save;
	}
}
