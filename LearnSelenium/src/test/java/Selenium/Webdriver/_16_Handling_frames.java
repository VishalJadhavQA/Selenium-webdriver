package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _16_Handling_frames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Handling iframe
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Switched to iframe sucessfully.");
		
		
		//Handling frame
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Description")).click();
		
		
		
		
		
	}

}
