package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //initElements -> used to initialize elements
	}
	
	@FindBy(id = "user-name")WebElement username; // FindBy annotation used to find Web elements
	@FindBy(id = "password")WebElement password;
	@FindBy(id = "login-button")WebElement loginbtn;
	
	public void enterUserNameonUserNameField()
	{
		username.sendKeys("standard_user");
	}
	
	public void enterPasswordonPasswordField()
	{
		password.sendKeys("secret_sauce");
	}
	
	public void clickonLoginButton()
	{
		loginbtn.click();
	}
	
}
