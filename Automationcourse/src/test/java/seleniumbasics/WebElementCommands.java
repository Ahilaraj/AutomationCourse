package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{
	
	public void verifyWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement textbox = driver.findElement(By.id("single-input-field"));
		textbox.sendKeys("haii"); // to input a text
		WebElement showmsgbtn = driver.findElement(By.id("button-one"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5)); //Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showmsgbtn));
		
		//fluent wait
		
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentwait.until(ExpectedConditions.elementToBeClickable(showmsgbtn));
		System.out.println(showmsgbtn.isDisplayed()); // to see if the element is displayed or not. return true if displayed
		System.out.println(showmsgbtn.isEnabled()); // to see if element is enabled or not
		
		
		
		showmsgbtn.click(); // to click 
		WebElement shwtext = driver.findElement(By.id("message-one"));
		System.out.println(shwtext.getText()); // to get text from the webpage
		System.out.println(shwtext.getTagName()); // to get tag name of element
		System.out.println(showmsgbtn.getCssValue("background-color")); // to get css property of an element
		textbox.clear();
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebElementCommands wc = new WebElementCommands();
		wc.initializeBrowser();
		wc.verifyWebElementCommands();
		wc.closeBrowser();

	}

}
