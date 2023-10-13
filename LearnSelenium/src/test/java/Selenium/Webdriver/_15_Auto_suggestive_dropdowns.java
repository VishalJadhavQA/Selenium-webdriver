package Selenium.Webdriver;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _15_Auto_suggestive_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.goibibo.com/");
		 
		 
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		 
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 wRKJm fswFld '])[1]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("india");
		
		
		for (int i = 1; i < 4; i++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ARROW_DOWN);
			
		}
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
				
	}

}
