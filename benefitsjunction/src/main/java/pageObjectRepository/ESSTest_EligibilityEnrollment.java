package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ESSTest_EligibilityEnrollment {
	public WebDriver driver;

	//Constructor
	public ESSTest_EligibilityEnrollment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Click on EligibilityandEnrollment module
			@FindBy(xpath="//*[@id='HLAdmin']")
			WebElement EligibilityandEnrollment;
			
			public WebElement ClickonEligibilityandEnrollment()
			{
				return EligibilityandEnrollment;
				
			}
			//Clickon plan setup
			@FindBy(id="TrvwPayrollt0")
			WebElement Plansetup;
			
			public WebElement ClickonPlansetup()
			{
				return Plansetup;
				
			}
			
			//click on Copy planset
			@FindBy(id="TrvwPayrollt2")
			WebElement copyplanset;
			
			public WebElement Clickoncopyplanset()
			{
				return copyplanset;
				
			}
}
