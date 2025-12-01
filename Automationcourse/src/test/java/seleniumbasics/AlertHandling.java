package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simple = driver.findElement(By.id("alertButton"));
		simple.click();
		Alert a = driver.switchTo().alert(); // alert is a predefined interface
		a.accept(); // method used to press 'OK' button
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirm = driver.findElement(By.id("confirmButton"));
		confirm.click();
		Alert a = driver.switchTo().alert();
		a.dismiss(); // method used to click 'cancel'
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("test");
		a.accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlertHandling ah = new AlertHandling();
		ah.initializeBrowser();
		//ah.verifySimpleAlert();
		//ah.verifyConfirmAlert();
		ah.verifyPromptAlert();
		ah.closeBrowser();
	}

}
