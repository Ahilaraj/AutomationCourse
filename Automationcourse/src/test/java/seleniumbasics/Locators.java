package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocator()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one")); //to find single element . Locators are in 'By' class
		driver.findElement(By.className("clearfix")); // to find element using class name
		driver.findElement(By.tagName("div")); // to find element using tag name
		driver.findElement(By.name("description")); // to find element using  name
		driver.findElement(By.linkText("Simple Form Demo")); // find element(link) using link text
		driver.findElement(By.partialLinkText("Simple")); // find element(link) using link text by giving partial text
		 
		//using css selector locator
		
		driver.findElement(By.cssSelector("button[id='button-one']"));
		
		// /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button (Absolute X path)
		
		driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[text()='Show Message']")); // x path using text name
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]")); //incase if the element text is longer
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']")); // using AND
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		
		//xpath axis method used if above locators are not worked. Locate
		
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']")); // used to locate using parent element
		
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']")); // used to locate using just below element
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));// consider all element below the target element
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));// consider all element above the target element
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div")); // consider all parent and grandparent of target element
		driver.findElement(By.xpath("//div[@class='card']//descendant::div")); // consider all child element to locate the target element
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locators lc = new Locators();
		lc.initializeBrowser();
		lc.closeBrowser();

	}

}
