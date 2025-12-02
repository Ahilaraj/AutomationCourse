package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.TestNGBase;
import pages.LoginPage;

public class LoginTest extends TestNGBase {
	
	@Test
	public void verifyUserLoginwithValidCredentials()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserNameonUserNameField();
		lp.enterPasswordonPasswordField();
		lp.clickonLoginButton();
		
	}
	
	@Test
	public void verifyUserLoginwithInValidCredentials()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("abcuser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Test123");
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
	}
	
	@Test
	public void verifyUserLoginwithInValidUsernameandValidPassword()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("abcuser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
	}
	
	@Test
	public void verifyUserLoginwithValidUsernameandInValidPassword()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Test@123");
		WebElement loginbtn = driver.findElement(By.id("login-button"));
		loginbtn.click();
	}
	
	
}
