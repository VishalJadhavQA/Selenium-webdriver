package Selenium.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _17_Nested_frames {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/frame");
		
		//two child frames under single parent frame
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Test");
		driver.findElement(By.name("lname")).sendKeys("Progress");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(frame); //swithcing to nested frame
				
		driver.findElement(By.className("input")).sendKeys("Test@mail.com");
		
		
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Child frames under two different parent frame
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//Switch to parent frame - Top
		driver.switchTo().frame("frame-top");
		
		//Switch to child frame - left
		driver.switchTo().frame("frame-left");
		
		String frame1 = driver.findElement(By.xpath("//body")).getText();
		System.out.println(frame1);
		
		//Switch again to parent frame - Top
		driver.switchTo().parentFrame();
		
		//Switch to child frame - middle
		driver.switchTo().frame("frame-middle");
		
		String frame2 = driver.findElement(By.id("content")).getText();
		System.out.println(frame2);
		
		
		//Switch back to page level or select first frame on the page
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		String frame3 = driver.findElement(By.xpath("//body")).getText();
		
		System.out.println(frame3);
		
	}

}
