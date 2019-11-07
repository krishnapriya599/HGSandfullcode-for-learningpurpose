package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_PersonalInformation {
	
	public WebDriver driver;

		// Constructor
		public Employee_PersonalInformation(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		// First Name
		@FindBy(id = "ctl00_MainContent_txtbx0C2201002")
		WebElement firstName;

		public WebElement firstNameTextField() {
			return firstName;
		}

		// Middle Name
		@FindBy(id = "ctl00_MainContent_txtbx0C2201003")
		WebElement middleName;

		public WebElement middleNameTextField() {
			return middleName;
		}

		// Last Name
		@FindBy(id = "ctl00_MainContent_txtbx0C2201004")
		WebElement lastName;

		public WebElement lastNameTextField() {
			return lastName;
		}

		// Country Drop down
		@FindBy(id = "ctl00_MainContent_ddl0C2201005")
		WebElement countryDropDown;

		public WebElement countryDropDownOption() {
			return countryDropDown;
		}

		// Country Effective Date
		@FindBy(id = "ctl00_MainContent_txtbx0C2201006")
		WebElement countryEffectiveDate;

		public WebElement countryEffectiveDateField() {
			return countryDropDown;
		}

		// Gender radio button
		// Male radio button
		@FindBy(id = "ctl00_MainContent_rbt0C2201010_0")
		WebElement maleLink;

		public WebElement maleRadioLink() {
			return maleLink;
		}

		// Female radio button
		@FindBy(id = "ctl00_MainContent_rbt0C2201010_1")
		WebElement femaleLink;

		public WebElement femaleRadioLink() {
			return femaleLink;
		}

		// Address Line 1 text field
		@FindBy(id = "ctl00_MainContent_txtbx0C2201011")
		WebElement addressLine1;

		public WebElement addressLine1TextField() {
			return addressLine1;
		}

		// Address Line 2 text field
		@FindBy(id = "ctl00_MainContent_txtbx0C2201012")
		WebElement addressLine2;

		public WebElement addressLine2TextField() {
			return addressLine2;
		}

		// Zip or Postal Code
		@FindBy(id = "ctl00_MainContent_txtbx0C2201015")
		WebElement zipCode;

		public WebElement zipCodeField() {
			return zipCode;
		}

		// City
		@FindBy(id = "ctl00_MainContent_txtbx0C2201014")
		WebElement city;

		public WebElement cityTextCodeField() {
			return city;
		}

		// State drop down
		@FindBy(id = "ctl00_MainContent_ddl0C2201013")
		WebElement state;

		public WebElement stateDropDownOption() {
			return state;
		}

		// Home Phone field
		@FindBy(id = "ctl00_MainContent_txtbx0C2201016")
		WebElement homePhone;

		public WebElement homePhoneTextField() {
			return homePhone;
		}

		// Mobile Phone Field
		@FindBy(id = "ctl00_MainContent_txtbx0C2201017")
		WebElement mobilePhone;

		public WebElement mobilePhoneTextField() {
			return mobilePhone;
		}

		// Marital Status drop down
		@FindBy(id = "ctl00_MainContent_ddl0C2201022")
		WebElement maritalStatus;

		public WebElement maritalStatusDropDownOption() {
			return maritalStatus;
		}

		// Tobacco User radio button
		// Yes radin link
		@FindBy(id = "ctl00_MainContent_rbt0C2201024_0")
		WebElement yesLink;

		public WebElement yesRadioLinkForTobaccoUser() {
			return yesLink;
		}

		// No radio link
		@FindBy(id = "ctl00_MainContent_rbt0C2201024_1")
		WebElement noLink;

		public WebElement noRadioLinkForTobaccoUser() {
			return noLink;
		}

		// Submit link
		@FindBy(id = "ctl00_MainContent_btnSubmit")
		WebElement submitLink;

		public WebElement submitButton() {
			return submitLink;
		}
}
