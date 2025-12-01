package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick()
	
	{
		// to perform right click
		WebElement other = driver.findElement(By.id("others"));
		Actions ac = new Actions(driver); // invoking predefined class actions for invoking methods. Action class used to perform mouse actions
		ac.contextClick(other).build().perform(); // method used to right click
	}
	
	public void VerifyMouseHover()
	//to perform mousehover
	{
		WebElement other = driver.findElement(By.id("others"));
		Actions ac = new Actions(driver);
		ac.moveToElement(other).build().perform(); // method used to mouse hover
	}
	
	public void verifyDragandDrop()
	//to perform drag and drop
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).build().perform();
		
	}
	
	public void verifyKeyboardActions() throws AWTException // robot class used to perform keyboard actions
	{
		Robot rb = new Robot(); 
		// to open new tab using keyboard we perform (cntrl+T)
		rb.keyPress(KeyEvent.VK_CONTROL); //KeyPress used to press an event, keys inside KeyEvent-predefined class,VK means virtual Key, 
		rb.keyPress(KeyEvent.VK_T); //
		rb.keyRelease(KeyEvent.VK_CONTROL);  //Keyrelease used to release an event
		rb.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingActions ha = new HandlingActions();
		ha.initializeBrowser();
		//ha.verifyRightClick();
		//ha.VerifyMouseHover();
		//ha.verifyDragandDrop();
		try {
			ha.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ha.closeBrowser();
	}

}
