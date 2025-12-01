package seleniumbasics;

public class Navigation extends Base {
	
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/"); // method used for navigate from one site to another
		driver.navigate().back(); // used for navigate back to the browser
		driver.navigate().forward(); // navigate to previous browser
		driver.navigate().refresh(); // refresh page
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Navigation nv = new Navigation();
		nv.initializeBrowser();
		nv.navigationCommands();
		nv.closeBrowser();

	}

}
