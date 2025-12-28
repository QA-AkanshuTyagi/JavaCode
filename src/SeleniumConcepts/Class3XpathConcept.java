package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class3XpathConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(5000);
	WebElement ele= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	ele.sendKeys("shoes");
	
		ele.sendKeys(Keys.ENTER);
		// TODO Auto-generated method stub

				// xpath= //tagname[@attribute='av']
		
		//tagname[text()='']
		//tagname[.='']
		//tagname[contains(text(),'')]		
	
	
	Thread.sleep(5000);
		List<WebElement>allProducts=driver.findElements(By.xpath("//button[.='Add to cart']"));
		int count=0;
		for(WebElement eachProduct:allProducts) {
			
			
			eachProduct.click();
			Thread.sleep(2000);
			count++;
			
			if(count==4) {
				
				break;
			}
			
			
		}
	}

}
