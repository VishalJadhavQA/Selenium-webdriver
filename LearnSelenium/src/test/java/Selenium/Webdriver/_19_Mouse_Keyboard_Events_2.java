package Selenium.Webdriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _19_Mouse_Keyboard_Events_2 {

	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		 //keyDown() and keyUp() methods
		 driver.get("http://omayo.blogspot.com/");
		 
		 WebElement compendiumdev = driver.findElement(By.linkText("compendiumdev"));
		 
		 Actions action = new Actions(driver);
		 
		 	 
		 action.keyDown(Keys.CONTROL).moveToElement(compendiumdev).click(compendiumdev).keyUp(Keys.CONTROL).build().perform();
		 
		 
		 //Resizing using dragAndDropBy(element,width,height)
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 
		 driver.get("https://jqueryui.com/resizable/");
		 
		 WebElement frame = driver.findElement(By.className("demo-frame"));
		 
		 driver.switchTo().frame(frame);
		 
		 Actions action1 = new Actions(driver);
		 
		 WebElement resize = driver.findElement(By.cssSelector("div.ui-icon-gripsmall-diagonal-se"));
		 
		 action1.dragAndDropBy(resize, 40, 50).perform();
	
		 
		 // sendKeys(), pause() and click(WebElement)
		 driver.switchTo().newWindow(WindowType.WINDOW);
	
		 driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		 
		 driver.findElement(By.id("input-firstname")).sendKeys("Test");
		 
		 Actions action2 = new Actions(driver);
		 
		 action2.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys("Test")
		 		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys("Test.123@gmail.com")
		 		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys("123456")
		 		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys("Rwire")
		 		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys("Rwire")
		 		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(1))
		 		.sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
		 		.sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
		 		.build().perform();
		 		
		 
		 
	
	
	}
	
			
	
		 
		 	
}

