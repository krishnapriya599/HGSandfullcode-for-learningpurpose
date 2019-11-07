package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_StatusPage {
	public WebDriver driver;

	// Constructor
	public Employee_StatusPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//status Changes
	@FindBy(id="ctl00_MainContent_ddlStatusChanges")
	WebElement statusDropDown;
	
	public WebElement statusChangesDropDown() {
		return statusDropDown;
	}
	
	//Go link
	@FindBy(id="ctl00_MainContent_btnGo")
	WebElement goLink;
	
	public WebElement goButton() {
		return goLink;
	}
}
