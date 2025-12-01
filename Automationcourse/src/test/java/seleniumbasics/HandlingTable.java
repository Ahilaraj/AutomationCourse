package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{
	
	public void verifyTable()
	{
		driver.navigate().to("https://money.rediff.com/indices/nse");
		WebElement table = driver.findElement(By.id("dataTable"));
		System.out.println(table.getText());
		WebElement tablehead = driver.findElement(By.xpath("//table@[id='dataTable']/thead/tr[1]"));// to get table row headings
	
		System.out.println(tablehead);
		WebElement tabledata = driver.findElement(By.xpath("//table@id='dataTable']/tbody/tr[1]"));// to get table data by mentioning tr[1],tr[2] etc we can fetech any data of the table
		System.out.println(tabledata);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingTable ht = new HandlingTable();
		ht.initializeBrowser();
		ht.verifyTable();
		ht.closeBrowser();
	}

}
