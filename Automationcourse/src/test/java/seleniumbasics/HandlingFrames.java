package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> iframecount = driver.findElements(By.tagName("iframe"));// used to find all frames that why given findelements. so inorder to manage multiple values we use list
		System.out.println(iframecount.size());
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame1"); // to move driver control to a particular frame
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		driver.switchTo().defaultContent(); // to back the control of driver from where it was previously 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames hf = new HandlingFrames();
		hf.initializeBrowser();
		hf.verifyFrames();
		
		hf.closeBrowser();

	}

}
