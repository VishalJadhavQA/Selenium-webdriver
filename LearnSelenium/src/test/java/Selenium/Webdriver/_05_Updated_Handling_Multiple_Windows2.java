package Selenium.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _05_Updated_Handling_Multiple_Windows2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("Testing in progress");
		String ParentWindow = driver.getWindowHandle();
				
		
		//switching to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("HP");
		String childwin = driver.getWindowHandle();
		
		
		//Switching to parent window
		driver.switchTo().window(ParentWindow);
		
		
		//switching to new window driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.blogger.com/about/?bpli=1");
		
		//Switching to child window
		driver.switchTo().window(childwin);
		
		
		//driver.close();
		
			
		//driver.quit();
		
	}

}
