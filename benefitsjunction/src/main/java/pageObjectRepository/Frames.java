package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {
public  WebDriver driver;
	
	public Frames(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name ="FrmTabs")
	WebElement tabFrame;
	
	public WebElement topTabFrame()
	{
		return tabFrame;
	}
	
	@FindBy(name="FrmClientAdminMiddle")
	WebElement clientSectionFrame;
	
	public WebElement clientInfoSectionFrame() {
		return clientSectionFrame;
	}
	
	@FindBy(name="FrmClientAdminLeft")
	WebElement clientMenuFrame;
	
	public WebElement clientMenuSectionFrame() {
		return clientMenuFrame;
	}
	@FindBy(name= "FrmClientAdminTabs")
	WebElement ESStestEligibilityandEnroollment;
	
	public WebElement EligibilityandEnroollmentFrame()
	{
		return ESStestEligibilityandEnroollment;
	}
	
	public void switchToDefaultWindowOrFrame() {
		driver.switchTo().defaultContent();
	}
	public void switchToTopTabFrame() {
		driver.switchTo().frame(topTabFrame());
	}
	
	public void switchToLeftMenuFrame() {
		driver.switchTo().frame(clientMenuSectionFrame());
	}
	
	public void switchToClientInfoSectionFrame() {
		driver.switchTo().frame(clientInfoSectionFrame());
	}
	public void switchToSecondTopFrame()
	{
		driver.switchTo().frame(EligibilityandEnroollmentFrame());
	}
}
