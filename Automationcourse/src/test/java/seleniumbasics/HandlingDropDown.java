package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	
	public void verifyDropDown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select sl = new Select(dropdown); // for drop down written in 'Select'tag
		//sl.selectByIndex(2);
		//sl.selectByValue("python");
		sl.selectByVisibleText("Python");
		
	}
	
	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement chk = driver.findElement(By.xpath("//input[@value='option-1']"));
		//chk.click();
		WebElement chk1 = driver.findElement(By.xpath("//input[@value='option-2']"));
		chk1.click();
		//chk.click();
	}
	
	public void verifyRadiobtn()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio = driver.findElement(By.xpath("//input[@value='green']"));
		radio.click();
		System.out.println(radio.isSelected()); // to check if the element is selected or not
		//WebElement radio1 = driver.findElement(By.xpath("//input[@value='blue']"));
		//radio1.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingDropDown hd = new HandlingDropDown();
		hd.initializeBrowser();
		//hd.verifyDropDown();
		hd.verifyCheckBox();
		hd.verifyRadiobtn();
		hd.closeBrowser();
	}

}
