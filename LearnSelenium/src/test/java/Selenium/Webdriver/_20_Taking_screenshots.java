package Selenium.Webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _20_Taking_screenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Taking Screenshots of visible part on screen
		driver.get("https://omayo.blogspot.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/omayo.png");
		
		/*using file utils */ 
		//FileUtils.copyFile(src,dest);
				
		/*using file handler*/
		FileHandler.copy(src,dest);
		
		
		//Taking Screenshots of Web Elements
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		
		File src1 = multiselect.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshots/elment.png");
		
		FileHandler.copy(src1, dest1);
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Taking Screenshots of sections
		
		WebElement section = driver.findElement(By.id("content"));
		
		File src2 = section.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./Screenshots/section.png");
		
		FileHandler.copy(src2, dest2);

	}

}
