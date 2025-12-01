package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterSample extends Base {
	
	public void verifyJavaScript()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver; // casting defenition?
		js.executeScript("arguments[0].click();", showMessageButton); // predefined syntax
		js.executeScript("window.scrollBy(0,350)", "");// 0 is x axis , 350 is y axis - it scroll down 350 of total size. If we again give same line then it scroll 350 of remaining already completed 350. for scroll up use -350
		// scrollto not able to use coz
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecuterSample js = new JavaScriptExecuterSample();
		js.initializeBrowser();
		js.verifyJavaScript();
		js.closeBrowser();
	}

}
