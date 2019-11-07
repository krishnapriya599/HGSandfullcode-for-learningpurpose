package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Copy_Plan_Setup {
	public WebDriver driver;
	
	public Copy_Plan_Setup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="ddlCompanys")
	WebElement clientdropdown;
	
	public Select ClientDropDownlist()
	{
		return new Select(clientdropdown);
	}
	
	@FindBy(id="ddlPlantypes")
	WebElement plantyprdropdown;
	
	public Select ClickPlantypedropdown()
	{
		return new Select(plantyprdropdown);
	}
	
	@FindBy(id="ddlPlanFrom")
	WebElement plandropdown;
	
	public Select ClickPlantdropdown()
	{
		return new Select(plandropdown);
	}
	
	@FindBy(id="ddlPlanTo")
	WebElement Copytoplan;
	
	public Select ClickCopytoPlan()
	{
		return new Select(Copytoplan);
	}
	@FindBy(id="btnSave")
	WebElement copyplansavebutton;
	
	public WebElement Clickonsavebutton()
	{
		return copyplansavebutton;
	}
	
	@FindBy(id="btnOk")
	WebElement confirm;
	
	public  WebElement clickonconfirmbutton()
	{
		return confirm;
	}
}


 