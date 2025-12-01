package seleniumbasics;

public class BrowserCommands extends Base {
	
	public void verifyCommands() 
	{
		String title = driver.getTitle(); // to get title of web page
		System.out.println(title);
		String url = driver.getCurrentUrl(); // to get current url
		System.out.println(url);
		String handleId = driver.getWindowHandle(); // used to get single window id
		System.out.println(handleId);
		String source = driver.getPageSource(); // used to get current page source code
		System.out.println(source);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserCommands bc = new BrowserCommands();
		bc.initializeBrowser();
		bc.verifyCommands();
		bc.closeBrowser();

	}

}
