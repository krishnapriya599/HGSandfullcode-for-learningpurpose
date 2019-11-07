package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_SettingsPage {

	public WebDriver driver;

	// Constructor
	public Employee_SettingsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Work email radio button
	@FindBy(id="ctl00_MainContent_RbtNotifications_1")
	WebElement workEmailRadio;
	
	public WebElement workEmailRadioLink() {
		return workEmailRadio;
	}
	
	//None radio button
	@FindBy(id="ctl00_MainContent_RbtNotifications_3")
	WebElement noneRadio;
	
	public WebElement noneRadioLink() {
		return noneRadio;
	}
	
	//Submit link
	@FindBy(id="ctl00_MainContent_btnSubmit")
	WebElement submit;
	
	public WebElement submitLink() {
		return submit;
	}
	
}
