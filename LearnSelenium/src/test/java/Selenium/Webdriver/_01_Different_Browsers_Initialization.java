package Selenium.Webdriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class _01_Different_Browsers_Initialization {
	
	public static void main(String[] args) {
		
		
		String BrowserName = "Chrome";
		WebDriver drivers = null;

		if (BrowserName.equals("Edge")) {
			
			WebDriverManager.edgedriver().setup();
			drivers = new EdgeDriver();
		}
		
		else if (BrowserName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			drivers = new ChromeDriver();
			
		}
		
		else if (BrowserName.equals("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			drivers = new FirefoxDriver();
						
			
		}
		

		drivers.manage().window().maximize();
		drivers.get("https://tutorialsninja.com/demo/");
		drivers.findElement(By.name("search")).sendKeys("HP");
		drivers.findElement(By.className("input-group-btn")).click();
		
	}

}
