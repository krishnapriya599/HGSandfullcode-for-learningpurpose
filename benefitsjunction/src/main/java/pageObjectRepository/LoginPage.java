package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

	public  WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id= "TxtUserName")
	WebElement username;
	
	@FindBy(id= "TxtPassword")
	WebElement password;
	
	@FindBy(id = "LoginButton")
	WebElement loginButton;
	
	
	public WebElement enterUsername()
	{
		return username;
	}
	
	public WebElement enterPassword()
	{
		return password;
	}
	
	public WebElement clickLoginButton()
	{
		return loginButton;
	}
}
