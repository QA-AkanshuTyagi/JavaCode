package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class2FindElement {
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
				driver.get("https://www.Amazon.com"
					);

				driver.manage().window().maximize();

				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				Thread.sleep(4000);
	WebElement searchBar=driver.findElement(By.id("twotabsearchtextbox"));		
			searchBar.sendKeys("shoes");
			
			WebElement searchBarIcon=driver.findElement(By.id("nav-search-submit-button"));		
			searchBarIcon.click();
			
			WebElement linkText= driver.findElement(By.partialLinkText("Sell products"));
			linkText.click();
			
			
	}

}
