package Selenium.Webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _24_Static_table {

	public static void main(String[] args) {

		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://omayo.blogspot.com/");	
			
			
			/* Listing the table heading */ 
			
			List<WebElement> Heading = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
			for (WebElement THeading : Heading) {
				
				System.out.println(THeading.getText());
				
			}
		
			/* Listing the table data */ 
			
			List<WebElement> Data = driver.findElements(By.xpath("//table[@id='table1']//td"));
			
			for (WebElement TData : Data) {
				
				System.out.print(TData.getText()+ " ");
				
			}
			
			
			
			
			/* Number of rows in table */ 
			
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody/tr"));
			
			System.out.println(" ");
			System.out.println("Number of rows in table are " + rows.size());
			
			
			

	}

}
