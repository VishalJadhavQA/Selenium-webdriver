package Selenium.Webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_findElements_and_tagName {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
				
		//findElements()
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		
		for (WebElement t : options) {
					
			System.out.println(t.getText());
			
		}
		
		//Using Xpath locating all the hyperlink on the web page and retrieving their href attribute values
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(" ----- all the hyperlink on the web page ----- ");
		
		for (WebElement links : alllinks) {
			
		System.out.println(links.getAttribute("href"));	
		
		}
		
		//By.tagName()
		 List<WebElement> InputElements = driver.findElements(By.tagName("input"));
		 
		 System.out.println(" ----- all the Input tag on the web page ----- ");
		 
		 for (WebElement IE : InputElements) {
			
			 System.out.println(IE.getAttribute("type"));
			
		}
		 
		
		//Using Tag name locating all the hyperlink on the web page and retrieving their href attribute values
			
			List<WebElement> a = driver.findElements(By.tagName("a"));
			
			System.out.println(" ----- all the hyperlink on the web page ----- ");
			
			for (WebElement links : a) {
				
			System.out.println(links.getAttribute("href"));	
			
			}
		 
		driver.quit();
	}

}
