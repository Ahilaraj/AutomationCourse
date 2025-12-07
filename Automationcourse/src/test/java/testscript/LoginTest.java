package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.TestNGBase;
import pages.LoginPage;
import utillities.ExcelUtility;

public class LoginTest extends TestNGBase{

@Test

public void verifyUserLogiWithValidCredentials() throws IOException
{
String usernamevalue = ExcelUtility.getStringData(0, 0, "LoginPage");
String passwordvalue = ExcelUtility.getStringData(0, 1, "LoginPage");
LoginPage lp = new LoginPage(driver);
lp.enterUserNameOnUserNameField(usernamevalue);
lp.enterPasswordOnPasswordField(passwordvalue);
lp.clickOnLoginButton();

}

@Test
public void verifyUserLogiWithInvalidCredentials() throws IOException
{
String usernamevalue = ExcelUtility.getStringData(1, 0, "LoginPage");
String passwordvalue = ExcelUtility.getStringData(1, 1, "LoginPage");
LoginPage lp = new LoginPage(driver);
lp.enterUserNameOnUserNameField(usernamevalue);
lp.enterPasswordOnPasswordField(passwordvalue);
lp.clickOnLoginButton();
}

@Test

public void verifyUserLogiWithInvalidUsername() throws IOException
{
String usernamevalue = ExcelUtility.getStringData(2, 0, "LoginPage");
String passwordvalue = ExcelUtility.getStringData(2, 1, "LoginPage");
LoginPage lp = new LoginPage(driver);
lp.enterUserNameOnUserNameField(usernamevalue);
lp.enterPasswordOnPasswordField(passwordvalue);
lp.clickOnLoginButton();
}

@Test
public void verifyUserLogiWithInvalidPassword() throws IOException
{
String usernamevalue = ExcelUtility.getStringData(3, 0, "LoginPage");
String passwordvalue = ExcelUtility.getStringData(3, 1, "LoginPage");
LoginPage lp = new LoginPage(driver);
lp.enterUserNameOnUserNameField(usernamevalue);
lp.enterPasswordOnPasswordField(passwordvalue);
lp.clickOnLoginButton();
}



}