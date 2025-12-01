package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	
	
	public void verifyFileUploadUsingSendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement chosefile = driver.findElement(By.id("uploadfile_0"));
		chosefile.sendKeys("C:\\Users\\EMVIGO-USER\\eclipse-workspace\\Automationcourse\\src\\test\\resources\\Blank.pdf");
		WebElement chkbox = driver.findElement(By.id("terms"));
		chkbox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	
	public void verifyFileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement slctpdfbtn = driver.findElement(By.id("pickfiles"));
		slctpdfbtn.click();
		StringSelection ss = new StringSelection("C:\\Users\\EMVIGO-USER\\eclipse-workspace\\Automationcourse\\src\\test\\resources\\Blank.pdf"); // StringSelection cls is used to select
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); // to copy method to clipboard use ToolKit method
		Robot r=new Robot();
		r.delay(2500); //delay can apply only in Robot class method, 2500 is milliseconds
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandlingFileUpload hu = new HandlingFileUpload();
		hu.initializeBrowser();
		//hu.verifyFileUploadUsingSendkeys();
		try {
			hu.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hu.closeBrowser();
	}

}
