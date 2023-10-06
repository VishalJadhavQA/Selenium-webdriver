package Selenium.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _10_Modal_lightbox_cookies {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Handling Bootstrap Modal Dialogs
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_modal.asp");
		driver.findElement(By.xpath("//button[text()='Click To Open Modal']")).click();
		
		String Modaltext = driver.findElement(By.className("modal-content")).getText();
		System.out.println(Modaltext);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-dismiss=\"modal\"])[2]")).click();
		
		
		//Handling Light box
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.linkText("MacBook")).click();
		driver.findElement(By.xpath("(//a[@title=\"MacBook\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"Close (Esc)\"]")).click();
		
		//Handling Accept all cookies dialogue
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.opera.com/download");
		driver.findElement(By.xpath("//span[contains(text(),'Accept cookies')]")).click();
	}

}
