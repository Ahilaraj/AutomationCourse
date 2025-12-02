package automationcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {

	
	
	public WebDriver driver; // webdriver is an interface in selenium
	
	@BeforeMethod
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com"); // to launch url
		driver.manage().window().maximize(); //maximize window
	}
	
	@AfterMethod
	
	public void closeBrowser()
	{
		//driver.close(); // used to close current tab
		//driver.quit(); // used to close all tab
		
	} 
}
