package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeUploadPage {
	public WebDriver driver;

	// Constructor
	public EmployeeUploadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//select file type dropDown
	@FindBy(id="dd1FileType")
	WebElement selectFileType;
	
	public WebElement fileTypeDropDown() {
		return selectFileType;
	}
	
	//Select Transaction Type
	@FindBy(id="ddlTransactions")
	WebElement selectTransactionType;
	
	public WebElement transactionTypeDropDown() {
		return selectTransactionType;
	}
	
	//Choose File Link
	@FindBy(id="fuTedWeb")
	WebElement chooseFile;
	
	public WebElement upload_ChooseFileLink() {
		return chooseFile;
	}
	
	//Upload Upload Files Button
	@FindBy(id="btnUpload")
	WebElement uploadFiles;
	
	public WebElement uploadButton() {
		return uploadFiles;
	}
	
	//Use Email Delivery Date check box
	@FindBy(id="cbxMailDeliverDate")
	WebElement emailDeliveryDate;
	
	public WebElement useEmailDeliveryDateCheckBox() {
		return emailDeliveryDate;
	}
	
	//Now radio button
	@FindBy(id="rbtnNow")
	WebElement nowRadioLink;
	
	public WebElement nowRadioButton() {
		return nowRadioLink;
	}
	
	//Process changes resulting termination	
	//yes
	@FindBy(id="rbtTerm_0")
	WebElement yesRadioLink;
	
	public WebElement processChangesResultTermination_YES() {
		return yesRadioLink;
	}
	//No
	@FindBy(id="rbtTerm_1")
	WebElement noRadioLink;
	
	public WebElement processChangesResultTermination_NO() {
		return noRadioLink;
	}
	
	// "Switch off Benefits termination emails" check box
	@FindBy(id="ChkSWOffBenTermmails")
	WebElement checkBenefitTerminals;
	
	public WebElement checkBenefitTerminalEmailBox() {
		return checkBenefitTerminals;
	}
	
	//Switch off Activation emails check box
	@FindBy(id="ChkOffActvationMails")
	WebElement checkOffActivation;
	
	public WebElement checkOffActivationEmailBox() {
		return checkOffActivation;
	}
	
	//Finish button
	@FindBy(id="btnFinish")
	WebElement finishLink;
	
	public WebElement finishButton() {
		return finishLink;
	}
	
	//Previous upload radio button
	@FindBy(id="rblUploads_4")
	WebElement previousUploadLink;
	
	public WebElement previousUploadRadioLink() {
		return previousUploadLink;
	}
	
	//status of file upload
	@FindBy(id="lblStatus")
	WebElement statusColumn;
	
	public WebElement fileUploadStatus() {
		return statusColumn;
	}
}
