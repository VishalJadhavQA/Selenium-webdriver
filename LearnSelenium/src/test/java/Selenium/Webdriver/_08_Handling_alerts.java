package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _08_Handling_alerts {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
				
		//Information alert
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		WebElement r1 = driver.findElement(By.id("result"));
		System.out.println(r1.getText());
		
		
		//Confirmation alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		WebElement r2 = driver.findElement(By.id("result"));
		System.out.println(r2.getText());
		
		
		//Prompt alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a3 = driver.switchTo().alert();
		a3.sendKeys("Test");
		a3.accept();
		WebElement r3 = driver.findElement(By.id("result"));
		System.out.println(r3.getText());
		System.out.println();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
				
		//Handling Authentication Pop-up
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String text = driver.findElement(By.id("content")).getText();
		
		System.out.println(text);

	}

}
