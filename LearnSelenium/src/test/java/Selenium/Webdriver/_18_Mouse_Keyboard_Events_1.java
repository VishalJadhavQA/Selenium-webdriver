package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class _18_Mouse_Keyboard_Events_1 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
	
			
			 driver.get("http://omayo.blogspot.com/");
			
			//Predefined action class
			Actions action = new Actions(driver);
			
			
			//move to element 
			WebElement option1 = driver.findElement(By.id("blogsmenu"));
			  
			action.moveToElement(option1).perform();
			  
			  
			//move to element and click 
			WebElement option2 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
			  
			action.moveToElement(option2).click().build().perform();
			
			
			// drag and drop by xoffset and yoffset
			
			driver.switchTo().newWindow(WindowType.TAB);
			
			driver.get("https://omayo.blogspot.com/p/page3.html");
			
			WebElement element1 = driver.findElement(By.xpath("//a[@title='200']"));
			
			action.dragAndDropBy(element1, 50, 0).perform();
			
			// Right click or Context click
		
			WebElement element2 = driver.findElement(By.name("q"));
			
			action.contextClick(element2).perform();
			
			
						
			// double Clicking element
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("http://omayo.blogspot.com/");
			WebElement button1 = driver.findElement(By.id("testdoubleclick"));
			action.moveToElement(button1).perform();
			action.doubleClick(button1).perform();
			
						
			
			// drag and drop source and destination 
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			
			
			driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
						
			WebElement oslo = driver.findElement(By.xpath("//div[@id='box1']"));
			
			WebElement norway = driver.findElement(By.id("box101"));
			
			action.dragAndDrop(oslo, norway).perform();
			
	}

}
