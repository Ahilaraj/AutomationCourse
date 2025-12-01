package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver; // webdriver is an interface in selenium
	
	public void initializeBrowser()
	{
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();

		driver.get("https://selenium.qabible.in/"); // to launch url
		driver.manage().window().maximize(); //maximize window
	}
	
	public void closeBrowser()
	{
		//driver.close(); // used to close current tab
		//driver.quit(); // used to close all tab
		
	} 

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Base b = new Base ();
		b.initializeBrowser();
		b.closeBrowser();
		

	}

}
