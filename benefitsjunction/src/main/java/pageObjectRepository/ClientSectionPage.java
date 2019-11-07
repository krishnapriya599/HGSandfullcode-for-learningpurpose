package pageObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientSectionPage {
	public WebDriver driver;

	//Constructor
	public ClientSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Search company field
	@FindBy(name="txtsearchcompany")
	WebElement searchCompany;
	
	public WebElement enterSearchCompanyName() {
		return searchCompany;
	}
	
	//Submit link after search company field text
	@FindBy(name="btnsubmit")
	WebElement submitLink;
	
	public WebElement submitForSearchCompany() {
		return submitLink;
	}

	//ESS company link
	@FindBy(id = "GVCompanyList_ctl02_lbtnComapnyName")
	WebElement essCompanyLink;
	
	public WebElement essCompanyNameLink() {
		return essCompanyLink;
	}
	
}
