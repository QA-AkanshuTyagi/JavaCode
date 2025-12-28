package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class class1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// calling the WebDriver
		String WebBrowser = "Chrome";

		if (WebBrowser.equals("Chrome")) {
			driver = new ChromeDriver();

		}
		if (WebBrowser.equals("Edge")) {

			driver = new EdgeDriver();

		}
		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		Thread.sleep(2000);
		
		driver.close(); //for closing the current window
		driver.quit(); // for closing all the windows present in a browser.
		
		

	}

}
