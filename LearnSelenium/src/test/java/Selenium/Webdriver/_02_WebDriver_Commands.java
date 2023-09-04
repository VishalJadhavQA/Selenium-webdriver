package Selenium.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _02_WebDriver_Commands {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//maximize() - Used to maximize the current web page
		
		driver.manage().window().maximize();
		
		//get()- Used to open the specified URL's web page

		driver.get("http://omayo.blogspot.com/");
			
		
		driver.findElement(By.id("checkbox2")).click();
		
		driver.findElement(By.name("q")).sendKeys("Test");
		
		driver.findElement(By.className("dropdown")).click();
		
		driver.findElement(By.linkText("compendiumdev")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("input[title='search'][name='q']")).click();
		
		driver.findElement(By.xpath("//input[@id='radio1']")).click();
		
		//WebElement - Store the findElement() to reference variable of WebElement interface
		
		WebElement TextBox = driver.findElement(By.id("textbox1"));
		
		TextBox.clear();
		TextBox.sendKeys("Test1");
		TextBox.clear();
		TextBox.sendKeys("Test2");
		
		
		String Text = driver.findElement(By.id("pah")).getText();
		System.out.println(Text);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		String ButtonLabel = driver.findElement(By.cssSelector("input[title='search'][type='Submit']")).getAttribute("value");
		System.out.println(ButtonLabel);

				
		driver.quit();
	}

}
