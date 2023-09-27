package Selenium.Webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _04_Handling_Multiple_Windows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("Testing in progress");
		String ParentWindow = driver.getWindowHandle();
		
						
		driver.findElement(By.linkText("Blogger")).click();
		
		Set<String> Allwindow = driver.getWindowHandles();
		
		Iterator<String> itr = Allwindow.iterator();
		
		while (itr.hasNext()) {
			
			String win = itr.next();
			
			driver.switchTo().window(win);
			
			if (driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {;
			
			System.out.println(driver.getTitle());
						

			}
			
		}
		
		driver.switchTo().window(ParentWindow);
		
		
				
	}

}
