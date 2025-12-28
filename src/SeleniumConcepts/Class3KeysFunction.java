package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3KeysFunction {
	static WebDriver driver;
	static int count=4;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		WebElement searchBar=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		searchBar.sendKeys("shoes");
		
		for(int i=1;i<=count;i++) {
		searchBar.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		}
		
		searchBar.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);

	}

}
