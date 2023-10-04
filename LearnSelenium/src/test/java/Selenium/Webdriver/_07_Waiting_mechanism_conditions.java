package Selenium.Webdriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _07_Waiting_mechanism_conditions {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.className("dropbtn")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		//Waiting for an Element to be displayed on the page
		WebElement gmail_option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
		gmail_option.click();
		driver.navigate().back();
		
		
		
		//Waiting for an Alert to be present
		driver.findElement(By.id("alert1")).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		  		 
		
		
		//wait for the processing or loading icon to disappear
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
		
		String text = driver.findElement(By.id("finish")).getText();
		
		System.out.println(text);
		
	}

}
