package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentid = driver.getWindowHandle(); // to get initial window handlieid
		System.out.println(parentid);
		WebElement clickherebtn =driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickherebtn.click();
		Set<String>handleids =driver.getWindowHandles(); //handles used to get multiple windows id
		System.out.println(handleids);
		Iterator<String>it = handleids.iterator(); // to iterate handleids (coz currenlty we have 1st and 2nd window id)
		while(it.hasNext()) // if there is not next window then the while loop become break
		{
			String currentid = it.next();
			
			if(!currentid.equals(parentid)) // suppose we have total 3 windows then use if else or else if and set condition
			{
				driver.switchTo().window(currentid); // driver control goes to second window
				WebElement emailtxtfield = driver.findElement(By.name("emailid"));
				emailtxtfield.sendKeys("ahila@yopmail.com");
				WebElement submitbtn = driver.findElement(By.name("btnLogin"));
				submitbtn.click();
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling mh = new MultipleWindowHandling();
		mh.initializeBrowser();
		mh.verifyMultipleWindow();
		mh.closeBrowser();
	}

}
