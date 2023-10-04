package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _06_Waiting_mechanism {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Implicit Wait or Global wait - wait for all the web elements 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		
		// Thread.sleep() - Java wait
		Thread.sleep(10000);     
		driver.findElement(By.linkText("Facebook")).click();
		
		
		driver.navigate().back();
		
				
		driver.findElement(By.className("dropbtn")).click();
		
		// Explicit Wait - wait only for the specific web element
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		/*wait till Gmail is visible*/
		WebElement gmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		
		gmail.click();
		
		
		
	}

}
