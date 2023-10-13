package Selenium.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _14_JQuery_dropdowns {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		// Single Selection
		driver.findElement(By.id("justAnotherInputBox")).click();
		
		driver.findElement(By.xpath("(//li[@class='ComboTreeItemChlid'])[28]")).click();
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		driver.findElement(By.xpath("(//span[@class='comboTreeItemTitle'])[2]")).click();
		
		driver.findElement(By.id("justAnInputBox1")).click();
		
		driver.findElement(By.xpath("(//li[@class='ComboTreeItemParent']//span)[15]")).click();
		
		
				
		
	}

}
